package com.mulesoft.services.file;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

import org.apache.commons.io.input.CloseShieldInputStream;
import org.apache.log4j.Logger;
import org.mule.api.DefaultMuleException;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleException;
import org.mule.api.lifecycle.Callable;
import org.mule.config.i18n.MessageFactory;

/**
 * Performs a CRC32 Check of a file using a stream of the file.
 * As to avoid closing the original inputstream so further components
 * in the pipeline can read the IS, it uses a CloseShieldInputSream from
 * the apache commons library that can be read and closed without affecting
 * the original stream.
 * @author ashley.osborne
 *
 */
public class StreamCRC32 implements Callable{

	private static final Logger LOG = Logger.getLogger(StreamCRC32.class);
	
	/**
	 * Gets the CRC32 number of the file without consuming original stream or reading the file
	 * into memory
	 * @param is The inputstream
	 * @throws MuleException
	 */
	private long checkCRCOfStream(InputStream is) throws MuleException {

		CloseShieldInputStream csis = new CloseShieldInputStream(is);
		CRC32 crcMaker = new CRC32();
		byte[] buffer = new byte[8192];
		int bytesRead;
		
		try{
			while((bytesRead = csis.read(buffer)) != -1) {
				crcMaker.update(buffer, 0, bytesRead);
			}
		}catch(IOException e){
			LOG.error("IO error reading file");
			throw new DefaultMuleException(MessageFactory.createStaticMessage("IO error performing CRC check"), e);
		}finally{
			csis.close();
		}

		long crc = crcMaker.getValue(); 
		LOG.info("CRC is: " + crc);
		return crc;

	}

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		
		long crc = checkCRCOfStream((InputStream) eventContext.getMessage().getPayload());
		eventContext.getMessage().setInvocationProperty("CRC_VALUE", crc);
		
		return eventContext.getMessage();
	}
}

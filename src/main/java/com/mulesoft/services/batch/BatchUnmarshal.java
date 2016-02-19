package com.mulesoft.services.batch;

import java.io.ByteArrayInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

import batch.digital.hoares.products.ProductType;

public class BatchUnmarshal implements Callable {
	
	private static final Logger LOG = Logger.getLogger(BatchUnmarshal.class);

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		

		LOG.info("The payload is: " + eventContext.getMessage().getPayload());
		
		JAXBContext jc = JAXBContext.newInstance (ProductType.class);
        Unmarshaller  unmarshaller = jc.createUnmarshaller();
        ByteArrayInputStream input = new ByteArrayInputStream((byte[]) eventContext.getMessage().getPayload());
        ProductType product =   (ProductType) unmarshaller.unmarshal(input);
        input.close();
		
        eventContext.getMessage().setPayload(product);
        
		return eventContext;
	}

}

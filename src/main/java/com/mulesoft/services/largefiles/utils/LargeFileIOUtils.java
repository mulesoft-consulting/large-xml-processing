package com.mulesoft.services.largefiles.utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.mule.api.DefaultMuleException;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.transport.PropertyScope;
import org.mule.config.i18n.MessageFactory;

public class LargeFileIOUtils {

	public static final String FILEPATH_FLOWVAR = "filePath";
	
	public static InputStream InputStream(MuleMessage message) throws DefaultMuleException{
		String filepath ="";
		try {
			filepath = (String)message.getProperty(FILEPATH_FLOWVAR, PropertyScope.INVOCATION);
			return new BufferedInputStream(new FileInputStream(filepath));
		} catch (FileNotFoundException e) {
			throw new DefaultMuleException(MessageFactory.createStaticMessage("IO loading original from filepath provided: " + filepath), e);
		}
	}
	
	
}

package com.mulesoft.services.xml.xpath;

import java.io.InputStream;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

import com.mulesoft.services.largefiles.utils.LargeFileIOUtils;

public class XMLParser implements Callable {

	private String xmlAttributeName;
	private String xmlTagName;

	public void setXmlAttributeName(String xmlAttributeName) {
		this.xmlAttributeName = xmlAttributeName;
	}

	public void setXmlTagName(String xmlTagName) {
		this.xmlTagName = xmlTagName;
	}
	
	public XMLParser(){
		
	}

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		
		
		SAXXpath xPather = new SAXXpath(LargeFileIOUtils.InputStream(eventContext.getMessage()),xmlTagName, xmlAttributeName);
		
		String attributeValue = xPather.parseXml();
		
		eventContext.getMessage().setInvocationProperty("groupId", attributeValue);
		
		return eventContext.getMessage();
	}

}

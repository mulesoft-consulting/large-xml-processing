package com.mulesoft.services.xml.xpath;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Namespace;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.apache.commons.io.input.CloseShieldInputStream;
import org.mule.api.DefaultMuleException;
import org.mule.config.i18n.MessageFactory;

/**
 * Iterates over InputStream using SAX and attempts to find a given attribute
 * @author ashley.osborne
 *
 */
public class SAXXpath {
	
	private String recordTagName;
	private String attributeName;
	

	private XMLInputFactory inputFactory;

	private XMLEventReader eventReader;

	private XMLEvent event;

	private StartElement startElement;
	
	private HashMap<String, Namespace> namespeces;
	
	private InputStream is;
	

	public SAXXpath(InputStream is, String recordTagName, String attributeName) throws XMLStreamException {
		
		this.is = is;
		inputFactory = XMLInputFactory.newInstance();
		inputFactory.setProperty("javax.xml.stream.supportDTD", false);		
		eventReader = inputFactory.createXMLEventReader(is);
		startElement = null;
		
		this.recordTagName = recordTagName;
		this.attributeName = attributeName;

		namespeces = new HashMap<String, Namespace>();
		
	}
	
	/**
	 * Parse the XML for the attribute
	 * @return
	 * @throws DefaultMuleException
	 */
	public String parseXml() throws DefaultMuleException{
		String xpathResult = runXpath();
		if(xpathResult != null){
			return xpathResult;
		}else{
			throw new DefaultMuleException(MessageFactory.createStaticMessage("AttributeName was not found in stream"));
		}
	}

	private String runXpath() {
		try {
			while (eventReader.hasNext()) {
				event = eventReader.nextEvent();
				if (event.isStartElement()) {
					startElement = event.asStartElement();
					if (startElement.getName().getLocalPart().equals(recordTagName)) {
						
						QName qName = new QName(attributeName);
						
						return startElement.getAttributeByName(qName).getValue();
						
					} else {
						Iterator<?> it = startElement.getNamespaces();						
						while (it.hasNext()) {
							Namespace ns = (Namespace) it.next();
							namespeces.put(ns.getValue(), ns);
						}
					}
				}
			}
			
			if (eventReader != null){
				eventReader.close();
			}
			
			return null;
		} catch (Exception e) {
			throw new RuntimeException("Unable to load element", e);
		}finally{
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

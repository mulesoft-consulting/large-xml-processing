package com.mulesoft.services.xml.chunking;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.Namespace;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.input.CloseShieldInputStream;
import org.mule.api.DefaultMuleException;
import org.mule.api.MuleMessage;

import com.ctc.wstx.sax.WstxSAXParserFactory;

import batch.digital.hoares.products.ProductType;

import com.mulesoft.services.largefiles.utils.LargeFileIOUtils;

/**
 * 
 * @author Simone.Avossa
 *
 */
public class XMLStreamingIterator implements Iterator<byte[]> {
	
	private String recordTagName;
	
	private boolean hasNextIndex = true;
	private boolean isNextIndexAlredyLoaded = true;

	private XMLInputFactory inputFactory;
	private XMLOutputFactory outputFactory;

	private XMLEventReader eventReader;

	private XMLEvent event;

	private StartElement startElement;
	private EndElement endElement;
	
	private HashMap<String, Namespace> namespeces;
	
	private InputStream csis;

	public XMLStreamingIterator(MuleMessage message, String recordTagName) throws XMLStreamException, DefaultMuleException {
		
		csis = LargeFileIOUtils.InputStream(message);
		inputFactory = XMLInputFactory.newInstance();
		outputFactory = XMLOutputFactory.newInstance();
		inputFactory.setProperty("javax.xml.stream.supportDTD", false);		
		eventReader = inputFactory.createXMLEventReader(csis);
		startElement = null;
		endElement = null;
		
		this.recordTagName = recordTagName;

		namespeces = new HashMap<String, Namespace>();
		
		hasNextIndex = loadNextIndex();
	}

	@Override
	public boolean hasNext() {
		if (!isNextIndexAlredyLoaded) {
			hasNextIndex = loadNextIndex();						
		}
		isNextIndexAlredyLoaded = true;
		return hasNextIndex;
	}

	@Override
	public byte[] next() {		
		return loadNext();
	}

	@Override
	public void remove() {
		loadNext();
	}

	private byte[] loadNext() {
		boolean exit = false;
		ByteArrayOutputStream baos =  null;
		XMLEventWriter eventWriter = null;
		isNextIndexAlredyLoaded = false;
		if (hasNextIndex) {
			try {				
				baos = new ByteArrayOutputStream();
				eventWriter = outputFactory.createXMLEventWriter(baos);
				eventWriter.add(event);
				
				Iterator<Namespace> it = namespeces.values().iterator();
				while (it.hasNext()) {
					eventWriter.add(it.next());
				}
				
				while (eventReader.hasNext() && !exit) {
					event = eventReader.nextEvent();
					eventWriter.add(event);										
					if (event.isEndElement()) {
						endElement = event.asEndElement();
						if (endElement.getName().getLocalPart().equals(recordTagName)) {
							exit = true;
						}
					}
				}

				eventWriter.flush();
				baos.flush();
	
	
				return baos.toByteArray();
				//TODO JAXB marshall here
			} catch (Exception e) {
				throw new RuntimeException("Unable to retrieve element", e);
			} finally {
				try {
					if (eventWriter != null) eventWriter.close();
					if (baos != null) IOUtils.closeQuietly(baos);
				} catch (Exception e) {
					throw new RuntimeException("Unable to close output streams", e);
				}
			}
		}
		else {
			try {
				if (eventReader != null) {
					eventReader.close();
				}
				if (csis != null) {
					csis.close();
				}
				
			} catch (Exception e) {
				throw new RuntimeException("Unable to close input streams", e);
			}
		}

		return null;
	}

	private boolean loadNextIndex() {
		try {
			while (eventReader.hasNext()) {
				event = eventReader.nextEvent();
				if (event.isStartElement()) {
					startElement = event.asStartElement();
					if (startElement.getName().getLocalPart().equals(recordTagName)) {
						return true;
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
			if (csis != null){
				csis.close();				
			}
			
			return false;
		} catch (Exception e) {
			throw new RuntimeException("Unable to load element", e);
		}
	}
}

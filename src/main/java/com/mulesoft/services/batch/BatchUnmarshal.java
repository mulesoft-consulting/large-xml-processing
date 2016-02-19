package com.mulesoft.services.batch;

import java.io.ByteArrayInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.jibx.runtime.BindingDirectory;
import org.jibx.runtime.IBindingFactory;
import org.jibx.runtime.IUnmarshallingContext;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;

import batch.digital.hoares.products.ProductType;

//import batch.digital.hoares.products.ProductType;

public class BatchUnmarshal implements Callable  {
	
	private static final Logger LOG = Logger.getLogger(BatchUnmarshal.class);

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
	    IBindingFactory bfact = 
	            BindingDirectory.getFactory(ProductType.class);
	    IUnmarshallingContext uctx = bfact.createUnmarshallingContext();
	    ByteArrayInputStream input = new ByteArrayInputStream((byte[]) eventContext.getMessage().getPayload());
	    
	    ProductType product = (ProductType) uctx.unmarshalDocument
	            (input, null);
	    
	    eventContext.getMessage().setPayload(product);
	    
	    LOG.info("Product number: " + product.getProductDetails().getShortName());
	    
	    
//
//		LOG.info("The payload is: " + eventContext.getMessage().getPayload());
//		
//		JAXBContext jc = JAXBContext.newInstance (ProductType.class);
//        Unmarshaller  unmarshaller = jc.createUnmarshaller();
//        ByteArrayInputStream input = new ByteArrayInputStream((byte[]) eventContext.getMessage().getPayload());
//        ProductType product =   (ProductType) unmarshaller.unmarshal(input);
//        input.close(); 
//		
//        eventContext.getMessage().setPayload(product);
        
		return eventContext;
	}


}

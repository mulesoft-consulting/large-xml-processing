package com.mulesoft.services.batch;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.jibx.runtime.BindingDirectory;
import org.jibx.runtime.IBindingFactory;
import org.jibx.runtime.IUnmarshallingContext;
import org.jibx.runtime.JiBXException;
import org.mule.api.DefaultMuleException;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.config.i18n.MessageFactory;

import batch.digital.hoares.products.ProductType;

//import batch.digital.hoares.products.ProductType;

public class BatchUnmarshal implements Callable  {
	
	private static final Logger LOG = Logger.getLogger(BatchUnmarshal.class);

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		ByteArrayInputStream input = new ByteArrayInputStream((byte[]) eventContext.getMessage().getPayload());
		try{
			IBindingFactory bfact = 
		            BindingDirectory.getFactory(ProductType.class);
		    IUnmarshallingContext uctx = bfact.createUnmarshallingContext();
		    

		    ProductType product = (ProductType) uctx.unmarshalDocument
		            (input, null);
		    
		    eventContext.getMessage().setPayload(product);
		    
		}catch(JiBXException e){
			throw new DefaultMuleException(MessageFactory.createStaticMessage("JIXB exception unmarshalling"), e);
		}

	    try{
	    	input.close();
	    }catch(IOException e){
	    	e.printStackTrace();
	    }
	   
	    
        
		return eventContext.getMessage();
	}


}

package it.smeup;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class HandlHeaderCO implements HandlerResolver {
	
    private File iBodyFile= null;
    private File iResponseFile= null;
    private SmeupResponseCO sResp=null;
	
	
    public HandlHeaderCO(File aBodyFile, File aResponseFile,  SmeupResponseCO sr) {
        iBodyFile= aBodyFile;
        iResponseFile= aResponseFile;
        sResp = sr;
    }

	public List<Handler> getHandlerChain(PortInfo arg0) {
	      List<Handler> handlerChain = new ArrayList<Handler>();
	      
	      ModHeaderCO hh = new ModHeaderCO(iBodyFile,iResponseFile,sResp);
	 
	      handlerChain.add(hh);
	 
	      return handlerChain;
	}


	
}

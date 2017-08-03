package it.smeup;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class HandlHeader implements HandlerResolver {
	
    private File iBodyFile= null;
    private File iResponseFile= null;
    private SmeupResponse sResp=null;
	
	
    public HandlHeader(File aBodyFile, File aResponseFile,  SmeupResponse sr) {
        iBodyFile= aBodyFile;
        iResponseFile= aResponseFile;
        sResp = sr;
    }

	public List<Handler> getHandlerChain(PortInfo arg0) {
	      List<Handler> handlerChain = new ArrayList<Handler>();
	      
	      ModHeader hh = new ModHeader(iBodyFile,iResponseFile,sResp);
	 
	      handlerChain.add(hh);
	 
	      return handlerChain;
	}


	
}

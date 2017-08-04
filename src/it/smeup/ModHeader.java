package it.smeup;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ModHeader implements SOAPHandler<SOAPMessageContext> {
	
    private File iBodyFile= null;
    private File iResponseFile= null;
    private long iIDInvioInterno= System.currentTimeMillis();
    private SmeupResponse sResp=null;
    
    
    public ModHeader(File aBodyFile, File aResponseFile, SmeupResponse sr) {
        iBodyFile= aBodyFile;
        iResponseFile= aResponseFile;
        if (sr==null) {
        	sResp = new SmeupResponse();
        } else {
        	sResp = sr;
        }
        
    }

	public void close(MessageContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean handleFault(SOAPMessageContext arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean handleMessage(SOAPMessageContext smc) {
		long vNow= iIDInvioInterno;
	    Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
	       
	        if (!outboundProperty.booleanValue()) {
	        	if (iResponseFile!=null) {
		        	FileOutputStream vOut = null;
		        	try {
		                try {
		                    vOut= new FileOutputStream(iResponseFile);
		                } catch (FileNotFoundException ex) {
		                	try {
		                		vOut= new FileOutputStream(iResponseFile.getName());
		                	} catch (FileNotFoundException e) {
		                		sResp.setCode(SmeupToUBUY.RETCODEERROROUTPUTFILE);
		                		sResp.setText(e.getMessage());
		            			StringWriter sw = new StringWriter();
		            			PrintWriter pw = new PrintWriter(sw);
		            			sResp.setStackTrace(sw.toString());
		            			sResp.setSubType(SmeupToUBUY.SubTypeValue.FILESYSTEM.name());
		            			sResp.setOrigin(SmeupToUBUY.OriginValue.SMEUP.name());	                		
		            			e.printStackTrace(pw);
		                	}
		                }                    
		                smc.getMessage().writeTo(vOut);
		                vOut.flush();
		                vOut.close();
	                } catch (IOException ex) {
                		sResp.setCode(SmeupToUBUY.RETCODEERROROUTPUTFILE);
                		sResp.setText(ex.getMessage());
            			StringWriter sw = new StringWriter();
            			PrintWriter pw = new PrintWriter(sw);
            			sResp.setStackTrace(sw.toString());
            			sResp.setSubType(SmeupToUBUY.SubTypeValue.FILESYSTEM.name());
            			sResp.setOrigin(SmeupToUBUY.OriginValue.SMEUP.name());	                		
            			ex.printStackTrace(pw);
	                } catch (SOAPException e) {
						sResp.setCode(SmeupToUBUY.RETCODEERRORSEND);	
						sResp.setText(e.getMessage());
						StringWriter sw = new StringWriter();
						PrintWriter pw = new PrintWriter(sw);
						sResp.setStackTrace(sw.toString());
						sResp.setSubType(SmeupToUBUY.SubTypeValue.APPLICATION.name());
						sResp.setOrigin(SmeupToUBUY.OriginValue.SMEUPWSDEST.name());
						e.printStackTrace(pw);
	                }		                
	//	                
	//	                //mpb prova per salvare il body e fare l'unmarshal
	//	                Document bodyDoc = smc.getMessage().getSOAPBody().extractContentAsDocument();
	//	                Transformer transformer;
	//					try {
	//						transformer = TransformerFactory.newInstance().newTransformer();
	//						
	//		                Result output = new StreamResult(new File("C:\\Users\\marbonfa\\Desktop\\u-buy\\maggioli\\body.xml"));
	//		                Source input = new DOMSource(bodyDoc);
	//
	//		                try {
	//							transformer.transform(input, output);
	//						} catch (TransformerException e) {
	//							// TODO Auto-generated catch block
	//							e.printStackTrace();
	//						}
	//					} catch (TransformerConfigurationException e) {
	//						// TODO Auto-generated catch block
	//						e.printStackTrace();
	//					} catch (TransformerFactoryConfigurationError e) {
	//						// TODO Auto-generated catch block
	//						e.printStackTrace();
	//					}
	//					 //mpb prova per salvare il body e fare l'unmarshal
		        }
	        	try {
	        		System.out.println("");
		            System.out.println("Risposta SOAP "+vNow+":");
		            smc.getMessage().writeTo(System.out);
		            System.out.println('\n');
	        	} catch (IOException ex) {	                		
            		ex.printStackTrace();
	            } catch (SOAPException e) {
					sResp.setCode(SmeupToUBUY.RETCODEERRORSEND);	
					sResp.setText(e.getMessage());
					StringWriter sw = new StringWriter();
					PrintWriter pw = new PrintWriter(sw);
					sResp.setStackTrace(sw.toString());
					sResp.setSubType(SmeupToUBUY.SubTypeValue.APPLICATION.name());
					sResp.setOrigin(SmeupToUBUY.OriginValue.SMEUPWSDEST.name());
					e.printStackTrace(pw);
	            }
	        } else {
                Document vDoc;
                if (iBodyFile!=null) {
					try {
						vDoc = buildMessageBody(iBodyFile);
	
		                SOAPMessage vMessage= smc.getMessage();
		                System.out.println( "Messaggio SOAP originale: ");               
		                vMessage.writeTo(System.out);
		                SOAPPart vPart= vMessage.getSOAPPart();
		                SOAPEnvelope vEnvelope = vPart.getEnvelope();
	
		                SOAPBody vRemovedBody = vEnvelope.getBody();
		                
		                vRemovedBody.detachNode();
		                vEnvelope.addBody().addDocument(vDoc);
		                System.out.println("");
		                System.out.println( "Messaggio SOAP modificato: ");
		                vMessage.writeTo(System.out);
		                System.out.println('\n');
					} catch (FileNotFoundException e) {
						sResp.setCode(SmeupToUBUY.RETCODEERRORINPUTFILE);
	            		sResp.setText(e.getMessage());
	        			StringWriter sw = new StringWriter();
	        			PrintWriter pw = new PrintWriter(sw);
	        			sResp.setStackTrace(sw.toString());
						sResp.setSubType(SmeupToUBUY.SubTypeValue.FILESYSTEM.name());
						sResp.setOrigin(SmeupToUBUY.OriginValue.SMEUP.name());
						e.printStackTrace(pw);
					} catch (ParserConfigurationException e) {
	 					sResp.setCode(SmeupToUBUY.RETCODEERRORINVALIDXML);
						sResp.setText(e.getMessage());
						StringWriter sw = new StringWriter();
						PrintWriter pw = new PrintWriter(sw);
						sResp.setStackTrace(sw.toString());
						sResp.setSubType(SmeupToUBUY.SubTypeValue.APPLICATION.name());
						sResp.setOrigin(SmeupToUBUY.OriginValue.SMEUP.name());
						e.printStackTrace(pw);
					} catch (SAXException e) {
						sResp.setCode(SmeupToUBUY.RETCODEERRORINVALIDXML);
						sResp.setText(e.getMessage());
						StringWriter sw = new StringWriter();
						PrintWriter pw = new PrintWriter(sw);
						sResp.setStackTrace(sw.toString());
						sResp.setSubType(SmeupToUBUY.SubTypeValue.APPLICATION.name());
						sResp.setOrigin(SmeupToUBUY.OriginValue.SMEUP.name());
						e.printStackTrace(pw);
					} catch (IOException e) {
						sResp.setCode(SmeupToUBUY.RETCODEERRORINPUTFILE);
	            		sResp.setText(e.getMessage());
	        			StringWriter sw = new StringWriter();
	        			PrintWriter pw = new PrintWriter(sw);
	        			sResp.setStackTrace(sw.toString());
						sResp.setSubType(SmeupToUBUY.SubTypeValue.FILESYSTEM.name());
						sResp.setOrigin(SmeupToUBUY.OriginValue.SMEUP.name());
						e.printStackTrace(pw);
					} catch (SOAPException e) {
						sResp.setCode(SmeupToUBUY.RETCODEERRORSEND);	
						sResp.setText(e.getMessage());
						StringWriter sw = new StringWriter();
						PrintWriter pw = new PrintWriter(sw);
						sResp.setStackTrace(sw.toString());
						sResp.setSubType(SmeupToUBUY.SubTypeValue.APPLICATION.name());
						sResp.setOrigin(SmeupToUBUY.OriginValue.SMEUPWSDEST.name());
						e.printStackTrace(pw);
					}
                }
	        }
	 
	 
	        return outboundProperty;
	}

	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}
	
    public Document buildMessageBody(File aBodyFile) throws ParserConfigurationException, FileNotFoundException, SAXException, IOException
    {
        Document vRet= null;
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        docBuilderFactory.setNamespaceAware(true);
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        vRet= docBuilder.parse(new InputSource(new FileReader(aBodyFile)));        
        return vRet;
    }

	public File getiBodyFile() {
		return iBodyFile;
	}

	public void setiBodyFile(File iBodyFile) {
		this.iBodyFile = iBodyFile;
	}

	public File getiResponseFile() {
		return iResponseFile;
	}

	public void setiResponseFile(File iResponseFile) {
		this.iResponseFile = iResponseFile;
	}

}

package it.smeup;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.BindingProvider;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.sun.xml.internal.ws.client.ClientTransportException;

import Smeup.smeui.wscspi.datastructure.interfaces.SezInterface;
import Smeup.smeui.wscspi.datastructure.wscconnector.SPIWsCConnectorConf;
import Smeup.smeui.wscspi.datastructure.wscconnector.SPIWsCConnectorInput;
import Smeup.smeui.wscspi.datastructure.wscconnector.SPIWsCConnectorResponse;
import Smeup.smeui.wscspi.interaction.SPIWsCConnectorAdapter;
import Smeup.smeui.wscspi.interaction.interfaces.SPIWsCConnectorInterface;
import it.cineca.u_gov.co.ws.ApplicationException_Exception;
import it.cineca.u_gov.co.ws.ObjectFactory;
import it.cineca.u_gov.co.ws.WSCOService;
import it.cineca.u_gov.co.ws.WSCOServiceService;

public class SmeupToUBUY extends SPIWsCConnectorAdapter implements SPIWsCConnectorInterface {
	
	public static final String PATHNAMEINPUTBODY = "xml_request";
	public static final String PATHNAMEOUTPUTMESSAGE = "xml_response";
	public static final String PATHNAMEERRORMESSAGE = "xml_error";
	public static final String USER = "USER";
	public static final String PASSWORD = "PASSWORD";
	
	public static final String RETCODEERROROUTPUTPARAM="40";
	public static final String RETCODEERROROUTPUTFILE="50";
	public static final String RETCODEERRORINPUTPARAM="60";	
	public static final String RETCODEERRORINPUTFILE="70";
	public static final String RETCODEERRORSEND="80";
	public static final String RETCODEERRORPAGENOTFOUND="85";
	public static final String RETCODEERRORSERVICE="90";
	public static final String RETCODEERRORINVALIDXML="100";
	public static final String RETCODEERRORDATA="110";
	public static final String RETCODEERRORDIFFERENTWSDL="120";
	
	public static final String RETCODEOK="0"; 
	public static final String EMPTY="EMPTY";
	
	enum TypeValue {
		OK,
		INFO,
		ALERT,
		WARNING,
		ERROR
	}
	
	enum SubTypeValue {
		SYSTEM,
		FILESYSTEM,
		APPLICATION,
		PARAMETERS,
		FORMATDATA,
		NETWORKING,
		DATABASE
	}
	
	enum OriginValue {
		SMEUP,
		SMEUPWSDEST,
		WSDEST,
		PROVIDER
	}
	
	enum Operazione {
		GETUAVOCECOANPR,
		GETDIMANACOFOWP,
		GETTPOPERSEZIVA,
		COMPETVERIFDISP,
		CREACOANANTEST,
		CANCCOANANTEST,
		CREADCE,
		GETELENCOUA,
		GETBENISERVIZI,
		GETVOCICOAN
	}
	
	protected SezInterface mySez;
	
	protected String user;
	protected String password;
	protected String inpBody;
	protected String outMsg;
	protected String errMsg;
	
	protected WSCOService wscos;
	protected WSCOServiceService wscoss;
	protected ObjectFactory of;

	public SmeupToUBUY() {
		// TODO Auto-generated constructor stub
	}

	public SezInterface getSez() {
		// TODO Auto-generated method stub
		return mySez;
	}

	public boolean init(SezInterface arg0, SPIWsCConnectorConf arg1) {
		mySez = arg0;
		
		if (arg1.getData(USER)!=null && arg1.getData(USER).trim().length()>0) {
			user = arg1.getData(USER);
		} else {
			user = "WS_UBUY@uniud.it";
		}
		
		if (arg1.getData(PASSWORD)!=null && arg1.getData(PASSWORD).trim().length()>0) {
			password = arg1.getData(PASSWORD);
		} else {
			password = "RdeFrt453";
		}
			
		return true;
	}

	public SPIWsCConnectorResponse invoke(String arg0, SPIWsCConnectorInput arg1) {
		SmeupResponseCO sr = new SmeupResponseCO();
		Operazione ope = null;
		try {
			ope = Operazione.valueOf(arg0);
		} catch (Exception e) {
			sr.setCode(RETCODEERROROUTPUTPARAM);
			sr.setText("Unknown operation: "+arg0);
			sr.setSubType(SubTypeValue.PARAMETERS.name());
			sr.setOrigin(OriginValue.SMEUP.name());
			sr.setType(TypeValue.ERROR.name());
			return generaRisposta(arg1,sr);
		}
		
		File inpFileBody = null;
		File outFileMsg = null;
		File errFileMsg = null;
				
		inpBody = arg1.getData(PATHNAMEINPUTBODY);
		outMsg = arg1.getData(PATHNAMEOUTPUTMESSAGE);
		errMsg = arg1.getData(PATHNAMEERRORMESSAGE);
		
		if (outMsg == null || outMsg.trim().length()<=0) {
			 sr.setCode(RETCODEERROROUTPUTPARAM);
			 sr.setText("Output file is required");
			 sr.setSubType(SubTypeValue.PARAMETERS.name());
			 sr.setOrigin(OriginValue.SMEUP.name());
			 sr.setType(TypeValue.ERROR.name());
			 return generaRisposta(arg1,sr);
		}
		
		try {
			outFileMsg = new File(outMsg);
			File pathOutMsg = new File(outFileMsg.getParent());
			
			if (!pathOutMsg.exists() && !pathOutMsg.mkdirs()) {
				sr.setCode(RETCODEERROROUTPUTFILE);
				sr.setText("Path output file not exists");
				sr.setSubType(SubTypeValue.FILESYSTEM.name());
				sr.setOrigin(OriginValue.SMEUP.name());
				sr.setType(TypeValue.ERROR.name());
				return generaRisposta(arg1,sr);
			}
			if (!pathOutMsg.isDirectory()) {
				sr.setCode(RETCODEERROROUTPUTFILE);
				sr.setText("Path output file not exists");
				sr.setSubType(SubTypeValue.FILESYSTEM.name());
				sr.setOrigin(OriginValue.SMEUP.name());
				sr.setType(TypeValue.ERROR.name());
				return generaRisposta(arg1,sr);
			}
			FileOutputStream vOut= new FileOutputStream(outFileMsg);
			vOut.close();
			
			if (outFileMsg.exists()) {
				outFileMsg.delete();
			}

		} catch (Exception e) {
			sr.setCode(RETCODEERROROUTPUTFILE);
			sr.setText(e);
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			sr.setStackTrace(sw.toString());
			sr.setSubType(SubTypeValue.FILESYSTEM.name());
			sr.setOrigin(OriginValue.SMEUP.name());
			sr.setType(TypeValue.ERROR.name());
			return generaRisposta(arg1, sr);
		}
		
		if (inpBody == null || inpBody.trim().length()<=0) {
			 sr.setCode(RETCODEERRORINPUTPARAM);
			 sr.setText("Input file is required");
			 sr.setSubType(SubTypeValue.PARAMETERS.name());
			 sr.setOrigin(OriginValue.SMEUP.name());
			 sr.setType(TypeValue.ERROR.name());
			 return generaRisposta(arg1,sr);
		}
		
		try {
			
			inpFileBody = new File(inpBody);
			
			if (!inpFileBody.exists() || !inpFileBody.isFile()) {
				sr.setCode(RETCODEERRORINPUTFILE);
				sr.setText("Input file not exists");
				sr.setSubType(SubTypeValue.FILESYSTEM.name());
				sr.setOrigin(OriginValue.SMEUP.name());
				sr.setType(TypeValue.ERROR.name());
				return generaRisposta(arg1,sr);
			}
			
		} catch (Exception e) {
			sr.setCode(RETCODEERRORINPUTFILE);
			sr.setText(e);
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			sr.setStackTrace(sw.toString());
			sr.setSubType(SubTypeValue.FILESYSTEM.name());
			sr.setOrigin(OriginValue.SMEUP.name());
			sr.setType(TypeValue.ERROR.name());
			return generaRisposta(arg1,sr);
		}	
		//se non ricevo il nome del file di errori lo ricavo:
		//prendo il path del file di output e compongo un nome di default
		if (errMsg == null || errMsg.trim().length()<=0) {
			errMsg = outFileMsg.getPath().substring(0, outFileMsg.getPath().length() - 4).concat("_log.xml");
		}
		
		try {
			errFileMsg = new File(errMsg);
			File pathErrMsg = new File(errFileMsg.getParent());
			
			if (!pathErrMsg.exists() && !pathErrMsg.mkdirs()) {
				sr.setCode(RETCODEERROROUTPUTFILE);
				sr.setText("Path error file not exists");
				sr.setSubType(SubTypeValue.FILESYSTEM.name());
				sr.setOrigin(OriginValue.SMEUP.name());
				sr.setType(TypeValue.ERROR.name());
				return generaRisposta(arg1,sr);
			}
			if (!pathErrMsg.isDirectory()) {
				sr.setCode(RETCODEERROROUTPUTFILE);
				sr.setText("Path error file not exists");
				sr.setSubType(SubTypeValue.FILESYSTEM.name());
				sr.setOrigin(OriginValue.SMEUP.name());
				sr.setType(TypeValue.ERROR.name());
				return generaRisposta(arg1,sr);
			}
			FileOutputStream vOut= new FileOutputStream(errFileMsg);
			vOut.close();
			
			if (errFileMsg.exists()) {
				errFileMsg.delete();
			}

		} catch (Exception e) {
			sr.setCode(RETCODEERROROUTPUTFILE);
			sr.setText(e);
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			sr.setStackTrace(sw.toString());
			sr.setSubType(SubTypeValue.FILESYSTEM.name());
			sr.setOrigin(OriginValue.SMEUP.name());
			sr.setType(TypeValue.ERROR.name());
			return generaRisposta(arg1, sr);
		}
			

		try {
			wscoss = new WSCOServiceService();
			wscoss.setHandlerResolver(new HandlHeaderCO(inpFileBody,outFileMsg,sr));
			
			wscos = wscoss.getWSCOServicePort();
			
			of = new ObjectFactory();
	
			BindingProvider prov = (BindingProvider)wscos;
			prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, user);
			prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
		
		} catch (Exception e) {
			if (sr.getCode()==RETCODEOK) {
				if (e.getClass().equals(ClientTransportException.class)) {
					sr.setCode(RETCODEERRORPAGENOTFOUND);
					sr.setOrigin(OriginValue.SMEUPWSDEST.name());
					sr.setSubType(SubTypeValue.APPLICATION.name());
				} else if (e.getClass().equals(NullPointerException.class)) {
					sr.setCode(RETCODEERRORDIFFERENTWSDL);
					sr.setOrigin(OriginValue.SMEUP.name());
					sr.setSubType(SubTypeValue.APPLICATION.name());
				} else {
					sr.setCode(RETCODEERRORSERVICE);
					sr.setOrigin(OriginValue.SMEUPWSDEST.name());
					sr.setSubType(SubTypeValue.SYSTEM.name());
				}
				sr.setText(e);
				StringWriter sw = new StringWriter();
				PrintWriter pw = new PrintWriter(sw);
				e.printStackTrace(pw);
				sr.setStackTrace(sw.toString());	
				sr.setType(TypeValue.ERROR.name());
			}

			return generaRisposta(arg1,sr);
		}
		try {
			switch (ope) {
			case GETUAVOCECOANPR:
				wscos.getUAVoceCoanProgetto(null,null,null);
				break;
			case GETDIMANACOFOWP:
				wscos.getDimAnaCofogWP(null,null,null,null);
				break;
			case GETTPOPERSEZIVA:
				wscos.getTipoOperazSezionaleIva(null,null,null,null,null,null,null,null);
				break;
			case COMPETVERIFDISP:
				wscos.competVerificaDisp(null);
				break;
			case CREACOANANTEST:
				wscos.creaCoanAntEsterna(null);
				break;
			case CANCCOANANTEST:
				wscos.cancellaCoanAntEsterna(null);
				break;
			case CREADCE:
				wscos.creaDce(null);
				break;
			case GETELENCOUA:
				wscos.getElencoUA(null, null, null);
				break;
			case GETBENISERVIZI:
				wscos.getBeniServizi();
				break;
			case GETVOCICOAN:
				wscos.getVociCoan(null);
				break;
			default:
				return generaRisposta(arg1,"Unknow Operation");
			}
		} catch (Exception e) {
			if (sr.getCode()==RETCODEOK) {
				if (e.getClass().equals(ClientTransportException.class)) {
					sr.setCode(RETCODEERRORPAGENOTFOUND);
					sr.setOrigin(OriginValue.WSDEST.name());
				} else if (e.getClass().equals(ApplicationException_Exception.class)) {
					sr.setCode(RETCODEERRORDATA);
					sr.setOrigin(OriginValue.SMEUPWSDEST.name());
				} else if (e.getClass().equals(NullPointerException.class)) {
					sr.setCode(RETCODEERRORDIFFERENTWSDL);
					sr.setOrigin(OriginValue.SMEUP.name());
				} else {
					sr.setCode(RETCODEERRORSEND);
					sr.setOrigin(OriginValue.SMEUP.name());
				}
				sr.setText(e);
				StringWriter sw = new StringWriter();
				PrintWriter pw = new PrintWriter(sw);
				e.printStackTrace(pw);
				sr.setStackTrace(sw.toString());
				sr.setSubType(SubTypeValue.APPLICATION.name());
				sr.setType(TypeValue.ERROR.name());
			}
		}
		
		return generaRisposta(arg1,sr);
	}

	public boolean ping() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean unplug() {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args)  {
	   	SPIWsCConnectorConf vConf = new SPIWsCConnectorConf();	

        vConf.addData(USER, "WS_UBUY@uniud.it");
        vConf.addData(PASSWORD, "RdeFrt453");
                
        SmeupToUBUY vPlugin = new SmeupToUBUY();
        
        vPlugin.init(null, vConf);		

        SPIWsCConnectorInput vInput=impostaValori(Operazione.COMPETVERIFDISP);        
      	SPIWsCConnectorResponse vResp = vPlugin.invoke(Operazione.COMPETVERIFDISP.name(),vInput);
	      
	    if(vResp != null) {
	      	if (!vResp.getDataTable().isEmpty()) {
	      		Iterator<HashMap<String, String>> vIt = vResp.getDataTable().iterator();
		        while (vIt.hasNext()) {
		           	HashMap<String, String> hp = vIt.next();
		            	
		            Enumeration<String> vKeyEnum = vResp.getKeys(hp);
		            while (vKeyEnum.hasMoreElements()) {
		                String vKey = (String) vKeyEnum.nextElement();
		                String vValue = hp.get(vKey);
		
		                System.out.println(vKey + ": " + vValue);
		            }
		        }
	      	}
	    }
	

	}
	
    public static SPIWsCConnectorInput impostaValori(Operazione ope) {
    	SPIWsCConnectorInput vInput = new SPIWsCConnectorInput();
    	switch (ope) {
    	case GETUAVOCECOANPR:
    		/*
    		vInput.addData("dtRegistrazione", "20170222082254");
    		vInput.addData("cdNodo", "170034");
    		vInput.addData("cdBeneServizio","101");
    		*/
    		break;
    	case GETDIMANACOFOWP:
    		/*
    		vInput.addData("dtReg", "20170222082254");
    		vInput.addData("cdUa","UA.ATE.DIP");
    		vInput.addData("cdVoceCoan","CA.04.03.10.01.24");
    		vInput.addData("cdProgetto","AGER_2011_DA_PORTO");
    		*/
    		break;
    	case GETTPOPERSEZIVA:
    		/*
    		vInput.addData("tiCampoAttivita", "?");
    		vInput.addData("idAbSogg","?");
    		vInput.addData("partIva","?");
    		vInput.addData("codFis","?");
    		vInput.addData("ragioneSoc","?");
    		vInput.addData("dtReg","?");
    		vInput.addData("cdUO","?");
    		vInput.addData("percIva","?");
    		*/
    		break;
    	case COMPETVERIFDISP:
    		/*
    		 * vInput.addData(PATHNAMEINPUTBODY, "\\\\10.250.50.46\\smedoc\\Smeup\\Export\\Cineca\\inpcompetverifdisp.xml");
    		 * vInput.addData(PATHNAMEOUTPUTMESSAGE, "\\\\10.250.50.46\\smedoc\\Smeup\\Import\\Cineca\\out.xml");
    		 * 
    		 vInput.addData(PATHNAMEINPUTBODY, "C:\\xmlcineca\\inpcompetverifdisp.xml");
    		 vInput.addData(PATHNAMEOUTPUTMESSAGE, "C:\\xmlcineca\\outcompetverifdisp.xml"); 
     		*/
    		vInput.addData(PATHNAMEINPUTBODY, "C:\\Users\\marbonfa\\Desktop\\u-buy\\cineca\\C04012416142494.xml");
   		 	vInput.addData(PATHNAMEOUTPUTMESSAGE, "C:\\Users\\marbonfa\\Desktop\\u-buy\\cineca\\outC04012416142494.xml"); 
    		break;
		case CREACOANANTEST:
			break;
		case CANCCOANANTEST:
			// vInput.addData("idDocumento", "3");
			break;
		case CREADCE:
			break;
		case GETELENCOUA:
			/*
			vInput.addData("esercizio", "prova");
			vInput.addData("codiceUO", "");
			vInput.addData("conUAfiglie", "false");
			*/
			break;
		case GETBENISERVIZI:
			break;
		case GETVOCICOAN:
			// vInput.addData("esercizio", "prova");
			break;			
    	default:
    		break;
    	}
    	return vInput;
    }
	
	private SPIWsCConnectorResponse generaRisposta(SPIWsCConnectorInput tabInput, SmeupResponseCO DRC) {
		//MPB scrivo gli eventuali errori in un altro file diverso da quello di risposta e anche in caso positivo
//		if (DRC.getCode()!=RETCODEOK) {
			File out = null;
			if (errMsg == null && errMsg.trim().length()<=0) {
				out = new File(System.currentTimeMillis()+".xml");
			} else {
				out = new File(errMsg);
				if (DRC.getCode()==RETCODEERROROUTPUTFILE) {
					String name = out.getName();
					out = new File(name);
				}
			}
			scriviFileXml(tabInput,DRC,out);
				
//		} else {
//			DRC.setType(TypeValue.OK.name());
//		}
		

		SPIWsCConnectorResponse resp = new SPIWsCConnectorResponse();
		//nella prima hashMap metto codici di errore/risposte da XPP
		HashMap<String,String> tab1Out = new HashMap<String, String>();
		ArrayList<HashMap<String,String>> vGrid = new ArrayList<HashMap<String,String>>();
		
		tab1Out.put("SmeupPluginReturnCode", DRC.getCode());
		tab1Out.put("SmeupPluginText", DRC.getText());
		tab1Out.put("SmeupPluginStackTrace", DRC.getStackTrace());
		tab1Out.put("SmeupPluginType", DRC.getType());
		tab1Out.put("SmeupPluginSubType", DRC.getSubType());
		tab1Out.put("SmeupPluginOrigin", DRC.getOrigin());
		tab1Out.put("SmeupPluginTechnicalText", DRC.getTechnicalText());
		
		
		vGrid.add(tab1Out);
		
		//nella seconda hashMap accodo tutti i dati di input
		HashMap<String,String> tabOut = new HashMap<String, String>();
        Iterator<String> vKeyIter = tabInput.getKeys().iterator();

        while(vKeyIter.hasNext())
        {
            String vKey = (String) vKeyIter.next();
            String vValue = tabInput.getData(vKey);
            tabOut.put(vKey, vValue);
        }
        
        vGrid.add(tabOut);
        
        resp.setDataTable(vGrid);
        
		return resp;
	}
	
	private void scriviFileXml(SPIWsCConnectorInput tabInput, SmeupResponseCO DRC, File out) {
		  try {

				DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

				Document doc = docBuilder.newDocument();
				Element rootElement = doc.createElement("SmeupResponseError");
				doc.appendChild(rootElement);

				Element smeupOutput = doc.createElement("SmeupOutput");
				rootElement.appendChild(smeupOutput);
				
				if (wscoss!= null && wscoss.getWSDLDocumentLocation()!=null) {
					Element smeupPluginWsdlLocation = doc.createElement("SmeupPluginWsdlLocation");
					smeupPluginWsdlLocation.appendChild(doc.createTextNode(wscoss.getWSDLDocumentLocation().toExternalForm()));
					smeupOutput.appendChild(smeupPluginWsdlLocation);
				}
				
				Element smeupPluginReturnCode = doc.createElement("SmeupPluginReturnCode");
				smeupPluginReturnCode.appendChild(doc.createTextNode(DRC.getCode()));
				smeupOutput.appendChild(smeupPluginReturnCode);

				Element smeupPluginText = doc.createElement("SmeupPluginText");
				smeupPluginText.appendChild(doc.createTextNode(DRC.getText()));
				smeupOutput.appendChild(smeupPluginText);
				
				Element technicalText = doc.createElement("SmeupTechnicalText");
				technicalText.appendChild(doc.createTextNode(DRC.getTechnicalText()));
				smeupOutput.appendChild(technicalText);
				
				Element smeupPluginStackTrace = doc.createElement("SmeupPluginStackTrace");
				smeupPluginStackTrace.appendChild(doc.createTextNode(DRC.getStackTrace()));
				smeupOutput.appendChild(smeupPluginStackTrace);
				
				Element smeupPluginType = doc.createElement("SmeupPluginType");
				smeupPluginType.appendChild(doc.createTextNode(DRC.getType()));
				smeupOutput.appendChild(smeupPluginType);
				
				Element smeupPluginSubType = doc.createElement("SmeupPluginSubType");
				smeupPluginSubType.appendChild(doc.createTextNode(DRC.getSubType()));
				smeupOutput.appendChild(smeupPluginSubType);
				
				Element smeupPluginOrigin = doc.createElement("SmeupPluginOrigin");
				smeupPluginOrigin.appendChild(doc.createTextNode(DRC.getOrigin()));
				smeupOutput.appendChild(smeupPluginOrigin);
				
				Element smeupInput = doc.createElement("SmeupInput");
				rootElement.appendChild(smeupInput);
				
		        Iterator<String> vKeyIter = tabInput.getKeys().iterator();

		        while(vKeyIter.hasNext())
		        {
		        	String vKey = (String) vKeyIter.next();
		            String vValue = tabInput.getData(vKey);
					Element element = doc.createElement(vKey);
					element.appendChild(doc.createTextNode(vValue));
					smeupInput.appendChild(element);
		            
		        }

		        Document docBody;
				try {
					docBody = docBuilder.parse(new File(inpBody));
					
					Element smeupContentBodyFile = doc.createElement("SmeupContentBodyFile");
					NodeList list = docBody.getChildNodes();
					for(int i = 0 ; i< list.getLength() ; i++) {
						Node n = list.item(i);
						Node copiedNode = doc.importNode(n, true);
						smeupContentBodyFile.appendChild(copiedNode);

					}
			        
					smeupInput.appendChild(smeupContentBodyFile);
					

				} catch (SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					        

				// write the content into xml file
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(out);

				transformer.transform(source, result);


			  } catch (ParserConfigurationException pce) {
				pce.printStackTrace();
			  } catch (TransformerException tfe) {
				tfe.printStackTrace();
			  }
	}
	
	
	private SPIWsCConnectorResponse generaRisposta(SPIWsCConnectorInput tabInput, String freeText) {
		SmeupResponseCO DRC = new SmeupResponseCO();
		DRC.setText(freeText);
		
		return generaRisposta(tabInput,DRC);
	}
	
    protected static GregorianCalendar decodificaData(String dateStr) {
    	if (dateStr==null){ return null;};
    	if (dateStr.trim().length()<14){ return null;};
    	GregorianCalendar gc = new GregorianCalendar();
		gc.setLenient(true);
		gc.set(GregorianCalendar.YEAR, new Integer(dateStr.substring(0, 4)).intValue());
		gc.set(GregorianCalendar.MONTH, new Integer(dateStr.substring(4, 6)).intValue());
		gc.set(GregorianCalendar.DATE, new Integer(dateStr.substring(6, 8)).intValue());
		gc.set(GregorianCalendar.HOUR, new Integer(dateStr.substring(8, 10)).intValue());
		gc.set(GregorianCalendar.MINUTE, new Integer(dateStr.substring(10, 12)).intValue());
		gc.set(GregorianCalendar.SECOND, new Integer(dateStr.substring(12, 14)).intValue());
		return gc;
    }
    
    //Chiamate predisposte per avere parametri in input non utilizzate, ma lasciate per eventuali test "rapidi"
    
//	private SPIWsCConnectorResponse sendGetUaVoceCoanProgettoWithPar(SPIWsCConnectorInput arg1) {
//		SmeupResponse sr = new SmeupResponse();
//        XMLGregorianCalendar dtRegistrazione;
//        String cdNodo;
//        String cdBeneServizio;
//		try {
//			dtRegistrazione = DatatypeFactory.newInstance().newXMLGregorianCalendar(decodificaData(arg1.getData("dtRegistrazione")));
//			cdNodo = arg1.getData("cdNodo");
//			cdBeneServizio = arg1.getData("cdBeneServizio");
//			
//			if (dtRegistrazione == null || 
//				cdNodo == null ||
//				cdBeneServizio == null) {
//				sr.setCode(-2);
//				sr.setText("dtRegistrazione, cdNodo, cdBeneServizio are required");
//			
//				return generaRisposta(arg1,sr);
//			}
//			
//			wscos.getUAVoceCoanProgetto(dtRegistrazione, cdNodo, cdBeneServizio);
//					
//			
//			
//		} catch (Exception e) {
//			if (sr.getCode()==0){
//				sr.setCode(RETCODEERRORSEND);
//				sr.setText(e);
//				sr.setExternalText(e.getStackTrace().toString());
//			} else {
//				sr.setText(e);
//			}
//		}
//
//		return generaRisposta(arg1,sr);
//	}
//	
//	private SPIWsCConnectorResponse sendGetDimAnaCofogWPWithPar(SPIWsCConnectorInput arg1) {
//		SmeupResponse sr = new SmeupResponse();
//		XMLGregorianCalendar dtReg;
//        String cdUa;
//        String cdVoceCoan;
//        String cdProgetto;
//		try {
//			dtReg = DatatypeFactory.newInstance().newXMLGregorianCalendar(decodificaData(arg1.getData("dtReg")));
//			cdUa = arg1.getData("cdUa");
//			cdVoceCoan = arg1.getData("cdVoceCoan");
//			cdProgetto = arg1.getData("cdProgetto");
//			
//			if (dtReg == null || 
//				cdUa == null) {
//				sr.setCode(-2);
//				sr.setText("dtReg, cdUa are required");
//			
//				return generaRisposta(arg1,sr);
//			}
//			
//			wscos.getDimAnaCofogWP(dtReg, cdUa, cdVoceCoan, cdProgetto);
//					
//			
//			
//		} catch (Exception e) {
//			if (sr.getCode()==0){
//				sr.setCode(RETCODEERRORSEND);
//				sr.setText(e);
//				sr.setExternalText(e.getStackTrace().toString());
//			} else {
//				sr.setText(e);
//			}
//		}
//
//		return generaRisposta(arg1,sr);
//	}
//	
//	private SPIWsCConnectorResponse sendGetTipoOperazSezionaleIvaWithPar(SPIWsCConnectorInput arg1) {
//		SmeupResponse sr = new SmeupResponse();
//		String tiCampoAttivita;
//        Long idAbSogg;
//        String partIva;
//        String codFis;
//        String ragioneSoc;
//        XMLGregorianCalendar dtReg;
//        String cdUO;
//        BigDecimal percIva;
//		try {
//			tiCampoAttivita = arg1.getData("tiCampoAttivita");
//			String idAbSoggStr = arg1.getData("idAbSogg");
//			partIva = arg1.getData("partIva");
//			codFis = arg1.getData("codFis");
//			ragioneSoc = arg1.getData("ragioneSoc");
//			dtReg = DatatypeFactory.newInstance().newXMLGregorianCalendar(decodificaData(arg1.getData("dtReg")));
//			cdUO = arg1.getData("cdUO");
//			String percIvaStr = arg1.getData("percIva");
//			
//			if (tiCampoAttivita == null || 
//				cdUO == null ||
//				percIvaStr == null) {
//				sr.setCode(-2);
//				sr.setText("tiCampoAttivita, cdUO, percIva are required");
//			
//				return generaRisposta(arg1,sr);
//			}
//			
//			if (idAbSoggStr!=null && idAbSoggStr.trim().length()>0) {
//				idAbSogg = new Long(idAbSoggStr);
//			} else {
//				idAbSogg = new Long(0);
//			}
//			
//			if (percIvaStr!=null && percIvaStr.trim().length()>0) {
//				percIva = new BigDecimal(percIvaStr);
//			} else {
//				percIva = new BigDecimal(0);
//			}
//			
//			wscos.getTipoOperazSezionaleIva(tiCampoAttivita, idAbSogg, partIva, codFis, ragioneSoc, dtReg, cdUO, percIva);
//			
//	
//			
//		} catch (Exception e) {
//			if (sr.getCode()==0){
//				sr.setCode(RETCODEERRORSEND);
//				sr.setText(e);
//				sr.setExternalText(e.getStackTrace().toString());
//			} else {
//				sr.setText(e);
//			}
//		}
//
//		return generaRisposta(arg1,sr);
//	}
//	
//	private SPIWsCConnectorResponse sendCancellaCoanAntEsternaWithPar(SPIWsCConnectorInput arg1) {
//		SmeupResponse sr = new SmeupResponse();
//		Long idDettaglioDocumento;
//		try {
//			String idDettaglioDocumentoStr = arg1.getData("idDettaglioDocumento");
//			
//			if (idDettaglioDocumentoStr == null || idDettaglioDocumentoStr.trim().length()<=0) {
//				sr.setCode(-2);
//				sr.setText("idDettaglioDocumento is required");
//			
//				return generaRisposta(arg1,sr);
//			}
//			
//			idDettaglioDocumento = new Long(idDettaglioDocumentoStr);
//			
//			wscos.cancellaCoanAntEsterna(idDettaglioDocumento);
//					
//			
//			
//		} catch (Exception e) {
//			if (sr.getCode()==0){
//				sr.setCode(RETCODEERRORSEND);
//				sr.setText(e);
//				sr.setExternalText(e.getStackTrace().toString());
//			} else {
//				sr.setText(e);
//			}
//		}
//
//		return generaRisposta(arg1,sr);
//	}

}

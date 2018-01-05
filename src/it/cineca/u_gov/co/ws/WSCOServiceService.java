
package it.cineca.u_gov.co.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSCOServiceService", targetNamespace = "http://ws.co.u-gov.cineca.it/", wsdlLocation = "https://univ-test02.sviluppo.u-gov.it/ws-co/ws/private/service.wsdl")
public class WSCOServiceService
    extends Service
{

    private final static URL WSCOSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException WSCOSERVICESERVICE_EXCEPTION;
    private final static QName WSCOSERVICESERVICE_QNAME = new QName("http://ws.co.u-gov.cineca.it/", "WSCOServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
//            url = new URL("https://univ-test02.sviluppo.u-gov.it/ws-co/ws/private/service.wsdl");
        	url = new URL("https://univ-test03.sviluppo.u-gov.it/ws-co/ws/private/service.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSCOSERVICESERVICE_WSDL_LOCATION = url;
        WSCOSERVICESERVICE_EXCEPTION = e;
    }

    public WSCOServiceService() {
        super(__getWsdlLocation(), WSCOSERVICESERVICE_QNAME);
    }

    public WSCOServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSCOSERVICESERVICE_QNAME, features);
    }

    public WSCOServiceService(URL wsdlLocation) {
        super(wsdlLocation, WSCOSERVICESERVICE_QNAME);
    }

    public WSCOServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSCOSERVICESERVICE_QNAME, features);
    }

    public WSCOServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSCOServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSCOService
     */
    @WebEndpoint(name = "WSCOServicePort")
    public WSCOService getWSCOServicePort() {
        return super.getPort(new QName("http://ws.co.u-gov.cineca.it/", "WSCOServicePort"), WSCOService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSCOService
     */
    @WebEndpoint(name = "WSCOServicePort")
    public WSCOService getWSCOServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.co.u-gov.cineca.it/", "WSCOServicePort"), WSCOService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSCOSERVICESERVICE_EXCEPTION!= null) {
            throw WSCOSERVICESERVICE_EXCEPTION;
        }
        return WSCOSERVICESERVICE_WSDL_LOCATION;
    }

}

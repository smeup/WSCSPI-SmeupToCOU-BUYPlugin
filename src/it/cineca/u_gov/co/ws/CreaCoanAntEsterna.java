
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creaCoanAntEsterna complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creaCoanAntEsterna">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documento" type="{http://ws.co.u-gov.cineca.it/}scritturaEsternaCoanDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creaCoanAntEsterna", propOrder = {
    "documento"
})
public class CreaCoanAntEsterna {

    protected ScritturaEsternaCoanDTO documento;

    /**
     * Gets the value of the documento property.
     * 
     * @return
     *     possible object is
     *     {@link ScritturaEsternaCoanDTO }
     *     
     */
    public ScritturaEsternaCoanDTO getDocumento() {
        return documento;
    }

    /**
     * Sets the value of the documento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScritturaEsternaCoanDTO }
     *     
     */
    public void setDocumento(ScritturaEsternaCoanDTO value) {
        this.documento = value;
    }

}

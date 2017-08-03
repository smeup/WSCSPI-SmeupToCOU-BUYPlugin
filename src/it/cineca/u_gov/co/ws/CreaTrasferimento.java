
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creaTrasferimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creaTrasferimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trasferimento" type="{http://ws.co.u-gov.cineca.it/}creaTrasfeInDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creaTrasferimento", propOrder = {
    "trasferimento"
})
public class CreaTrasferimento {

    protected CreaTrasfeInDTO trasferimento;

    /**
     * Gets the value of the trasferimento property.
     * 
     * @return
     *     possible object is
     *     {@link CreaTrasfeInDTO }
     *     
     */
    public CreaTrasfeInDTO getTrasferimento() {
        return trasferimento;
    }

    /**
     * Sets the value of the trasferimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreaTrasfeInDTO }
     *     
     */
    public void setTrasferimento(CreaTrasfeInDTO value) {
        this.trasferimento = value;
    }

}

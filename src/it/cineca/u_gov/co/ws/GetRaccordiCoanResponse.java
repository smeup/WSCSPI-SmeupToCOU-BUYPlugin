
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getRaccordiCoanResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getRaccordiCoanResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.co.u-gov.cineca.it/}raccordiCoanOutDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRaccordiCoanResponse", propOrder = {
    "_return"
})
public class GetRaccordiCoanResponse {

    @XmlElement(name = "return")
    protected RaccordiCoanOutDTO _return;

    /**
     * Recupera il valore della proprietà return.
     * 
     * @return
     *     possible object is
     *     {@link RaccordiCoanOutDTO }
     *     
     */
    public RaccordiCoanOutDTO getReturn() {
        return _return;
    }

    /**
     * Imposta il valore della proprietà return.
     * 
     * @param value
     *     allowed object is
     *     {@link RaccordiCoanOutDTO }
     *     
     */
    public void setReturn(RaccordiCoanOutDTO value) {
        this._return = value;
    }

}

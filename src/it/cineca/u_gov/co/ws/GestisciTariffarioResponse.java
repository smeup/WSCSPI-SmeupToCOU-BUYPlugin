
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per gestisciTariffarioResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="gestisciTariffarioResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.co.u-gov.cineca.it/}gestTariffarioDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gestisciTariffarioResponse", propOrder = {
    "_return"
})
public class GestisciTariffarioResponse {

    @XmlElement(name = "return")
    protected GestTariffarioDTO _return;

    /**
     * Recupera il valore della propriet� return.
     * 
     * @return
     *     possible object is
     *     {@link GestTariffarioDTO }
     *     
     */
    public GestTariffarioDTO getReturn() {
        return _return;
    }

    /**
     * Imposta il valore della propriet� return.
     * 
     * @param value
     *     allowed object is
     *     {@link GestTariffarioDTO }
     *     
     */
    public void setReturn(GestTariffarioDTO value) {
        this._return = value;
    }

}

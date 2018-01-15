
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per gestTariffarioOutDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="gestTariffarioOutDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdTariffa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msgErrore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gestTariffarioOutDTO", propOrder = {
    "cdTariffa",
    "cdUO",
    "msgErrore"
})
public class GestTariffarioOutDTO {

    protected String cdTariffa;
    protected String cdUO;
    protected String msgErrore;

    /**
     * Recupera il valore della propriet� cdTariffa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdTariffa() {
        return cdTariffa;
    }

    /**
     * Imposta il valore della propriet� cdTariffa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdTariffa(String value) {
        this.cdTariffa = value;
    }

    /**
     * Recupera il valore della propriet� cdUO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUO() {
        return cdUO;
    }

    /**
     * Imposta il valore della propriet� cdUO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUO(String value) {
        this.cdUO = value;
    }

    /**
     * Recupera il valore della propriet� msgErrore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgErrore() {
        return msgErrore;
    }

    /**
     * Imposta il valore della propriet� msgErrore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgErrore(String value) {
        this.msgErrore = value;
    }

}

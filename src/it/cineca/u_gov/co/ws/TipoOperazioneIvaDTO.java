
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tipoOperazioneIvaDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tipoOperazioneIvaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdTiOperazIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsTiOperazIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoOperazioneIvaDTO", propOrder = {
    "cdTiOperazIva",
    "dsTiOperazIva"
})
public class TipoOperazioneIvaDTO {

    protected String cdTiOperazIva;
    protected String dsTiOperazIva;

    /**
     * Recupera il valore della proprietà cdTiOperazIva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdTiOperazIva() {
        return cdTiOperazIva;
    }

    /**
     * Imposta il valore della proprietà cdTiOperazIva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdTiOperazIva(String value) {
        this.cdTiOperazIva = value;
    }

    /**
     * Recupera il valore della proprietà dsTiOperazIva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsTiOperazIva() {
        return dsTiOperazIva;
    }

    /**
     * Imposta il valore della proprietà dsTiOperazIva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsTiOperazIva(String value) {
        this.dsTiOperazIva = value;
    }

}

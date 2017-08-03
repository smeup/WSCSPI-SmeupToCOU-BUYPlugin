
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoOperazioneIvaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the cdTiOperazIva property.
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
     * Sets the value of the cdTiOperazIva property.
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
     * Gets the value of the dsTiOperazIva property.
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
     * Sets the value of the dsTiOperazIva property.
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

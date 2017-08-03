
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoOperazioneIvaLightDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoOperazioneIvaLightDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdTipoOperazioneIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "tipoOperazioneIvaLightDTO", propOrder = {
    "cdTipoOperazioneIva",
    "dsTiOperazIva"
})
public class TipoOperazioneIvaLightDTO {

    protected String cdTipoOperazioneIva;
    protected String dsTiOperazIva;

    /**
     * Gets the value of the cdTipoOperazioneIva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdTipoOperazioneIva() {
        return cdTipoOperazioneIva;
    }

    /**
     * Sets the value of the cdTipoOperazioneIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdTipoOperazioneIva(String value) {
        this.cdTipoOperazioneIva = value;
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

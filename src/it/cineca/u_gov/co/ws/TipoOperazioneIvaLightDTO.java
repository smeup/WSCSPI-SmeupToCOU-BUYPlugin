
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tipoOperazioneIvaLightDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietÓ cdTipoOperazioneIva.
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
     * Imposta il valore della proprietÓ cdTipoOperazioneIva.
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
     * Recupera il valore della proprietÓ dsTiOperazIva.
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
     * Imposta il valore della proprietÓ dsTiOperazIva.
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

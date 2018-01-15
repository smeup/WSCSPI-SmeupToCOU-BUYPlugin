
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per getTipoOperazioneIva complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getTipoOperazioneIva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dtRegistrazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idAb" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tiCampoAttivita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiAttivoPassivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTipoOperazioneIva", propOrder = {
    "dtRegistrazione",
    "idAb",
    "tiCampoAttivita",
    "tiAttivoPassivo"
})
public class GetTipoOperazioneIva {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtRegistrazione;
    protected Long idAb;
    protected String tiCampoAttivita;
    protected String tiAttivoPassivo;

    /**
     * Recupera il valore della propriet� dtRegistrazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtRegistrazione() {
        return dtRegistrazione;
    }

    /**
     * Imposta il valore della propriet� dtRegistrazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtRegistrazione(XMLGregorianCalendar value) {
        this.dtRegistrazione = value;
    }

    /**
     * Recupera il valore della propriet� idAb.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAb() {
        return idAb;
    }

    /**
     * Imposta il valore della propriet� idAb.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAb(Long value) {
        this.idAb = value;
    }

    /**
     * Recupera il valore della propriet� tiCampoAttivita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiCampoAttivita() {
        return tiCampoAttivita;
    }

    /**
     * Imposta il valore della propriet� tiCampoAttivita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiCampoAttivita(String value) {
        this.tiCampoAttivita = value;
    }

    /**
     * Recupera il valore della propriet� tiAttivoPassivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiAttivoPassivo() {
        return tiAttivoPassivo;
    }

    /**
     * Imposta il valore della propriet� tiAttivoPassivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiAttivoPassivo(String value) {
        this.tiAttivoPassivo = value;
    }

}


package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per getCodiciIva complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getCodiciIva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dtRegistrazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tiCampoAttivita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdTipoOperazioneIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdBeneServizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdTariffa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCodiciIva", propOrder = {
    "dtRegistrazione",
    "tiCampoAttivita",
    "cdTipoOperazioneIva",
    "cdBeneServizio",
    "cdTariffa",
    "cdUo"
})
public class GetCodiciIva {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtRegistrazione;
    protected String tiCampoAttivita;
    protected String cdTipoOperazioneIva;
    protected String cdBeneServizio;
    protected String cdTariffa;
    protected String cdUo;

    /**
     * Recupera il valore della proprietÓ dtRegistrazione.
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
     * Imposta il valore della proprietÓ dtRegistrazione.
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
     * Recupera il valore della proprietÓ tiCampoAttivita.
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
     * Imposta il valore della proprietÓ tiCampoAttivita.
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
     * Recupera il valore della proprietÓ cdBeneServizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdBeneServizio() {
        return cdBeneServizio;
    }

    /**
     * Imposta il valore della proprietÓ cdBeneServizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdBeneServizio(String value) {
        this.cdBeneServizio = value;
    }

    /**
     * Recupera il valore della proprietÓ cdTariffa.
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
     * Imposta il valore della proprietÓ cdTariffa.
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
     * Recupera il valore della proprietÓ cdUo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUo() {
        return cdUo;
    }

    /**
     * Imposta il valore della proprietÓ cdUo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUo(String value) {
        this.cdUo = value;
    }

}

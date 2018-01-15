
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per creaBuonoDetOutDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="creaBuonoDetOutDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdInvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtRegistrazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="flErrore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idBuonoCarScar" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="messaggioErrore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messaggioInformativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgBuonoCarScar" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tipoBuono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creaBuonoDetOutDTO", propOrder = {
    "cdInvent",
    "dtRegistrazione",
    "esercizio",
    "flErrore",
    "idBuonoCarScar",
    "messaggioErrore",
    "messaggioInformativo",
    "pgBuonoCarScar",
    "tipoBuono"
})
public class CreaBuonoDetOutDTO {

    protected String cdInvent;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtRegistrazione;
    protected Integer esercizio;
    protected Boolean flErrore;
    protected Long idBuonoCarScar;
    protected String messaggioErrore;
    protected String messaggioInformativo;
    protected Long pgBuonoCarScar;
    protected String tipoBuono;

    /**
     * Recupera il valore della proprietà cdInvent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdInvent() {
        return cdInvent;
    }

    /**
     * Imposta il valore della proprietà cdInvent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdInvent(String value) {
        this.cdInvent = value;
    }

    /**
     * Recupera il valore della proprietà dtRegistrazione.
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
     * Imposta il valore della proprietà dtRegistrazione.
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
     * Recupera il valore della proprietà esercizio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEsercizio() {
        return esercizio;
    }

    /**
     * Imposta il valore della proprietà esercizio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEsercizio(Integer value) {
        this.esercizio = value;
    }

    /**
     * Recupera il valore della proprietà flErrore.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlErrore() {
        return flErrore;
    }

    /**
     * Imposta il valore della proprietà flErrore.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlErrore(Boolean value) {
        this.flErrore = value;
    }

    /**
     * Recupera il valore della proprietà idBuonoCarScar.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdBuonoCarScar() {
        return idBuonoCarScar;
    }

    /**
     * Imposta il valore della proprietà idBuonoCarScar.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdBuonoCarScar(Long value) {
        this.idBuonoCarScar = value;
    }

    /**
     * Recupera il valore della proprietà messaggioErrore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessaggioErrore() {
        return messaggioErrore;
    }

    /**
     * Imposta il valore della proprietà messaggioErrore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessaggioErrore(String value) {
        this.messaggioErrore = value;
    }

    /**
     * Recupera il valore della proprietà messaggioInformativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessaggioInformativo() {
        return messaggioInformativo;
    }

    /**
     * Imposta il valore della proprietà messaggioInformativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessaggioInformativo(String value) {
        this.messaggioInformativo = value;
    }

    /**
     * Recupera il valore della proprietà pgBuonoCarScar.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPgBuonoCarScar() {
        return pgBuonoCarScar;
    }

    /**
     * Imposta il valore della proprietà pgBuonoCarScar.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPgBuonoCarScar(Long value) {
        this.pgBuonoCarScar = value;
    }

    /**
     * Recupera il valore della proprietà tipoBuono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoBuono() {
        return tipoBuono;
    }

    /**
     * Imposta il valore della proprietà tipoBuono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoBuono(String value) {
        this.tipoBuono = value;
    }

}

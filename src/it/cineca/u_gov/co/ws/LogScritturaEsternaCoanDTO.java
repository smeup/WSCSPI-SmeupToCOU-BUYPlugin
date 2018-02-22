
package it.cineca.u_gov.co.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per logScritturaEsternaCoanDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="logScritturaEsternaCoanDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdUaBudget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dettagli" type="{http://ws.co.u-gov.cineca.it/}logDettaglioScrEsternaCoanDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idDettaglioDocumento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idScrCoan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pgScr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logScritturaEsternaCoanDTO", propOrder = {
    "cdUaBudget",
    "dettagli",
    "esercizio",
    "idDettaglioDocumento",
    "idScrCoan",
    "pgScr"
})
public class LogScritturaEsternaCoanDTO {

    protected String cdUaBudget;
    @XmlElement(nillable = true)
    protected List<LogDettaglioScrEsternaCoanDTO> dettagli;
    protected Integer esercizio;
    protected Long idDettaglioDocumento;
    protected Long idScrCoan;
    protected Long pgScr;

    /**
     * Recupera il valore della proprietà cdUaBudget.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUaBudget() {
        return cdUaBudget;
    }

    /**
     * Imposta il valore della proprietà cdUaBudget.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUaBudget(String value) {
        this.cdUaBudget = value;
    }

    /**
     * Gets the value of the dettagli property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dettagli property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDettagli().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogDettaglioScrEsternaCoanDTO }
     * 
     * 
     */
    public List<LogDettaglioScrEsternaCoanDTO> getDettagli() {
        if (dettagli == null) {
            dettagli = new ArrayList<LogDettaglioScrEsternaCoanDTO>();
        }
        return this.dettagli;
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
     * Recupera il valore della proprietà idDettaglioDocumento.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDettaglioDocumento() {
        return idDettaglioDocumento;
    }

    /**
     * Imposta il valore della proprietà idDettaglioDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDettaglioDocumento(Long value) {
        this.idDettaglioDocumento = value;
    }

    /**
     * Recupera il valore della proprietà idScrCoan.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdScrCoan() {
        return idScrCoan;
    }

    /**
     * Imposta il valore della proprietà idScrCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdScrCoan(Long value) {
        this.idScrCoan = value;
    }

    /**
     * Recupera il valore della proprietà pgScr.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPgScr() {
        return pgScr;
    }

    /**
     * Imposta il valore della proprietà pgScr.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPgScr(Long value) {
        this.pgScr = value;
    }

}

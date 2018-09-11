
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per pdcCoanDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="pdcCoanDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdVoceCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denomVoceCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsVoceCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="flSchedaBudget" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idPdcCoan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tiVoce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pdcCoanDTO", propOrder = {
    "cdVoceCoan",
    "denomVoceCoan",
    "dsVoceCoan",
    "esercizio",
    "flSchedaBudget",
    "idPdcCoan",
    "tiVoce"
})
public class PdcCoanDTO {

    protected String cdVoceCoan;
    protected String denomVoceCoan;
    protected String dsVoceCoan;
    protected Integer esercizio;
    protected Boolean flSchedaBudget;
    protected Long idPdcCoan;
    protected String tiVoce;

    /**
     * Recupera il valore della proprietà cdVoceCoan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdVoceCoan() {
        return cdVoceCoan;
    }

    /**
     * Imposta il valore della proprietà cdVoceCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdVoceCoan(String value) {
        this.cdVoceCoan = value;
    }

    /**
     * Recupera il valore della proprietà denomVoceCoan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenomVoceCoan() {
        return denomVoceCoan;
    }

    /**
     * Imposta il valore della proprietà denomVoceCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenomVoceCoan(String value) {
        this.denomVoceCoan = value;
    }

    /**
     * Recupera il valore della proprietà dsVoceCoan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsVoceCoan() {
        return dsVoceCoan;
    }

    /**
     * Imposta il valore della proprietà dsVoceCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsVoceCoan(String value) {
        this.dsVoceCoan = value;
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
     * Recupera il valore della proprietà flSchedaBudget.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlSchedaBudget() {
        return flSchedaBudget;
    }

    /**
     * Imposta il valore della proprietà flSchedaBudget.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlSchedaBudget(Boolean value) {
        this.flSchedaBudget = value;
    }

    /**
     * Recupera il valore della proprietà idPdcCoan.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPdcCoan() {
        return idPdcCoan;
    }

    /**
     * Imposta il valore della proprietà idPdcCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPdcCoan(Long value) {
        this.idPdcCoan = value;
    }

    /**
     * Recupera il valore della proprietà tiVoce.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiVoce() {
        return tiVoce;
    }

    /**
     * Imposta il valore della proprietà tiVoce.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiVoce(String value) {
        this.tiVoce = value;
    }

}

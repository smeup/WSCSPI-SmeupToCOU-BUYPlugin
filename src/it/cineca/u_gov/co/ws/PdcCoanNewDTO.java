
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per pdcCoanNewDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="pdcCoanNewDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdVoceCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denomVoceCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flCompetenz" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flRiportoVinc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flSchedaBudget" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idVoceCoan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "pdcCoanNewDTO", propOrder = {
    "cdVoceCoan",
    "denomVoceCoan",
    "flCompetenz",
    "flRiportoVinc",
    "flSchedaBudget",
    "idVoceCoan",
    "tiVoce"
})
public class PdcCoanNewDTO {

    protected String cdVoceCoan;
    protected String denomVoceCoan;
    protected Boolean flCompetenz;
    protected Boolean flRiportoVinc;
    protected Boolean flSchedaBudget;
    protected Long idVoceCoan;
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
     * Recupera il valore della proprietà flCompetenz.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlCompetenz() {
        return flCompetenz;
    }

    /**
     * Imposta il valore della proprietà flCompetenz.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlCompetenz(Boolean value) {
        this.flCompetenz = value;
    }

    /**
     * Recupera il valore della proprietà flRiportoVinc.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlRiportoVinc() {
        return flRiportoVinc;
    }

    /**
     * Imposta il valore della proprietà flRiportoVinc.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlRiportoVinc(Boolean value) {
        this.flRiportoVinc = value;
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
     * Recupera il valore della proprietà idVoceCoan.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdVoceCoan() {
        return idVoceCoan;
    }

    /**
     * Imposta il valore della proprietà idVoceCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdVoceCoan(Long value) {
        this.idVoceCoan = value;
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

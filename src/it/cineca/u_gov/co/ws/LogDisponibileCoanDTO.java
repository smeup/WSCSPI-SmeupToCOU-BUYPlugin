
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per logDisponibileCoanDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="logDisponibileCoanDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ammDisponibileCO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ammDisponibilePJ" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ammPrevisioneCO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ammPrevisionePJ" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ammTotaleScrittureCO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ammTotaleScritturePJ" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ammontare" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="cdProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdVoceCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denomUa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denomVoceCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="flDisponibilita" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idDettaglioDocumento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logDisponibileCoanDTO", propOrder = {
    "ammDisponibileCO",
    "ammDisponibilePJ",
    "ammPrevisioneCO",
    "ammPrevisionePJ",
    "ammTotaleScrittureCO",
    "ammTotaleScritturePJ",
    "ammontare",
    "cdProgetto",
    "cdUa",
    "cdVoceCoan",
    "denomUa",
    "denomVoceCoan",
    "dsProgetto",
    "esercizio",
    "flDisponibilita",
    "idDettaglioDocumento"
})
public class LogDisponibileCoanDTO {

    protected BigDecimal ammDisponibileCO;
    protected BigDecimal ammDisponibilePJ;
    protected BigDecimal ammPrevisioneCO;
    protected BigDecimal ammPrevisionePJ;
    protected BigDecimal ammTotaleScrittureCO;
    protected BigDecimal ammTotaleScritturePJ;
    protected BigDecimal ammontare;
    protected String cdProgetto;
    protected String cdUa;
    protected String cdVoceCoan;
    protected String denomUa;
    protected String denomVoceCoan;
    protected String dsProgetto;
    protected Integer esercizio;
    protected Boolean flDisponibilita;
    protected Long idDettaglioDocumento;

    /**
     * Recupera il valore della proprietà ammDisponibileCO.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmDisponibileCO() {
        return ammDisponibileCO;
    }

    /**
     * Imposta il valore della proprietà ammDisponibileCO.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmDisponibileCO(BigDecimal value) {
        this.ammDisponibileCO = value;
    }

    /**
     * Recupera il valore della proprietà ammDisponibilePJ.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmDisponibilePJ() {
        return ammDisponibilePJ;
    }

    /**
     * Imposta il valore della proprietà ammDisponibilePJ.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmDisponibilePJ(BigDecimal value) {
        this.ammDisponibilePJ = value;
    }

    /**
     * Recupera il valore della proprietà ammPrevisioneCO.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmPrevisioneCO() {
        return ammPrevisioneCO;
    }

    /**
     * Imposta il valore della proprietà ammPrevisioneCO.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmPrevisioneCO(BigDecimal value) {
        this.ammPrevisioneCO = value;
    }

    /**
     * Recupera il valore della proprietà ammPrevisionePJ.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmPrevisionePJ() {
        return ammPrevisionePJ;
    }

    /**
     * Imposta il valore della proprietà ammPrevisionePJ.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmPrevisionePJ(BigDecimal value) {
        this.ammPrevisionePJ = value;
    }

    /**
     * Recupera il valore della proprietà ammTotaleScrittureCO.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmTotaleScrittureCO() {
        return ammTotaleScrittureCO;
    }

    /**
     * Imposta il valore della proprietà ammTotaleScrittureCO.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmTotaleScrittureCO(BigDecimal value) {
        this.ammTotaleScrittureCO = value;
    }

    /**
     * Recupera il valore della proprietà ammTotaleScritturePJ.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmTotaleScritturePJ() {
        return ammTotaleScritturePJ;
    }

    /**
     * Imposta il valore della proprietà ammTotaleScritturePJ.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmTotaleScritturePJ(BigDecimal value) {
        this.ammTotaleScritturePJ = value;
    }

    /**
     * Recupera il valore della proprietà ammontare.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmontare() {
        return ammontare;
    }

    /**
     * Imposta il valore della proprietà ammontare.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmontare(BigDecimal value) {
        this.ammontare = value;
    }

    /**
     * Recupera il valore della proprietà cdProgetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdProgetto() {
        return cdProgetto;
    }

    /**
     * Imposta il valore della proprietà cdProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdProgetto(String value) {
        this.cdProgetto = value;
    }

    /**
     * Recupera il valore della proprietà cdUa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUa() {
        return cdUa;
    }

    /**
     * Imposta il valore della proprietà cdUa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUa(String value) {
        this.cdUa = value;
    }

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
     * Recupera il valore della proprietà denomUa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenomUa() {
        return denomUa;
    }

    /**
     * Imposta il valore della proprietà denomUa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenomUa(String value) {
        this.denomUa = value;
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
     * Recupera il valore della proprietà dsProgetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsProgetto() {
        return dsProgetto;
    }

    /**
     * Imposta il valore della proprietà dsProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsProgetto(String value) {
        this.dsProgetto = value;
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
     * Recupera il valore della proprietà flDisponibilita.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlDisponibilita() {
        return flDisponibilita;
    }

    /**
     * Imposta il valore della proprietà flDisponibilita.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlDisponibilita(Boolean value) {
        this.flDisponibilita = value;
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

}

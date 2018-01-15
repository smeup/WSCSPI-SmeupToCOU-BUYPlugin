
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per disponibileCOPJDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="disponibileCOPJDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdVoceCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdVoceCoanBudget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coDisponibile" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="coDisponibileSinteticoFunzionamentoProgetto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="coDisponibileSinteticoInvestimentoProgetto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="coDisponibileSinteticoProgetto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="coPrevisioneDefinitiva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="coPrevisioneSinteticaFunzionamentoProgetto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="coPrevisioneSinteticaInvestimentoProgetto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="coPrevisioneSinteticaProgetto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="coTotaleScritture" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="coTotaleScrittureSinteticoFunzionamentoProgetto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="coTotaleScrittureSinteticoInvestimentoProgetto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="coTotaleScrittureSinteticoProgetto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dsVoceProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="flDisponibilita" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="msgDisponibilita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pjDisponibileVoceProgetto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pjDisponibileVoceProgettoEse" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pjPrevisioneVoceProgetto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pjPrevisioneVoceProgettoEse" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pjTotaleScrittureVoceProgetto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pjTotaleScrittureVoceProgettoEse" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disponibileCOPJDTO", propOrder = {
    "cdProgetto",
    "cdUa",
    "cdVoceCoan",
    "cdVoceCoanBudget",
    "coDisponibile",
    "coDisponibileSinteticoFunzionamentoProgetto",
    "coDisponibileSinteticoInvestimentoProgetto",
    "coDisponibileSinteticoProgetto",
    "coPrevisioneDefinitiva",
    "coPrevisioneSinteticaFunzionamentoProgetto",
    "coPrevisioneSinteticaInvestimentoProgetto",
    "coPrevisioneSinteticaProgetto",
    "coTotaleScritture",
    "coTotaleScrittureSinteticoFunzionamentoProgetto",
    "coTotaleScrittureSinteticoInvestimentoProgetto",
    "coTotaleScrittureSinteticoProgetto",
    "dsVoceProgetto",
    "esercizio",
    "flDisponibilita",
    "msgDisponibilita",
    "pjDisponibileVoceProgetto",
    "pjDisponibileVoceProgettoEse",
    "pjPrevisioneVoceProgetto",
    "pjPrevisioneVoceProgettoEse",
    "pjTotaleScrittureVoceProgetto",
    "pjTotaleScrittureVoceProgettoEse"
})
public class DisponibileCOPJDTO {

    protected String cdProgetto;
    protected String cdUa;
    protected String cdVoceCoan;
    protected String cdVoceCoanBudget;
    protected BigDecimal coDisponibile;
    protected BigDecimal coDisponibileSinteticoFunzionamentoProgetto;
    protected BigDecimal coDisponibileSinteticoInvestimentoProgetto;
    protected BigDecimal coDisponibileSinteticoProgetto;
    protected BigDecimal coPrevisioneDefinitiva;
    protected BigDecimal coPrevisioneSinteticaFunzionamentoProgetto;
    protected BigDecimal coPrevisioneSinteticaInvestimentoProgetto;
    protected BigDecimal coPrevisioneSinteticaProgetto;
    protected BigDecimal coTotaleScritture;
    protected BigDecimal coTotaleScrittureSinteticoFunzionamentoProgetto;
    protected BigDecimal coTotaleScrittureSinteticoInvestimentoProgetto;
    protected BigDecimal coTotaleScrittureSinteticoProgetto;
    protected String dsVoceProgetto;
    protected Integer esercizio;
    protected Boolean flDisponibilita;
    protected String msgDisponibilita;
    protected BigDecimal pjDisponibileVoceProgetto;
    protected BigDecimal pjDisponibileVoceProgettoEse;
    protected BigDecimal pjPrevisioneVoceProgetto;
    protected BigDecimal pjPrevisioneVoceProgettoEse;
    protected BigDecimal pjTotaleScrittureVoceProgetto;
    protected BigDecimal pjTotaleScrittureVoceProgettoEse;

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
     * Recupera il valore della proprietà cdVoceCoanBudget.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdVoceCoanBudget() {
        return cdVoceCoanBudget;
    }

    /**
     * Imposta il valore della proprietà cdVoceCoanBudget.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdVoceCoanBudget(String value) {
        this.cdVoceCoanBudget = value;
    }

    /**
     * Recupera il valore della proprietà coDisponibile.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoDisponibile() {
        return coDisponibile;
    }

    /**
     * Imposta il valore della proprietà coDisponibile.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoDisponibile(BigDecimal value) {
        this.coDisponibile = value;
    }

    /**
     * Recupera il valore della proprietà coDisponibileSinteticoFunzionamentoProgetto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoDisponibileSinteticoFunzionamentoProgetto() {
        return coDisponibileSinteticoFunzionamentoProgetto;
    }

    /**
     * Imposta il valore della proprietà coDisponibileSinteticoFunzionamentoProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoDisponibileSinteticoFunzionamentoProgetto(BigDecimal value) {
        this.coDisponibileSinteticoFunzionamentoProgetto = value;
    }

    /**
     * Recupera il valore della proprietà coDisponibileSinteticoInvestimentoProgetto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoDisponibileSinteticoInvestimentoProgetto() {
        return coDisponibileSinteticoInvestimentoProgetto;
    }

    /**
     * Imposta il valore della proprietà coDisponibileSinteticoInvestimentoProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoDisponibileSinteticoInvestimentoProgetto(BigDecimal value) {
        this.coDisponibileSinteticoInvestimentoProgetto = value;
    }

    /**
     * Recupera il valore della proprietà coDisponibileSinteticoProgetto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoDisponibileSinteticoProgetto() {
        return coDisponibileSinteticoProgetto;
    }

    /**
     * Imposta il valore della proprietà coDisponibileSinteticoProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoDisponibileSinteticoProgetto(BigDecimal value) {
        this.coDisponibileSinteticoProgetto = value;
    }

    /**
     * Recupera il valore della proprietà coPrevisioneDefinitiva.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoPrevisioneDefinitiva() {
        return coPrevisioneDefinitiva;
    }

    /**
     * Imposta il valore della proprietà coPrevisioneDefinitiva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoPrevisioneDefinitiva(BigDecimal value) {
        this.coPrevisioneDefinitiva = value;
    }

    /**
     * Recupera il valore della proprietà coPrevisioneSinteticaFunzionamentoProgetto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoPrevisioneSinteticaFunzionamentoProgetto() {
        return coPrevisioneSinteticaFunzionamentoProgetto;
    }

    /**
     * Imposta il valore della proprietà coPrevisioneSinteticaFunzionamentoProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoPrevisioneSinteticaFunzionamentoProgetto(BigDecimal value) {
        this.coPrevisioneSinteticaFunzionamentoProgetto = value;
    }

    /**
     * Recupera il valore della proprietà coPrevisioneSinteticaInvestimentoProgetto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoPrevisioneSinteticaInvestimentoProgetto() {
        return coPrevisioneSinteticaInvestimentoProgetto;
    }

    /**
     * Imposta il valore della proprietà coPrevisioneSinteticaInvestimentoProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoPrevisioneSinteticaInvestimentoProgetto(BigDecimal value) {
        this.coPrevisioneSinteticaInvestimentoProgetto = value;
    }

    /**
     * Recupera il valore della proprietà coPrevisioneSinteticaProgetto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoPrevisioneSinteticaProgetto() {
        return coPrevisioneSinteticaProgetto;
    }

    /**
     * Imposta il valore della proprietà coPrevisioneSinteticaProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoPrevisioneSinteticaProgetto(BigDecimal value) {
        this.coPrevisioneSinteticaProgetto = value;
    }

    /**
     * Recupera il valore della proprietà coTotaleScritture.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoTotaleScritture() {
        return coTotaleScritture;
    }

    /**
     * Imposta il valore della proprietà coTotaleScritture.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoTotaleScritture(BigDecimal value) {
        this.coTotaleScritture = value;
    }

    /**
     * Recupera il valore della proprietà coTotaleScrittureSinteticoFunzionamentoProgetto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoTotaleScrittureSinteticoFunzionamentoProgetto() {
        return coTotaleScrittureSinteticoFunzionamentoProgetto;
    }

    /**
     * Imposta il valore della proprietà coTotaleScrittureSinteticoFunzionamentoProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoTotaleScrittureSinteticoFunzionamentoProgetto(BigDecimal value) {
        this.coTotaleScrittureSinteticoFunzionamentoProgetto = value;
    }

    /**
     * Recupera il valore della proprietà coTotaleScrittureSinteticoInvestimentoProgetto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoTotaleScrittureSinteticoInvestimentoProgetto() {
        return coTotaleScrittureSinteticoInvestimentoProgetto;
    }

    /**
     * Imposta il valore della proprietà coTotaleScrittureSinteticoInvestimentoProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoTotaleScrittureSinteticoInvestimentoProgetto(BigDecimal value) {
        this.coTotaleScrittureSinteticoInvestimentoProgetto = value;
    }

    /**
     * Recupera il valore della proprietà coTotaleScrittureSinteticoProgetto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoTotaleScrittureSinteticoProgetto() {
        return coTotaleScrittureSinteticoProgetto;
    }

    /**
     * Imposta il valore della proprietà coTotaleScrittureSinteticoProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoTotaleScrittureSinteticoProgetto(BigDecimal value) {
        this.coTotaleScrittureSinteticoProgetto = value;
    }

    /**
     * Recupera il valore della proprietà dsVoceProgetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsVoceProgetto() {
        return dsVoceProgetto;
    }

    /**
     * Imposta il valore della proprietà dsVoceProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsVoceProgetto(String value) {
        this.dsVoceProgetto = value;
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
     * Recupera il valore della proprietà msgDisponibilita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgDisponibilita() {
        return msgDisponibilita;
    }

    /**
     * Imposta il valore della proprietà msgDisponibilita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgDisponibilita(String value) {
        this.msgDisponibilita = value;
    }

    /**
     * Recupera il valore della proprietà pjDisponibileVoceProgetto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPjDisponibileVoceProgetto() {
        return pjDisponibileVoceProgetto;
    }

    /**
     * Imposta il valore della proprietà pjDisponibileVoceProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPjDisponibileVoceProgetto(BigDecimal value) {
        this.pjDisponibileVoceProgetto = value;
    }

    /**
     * Recupera il valore della proprietà pjDisponibileVoceProgettoEse.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPjDisponibileVoceProgettoEse() {
        return pjDisponibileVoceProgettoEse;
    }

    /**
     * Imposta il valore della proprietà pjDisponibileVoceProgettoEse.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPjDisponibileVoceProgettoEse(BigDecimal value) {
        this.pjDisponibileVoceProgettoEse = value;
    }

    /**
     * Recupera il valore della proprietà pjPrevisioneVoceProgetto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPjPrevisioneVoceProgetto() {
        return pjPrevisioneVoceProgetto;
    }

    /**
     * Imposta il valore della proprietà pjPrevisioneVoceProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPjPrevisioneVoceProgetto(BigDecimal value) {
        this.pjPrevisioneVoceProgetto = value;
    }

    /**
     * Recupera il valore della proprietà pjPrevisioneVoceProgettoEse.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPjPrevisioneVoceProgettoEse() {
        return pjPrevisioneVoceProgettoEse;
    }

    /**
     * Imposta il valore della proprietà pjPrevisioneVoceProgettoEse.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPjPrevisioneVoceProgettoEse(BigDecimal value) {
        this.pjPrevisioneVoceProgettoEse = value;
    }

    /**
     * Recupera il valore della proprietà pjTotaleScrittureVoceProgetto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPjTotaleScrittureVoceProgetto() {
        return pjTotaleScrittureVoceProgetto;
    }

    /**
     * Imposta il valore della proprietà pjTotaleScrittureVoceProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPjTotaleScrittureVoceProgetto(BigDecimal value) {
        this.pjTotaleScrittureVoceProgetto = value;
    }

    /**
     * Recupera il valore della proprietà pjTotaleScrittureVoceProgettoEse.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPjTotaleScrittureVoceProgettoEse() {
        return pjTotaleScrittureVoceProgettoEse;
    }

    /**
     * Imposta il valore della proprietà pjTotaleScrittureVoceProgettoEse.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPjTotaleScrittureVoceProgettoEse(BigDecimal value) {
        this.pjTotaleScrittureVoceProgettoEse = value;
    }

}

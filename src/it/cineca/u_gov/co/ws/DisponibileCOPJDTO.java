
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for disponibileCOPJDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the cdProgetto property.
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
     * Sets the value of the cdProgetto property.
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
     * Gets the value of the cdUa property.
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
     * Sets the value of the cdUa property.
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
     * Gets the value of the cdVoceCoan property.
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
     * Sets the value of the cdVoceCoan property.
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
     * Gets the value of the cdVoceCoanBudget property.
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
     * Sets the value of the cdVoceCoanBudget property.
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
     * Gets the value of the coDisponibile property.
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
     * Sets the value of the coDisponibile property.
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
     * Gets the value of the coDisponibileSinteticoFunzionamentoProgetto property.
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
     * Sets the value of the coDisponibileSinteticoFunzionamentoProgetto property.
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
     * Gets the value of the coDisponibileSinteticoInvestimentoProgetto property.
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
     * Sets the value of the coDisponibileSinteticoInvestimentoProgetto property.
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
     * Gets the value of the coDisponibileSinteticoProgetto property.
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
     * Sets the value of the coDisponibileSinteticoProgetto property.
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
     * Gets the value of the coPrevisioneDefinitiva property.
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
     * Sets the value of the coPrevisioneDefinitiva property.
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
     * Gets the value of the coPrevisioneSinteticaFunzionamentoProgetto property.
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
     * Sets the value of the coPrevisioneSinteticaFunzionamentoProgetto property.
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
     * Gets the value of the coPrevisioneSinteticaInvestimentoProgetto property.
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
     * Sets the value of the coPrevisioneSinteticaInvestimentoProgetto property.
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
     * Gets the value of the coPrevisioneSinteticaProgetto property.
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
     * Sets the value of the coPrevisioneSinteticaProgetto property.
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
     * Gets the value of the coTotaleScritture property.
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
     * Sets the value of the coTotaleScritture property.
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
     * Gets the value of the coTotaleScrittureSinteticoFunzionamentoProgetto property.
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
     * Sets the value of the coTotaleScrittureSinteticoFunzionamentoProgetto property.
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
     * Gets the value of the coTotaleScrittureSinteticoInvestimentoProgetto property.
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
     * Sets the value of the coTotaleScrittureSinteticoInvestimentoProgetto property.
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
     * Gets the value of the coTotaleScrittureSinteticoProgetto property.
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
     * Sets the value of the coTotaleScrittureSinteticoProgetto property.
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
     * Gets the value of the dsVoceProgetto property.
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
     * Sets the value of the dsVoceProgetto property.
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
     * Gets the value of the esercizio property.
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
     * Sets the value of the esercizio property.
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
     * Gets the value of the flDisponibilita property.
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
     * Sets the value of the flDisponibilita property.
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
     * Gets the value of the msgDisponibilita property.
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
     * Sets the value of the msgDisponibilita property.
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
     * Gets the value of the pjDisponibileVoceProgetto property.
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
     * Sets the value of the pjDisponibileVoceProgetto property.
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
     * Gets the value of the pjDisponibileVoceProgettoEse property.
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
     * Sets the value of the pjDisponibileVoceProgettoEse property.
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
     * Gets the value of the pjPrevisioneVoceProgetto property.
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
     * Sets the value of the pjPrevisioneVoceProgetto property.
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
     * Gets the value of the pjPrevisioneVoceProgettoEse property.
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
     * Sets the value of the pjPrevisioneVoceProgettoEse property.
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
     * Gets the value of the pjTotaleScrittureVoceProgetto property.
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
     * Sets the value of the pjTotaleScrittureVoceProgetto property.
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
     * Gets the value of the pjTotaleScrittureVoceProgettoEse property.
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
     * Sets the value of the pjTotaleScrittureVoceProgettoEse property.
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

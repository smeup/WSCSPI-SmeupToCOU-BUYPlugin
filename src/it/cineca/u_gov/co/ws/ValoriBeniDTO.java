
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per valoriBeniDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="valoriBeniDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aumentiValore" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="cdInvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diminuzioniValore" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dtRif" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idInventarioBeni" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="messaggio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgBene" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pgBeneAssoluto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pgBeneSub" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="quotaAmmFiscale" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="quotaAmmOrdinario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valoreAmmFiscale" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valoreAmmOrdinario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valoreAttuale" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valoreCaricato" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valoreResiduoFiscale" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valoreResiduoOrdinario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valoreScaricato" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valoriBeniDTO", propOrder = {
    "aumentiValore",
    "cdInvent",
    "diminuzioniValore",
    "dtRif",
    "idInventarioBeni",
    "messaggio",
    "pgBene",
    "pgBeneAssoluto",
    "pgBeneSub",
    "quotaAmmFiscale",
    "quotaAmmOrdinario",
    "valoreAmmFiscale",
    "valoreAmmOrdinario",
    "valoreAttuale",
    "valoreCaricato",
    "valoreResiduoFiscale",
    "valoreResiduoOrdinario",
    "valoreScaricato"
})
public class ValoriBeniDTO {

    protected BigDecimal aumentiValore;
    protected String cdInvent;
    protected BigDecimal diminuzioniValore;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtRif;
    protected Long idInventarioBeni;
    protected String messaggio;
    protected Long pgBene;
    protected Long pgBeneAssoluto;
    protected Integer pgBeneSub;
    protected BigDecimal quotaAmmFiscale;
    protected BigDecimal quotaAmmOrdinario;
    protected BigDecimal valoreAmmFiscale;
    protected BigDecimal valoreAmmOrdinario;
    protected BigDecimal valoreAttuale;
    protected BigDecimal valoreCaricato;
    protected BigDecimal valoreResiduoFiscale;
    protected BigDecimal valoreResiduoOrdinario;
    protected BigDecimal valoreScaricato;

    /**
     * Recupera il valore della proprietà aumentiValore.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAumentiValore() {
        return aumentiValore;
    }

    /**
     * Imposta il valore della proprietà aumentiValore.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAumentiValore(BigDecimal value) {
        this.aumentiValore = value;
    }

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
     * Recupera il valore della proprietà diminuzioniValore.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiminuzioniValore() {
        return diminuzioniValore;
    }

    /**
     * Imposta il valore della proprietà diminuzioniValore.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiminuzioniValore(BigDecimal value) {
        this.diminuzioniValore = value;
    }

    /**
     * Recupera il valore della proprietà dtRif.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtRif() {
        return dtRif;
    }

    /**
     * Imposta il valore della proprietà dtRif.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtRif(XMLGregorianCalendar value) {
        this.dtRif = value;
    }

    /**
     * Recupera il valore della proprietà idInventarioBeni.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdInventarioBeni() {
        return idInventarioBeni;
    }

    /**
     * Imposta il valore della proprietà idInventarioBeni.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdInventarioBeni(Long value) {
        this.idInventarioBeni = value;
    }

    /**
     * Recupera il valore della proprietà messaggio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessaggio() {
        return messaggio;
    }

    /**
     * Imposta il valore della proprietà messaggio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessaggio(String value) {
        this.messaggio = value;
    }

    /**
     * Recupera il valore della proprietà pgBene.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPgBene() {
        return pgBene;
    }

    /**
     * Imposta il valore della proprietà pgBene.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPgBene(Long value) {
        this.pgBene = value;
    }

    /**
     * Recupera il valore della proprietà pgBeneAssoluto.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPgBeneAssoluto() {
        return pgBeneAssoluto;
    }

    /**
     * Imposta il valore della proprietà pgBeneAssoluto.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPgBeneAssoluto(Long value) {
        this.pgBeneAssoluto = value;
    }

    /**
     * Recupera il valore della proprietà pgBeneSub.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPgBeneSub() {
        return pgBeneSub;
    }

    /**
     * Imposta il valore della proprietà pgBeneSub.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPgBeneSub(Integer value) {
        this.pgBeneSub = value;
    }

    /**
     * Recupera il valore della proprietà quotaAmmFiscale.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuotaAmmFiscale() {
        return quotaAmmFiscale;
    }

    /**
     * Imposta il valore della proprietà quotaAmmFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuotaAmmFiscale(BigDecimal value) {
        this.quotaAmmFiscale = value;
    }

    /**
     * Recupera il valore della proprietà quotaAmmOrdinario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuotaAmmOrdinario() {
        return quotaAmmOrdinario;
    }

    /**
     * Imposta il valore della proprietà quotaAmmOrdinario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuotaAmmOrdinario(BigDecimal value) {
        this.quotaAmmOrdinario = value;
    }

    /**
     * Recupera il valore della proprietà valoreAmmFiscale.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValoreAmmFiscale() {
        return valoreAmmFiscale;
    }

    /**
     * Imposta il valore della proprietà valoreAmmFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValoreAmmFiscale(BigDecimal value) {
        this.valoreAmmFiscale = value;
    }

    /**
     * Recupera il valore della proprietà valoreAmmOrdinario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValoreAmmOrdinario() {
        return valoreAmmOrdinario;
    }

    /**
     * Imposta il valore della proprietà valoreAmmOrdinario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValoreAmmOrdinario(BigDecimal value) {
        this.valoreAmmOrdinario = value;
    }

    /**
     * Recupera il valore della proprietà valoreAttuale.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValoreAttuale() {
        return valoreAttuale;
    }

    /**
     * Imposta il valore della proprietà valoreAttuale.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValoreAttuale(BigDecimal value) {
        this.valoreAttuale = value;
    }

    /**
     * Recupera il valore della proprietà valoreCaricato.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValoreCaricato() {
        return valoreCaricato;
    }

    /**
     * Imposta il valore della proprietà valoreCaricato.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValoreCaricato(BigDecimal value) {
        this.valoreCaricato = value;
    }

    /**
     * Recupera il valore della proprietà valoreResiduoFiscale.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValoreResiduoFiscale() {
        return valoreResiduoFiscale;
    }

    /**
     * Imposta il valore della proprietà valoreResiduoFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValoreResiduoFiscale(BigDecimal value) {
        this.valoreResiduoFiscale = value;
    }

    /**
     * Recupera il valore della proprietà valoreResiduoOrdinario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValoreResiduoOrdinario() {
        return valoreResiduoOrdinario;
    }

    /**
     * Imposta il valore della proprietà valoreResiduoOrdinario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValoreResiduoOrdinario(BigDecimal value) {
        this.valoreResiduoOrdinario = value;
    }

    /**
     * Recupera il valore della proprietà valoreScaricato.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValoreScaricato() {
        return valoreScaricato;
    }

    /**
     * Imposta il valore della proprietà valoreScaricato.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValoreScaricato(BigDecimal value) {
        this.valoreScaricato = value;
    }

}

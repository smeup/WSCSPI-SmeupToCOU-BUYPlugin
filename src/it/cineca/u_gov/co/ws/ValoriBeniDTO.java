
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for valoriBeniDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the aumentiValore property.
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
     * Sets the value of the aumentiValore property.
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
     * Gets the value of the cdInvent property.
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
     * Sets the value of the cdInvent property.
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
     * Gets the value of the diminuzioniValore property.
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
     * Sets the value of the diminuzioniValore property.
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
     * Gets the value of the dtRif property.
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
     * Sets the value of the dtRif property.
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
     * Gets the value of the idInventarioBeni property.
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
     * Sets the value of the idInventarioBeni property.
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
     * Gets the value of the messaggio property.
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
     * Sets the value of the messaggio property.
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
     * Gets the value of the pgBene property.
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
     * Sets the value of the pgBene property.
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
     * Gets the value of the pgBeneAssoluto property.
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
     * Sets the value of the pgBeneAssoluto property.
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
     * Gets the value of the pgBeneSub property.
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
     * Sets the value of the pgBeneSub property.
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
     * Gets the value of the quotaAmmFiscale property.
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
     * Sets the value of the quotaAmmFiscale property.
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
     * Gets the value of the quotaAmmOrdinario property.
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
     * Sets the value of the quotaAmmOrdinario property.
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
     * Gets the value of the valoreAmmFiscale property.
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
     * Sets the value of the valoreAmmFiscale property.
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
     * Gets the value of the valoreAmmOrdinario property.
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
     * Sets the value of the valoreAmmOrdinario property.
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
     * Gets the value of the valoreAttuale property.
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
     * Sets the value of the valoreAttuale property.
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
     * Gets the value of the valoreCaricato property.
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
     * Sets the value of the valoreCaricato property.
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
     * Gets the value of the valoreResiduoFiscale property.
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
     * Sets the value of the valoreResiduoFiscale property.
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
     * Gets the value of the valoreResiduoOrdinario property.
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
     * Sets the value of the valoreResiduoOrdinario property.
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
     * Gets the value of the valoreScaricato property.
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
     * Sets the value of the valoreScaricato property.
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

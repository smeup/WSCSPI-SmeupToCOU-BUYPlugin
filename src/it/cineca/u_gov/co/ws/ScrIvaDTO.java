
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for scrIvaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scrIvaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ammImponibileEuro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ammImponibileValuta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ammIvaEuro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="annoDg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cdAttivitaIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdClaGeo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdSezionale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdTiOperazIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUoNumeranteDg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdValuta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtEsigibilita" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtRegistrazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="flIvaDifferita" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flStorno" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flagSplitPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idAb" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idDg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idScrIva" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nomeTipoDg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numRegistrazioneDg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pgScrIva" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tiAttivoPassivo" type="{http://ws.co.u-gov.cineca.it/}tipiAttivoPassivo" minOccurs="0"/>
 *         &lt;element name="tiCampoAttivita" type="{http://ws.co.u-gov.cineca.it/}tipiAttivita" minOccurs="0"/>
 *         &lt;element name="tiFattura" type="{http://ws.co.u-gov.cineca.it/}tipiFattura" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scrIvaDTO", propOrder = {
    "ammImponibileEuro",
    "ammImponibileValuta",
    "ammIvaEuro",
    "annoDg",
    "cdAttivitaIva",
    "cdClaGeo",
    "cdSezionale",
    "cdTiOperazIva",
    "cdUe",
    "cdUoNumeranteDg",
    "cdValuta",
    "dtEsigibilita",
    "dtRegistrazione",
    "esercizio",
    "flIvaDifferita",
    "flStorno",
    "flagSplitPayment",
    "idAb",
    "idDg",
    "idScrIva",
    "nomeTipoDg",
    "numRegistrazioneDg",
    "pgScrIva",
    "tiAttivoPassivo",
    "tiCampoAttivita",
    "tiFattura"
})
public class ScrIvaDTO {

    protected BigDecimal ammImponibileEuro;
    protected BigDecimal ammImponibileValuta;
    protected BigDecimal ammIvaEuro;
    protected Integer annoDg;
    protected String cdAttivitaIva;
    protected String cdClaGeo;
    protected String cdSezionale;
    protected String cdTiOperazIva;
    protected String cdUe;
    protected String cdUoNumeranteDg;
    protected String cdValuta;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtEsigibilita;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtRegistrazione;
    protected Integer esercizio;
    protected Boolean flIvaDifferita;
    protected Boolean flStorno;
    protected Boolean flagSplitPayment;
    protected Long idAb;
    protected Long idDg;
    protected Long idScrIva;
    protected String nomeTipoDg;
    protected Integer numRegistrazioneDg;
    protected Integer pgScrIva;
    protected TipiAttivoPassivo tiAttivoPassivo;
    protected TipiAttivita tiCampoAttivita;
    protected TipiFattura tiFattura;

    /**
     * Gets the value of the ammImponibileEuro property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmImponibileEuro() {
        return ammImponibileEuro;
    }

    /**
     * Sets the value of the ammImponibileEuro property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmImponibileEuro(BigDecimal value) {
        this.ammImponibileEuro = value;
    }

    /**
     * Gets the value of the ammImponibileValuta property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmImponibileValuta() {
        return ammImponibileValuta;
    }

    /**
     * Sets the value of the ammImponibileValuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmImponibileValuta(BigDecimal value) {
        this.ammImponibileValuta = value;
    }

    /**
     * Gets the value of the ammIvaEuro property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmIvaEuro() {
        return ammIvaEuro;
    }

    /**
     * Sets the value of the ammIvaEuro property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmIvaEuro(BigDecimal value) {
        this.ammIvaEuro = value;
    }

    /**
     * Gets the value of the annoDg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnnoDg() {
        return annoDg;
    }

    /**
     * Sets the value of the annoDg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnnoDg(Integer value) {
        this.annoDg = value;
    }

    /**
     * Gets the value of the cdAttivitaIva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdAttivitaIva() {
        return cdAttivitaIva;
    }

    /**
     * Sets the value of the cdAttivitaIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdAttivitaIva(String value) {
        this.cdAttivitaIva = value;
    }

    /**
     * Gets the value of the cdClaGeo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdClaGeo() {
        return cdClaGeo;
    }

    /**
     * Sets the value of the cdClaGeo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdClaGeo(String value) {
        this.cdClaGeo = value;
    }

    /**
     * Gets the value of the cdSezionale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdSezionale() {
        return cdSezionale;
    }

    /**
     * Sets the value of the cdSezionale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdSezionale(String value) {
        this.cdSezionale = value;
    }

    /**
     * Gets the value of the cdTiOperazIva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdTiOperazIva() {
        return cdTiOperazIva;
    }

    /**
     * Sets the value of the cdTiOperazIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdTiOperazIva(String value) {
        this.cdTiOperazIva = value;
    }

    /**
     * Gets the value of the cdUe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUe() {
        return cdUe;
    }

    /**
     * Sets the value of the cdUe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUe(String value) {
        this.cdUe = value;
    }

    /**
     * Gets the value of the cdUoNumeranteDg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUoNumeranteDg() {
        return cdUoNumeranteDg;
    }

    /**
     * Sets the value of the cdUoNumeranteDg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUoNumeranteDg(String value) {
        this.cdUoNumeranteDg = value;
    }

    /**
     * Gets the value of the cdValuta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdValuta() {
        return cdValuta;
    }

    /**
     * Sets the value of the cdValuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdValuta(String value) {
        this.cdValuta = value;
    }

    /**
     * Gets the value of the dtEsigibilita property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtEsigibilita() {
        return dtEsigibilita;
    }

    /**
     * Sets the value of the dtEsigibilita property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtEsigibilita(XMLGregorianCalendar value) {
        this.dtEsigibilita = value;
    }

    /**
     * Gets the value of the dtRegistrazione property.
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
     * Sets the value of the dtRegistrazione property.
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
     * Gets the value of the flIvaDifferita property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlIvaDifferita() {
        return flIvaDifferita;
    }

    /**
     * Sets the value of the flIvaDifferita property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlIvaDifferita(Boolean value) {
        this.flIvaDifferita = value;
    }

    /**
     * Gets the value of the flStorno property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlStorno() {
        return flStorno;
    }

    /**
     * Sets the value of the flStorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlStorno(Boolean value) {
        this.flStorno = value;
    }

    /**
     * Gets the value of the flagSplitPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlagSplitPayment() {
        return flagSplitPayment;
    }

    /**
     * Sets the value of the flagSplitPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlagSplitPayment(Boolean value) {
        this.flagSplitPayment = value;
    }

    /**
     * Gets the value of the idAb property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAb() {
        return idAb;
    }

    /**
     * Sets the value of the idAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAb(Long value) {
        this.idAb = value;
    }

    /**
     * Gets the value of the idDg property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDg() {
        return idDg;
    }

    /**
     * Sets the value of the idDg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDg(Long value) {
        this.idDg = value;
    }

    /**
     * Gets the value of the idScrIva property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdScrIva() {
        return idScrIva;
    }

    /**
     * Sets the value of the idScrIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdScrIva(Long value) {
        this.idScrIva = value;
    }

    /**
     * Gets the value of the nomeTipoDg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeTipoDg() {
        return nomeTipoDg;
    }

    /**
     * Sets the value of the nomeTipoDg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeTipoDg(String value) {
        this.nomeTipoDg = value;
    }

    /**
     * Gets the value of the numRegistrazioneDg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumRegistrazioneDg() {
        return numRegistrazioneDg;
    }

    /**
     * Sets the value of the numRegistrazioneDg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumRegistrazioneDg(Integer value) {
        this.numRegistrazioneDg = value;
    }

    /**
     * Gets the value of the pgScrIva property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPgScrIva() {
        return pgScrIva;
    }

    /**
     * Sets the value of the pgScrIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPgScrIva(Integer value) {
        this.pgScrIva = value;
    }

    /**
     * Gets the value of the tiAttivoPassivo property.
     * 
     * @return
     *     possible object is
     *     {@link TipiAttivoPassivo }
     *     
     */
    public TipiAttivoPassivo getTiAttivoPassivo() {
        return tiAttivoPassivo;
    }

    /**
     * Sets the value of the tiAttivoPassivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipiAttivoPassivo }
     *     
     */
    public void setTiAttivoPassivo(TipiAttivoPassivo value) {
        this.tiAttivoPassivo = value;
    }

    /**
     * Gets the value of the tiCampoAttivita property.
     * 
     * @return
     *     possible object is
     *     {@link TipiAttivita }
     *     
     */
    public TipiAttivita getTiCampoAttivita() {
        return tiCampoAttivita;
    }

    /**
     * Sets the value of the tiCampoAttivita property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipiAttivita }
     *     
     */
    public void setTiCampoAttivita(TipiAttivita value) {
        this.tiCampoAttivita = value;
    }

    /**
     * Gets the value of the tiFattura property.
     * 
     * @return
     *     possible object is
     *     {@link TipiFattura }
     *     
     */
    public TipiFattura getTiFattura() {
        return tiFattura;
    }

    /**
     * Sets the value of the tiFattura property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipiFattura }
     *     
     */
    public void setTiFattura(TipiFattura value) {
        this.tiFattura = value;
    }

}

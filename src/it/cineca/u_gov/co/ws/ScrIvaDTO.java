
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per scrIvaDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
    @XmlSchemaType(name = "string")
    protected TipiAttivoPassivo tiAttivoPassivo;
    @XmlSchemaType(name = "string")
    protected TipiAttivita tiCampoAttivita;
    @XmlSchemaType(name = "string")
    protected TipiFattura tiFattura;

    /**
     * Recupera il valore della proprietà ammImponibileEuro.
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
     * Imposta il valore della proprietà ammImponibileEuro.
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
     * Recupera il valore della proprietà ammImponibileValuta.
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
     * Imposta il valore della proprietà ammImponibileValuta.
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
     * Recupera il valore della proprietà ammIvaEuro.
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
     * Imposta il valore della proprietà ammIvaEuro.
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
     * Recupera il valore della proprietà annoDg.
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
     * Imposta il valore della proprietà annoDg.
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
     * Recupera il valore della proprietà cdAttivitaIva.
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
     * Imposta il valore della proprietà cdAttivitaIva.
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
     * Recupera il valore della proprietà cdClaGeo.
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
     * Imposta il valore della proprietà cdClaGeo.
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
     * Recupera il valore della proprietà cdSezionale.
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
     * Imposta il valore della proprietà cdSezionale.
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
     * Recupera il valore della proprietà cdTiOperazIva.
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
     * Imposta il valore della proprietà cdTiOperazIva.
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
     * Recupera il valore della proprietà cdUe.
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
     * Imposta il valore della proprietà cdUe.
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
     * Recupera il valore della proprietà cdUoNumeranteDg.
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
     * Imposta il valore della proprietà cdUoNumeranteDg.
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
     * Recupera il valore della proprietà cdValuta.
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
     * Imposta il valore della proprietà cdValuta.
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
     * Recupera il valore della proprietà dtEsigibilita.
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
     * Imposta il valore della proprietà dtEsigibilita.
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
     * Recupera il valore della proprietà flIvaDifferita.
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
     * Imposta il valore della proprietà flIvaDifferita.
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
     * Recupera il valore della proprietà flStorno.
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
     * Imposta il valore della proprietà flStorno.
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
     * Recupera il valore della proprietà flagSplitPayment.
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
     * Imposta il valore della proprietà flagSplitPayment.
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
     * Recupera il valore della proprietà idAb.
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
     * Imposta il valore della proprietà idAb.
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
     * Recupera il valore della proprietà idDg.
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
     * Imposta il valore della proprietà idDg.
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
     * Recupera il valore della proprietà idScrIva.
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
     * Imposta il valore della proprietà idScrIva.
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
     * Recupera il valore della proprietà nomeTipoDg.
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
     * Imposta il valore della proprietà nomeTipoDg.
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
     * Recupera il valore della proprietà numRegistrazioneDg.
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
     * Imposta il valore della proprietà numRegistrazioneDg.
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
     * Recupera il valore della proprietà pgScrIva.
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
     * Imposta il valore della proprietà pgScrIva.
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
     * Recupera il valore della proprietà tiAttivoPassivo.
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
     * Imposta il valore della proprietà tiAttivoPassivo.
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
     * Recupera il valore della proprietà tiCampoAttivita.
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
     * Imposta il valore della proprietà tiCampoAttivita.
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
     * Recupera il valore della proprietà tiFattura.
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
     * Imposta il valore della proprietà tiFattura.
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

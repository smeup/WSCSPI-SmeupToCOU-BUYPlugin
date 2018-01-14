
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for listaContrPassDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaContrPassDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idDg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cdUoOrigine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denomUoOrigine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdIPA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annoDg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nomeTipoDg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtRegistrazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numRegistrazione" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dtDocRif" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numDocRif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsDg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAbFornitore" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nomeEstesoFornitore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdAppExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imponibile" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="iva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totale" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="idXCommDet" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numRigaDett" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dsRiga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdCup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdBeneServizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantita" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="prezzoUnitario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="prezzoTotale" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="sconto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="percSconto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="maggiorazione" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="percMaggiorazione" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="imponibileDett" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ivaDett" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totaleDett" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dtInizioComp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtFineComp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tiScrCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizioScr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pgScrCoan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dtScrCoan" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numDettScrCoan" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cdUaBudget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denomUa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdVoceCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsVoceCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdVoceRicl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiDimAna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdDimAna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsDimAna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUnitaLavoro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsUnitaLavoro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdCofog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsCofog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ammDettScr" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ammQuotaAperta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="idScrCoanDet" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaContrPassDTO", propOrder = {
    "idDg",
    "cdUoOrigine",
    "denomUoOrigine",
    "cdIPA",
    "annoDg",
    "nomeTipoDg",
    "dtRegistrazione",
    "numRegistrazione",
    "dtDocRif",
    "numDocRif",
    "dsDg",
    "idAbFornitore",
    "nomeEstesoFornitore",
    "soggetto",
    "cdAppExt",
    "imponibile",
    "iva",
    "totale",
    "idXCommDet",
    "numRigaDett",
    "dsRiga",
    "cdCup",
    "cdBeneServizio",
    "cpv",
    "quantita",
    "prezzoUnitario",
    "prezzoTotale",
    "sconto",
    "percSconto",
    "maggiorazione",
    "percMaggiorazione",
    "imponibileDett",
    "ivaDett",
    "totaleDett",
    "dtInizioComp",
    "dtFineComp",
    "tiScrCoan",
    "esercizioScr",
    "pgScrCoan",
    "dtScrCoan",
    "numDettScrCoan",
    "cdUaBudget",
    "cdUa",
    "denomUa",
    "cdVoceCoan",
    "dsVoceCoan",
    "cdVoceRicl",
    "tiDimAna",
    "cdDimAna",
    "dsDimAna",
    "cdProgetto",
    "dsProgetto",
    "cdUnitaLavoro",
    "dsUnitaLavoro",
    "cdCofog",
    "dsCofog",
    "ammDettScr",
    "ammQuotaAperta",
    "idScrCoanDet"
})
public class ListaContrPassDTO {

    protected Long idDg;
    protected String cdUoOrigine;
    protected String denomUoOrigine;
    protected String cdIPA;
    protected Integer annoDg;
    protected String nomeTipoDg;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtRegistrazione;
    protected Long numRegistrazione;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtDocRif;
    protected String numDocRif;
    protected String dsDg;
    protected Long idAbFornitore;
    protected String nomeEstesoFornitore;
    protected String soggetto;
    protected String cdAppExt;
    protected BigDecimal imponibile;
    protected BigDecimal iva;
    protected BigDecimal totale;
    protected Long idXCommDet;
    protected Integer numRigaDett;
    protected String dsRiga;
    protected String cdCup;
    protected String cdBeneServizio;
    @XmlElement(name = "CPV")
    protected String cpv;
    protected Integer quantita;
    protected BigDecimal prezzoUnitario;
    protected BigDecimal prezzoTotale;
    protected BigDecimal sconto;
    protected BigDecimal percSconto;
    protected BigDecimal maggiorazione;
    protected BigDecimal percMaggiorazione;
    protected BigDecimal imponibileDett;
    protected BigDecimal ivaDett;
    protected BigDecimal totaleDett;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtInizioComp;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtFineComp;
    protected String tiScrCoan;
    protected Integer esercizioScr;
    protected Long pgScrCoan;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtScrCoan;
    protected Integer numDettScrCoan;
    protected String cdUaBudget;
    protected String cdUa;
    protected String denomUa;
    protected String cdVoceCoan;
    protected String dsVoceCoan;
    protected String cdVoceRicl;
    protected String tiDimAna;
    protected String cdDimAna;
    protected String dsDimAna;
    protected String cdProgetto;
    protected String dsProgetto;
    protected String cdUnitaLavoro;
    protected String dsUnitaLavoro;
    protected String cdCofog;
    protected String dsCofog;
    protected BigDecimal ammDettScr;
    protected BigDecimal ammQuotaAperta;
    protected Long idScrCoanDet;

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
     * Gets the value of the cdUoOrigine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUoOrigine() {
        return cdUoOrigine;
    }

    /**
     * Sets the value of the cdUoOrigine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUoOrigine(String value) {
        this.cdUoOrigine = value;
    }

    /**
     * Gets the value of the denomUoOrigine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenomUoOrigine() {
        return denomUoOrigine;
    }

    /**
     * Sets the value of the denomUoOrigine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenomUoOrigine(String value) {
        this.denomUoOrigine = value;
    }

    /**
     * Gets the value of the cdIPA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdIPA() {
        return cdIPA;
    }

    /**
     * Sets the value of the cdIPA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdIPA(String value) {
        this.cdIPA = value;
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
     * Gets the value of the numRegistrazione property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumRegistrazione() {
        return numRegistrazione;
    }

    /**
     * Sets the value of the numRegistrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumRegistrazione(Long value) {
        this.numRegistrazione = value;
    }

    /**
     * Gets the value of the dtDocRif property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtDocRif() {
        return dtDocRif;
    }

    /**
     * Sets the value of the dtDocRif property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtDocRif(XMLGregorianCalendar value) {
        this.dtDocRif = value;
    }

    /**
     * Gets the value of the numDocRif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDocRif() {
        return numDocRif;
    }

    /**
     * Sets the value of the numDocRif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDocRif(String value) {
        this.numDocRif = value;
    }

    /**
     * Gets the value of the dsDg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsDg() {
        return dsDg;
    }

    /**
     * Sets the value of the dsDg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsDg(String value) {
        this.dsDg = value;
    }

    /**
     * Gets the value of the idAbFornitore property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAbFornitore() {
        return idAbFornitore;
    }

    /**
     * Sets the value of the idAbFornitore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAbFornitore(Long value) {
        this.idAbFornitore = value;
    }

    /**
     * Gets the value of the nomeEstesoFornitore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEstesoFornitore() {
        return nomeEstesoFornitore;
    }

    /**
     * Sets the value of the nomeEstesoFornitore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEstesoFornitore(String value) {
        this.nomeEstesoFornitore = value;
    }

    /**
     * Gets the value of the soggetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoggetto() {
        return soggetto;
    }

    /**
     * Sets the value of the soggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoggetto(String value) {
        this.soggetto = value;
    }

    /**
     * Gets the value of the cdAppExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdAppExt() {
        return cdAppExt;
    }

    /**
     * Sets the value of the cdAppExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdAppExt(String value) {
        this.cdAppExt = value;
    }

    /**
     * Gets the value of the imponibile property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImponibile() {
        return imponibile;
    }

    /**
     * Sets the value of the imponibile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImponibile(BigDecimal value) {
        this.imponibile = value;
    }

    /**
     * Gets the value of the iva property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIva() {
        return iva;
    }

    /**
     * Sets the value of the iva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIva(BigDecimal value) {
        this.iva = value;
    }

    /**
     * Gets the value of the totale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotale() {
        return totale;
    }

    /**
     * Sets the value of the totale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotale(BigDecimal value) {
        this.totale = value;
    }

    /**
     * Gets the value of the idXCommDet property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdXCommDet() {
        return idXCommDet;
    }

    /**
     * Sets the value of the idXCommDet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdXCommDet(Long value) {
        this.idXCommDet = value;
    }

    /**
     * Gets the value of the numRigaDett property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumRigaDett() {
        return numRigaDett;
    }

    /**
     * Sets the value of the numRigaDett property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumRigaDett(Integer value) {
        this.numRigaDett = value;
    }

    /**
     * Gets the value of the dsRiga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsRiga() {
        return dsRiga;
    }

    /**
     * Sets the value of the dsRiga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsRiga(String value) {
        this.dsRiga = value;
    }

    /**
     * Gets the value of the cdCup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCup() {
        return cdCup;
    }

    /**
     * Sets the value of the cdCup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCup(String value) {
        this.cdCup = value;
    }

    /**
     * Gets the value of the cdBeneServizio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdBeneServizio() {
        return cdBeneServizio;
    }

    /**
     * Sets the value of the cdBeneServizio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdBeneServizio(String value) {
        this.cdBeneServizio = value;
    }

    /**
     * Gets the value of the cpv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPV() {
        return cpv;
    }

    /**
     * Sets the value of the cpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPV(String value) {
        this.cpv = value;
    }

    /**
     * Gets the value of the quantita property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantita() {
        return quantita;
    }

    /**
     * Sets the value of the quantita property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantita(Integer value) {
        this.quantita = value;
    }

    /**
     * Gets the value of the prezzoUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrezzoUnitario() {
        return prezzoUnitario;
    }

    /**
     * Sets the value of the prezzoUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrezzoUnitario(BigDecimal value) {
        this.prezzoUnitario = value;
    }

    /**
     * Gets the value of the prezzoTotale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrezzoTotale() {
        return prezzoTotale;
    }

    /**
     * Sets the value of the prezzoTotale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrezzoTotale(BigDecimal value) {
        this.prezzoTotale = value;
    }

    /**
     * Gets the value of the sconto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSconto() {
        return sconto;
    }

    /**
     * Sets the value of the sconto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSconto(BigDecimal value) {
        this.sconto = value;
    }

    /**
     * Gets the value of the percSconto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercSconto() {
        return percSconto;
    }

    /**
     * Sets the value of the percSconto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercSconto(BigDecimal value) {
        this.percSconto = value;
    }

    /**
     * Gets the value of the maggiorazione property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaggiorazione() {
        return maggiorazione;
    }

    /**
     * Sets the value of the maggiorazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaggiorazione(BigDecimal value) {
        this.maggiorazione = value;
    }

    /**
     * Gets the value of the percMaggiorazione property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercMaggiorazione() {
        return percMaggiorazione;
    }

    /**
     * Sets the value of the percMaggiorazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercMaggiorazione(BigDecimal value) {
        this.percMaggiorazione = value;
    }

    /**
     * Gets the value of the imponibileDett property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImponibileDett() {
        return imponibileDett;
    }

    /**
     * Sets the value of the imponibileDett property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImponibileDett(BigDecimal value) {
        this.imponibileDett = value;
    }

    /**
     * Gets the value of the ivaDett property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIvaDett() {
        return ivaDett;
    }

    /**
     * Sets the value of the ivaDett property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIvaDett(BigDecimal value) {
        this.ivaDett = value;
    }

    /**
     * Gets the value of the totaleDett property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotaleDett() {
        return totaleDett;
    }

    /**
     * Sets the value of the totaleDett property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotaleDett(BigDecimal value) {
        this.totaleDett = value;
    }

    /**
     * Gets the value of the dtInizioComp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtInizioComp() {
        return dtInizioComp;
    }

    /**
     * Sets the value of the dtInizioComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtInizioComp(XMLGregorianCalendar value) {
        this.dtInizioComp = value;
    }

    /**
     * Gets the value of the dtFineComp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtFineComp() {
        return dtFineComp;
    }

    /**
     * Sets the value of the dtFineComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtFineComp(XMLGregorianCalendar value) {
        this.dtFineComp = value;
    }

    /**
     * Gets the value of the tiScrCoan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiScrCoan() {
        return tiScrCoan;
    }

    /**
     * Sets the value of the tiScrCoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiScrCoan(String value) {
        this.tiScrCoan = value;
    }

    /**
     * Gets the value of the esercizioScr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEsercizioScr() {
        return esercizioScr;
    }

    /**
     * Sets the value of the esercizioScr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEsercizioScr(Integer value) {
        this.esercizioScr = value;
    }

    /**
     * Gets the value of the pgScrCoan property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPgScrCoan() {
        return pgScrCoan;
    }

    /**
     * Sets the value of the pgScrCoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPgScrCoan(Long value) {
        this.pgScrCoan = value;
    }

    /**
     * Gets the value of the dtScrCoan property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtScrCoan() {
        return dtScrCoan;
    }

    /**
     * Sets the value of the dtScrCoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtScrCoan(XMLGregorianCalendar value) {
        this.dtScrCoan = value;
    }

    /**
     * Gets the value of the numDettScrCoan property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDettScrCoan() {
        return numDettScrCoan;
    }

    /**
     * Sets the value of the numDettScrCoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDettScrCoan(Integer value) {
        this.numDettScrCoan = value;
    }

    /**
     * Gets the value of the cdUaBudget property.
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
     * Sets the value of the cdUaBudget property.
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
     * Gets the value of the denomUa property.
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
     * Sets the value of the denomUa property.
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
     * Gets the value of the dsVoceCoan property.
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
     * Sets the value of the dsVoceCoan property.
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
     * Gets the value of the cdVoceRicl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdVoceRicl() {
        return cdVoceRicl;
    }

    /**
     * Sets the value of the cdVoceRicl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdVoceRicl(String value) {
        this.cdVoceRicl = value;
    }

    /**
     * Gets the value of the tiDimAna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiDimAna() {
        return tiDimAna;
    }

    /**
     * Sets the value of the tiDimAna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiDimAna(String value) {
        this.tiDimAna = value;
    }

    /**
     * Gets the value of the cdDimAna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdDimAna() {
        return cdDimAna;
    }

    /**
     * Sets the value of the cdDimAna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdDimAna(String value) {
        this.cdDimAna = value;
    }

    /**
     * Gets the value of the dsDimAna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsDimAna() {
        return dsDimAna;
    }

    /**
     * Sets the value of the dsDimAna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsDimAna(String value) {
        this.dsDimAna = value;
    }

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
     * Gets the value of the dsProgetto property.
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
     * Sets the value of the dsProgetto property.
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
     * Gets the value of the cdUnitaLavoro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUnitaLavoro() {
        return cdUnitaLavoro;
    }

    /**
     * Sets the value of the cdUnitaLavoro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUnitaLavoro(String value) {
        this.cdUnitaLavoro = value;
    }

    /**
     * Gets the value of the dsUnitaLavoro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsUnitaLavoro() {
        return dsUnitaLavoro;
    }

    /**
     * Sets the value of the dsUnitaLavoro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsUnitaLavoro(String value) {
        this.dsUnitaLavoro = value;
    }

    /**
     * Gets the value of the cdCofog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCofog() {
        return cdCofog;
    }

    /**
     * Sets the value of the cdCofog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCofog(String value) {
        this.cdCofog = value;
    }

    /**
     * Gets the value of the dsCofog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsCofog() {
        return dsCofog;
    }

    /**
     * Sets the value of the dsCofog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsCofog(String value) {
        this.dsCofog = value;
    }

    /**
     * Gets the value of the ammDettScr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmDettScr() {
        return ammDettScr;
    }

    /**
     * Sets the value of the ammDettScr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmDettScr(BigDecimal value) {
        this.ammDettScr = value;
    }

    /**
     * Gets the value of the ammQuotaAperta property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmQuotaAperta() {
        return ammQuotaAperta;
    }

    /**
     * Sets the value of the ammQuotaAperta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmQuotaAperta(BigDecimal value) {
        this.ammQuotaAperta = value;
    }

    /**
     * Gets the value of the idScrCoanDet property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdScrCoanDet() {
        return idScrCoanDet;
    }

    /**
     * Sets the value of the idScrCoanDet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdScrCoanDet(Long value) {
        this.idScrCoanDet = value;
    }

}

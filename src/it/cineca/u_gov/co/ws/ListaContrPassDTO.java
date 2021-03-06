
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per listaContrPassDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
 *         &lt;element name="idDocumentale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idProtocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtProtocollo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cdClassificazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idXCommDet" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numRigaDett" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dsRiga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdCup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdCig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idDocumentale",
    "idProtocollo",
    "dtProtocollo",
    "cdClassificazione",
    "idXCommDet",
    "numRigaDett",
    "dsRiga",
    "cdCup",
    "cdCig",
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
    protected String idDocumentale;
    protected String idProtocollo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtProtocollo;
    protected String cdClassificazione;
    protected Long idXCommDet;
    protected Integer numRigaDett;
    protected String dsRiga;
    protected String cdCup;
    protected String cdCig;
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
     * Recupera il valore della proprietÓ idDg.
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
     * Imposta il valore della proprietÓ idDg.
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
     * Recupera il valore della proprietÓ cdUoOrigine.
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
     * Imposta il valore della proprietÓ cdUoOrigine.
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
     * Recupera il valore della proprietÓ denomUoOrigine.
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
     * Imposta il valore della proprietÓ denomUoOrigine.
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
     * Recupera il valore della proprietÓ cdIPA.
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
     * Imposta il valore della proprietÓ cdIPA.
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
     * Recupera il valore della proprietÓ annoDg.
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
     * Imposta il valore della proprietÓ annoDg.
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
     * Recupera il valore della proprietÓ nomeTipoDg.
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
     * Imposta il valore della proprietÓ nomeTipoDg.
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
     * Recupera il valore della proprietÓ dtRegistrazione.
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
     * Imposta il valore della proprietÓ dtRegistrazione.
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
     * Recupera il valore della proprietÓ numRegistrazione.
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
     * Imposta il valore della proprietÓ numRegistrazione.
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
     * Recupera il valore della proprietÓ dtDocRif.
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
     * Imposta il valore della proprietÓ dtDocRif.
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
     * Recupera il valore della proprietÓ numDocRif.
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
     * Imposta il valore della proprietÓ numDocRif.
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
     * Recupera il valore della proprietÓ dsDg.
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
     * Imposta il valore della proprietÓ dsDg.
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
     * Recupera il valore della proprietÓ idAbFornitore.
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
     * Imposta il valore della proprietÓ idAbFornitore.
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
     * Recupera il valore della proprietÓ nomeEstesoFornitore.
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
     * Imposta il valore della proprietÓ nomeEstesoFornitore.
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
     * Recupera il valore della proprietÓ soggetto.
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
     * Imposta il valore della proprietÓ soggetto.
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
     * Recupera il valore della proprietÓ cdAppExt.
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
     * Imposta il valore della proprietÓ cdAppExt.
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
     * Recupera il valore della proprietÓ imponibile.
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
     * Imposta il valore della proprietÓ imponibile.
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
     * Recupera il valore della proprietÓ iva.
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
     * Imposta il valore della proprietÓ iva.
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
     * Recupera il valore della proprietÓ totale.
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
     * Imposta il valore della proprietÓ totale.
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
     * Recupera il valore della proprietÓ idDocumentale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocumentale() {
        return idDocumentale;
    }

    /**
     * Imposta il valore della proprietÓ idDocumentale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocumentale(String value) {
        this.idDocumentale = value;
    }

    /**
     * Recupera il valore della proprietÓ idProtocollo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProtocollo() {
        return idProtocollo;
    }

    /**
     * Imposta il valore della proprietÓ idProtocollo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProtocollo(String value) {
        this.idProtocollo = value;
    }

    /**
     * Recupera il valore della proprietÓ dtProtocollo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtProtocollo() {
        return dtProtocollo;
    }

    /**
     * Imposta il valore della proprietÓ dtProtocollo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtProtocollo(XMLGregorianCalendar value) {
        this.dtProtocollo = value;
    }

    /**
     * Recupera il valore della proprietÓ cdClassificazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdClassificazione() {
        return cdClassificazione;
    }

    /**
     * Imposta il valore della proprietÓ cdClassificazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdClassificazione(String value) {
        this.cdClassificazione = value;
    }

    /**
     * Recupera il valore della proprietÓ idXCommDet.
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
     * Imposta il valore della proprietÓ idXCommDet.
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
     * Recupera il valore della proprietÓ numRigaDett.
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
     * Imposta il valore della proprietÓ numRigaDett.
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
     * Recupera il valore della proprietÓ dsRiga.
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
     * Imposta il valore della proprietÓ dsRiga.
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
     * Recupera il valore della proprietÓ cdCup.
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
     * Imposta il valore della proprietÓ cdCup.
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
     * Recupera il valore della proprietÓ cdCig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCig() {
        return cdCig;
    }

    /**
     * Imposta il valore della proprietÓ cdCig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCig(String value) {
        this.cdCig = value;
    }

    /**
     * Recupera il valore della proprietÓ cdBeneServizio.
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
     * Imposta il valore della proprietÓ cdBeneServizio.
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
     * Recupera il valore della proprietÓ cpv.
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
     * Imposta il valore della proprietÓ cpv.
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
     * Recupera il valore della proprietÓ quantita.
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
     * Imposta il valore della proprietÓ quantita.
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
     * Recupera il valore della proprietÓ prezzoUnitario.
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
     * Imposta il valore della proprietÓ prezzoUnitario.
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
     * Recupera il valore della proprietÓ prezzoTotale.
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
     * Imposta il valore della proprietÓ prezzoTotale.
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
     * Recupera il valore della proprietÓ sconto.
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
     * Imposta il valore della proprietÓ sconto.
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
     * Recupera il valore della proprietÓ percSconto.
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
     * Imposta il valore della proprietÓ percSconto.
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
     * Recupera il valore della proprietÓ maggiorazione.
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
     * Imposta il valore della proprietÓ maggiorazione.
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
     * Recupera il valore della proprietÓ percMaggiorazione.
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
     * Imposta il valore della proprietÓ percMaggiorazione.
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
     * Recupera il valore della proprietÓ imponibileDett.
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
     * Imposta il valore della proprietÓ imponibileDett.
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
     * Recupera il valore della proprietÓ ivaDett.
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
     * Imposta il valore della proprietÓ ivaDett.
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
     * Recupera il valore della proprietÓ totaleDett.
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
     * Imposta il valore della proprietÓ totaleDett.
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
     * Recupera il valore della proprietÓ dtInizioComp.
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
     * Imposta il valore della proprietÓ dtInizioComp.
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
     * Recupera il valore della proprietÓ dtFineComp.
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
     * Imposta il valore della proprietÓ dtFineComp.
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
     * Recupera il valore della proprietÓ tiScrCoan.
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
     * Imposta il valore della proprietÓ tiScrCoan.
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
     * Recupera il valore della proprietÓ esercizioScr.
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
     * Imposta il valore della proprietÓ esercizioScr.
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
     * Recupera il valore della proprietÓ pgScrCoan.
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
     * Imposta il valore della proprietÓ pgScrCoan.
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
     * Recupera il valore della proprietÓ dtScrCoan.
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
     * Imposta il valore della proprietÓ dtScrCoan.
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
     * Recupera il valore della proprietÓ numDettScrCoan.
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
     * Imposta il valore della proprietÓ numDettScrCoan.
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
     * Recupera il valore della proprietÓ cdUaBudget.
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
     * Imposta il valore della proprietÓ cdUaBudget.
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
     * Recupera il valore della proprietÓ cdUa.
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
     * Imposta il valore della proprietÓ cdUa.
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
     * Recupera il valore della proprietÓ denomUa.
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
     * Imposta il valore della proprietÓ denomUa.
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
     * Recupera il valore della proprietÓ cdVoceCoan.
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
     * Imposta il valore della proprietÓ cdVoceCoan.
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
     * Recupera il valore della proprietÓ dsVoceCoan.
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
     * Imposta il valore della proprietÓ dsVoceCoan.
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
     * Recupera il valore della proprietÓ cdVoceRicl.
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
     * Imposta il valore della proprietÓ cdVoceRicl.
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
     * Recupera il valore della proprietÓ tiDimAna.
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
     * Imposta il valore della proprietÓ tiDimAna.
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
     * Recupera il valore della proprietÓ cdDimAna.
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
     * Imposta il valore della proprietÓ cdDimAna.
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
     * Recupera il valore della proprietÓ dsDimAna.
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
     * Imposta il valore della proprietÓ dsDimAna.
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
     * Recupera il valore della proprietÓ cdProgetto.
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
     * Imposta il valore della proprietÓ cdProgetto.
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
     * Recupera il valore della proprietÓ dsProgetto.
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
     * Imposta il valore della proprietÓ dsProgetto.
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
     * Recupera il valore della proprietÓ cdUnitaLavoro.
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
     * Imposta il valore della proprietÓ cdUnitaLavoro.
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
     * Recupera il valore della proprietÓ dsUnitaLavoro.
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
     * Imposta il valore della proprietÓ dsUnitaLavoro.
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
     * Recupera il valore della proprietÓ cdCofog.
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
     * Imposta il valore della proprietÓ cdCofog.
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
     * Recupera il valore della proprietÓ dsCofog.
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
     * Imposta il valore della proprietÓ dsCofog.
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
     * Recupera il valore della proprietÓ ammDettScr.
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
     * Imposta il valore della proprietÓ ammDettScr.
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
     * Recupera il valore della proprietÓ ammQuotaAperta.
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
     * Imposta il valore della proprietÓ ammQuotaAperta.
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
     * Recupera il valore della proprietÓ idScrCoanDet.
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
     * Imposta il valore della proprietÓ idScrCoanDet.
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

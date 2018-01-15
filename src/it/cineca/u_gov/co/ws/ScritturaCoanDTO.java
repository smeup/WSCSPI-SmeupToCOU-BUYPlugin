
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per scritturaCoanDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="scritturaCoanDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ammQuotaApertaDettaglio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ammontareDettaglio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="cdCauVar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdCofogCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdDimAna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUaBudget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUnitaLavoro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdVoceCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdVoceRiclassificato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denomDimAna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denomUaBudget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denomVoceCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsCauVar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsCofogCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsScrCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsScrCoanDet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsUnitaLavoro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsVoceRiclassificato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtFineComp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtInizioComp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtRegistrazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="esercizioOrigine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idAbDettaglio" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idCofogCoan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idDimAna" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idGestionale" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idProgetto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idScrCoan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idScrCoanDet" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idScrCoanDetEseSucc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idScrCoanEseSucc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idUnitaLavoro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idVoceCoan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nomeEstesoUa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroOrigine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgRiga" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pgRigaScrCoanEseSucc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pgScrCoan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pgScrCoanEseSucc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="soggettoDettaglio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiScrittura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiSubScrittura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "scritturaCoanDTO", propOrder = {
    "ammQuotaApertaDettaglio",
    "ammontareDettaglio",
    "cdCauVar",
    "cdCofogCoan",
    "cdDimAna",
    "cdProgetto",
    "cdUa",
    "cdUaBudget",
    "cdUnitaLavoro",
    "cdVoceCoan",
    "cdVoceRiclassificato",
    "denomDimAna",
    "denomUaBudget",
    "denomVoceCoan",
    "dsCauVar",
    "dsCofogCoan",
    "dsProgetto",
    "dsScrCoan",
    "dsScrCoanDet",
    "dsUnitaLavoro",
    "dsVoceRiclassificato",
    "dtFineComp",
    "dtInizioComp",
    "dtRegistrazione",
    "esercizio",
    "esercizioOrigine",
    "idAbDettaglio",
    "idCofogCoan",
    "idDimAna",
    "idGestionale",
    "idProgetto",
    "idScrCoan",
    "idScrCoanDet",
    "idScrCoanDetEseSucc",
    "idScrCoanEseSucc",
    "idUnitaLavoro",
    "idVoceCoan",
    "nomeEstesoUa",
    "numeroOrigine",
    "pgRiga",
    "pgRigaScrCoanEseSucc",
    "pgScrCoan",
    "pgScrCoanEseSucc",
    "soggettoDettaglio",
    "tiScrittura",
    "tiSubScrittura",
    "tiVoce"
})
public class ScritturaCoanDTO {

    protected BigDecimal ammQuotaApertaDettaglio;
    protected BigDecimal ammontareDettaglio;
    protected String cdCauVar;
    protected String cdCofogCoan;
    protected String cdDimAna;
    protected String cdProgetto;
    protected String cdUa;
    protected String cdUaBudget;
    protected String cdUnitaLavoro;
    protected String cdVoceCoan;
    protected String cdVoceRiclassificato;
    protected String denomDimAna;
    protected String denomUaBudget;
    protected String denomVoceCoan;
    protected String dsCauVar;
    protected String dsCofogCoan;
    protected String dsProgetto;
    protected String dsScrCoan;
    protected String dsScrCoanDet;
    protected String dsUnitaLavoro;
    protected String dsVoceRiclassificato;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtFineComp;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtInizioComp;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtRegistrazione;
    protected Integer esercizio;
    protected Integer esercizioOrigine;
    protected Long idAbDettaglio;
    protected Long idCofogCoan;
    protected Long idDimAna;
    protected Long idGestionale;
    protected Long idProgetto;
    protected Long idScrCoan;
    protected Long idScrCoanDet;
    protected Long idScrCoanDetEseSucc;
    protected Long idScrCoanEseSucc;
    protected Long idUnitaLavoro;
    protected Long idVoceCoan;
    protected String nomeEstesoUa;
    protected String numeroOrigine;
    protected Integer pgRiga;
    protected Integer pgRigaScrCoanEseSucc;
    protected Long pgScrCoan;
    protected Long pgScrCoanEseSucc;
    protected String soggettoDettaglio;
    protected String tiScrittura;
    protected String tiSubScrittura;
    protected String tiVoce;

    /**
     * Recupera il valore della propriet� ammQuotaApertaDettaglio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmQuotaApertaDettaglio() {
        return ammQuotaApertaDettaglio;
    }

    /**
     * Imposta il valore della propriet� ammQuotaApertaDettaglio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmQuotaApertaDettaglio(BigDecimal value) {
        this.ammQuotaApertaDettaglio = value;
    }

    /**
     * Recupera il valore della propriet� ammontareDettaglio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmontareDettaglio() {
        return ammontareDettaglio;
    }

    /**
     * Imposta il valore della propriet� ammontareDettaglio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmontareDettaglio(BigDecimal value) {
        this.ammontareDettaglio = value;
    }

    /**
     * Recupera il valore della propriet� cdCauVar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCauVar() {
        return cdCauVar;
    }

    /**
     * Imposta il valore della propriet� cdCauVar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCauVar(String value) {
        this.cdCauVar = value;
    }

    /**
     * Recupera il valore della propriet� cdCofogCoan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCofogCoan() {
        return cdCofogCoan;
    }

    /**
     * Imposta il valore della propriet� cdCofogCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCofogCoan(String value) {
        this.cdCofogCoan = value;
    }

    /**
     * Recupera il valore della propriet� cdDimAna.
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
     * Imposta il valore della propriet� cdDimAna.
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
     * Recupera il valore della propriet� cdProgetto.
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
     * Imposta il valore della propriet� cdProgetto.
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
     * Recupera il valore della propriet� cdUa.
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
     * Imposta il valore della propriet� cdUa.
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
     * Recupera il valore della propriet� cdUaBudget.
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
     * Imposta il valore della propriet� cdUaBudget.
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
     * Recupera il valore della propriet� cdUnitaLavoro.
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
     * Imposta il valore della propriet� cdUnitaLavoro.
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
     * Recupera il valore della propriet� cdVoceCoan.
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
     * Imposta il valore della propriet� cdVoceCoan.
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
     * Recupera il valore della propriet� cdVoceRiclassificato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdVoceRiclassificato() {
        return cdVoceRiclassificato;
    }

    /**
     * Imposta il valore della propriet� cdVoceRiclassificato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdVoceRiclassificato(String value) {
        this.cdVoceRiclassificato = value;
    }

    /**
     * Recupera il valore della propriet� denomDimAna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenomDimAna() {
        return denomDimAna;
    }

    /**
     * Imposta il valore della propriet� denomDimAna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenomDimAna(String value) {
        this.denomDimAna = value;
    }

    /**
     * Recupera il valore della propriet� denomUaBudget.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenomUaBudget() {
        return denomUaBudget;
    }

    /**
     * Imposta il valore della propriet� denomUaBudget.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenomUaBudget(String value) {
        this.denomUaBudget = value;
    }

    /**
     * Recupera il valore della propriet� denomVoceCoan.
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
     * Imposta il valore della propriet� denomVoceCoan.
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
     * Recupera il valore della propriet� dsCauVar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsCauVar() {
        return dsCauVar;
    }

    /**
     * Imposta il valore della propriet� dsCauVar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsCauVar(String value) {
        this.dsCauVar = value;
    }

    /**
     * Recupera il valore della propriet� dsCofogCoan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsCofogCoan() {
        return dsCofogCoan;
    }

    /**
     * Imposta il valore della propriet� dsCofogCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsCofogCoan(String value) {
        this.dsCofogCoan = value;
    }

    /**
     * Recupera il valore della propriet� dsProgetto.
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
     * Imposta il valore della propriet� dsProgetto.
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
     * Recupera il valore della propriet� dsScrCoan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsScrCoan() {
        return dsScrCoan;
    }

    /**
     * Imposta il valore della propriet� dsScrCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsScrCoan(String value) {
        this.dsScrCoan = value;
    }

    /**
     * Recupera il valore della propriet� dsScrCoanDet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsScrCoanDet() {
        return dsScrCoanDet;
    }

    /**
     * Imposta il valore della propriet� dsScrCoanDet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsScrCoanDet(String value) {
        this.dsScrCoanDet = value;
    }

    /**
     * Recupera il valore della propriet� dsUnitaLavoro.
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
     * Imposta il valore della propriet� dsUnitaLavoro.
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
     * Recupera il valore della propriet� dsVoceRiclassificato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsVoceRiclassificato() {
        return dsVoceRiclassificato;
    }

    /**
     * Imposta il valore della propriet� dsVoceRiclassificato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsVoceRiclassificato(String value) {
        this.dsVoceRiclassificato = value;
    }

    /**
     * Recupera il valore della propriet� dtFineComp.
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
     * Imposta il valore della propriet� dtFineComp.
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
     * Recupera il valore della propriet� dtInizioComp.
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
     * Imposta il valore della propriet� dtInizioComp.
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
     * Recupera il valore della propriet� dtRegistrazione.
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
     * Imposta il valore della propriet� dtRegistrazione.
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
     * Recupera il valore della propriet� esercizio.
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
     * Imposta il valore della propriet� esercizio.
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
     * Recupera il valore della propriet� esercizioOrigine.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEsercizioOrigine() {
        return esercizioOrigine;
    }

    /**
     * Imposta il valore della propriet� esercizioOrigine.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEsercizioOrigine(Integer value) {
        this.esercizioOrigine = value;
    }

    /**
     * Recupera il valore della propriet� idAbDettaglio.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAbDettaglio() {
        return idAbDettaglio;
    }

    /**
     * Imposta il valore della propriet� idAbDettaglio.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAbDettaglio(Long value) {
        this.idAbDettaglio = value;
    }

    /**
     * Recupera il valore della propriet� idCofogCoan.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdCofogCoan() {
        return idCofogCoan;
    }

    /**
     * Imposta il valore della propriet� idCofogCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdCofogCoan(Long value) {
        this.idCofogCoan = value;
    }

    /**
     * Recupera il valore della propriet� idDimAna.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDimAna() {
        return idDimAna;
    }

    /**
     * Imposta il valore della propriet� idDimAna.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDimAna(Long value) {
        this.idDimAna = value;
    }

    /**
     * Recupera il valore della propriet� idGestionale.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdGestionale() {
        return idGestionale;
    }

    /**
     * Imposta il valore della propriet� idGestionale.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdGestionale(Long value) {
        this.idGestionale = value;
    }

    /**
     * Recupera il valore della propriet� idProgetto.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdProgetto() {
        return idProgetto;
    }

    /**
     * Imposta il valore della propriet� idProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdProgetto(Long value) {
        this.idProgetto = value;
    }

    /**
     * Recupera il valore della propriet� idScrCoan.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdScrCoan() {
        return idScrCoan;
    }

    /**
     * Imposta il valore della propriet� idScrCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdScrCoan(Long value) {
        this.idScrCoan = value;
    }

    /**
     * Recupera il valore della propriet� idScrCoanDet.
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
     * Imposta il valore della propriet� idScrCoanDet.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdScrCoanDet(Long value) {
        this.idScrCoanDet = value;
    }

    /**
     * Recupera il valore della propriet� idScrCoanDetEseSucc.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdScrCoanDetEseSucc() {
        return idScrCoanDetEseSucc;
    }

    /**
     * Imposta il valore della propriet� idScrCoanDetEseSucc.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdScrCoanDetEseSucc(Long value) {
        this.idScrCoanDetEseSucc = value;
    }

    /**
     * Recupera il valore della propriet� idScrCoanEseSucc.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdScrCoanEseSucc() {
        return idScrCoanEseSucc;
    }

    /**
     * Imposta il valore della propriet� idScrCoanEseSucc.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdScrCoanEseSucc(Long value) {
        this.idScrCoanEseSucc = value;
    }

    /**
     * Recupera il valore della propriet� idUnitaLavoro.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdUnitaLavoro() {
        return idUnitaLavoro;
    }

    /**
     * Imposta il valore della propriet� idUnitaLavoro.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdUnitaLavoro(Long value) {
        this.idUnitaLavoro = value;
    }

    /**
     * Recupera il valore della propriet� idVoceCoan.
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
     * Imposta il valore della propriet� idVoceCoan.
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
     * Recupera il valore della propriet� nomeEstesoUa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEstesoUa() {
        return nomeEstesoUa;
    }

    /**
     * Imposta il valore della propriet� nomeEstesoUa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEstesoUa(String value) {
        this.nomeEstesoUa = value;
    }

    /**
     * Recupera il valore della propriet� numeroOrigine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroOrigine() {
        return numeroOrigine;
    }

    /**
     * Imposta il valore della propriet� numeroOrigine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroOrigine(String value) {
        this.numeroOrigine = value;
    }

    /**
     * Recupera il valore della propriet� pgRiga.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPgRiga() {
        return pgRiga;
    }

    /**
     * Imposta il valore della propriet� pgRiga.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPgRiga(Integer value) {
        this.pgRiga = value;
    }

    /**
     * Recupera il valore della propriet� pgRigaScrCoanEseSucc.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPgRigaScrCoanEseSucc() {
        return pgRigaScrCoanEseSucc;
    }

    /**
     * Imposta il valore della propriet� pgRigaScrCoanEseSucc.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPgRigaScrCoanEseSucc(Integer value) {
        this.pgRigaScrCoanEseSucc = value;
    }

    /**
     * Recupera il valore della propriet� pgScrCoan.
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
     * Imposta il valore della propriet� pgScrCoan.
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
     * Recupera il valore della propriet� pgScrCoanEseSucc.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPgScrCoanEseSucc() {
        return pgScrCoanEseSucc;
    }

    /**
     * Imposta il valore della propriet� pgScrCoanEseSucc.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPgScrCoanEseSucc(Long value) {
        this.pgScrCoanEseSucc = value;
    }

    /**
     * Recupera il valore della propriet� soggettoDettaglio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoggettoDettaglio() {
        return soggettoDettaglio;
    }

    /**
     * Imposta il valore della propriet� soggettoDettaglio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoggettoDettaglio(String value) {
        this.soggettoDettaglio = value;
    }

    /**
     * Recupera il valore della propriet� tiScrittura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiScrittura() {
        return tiScrittura;
    }

    /**
     * Imposta il valore della propriet� tiScrittura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiScrittura(String value) {
        this.tiScrittura = value;
    }

    /**
     * Recupera il valore della propriet� tiSubScrittura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiSubScrittura() {
        return tiSubScrittura;
    }

    /**
     * Imposta il valore della propriet� tiSubScrittura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiSubScrittura(String value) {
        this.tiSubScrittura = value;
    }

    /**
     * Recupera il valore della propriet� tiVoce.
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
     * Imposta il valore della propriet� tiVoce.
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

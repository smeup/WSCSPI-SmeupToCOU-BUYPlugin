
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per dettaglioScrEsternaCoanDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="dettaglioScrEsternaCoanDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ammImponibile" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ammIva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="cdCofogCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdDimAna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUnitaLavoro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdVoceCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsDgDet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtFine" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtInizio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idDettaglioDocPredecessore" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idDettaglioDocumento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idSchedaBudget" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tiCampoAttivita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dettaglioScrEsternaCoanDTO", propOrder = {
    "ammImponibile",
    "ammIva",
    "cdCofogCoan",
    "cdDimAna",
    "cdIva",
    "cdProgetto",
    "cdUa",
    "cdUnitaLavoro",
    "cdVoceCoan",
    "dsDgDet",
    "dtFine",
    "dtInizio",
    "idDettaglioDocPredecessore",
    "idDettaglioDocumento",
    "idSchedaBudget",
    "tiCampoAttivita"
})
public class DettaglioScrEsternaCoanDTO {

    protected BigDecimal ammImponibile;
    protected BigDecimal ammIva;
    protected String cdCofogCoan;
    protected String cdDimAna;
    protected String cdIva;
    protected String cdProgetto;
    protected String cdUa;
    protected String cdUnitaLavoro;
    protected String cdVoceCoan;
    protected String dsDgDet;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtFine;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtInizio;
    protected Long idDettaglioDocPredecessore;
    protected Long idDettaglioDocumento;
    protected Long idSchedaBudget;
    protected String tiCampoAttivita;

    /**
     * Recupera il valore della propriet� ammImponibile.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmImponibile() {
        return ammImponibile;
    }

    /**
     * Imposta il valore della propriet� ammImponibile.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmImponibile(BigDecimal value) {
        this.ammImponibile = value;
    }

    /**
     * Recupera il valore della propriet� ammIva.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmIva() {
        return ammIva;
    }

    /**
     * Imposta il valore della propriet� ammIva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmIva(BigDecimal value) {
        this.ammIva = value;
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
     * Recupera il valore della propriet� cdIva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdIva() {
        return cdIva;
    }

    /**
     * Imposta il valore della propriet� cdIva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdIva(String value) {
        this.cdIva = value;
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
     * Recupera il valore della propriet� dsDgDet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsDgDet() {
        return dsDgDet;
    }

    /**
     * Imposta il valore della propriet� dsDgDet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsDgDet(String value) {
        this.dsDgDet = value;
    }

    /**
     * Recupera il valore della propriet� dtFine.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtFine() {
        return dtFine;
    }

    /**
     * Imposta il valore della propriet� dtFine.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtFine(XMLGregorianCalendar value) {
        this.dtFine = value;
    }

    /**
     * Recupera il valore della propriet� dtInizio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtInizio() {
        return dtInizio;
    }

    /**
     * Imposta il valore della propriet� dtInizio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtInizio(XMLGregorianCalendar value) {
        this.dtInizio = value;
    }

    /**
     * Recupera il valore della propriet� idDettaglioDocPredecessore.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDettaglioDocPredecessore() {
        return idDettaglioDocPredecessore;
    }

    /**
     * Imposta il valore della propriet� idDettaglioDocPredecessore.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDettaglioDocPredecessore(Long value) {
        this.idDettaglioDocPredecessore = value;
    }

    /**
     * Recupera il valore della propriet� idDettaglioDocumento.
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
     * Imposta il valore della propriet� idDettaglioDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDettaglioDocumento(Long value) {
        this.idDettaglioDocumento = value;
    }

    /**
     * Recupera il valore della propriet� idSchedaBudget.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdSchedaBudget() {
        return idSchedaBudget;
    }

    /**
     * Imposta il valore della propriet� idSchedaBudget.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdSchedaBudget(Long value) {
        this.idSchedaBudget = value;
    }

    /**
     * Recupera il valore della propriet� tiCampoAttivita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiCampoAttivita() {
        return tiCampoAttivita;
    }

    /**
     * Imposta il valore della propriet� tiCampoAttivita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiCampoAttivita(String value) {
        this.tiCampoAttivita = value;
    }

}

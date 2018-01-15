
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per dettaglioDceDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="dettaglioDceDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdBeneServizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsDgDet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtFine" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtInizio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="flChiudePredecessore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idDettaglioDocPredecessore" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="percIva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="prezzoUnitario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="quantita" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "dettaglioDceDTO", propOrder = {
    "cdBeneServizio",
    "cdIva",
    "cig",
    "cup",
    "dsDgDet",
    "dtFine",
    "dtInizio",
    "flChiudePredecessore",
    "idDettaglioDocPredecessore",
    "percIva",
    "prezzoUnitario",
    "quantita",
    "tiCampoAttivita"
})
public class DettaglioDceDTO {

    protected String cdBeneServizio;
    protected String cdIva;
    protected String cig;
    protected String cup;
    protected String dsDgDet;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtFine;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtInizio;
    protected Boolean flChiudePredecessore;
    protected Long idDettaglioDocPredecessore;
    protected BigDecimal percIva;
    protected BigDecimal prezzoUnitario;
    protected BigDecimal quantita;
    protected String tiCampoAttivita;

    /**
     * Recupera il valore della proprietà cdBeneServizio.
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
     * Imposta il valore della proprietà cdBeneServizio.
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
     * Recupera il valore della proprietà cdIva.
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
     * Imposta il valore della proprietà cdIva.
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
     * Recupera il valore della proprietà cig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCig() {
        return cig;
    }

    /**
     * Imposta il valore della proprietà cig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCig(String value) {
        this.cig = value;
    }

    /**
     * Recupera il valore della proprietà cup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCup() {
        return cup;
    }

    /**
     * Imposta il valore della proprietà cup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCup(String value) {
        this.cup = value;
    }

    /**
     * Recupera il valore della proprietà dsDgDet.
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
     * Imposta il valore della proprietà dsDgDet.
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
     * Recupera il valore della proprietà dtFine.
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
     * Imposta il valore della proprietà dtFine.
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
     * Recupera il valore della proprietà dtInizio.
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
     * Imposta il valore della proprietà dtInizio.
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
     * Recupera il valore della proprietà flChiudePredecessore.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlChiudePredecessore() {
        return flChiudePredecessore;
    }

    /**
     * Imposta il valore della proprietà flChiudePredecessore.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlChiudePredecessore(Boolean value) {
        this.flChiudePredecessore = value;
    }

    /**
     * Recupera il valore della proprietà idDettaglioDocPredecessore.
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
     * Imposta il valore della proprietà idDettaglioDocPredecessore.
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
     * Recupera il valore della proprietà percIva.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercIva() {
        return percIva;
    }

    /**
     * Imposta il valore della proprietà percIva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercIva(BigDecimal value) {
        this.percIva = value;
    }

    /**
     * Recupera il valore della proprietà prezzoUnitario.
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
     * Imposta il valore della proprietà prezzoUnitario.
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
     * Recupera il valore della proprietà quantita.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantita() {
        return quantita;
    }

    /**
     * Imposta il valore della proprietà quantita.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantita(BigDecimal value) {
        this.quantita = value;
    }

    /**
     * Recupera il valore della proprietà tiCampoAttivita.
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
     * Imposta il valore della proprietà tiCampoAttivita.
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

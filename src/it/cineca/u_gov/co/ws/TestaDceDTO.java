
package it.cineca.u_gov.co.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per testaDceDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="testaDceDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdAppExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdSezionale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUoOrigine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdValuta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codFis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dettagli" type="{http://ws.co.u-gov.cineca.it/}dettaglioDceDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dsDg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtDg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtReg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idAbSogg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numDg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ragioneSociale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiOperazIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testaDceDTO", propOrder = {
    "cdAppExt",
    "cdSezionale",
    "cdUoOrigine",
    "cdValuta",
    "codFis",
    "dettagli",
    "dsDg",
    "dtDg",
    "dtReg",
    "idAbSogg",
    "numDg",
    "partIva",
    "ragioneSociale",
    "tiOperazIva",
    "tipoDg"
})
public class TestaDceDTO {

    protected String cdAppExt;
    protected String cdSezionale;
    protected String cdUoOrigine;
    protected String cdValuta;
    protected String codFis;
    @XmlElement(nillable = true)
    protected List<DettaglioDceDTO> dettagli;
    protected String dsDg;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtDg;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtReg;
    protected Long idAbSogg;
    protected String numDg;
    protected String partIva;
    protected String ragioneSociale;
    protected String tiOperazIva;
    protected String tipoDg;

    /**
     * Recupera il valore della proprietà cdAppExt.
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
     * Imposta il valore della proprietà cdAppExt.
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
     * Recupera il valore della proprietà cdUoOrigine.
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
     * Imposta il valore della proprietà cdUoOrigine.
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
     * Recupera il valore della proprietà codFis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodFis() {
        return codFis;
    }

    /**
     * Imposta il valore della proprietà codFis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodFis(String value) {
        this.codFis = value;
    }

    /**
     * Gets the value of the dettagli property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dettagli property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDettagli().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DettaglioDceDTO }
     * 
     * 
     */
    public List<DettaglioDceDTO> getDettagli() {
        if (dettagli == null) {
            dettagli = new ArrayList<DettaglioDceDTO>();
        }
        return this.dettagli;
    }

    /**
     * Recupera il valore della proprietà dsDg.
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
     * Imposta il valore della proprietà dsDg.
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
     * Recupera il valore della proprietà dtDg.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtDg() {
        return dtDg;
    }

    /**
     * Imposta il valore della proprietà dtDg.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtDg(XMLGregorianCalendar value) {
        this.dtDg = value;
    }

    /**
     * Recupera il valore della proprietà dtReg.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtReg() {
        return dtReg;
    }

    /**
     * Imposta il valore della proprietà dtReg.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtReg(XMLGregorianCalendar value) {
        this.dtReg = value;
    }

    /**
     * Recupera il valore della proprietà idAbSogg.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAbSogg() {
        return idAbSogg;
    }

    /**
     * Imposta il valore della proprietà idAbSogg.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAbSogg(Long value) {
        this.idAbSogg = value;
    }

    /**
     * Recupera il valore della proprietà numDg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDg() {
        return numDg;
    }

    /**
     * Imposta il valore della proprietà numDg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDg(String value) {
        this.numDg = value;
    }

    /**
     * Recupera il valore della proprietà partIva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartIva() {
        return partIva;
    }

    /**
     * Imposta il valore della proprietà partIva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartIva(String value) {
        this.partIva = value;
    }

    /**
     * Recupera il valore della proprietà ragioneSociale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRagioneSociale() {
        return ragioneSociale;
    }

    /**
     * Imposta il valore della proprietà ragioneSociale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRagioneSociale(String value) {
        this.ragioneSociale = value;
    }

    /**
     * Recupera il valore della proprietà tiOperazIva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiOperazIva() {
        return tiOperazIva;
    }

    /**
     * Imposta il valore della proprietà tiOperazIva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiOperazIva(String value) {
        this.tiOperazIva = value;
    }

    /**
     * Recupera il valore della proprietà tipoDg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDg() {
        return tipoDg;
    }

    /**
     * Imposta il valore della proprietà tipoDg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDg(String value) {
        this.tipoDg = value;
    }

}

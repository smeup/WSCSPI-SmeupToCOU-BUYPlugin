
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
 * <p>Classe Java per creaTrasfeOutDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="creaTrasfeOutDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdInventDest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdInventOri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUoDgDest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUoDgOri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dettagli" type="{http://ws.co.u-gov.cineca.it/}creaTrasfeDetOutDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dsTrasferimentoDest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsTrasferimentoOri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtRegistrazioneDgDest" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtRegistrazioneDgOri" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idDgDest" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idDgOri" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="messaggioErrore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numRegistrazioneDgDest" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numRegistrazioneDgOri" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pgTrasferimentoDest" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pgTrasferimentoOri" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="statoEditoriale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiTrasferimentoDest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiTrasferimentoOri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDgDest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDgOri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creaTrasfeOutDTO", propOrder = {
    "cdInventDest",
    "cdInventOri",
    "cdUoDgDest",
    "cdUoDgOri",
    "dettagli",
    "dsTrasferimentoDest",
    "dsTrasferimentoOri",
    "dtRegistrazioneDgDest",
    "dtRegistrazioneDgOri",
    "esercizio",
    "idDgDest",
    "idDgOri",
    "messaggioErrore",
    "numRegistrazioneDgDest",
    "numRegistrazioneDgOri",
    "pgTrasferimentoDest",
    "pgTrasferimentoOri",
    "statoEditoriale",
    "tiTrasferimentoDest",
    "tiTrasferimentoOri",
    "tipoDgDest",
    "tipoDgOri"
})
public class CreaTrasfeOutDTO {

    protected String cdInventDest;
    protected String cdInventOri;
    protected String cdUoDgDest;
    protected String cdUoDgOri;
    @XmlElement(nillable = true)
    protected List<CreaTrasfeDetOutDTO> dettagli;
    protected String dsTrasferimentoDest;
    protected String dsTrasferimentoOri;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtRegistrazioneDgDest;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtRegistrazioneDgOri;
    protected Integer esercizio;
    protected Long idDgDest;
    protected Long idDgOri;
    protected String messaggioErrore;
    protected Long numRegistrazioneDgDest;
    protected Long numRegistrazioneDgOri;
    protected Long pgTrasferimentoDest;
    protected Long pgTrasferimentoOri;
    protected String statoEditoriale;
    protected String tiTrasferimentoDest;
    protected String tiTrasferimentoOri;
    protected String tipoDgDest;
    protected String tipoDgOri;

    /**
     * Recupera il valore della proprietà cdInventDest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdInventDest() {
        return cdInventDest;
    }

    /**
     * Imposta il valore della proprietà cdInventDest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdInventDest(String value) {
        this.cdInventDest = value;
    }

    /**
     * Recupera il valore della proprietà cdInventOri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdInventOri() {
        return cdInventOri;
    }

    /**
     * Imposta il valore della proprietà cdInventOri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdInventOri(String value) {
        this.cdInventOri = value;
    }

    /**
     * Recupera il valore della proprietà cdUoDgDest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUoDgDest() {
        return cdUoDgDest;
    }

    /**
     * Imposta il valore della proprietà cdUoDgDest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUoDgDest(String value) {
        this.cdUoDgDest = value;
    }

    /**
     * Recupera il valore della proprietà cdUoDgOri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUoDgOri() {
        return cdUoDgOri;
    }

    /**
     * Imposta il valore della proprietà cdUoDgOri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUoDgOri(String value) {
        this.cdUoDgOri = value;
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
     * {@link CreaTrasfeDetOutDTO }
     * 
     * 
     */
    public List<CreaTrasfeDetOutDTO> getDettagli() {
        if (dettagli == null) {
            dettagli = new ArrayList<CreaTrasfeDetOutDTO>();
        }
        return this.dettagli;
    }

    /**
     * Recupera il valore della proprietà dsTrasferimentoDest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsTrasferimentoDest() {
        return dsTrasferimentoDest;
    }

    /**
     * Imposta il valore della proprietà dsTrasferimentoDest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsTrasferimentoDest(String value) {
        this.dsTrasferimentoDest = value;
    }

    /**
     * Recupera il valore della proprietà dsTrasferimentoOri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsTrasferimentoOri() {
        return dsTrasferimentoOri;
    }

    /**
     * Imposta il valore della proprietà dsTrasferimentoOri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsTrasferimentoOri(String value) {
        this.dsTrasferimentoOri = value;
    }

    /**
     * Recupera il valore della proprietà dtRegistrazioneDgDest.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtRegistrazioneDgDest() {
        return dtRegistrazioneDgDest;
    }

    /**
     * Imposta il valore della proprietà dtRegistrazioneDgDest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtRegistrazioneDgDest(XMLGregorianCalendar value) {
        this.dtRegistrazioneDgDest = value;
    }

    /**
     * Recupera il valore della proprietà dtRegistrazioneDgOri.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtRegistrazioneDgOri() {
        return dtRegistrazioneDgOri;
    }

    /**
     * Imposta il valore della proprietà dtRegistrazioneDgOri.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtRegistrazioneDgOri(XMLGregorianCalendar value) {
        this.dtRegistrazioneDgOri = value;
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
     * Recupera il valore della proprietà idDgDest.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDgDest() {
        return idDgDest;
    }

    /**
     * Imposta il valore della proprietà idDgDest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDgDest(Long value) {
        this.idDgDest = value;
    }

    /**
     * Recupera il valore della proprietà idDgOri.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDgOri() {
        return idDgOri;
    }

    /**
     * Imposta il valore della proprietà idDgOri.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDgOri(Long value) {
        this.idDgOri = value;
    }

    /**
     * Recupera il valore della proprietà messaggioErrore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessaggioErrore() {
        return messaggioErrore;
    }

    /**
     * Imposta il valore della proprietà messaggioErrore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessaggioErrore(String value) {
        this.messaggioErrore = value;
    }

    /**
     * Recupera il valore della proprietà numRegistrazioneDgDest.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumRegistrazioneDgDest() {
        return numRegistrazioneDgDest;
    }

    /**
     * Imposta il valore della proprietà numRegistrazioneDgDest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumRegistrazioneDgDest(Long value) {
        this.numRegistrazioneDgDest = value;
    }

    /**
     * Recupera il valore della proprietà numRegistrazioneDgOri.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumRegistrazioneDgOri() {
        return numRegistrazioneDgOri;
    }

    /**
     * Imposta il valore della proprietà numRegistrazioneDgOri.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumRegistrazioneDgOri(Long value) {
        this.numRegistrazioneDgOri = value;
    }

    /**
     * Recupera il valore della proprietà pgTrasferimentoDest.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPgTrasferimentoDest() {
        return pgTrasferimentoDest;
    }

    /**
     * Imposta il valore della proprietà pgTrasferimentoDest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPgTrasferimentoDest(Long value) {
        this.pgTrasferimentoDest = value;
    }

    /**
     * Recupera il valore della proprietà pgTrasferimentoOri.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPgTrasferimentoOri() {
        return pgTrasferimentoOri;
    }

    /**
     * Imposta il valore della proprietà pgTrasferimentoOri.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPgTrasferimentoOri(Long value) {
        this.pgTrasferimentoOri = value;
    }

    /**
     * Recupera il valore della proprietà statoEditoriale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoEditoriale() {
        return statoEditoriale;
    }

    /**
     * Imposta il valore della proprietà statoEditoriale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoEditoriale(String value) {
        this.statoEditoriale = value;
    }

    /**
     * Recupera il valore della proprietà tiTrasferimentoDest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiTrasferimentoDest() {
        return tiTrasferimentoDest;
    }

    /**
     * Imposta il valore della proprietà tiTrasferimentoDest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiTrasferimentoDest(String value) {
        this.tiTrasferimentoDest = value;
    }

    /**
     * Recupera il valore della proprietà tiTrasferimentoOri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiTrasferimentoOri() {
        return tiTrasferimentoOri;
    }

    /**
     * Imposta il valore della proprietà tiTrasferimentoOri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiTrasferimentoOri(String value) {
        this.tiTrasferimentoOri = value;
    }

    /**
     * Recupera il valore della proprietà tipoDgDest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDgDest() {
        return tipoDgDest;
    }

    /**
     * Imposta il valore della proprietà tipoDgDest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDgDest(String value) {
        this.tipoDgDest = value;
    }

    /**
     * Recupera il valore della proprietà tipoDgOri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDgOri() {
        return tipoDgOri;
    }

    /**
     * Imposta il valore della proprietà tipoDgOri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDgOri(String value) {
        this.tipoDgOri = value;
    }

}

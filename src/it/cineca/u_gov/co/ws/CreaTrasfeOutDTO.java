
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
 * <p>Java class for creaTrasfeOutDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the cdInventDest property.
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
     * Sets the value of the cdInventDest property.
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
     * Gets the value of the cdInventOri property.
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
     * Sets the value of the cdInventOri property.
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
     * Gets the value of the cdUoDgDest property.
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
     * Sets the value of the cdUoDgDest property.
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
     * Gets the value of the cdUoDgOri property.
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
     * Sets the value of the cdUoDgOri property.
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
     * Gets the value of the dsTrasferimentoDest property.
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
     * Sets the value of the dsTrasferimentoDest property.
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
     * Gets the value of the dsTrasferimentoOri property.
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
     * Sets the value of the dsTrasferimentoOri property.
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
     * Gets the value of the dtRegistrazioneDgDest property.
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
     * Sets the value of the dtRegistrazioneDgDest property.
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
     * Gets the value of the dtRegistrazioneDgOri property.
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
     * Sets the value of the dtRegistrazioneDgOri property.
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
     * Gets the value of the idDgDest property.
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
     * Sets the value of the idDgDest property.
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
     * Gets the value of the idDgOri property.
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
     * Sets the value of the idDgOri property.
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
     * Gets the value of the messaggioErrore property.
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
     * Sets the value of the messaggioErrore property.
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
     * Gets the value of the numRegistrazioneDgDest property.
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
     * Sets the value of the numRegistrazioneDgDest property.
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
     * Gets the value of the numRegistrazioneDgOri property.
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
     * Sets the value of the numRegistrazioneDgOri property.
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
     * Gets the value of the pgTrasferimentoDest property.
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
     * Sets the value of the pgTrasferimentoDest property.
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
     * Gets the value of the pgTrasferimentoOri property.
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
     * Sets the value of the pgTrasferimentoOri property.
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
     * Gets the value of the statoEditoriale property.
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
     * Sets the value of the statoEditoriale property.
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
     * Gets the value of the tiTrasferimentoDest property.
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
     * Sets the value of the tiTrasferimentoDest property.
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
     * Gets the value of the tiTrasferimentoOri property.
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
     * Sets the value of the tiTrasferimentoOri property.
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
     * Gets the value of the tipoDgDest property.
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
     * Sets the value of the tipoDgDest property.
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
     * Gets the value of the tipoDgOri property.
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
     * Sets the value of the tipoDgOri property.
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

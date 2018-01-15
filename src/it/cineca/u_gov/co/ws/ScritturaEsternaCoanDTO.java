
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
 * <p>Classe Java per scritturaEsternaCoanDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="scritturaEsternaCoanDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdAppExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdSezionale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdValuta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codFis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dettagli" type="{http://ws.co.u-gov.cineca.it/}dettaglioScrEsternaCoanDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dsDg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtReg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idAbSogg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idTestataDocumento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numRegistrazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ragioneSociale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scritturaEsternaCoanDTO", propOrder = {
    "cdAppExt",
    "cdSezionale",
    "cdValuta",
    "codFis",
    "dettagli",
    "dsDg",
    "dtReg",
    "idAbSogg",
    "idTestataDocumento",
    "numRegistrazione",
    "partIva",
    "ragioneSociale",
    "tipoDocumento"
})
public class ScritturaEsternaCoanDTO {

    protected String cdAppExt;
    protected String cdSezionale;
    protected String cdValuta;
    protected String codFis;
    @XmlElement(nillable = true)
    protected List<DettaglioScrEsternaCoanDTO> dettagli;
    protected String dsDg;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtReg;
    protected Long idAbSogg;
    protected Long idTestataDocumento;
    protected String numRegistrazione;
    protected String partIva;
    protected String ragioneSociale;
    protected String tipoDocumento;

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
     * {@link DettaglioScrEsternaCoanDTO }
     * 
     * 
     */
    public List<DettaglioScrEsternaCoanDTO> getDettagli() {
        if (dettagli == null) {
            dettagli = new ArrayList<DettaglioScrEsternaCoanDTO>();
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
     * Recupera il valore della proprietà idTestataDocumento.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTestataDocumento() {
        return idTestataDocumento;
    }

    /**
     * Imposta il valore della proprietà idTestataDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTestataDocumento(Long value) {
        this.idTestataDocumento = value;
    }

    /**
     * Recupera il valore della proprietà numRegistrazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRegistrazione() {
        return numRegistrazione;
    }

    /**
     * Imposta il valore della proprietà numRegistrazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRegistrazione(String value) {
        this.numRegistrazione = value;
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
     * Recupera il valore della proprietà tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Imposta il valore della proprietà tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

}

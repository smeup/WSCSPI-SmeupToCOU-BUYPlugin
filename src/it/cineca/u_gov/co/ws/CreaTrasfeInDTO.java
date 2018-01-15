
package it.cineca.u_gov.co.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per creaTrasfeInDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="creaTrasfeInDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categVoci" type="{http://ws.co.u-gov.cineca.it/}creaTrasfeCategInDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cdAppExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdInventDest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdInventOri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUoDest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUoOri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dettagli" type="{http://ws.co.u-gov.cineca.it/}creaTrasfeDetInDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="flDonazione" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flTuttiBeni" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="immobVoci" type="{http://ws.co.u-gov.cineca.it/}creaTrasfeImmobInDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creaTrasfeInDTO", propOrder = {
    "categVoci",
    "cdAppExt",
    "cdInventDest",
    "cdInventOri",
    "cdUoDest",
    "cdUoOri",
    "descrizione",
    "dettagli",
    "esercizio",
    "flDonazione",
    "flTuttiBeni",
    "immobVoci"
})
public class CreaTrasfeInDTO {

    @XmlElement(nillable = true)
    protected List<CreaTrasfeCategInDTO> categVoci;
    protected String cdAppExt;
    protected String cdInventDest;
    protected String cdInventOri;
    protected String cdUoDest;
    protected String cdUoOri;
    protected String descrizione;
    @XmlElement(nillable = true)
    protected List<CreaTrasfeDetInDTO> dettagli;
    protected Integer esercizio;
    protected Boolean flDonazione;
    protected Boolean flTuttiBeni;
    @XmlElement(nillable = true)
    protected List<CreaTrasfeImmobInDTO> immobVoci;

    /**
     * Gets the value of the categVoci property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categVoci property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategVoci().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreaTrasfeCategInDTO }
     * 
     * 
     */
    public List<CreaTrasfeCategInDTO> getCategVoci() {
        if (categVoci == null) {
            categVoci = new ArrayList<CreaTrasfeCategInDTO>();
        }
        return this.categVoci;
    }

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
     * Recupera il valore della proprietà cdUoDest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUoDest() {
        return cdUoDest;
    }

    /**
     * Imposta il valore della proprietà cdUoDest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUoDest(String value) {
        this.cdUoDest = value;
    }

    /**
     * Recupera il valore della proprietà cdUoOri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUoOri() {
        return cdUoOri;
    }

    /**
     * Imposta il valore della proprietà cdUoOri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUoOri(String value) {
        this.cdUoOri = value;
    }

    /**
     * Recupera il valore della proprietà descrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Imposta il valore della proprietà descrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
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
     * {@link CreaTrasfeDetInDTO }
     * 
     * 
     */
    public List<CreaTrasfeDetInDTO> getDettagli() {
        if (dettagli == null) {
            dettagli = new ArrayList<CreaTrasfeDetInDTO>();
        }
        return this.dettagli;
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
     * Recupera il valore della proprietà flDonazione.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlDonazione() {
        return flDonazione;
    }

    /**
     * Imposta il valore della proprietà flDonazione.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlDonazione(Boolean value) {
        this.flDonazione = value;
    }

    /**
     * Recupera il valore della proprietà flTuttiBeni.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlTuttiBeni() {
        return flTuttiBeni;
    }

    /**
     * Imposta il valore della proprietà flTuttiBeni.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlTuttiBeni(Boolean value) {
        this.flTuttiBeni = value;
    }

    /**
     * Gets the value of the immobVoci property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the immobVoci property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImmobVoci().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreaTrasfeImmobInDTO }
     * 
     * 
     */
    public List<CreaTrasfeImmobInDTO> getImmobVoci() {
        if (immobVoci == null) {
            immobVoci = new ArrayList<CreaTrasfeImmobInDTO>();
        }
        return this.immobVoci;
    }

}

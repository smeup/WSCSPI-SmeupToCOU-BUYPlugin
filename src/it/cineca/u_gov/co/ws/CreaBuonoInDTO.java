
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
 * <p>Java class for creaBuonoInDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creaBuonoInDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annoRif" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cdUoOrigine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dettagli" type="{http://ws.co.u-gov.cineca.it/}creaBuonoDetInDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dsBuono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtRegistrazioneDg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idDg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nomeTipoDg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numRegistrazione" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creaBuonoInDTO", propOrder = {
    "annoRif",
    "cdUoOrigine",
    "dettagli",
    "dsBuono",
    "dtRegistrazioneDg",
    "idDg",
    "nomeTipoDg",
    "numRegistrazione"
})
public class CreaBuonoInDTO {

    protected Integer annoRif;
    protected String cdUoOrigine;
    @XmlElement(nillable = true)
    protected List<CreaBuonoDetInDTO> dettagli;
    protected String dsBuono;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtRegistrazioneDg;
    protected Long idDg;
    protected String nomeTipoDg;
    protected Long numRegistrazione;

    /**
     * Gets the value of the annoRif property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnnoRif() {
        return annoRif;
    }

    /**
     * Sets the value of the annoRif property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnnoRif(Integer value) {
        this.annoRif = value;
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
     * {@link CreaBuonoDetInDTO }
     * 
     * 
     */
    public List<CreaBuonoDetInDTO> getDettagli() {
        if (dettagli == null) {
            dettagli = new ArrayList<CreaBuonoDetInDTO>();
        }
        return this.dettagli;
    }

    /**
     * Gets the value of the dsBuono property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsBuono() {
        return dsBuono;
    }

    /**
     * Sets the value of the dsBuono property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsBuono(String value) {
        this.dsBuono = value;
    }

    /**
     * Gets the value of the dtRegistrazioneDg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtRegistrazioneDg() {
        return dtRegistrazioneDg;
    }

    /**
     * Sets the value of the dtRegistrazioneDg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtRegistrazioneDg(XMLGregorianCalendar value) {
        this.dtRegistrazioneDg = value;
    }

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

}

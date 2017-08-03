
package it.cineca.u_gov.co.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transFSM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transFSM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idDgs" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="edgeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAbUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idAbSuppl" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transFSM", propOrder = {
    "idDgs",
    "edgeName",
    "cdLang",
    "idAbUser",
    "idAbSuppl",
    "note"
})
public class TransFSM {

    @XmlElement(type = Long.class)
    protected List<Long> idDgs;
    protected String edgeName;
    protected String cdLang;
    protected Long idAbUser;
    protected Long idAbSuppl;
    protected String note;

    /**
     * Gets the value of the idDgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idDgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdDgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getIdDgs() {
        if (idDgs == null) {
            idDgs = new ArrayList<Long>();
        }
        return this.idDgs;
    }

    /**
     * Gets the value of the edgeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdgeName() {
        return edgeName;
    }

    /**
     * Sets the value of the edgeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdgeName(String value) {
        this.edgeName = value;
    }

    /**
     * Gets the value of the cdLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdLang() {
        return cdLang;
    }

    /**
     * Sets the value of the cdLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdLang(String value) {
        this.cdLang = value;
    }

    /**
     * Gets the value of the idAbUser property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAbUser() {
        return idAbUser;
    }

    /**
     * Sets the value of the idAbUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAbUser(Long value) {
        this.idAbUser = value;
    }

    /**
     * Gets the value of the idAbSuppl property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAbSuppl() {
        return idAbSuppl;
    }

    /**
     * Sets the value of the idAbSuppl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAbSuppl(Long value) {
        this.idAbSuppl = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}

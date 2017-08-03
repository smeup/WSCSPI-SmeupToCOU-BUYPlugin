
package it.cineca.u_gov.co.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uaVoceCoanProgettoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uaVoceCoanProgettoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdUo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="progetti" type="{http://ws.co.u-gov.cineca.it/}progettiLightDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ua" type="{http://ws.co.u-gov.cineca.it/}uaLightDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="voci" type="{http://ws.co.u-gov.cineca.it/}voceCoanLightDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uaVoceCoanProgettoDTO", propOrder = {
    "cdUo",
    "progetti",
    "ua",
    "voci"
})
public class UaVoceCoanProgettoDTO {

    protected String cdUo;
    @XmlElement(nillable = true)
    protected List<ProgettiLightDTO> progetti;
    @XmlElement(nillable = true)
    protected List<UaLightDTO> ua;
    @XmlElement(nillable = true)
    protected List<VoceCoanLightDTO> voci;

    /**
     * Gets the value of the cdUo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUo() {
        return cdUo;
    }

    /**
     * Sets the value of the cdUo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUo(String value) {
        this.cdUo = value;
    }

    /**
     * Gets the value of the progetti property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the progetti property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgetti().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgettiLightDTO }
     * 
     * 
     */
    public List<ProgettiLightDTO> getProgetti() {
        if (progetti == null) {
            progetti = new ArrayList<ProgettiLightDTO>();
        }
        return this.progetti;
    }

    /**
     * Gets the value of the ua property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ua property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UaLightDTO }
     * 
     * 
     */
    public List<UaLightDTO> getUa() {
        if (ua == null) {
            ua = new ArrayList<UaLightDTO>();
        }
        return this.ua;
    }

    /**
     * Gets the value of the voci property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voci property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoci().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoceCoanLightDTO }
     * 
     * 
     */
    public List<VoceCoanLightDTO> getVoci() {
        if (voci == null) {
            voci = new ArrayList<VoceCoanLightDTO>();
        }
        return this.voci;
    }

}

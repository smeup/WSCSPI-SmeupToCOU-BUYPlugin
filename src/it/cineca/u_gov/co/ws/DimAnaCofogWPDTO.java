
package it.cineca.u_gov.co.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dimAnaCofogWPDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dimAnaCofogWPDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cofog" type="{http://ws.co.u-gov.cineca.it/}cofogCoanDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dimAna" type="{http://ws.co.u-gov.cineca.it/}dimAnaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="unitaLavoro" type="{http://ws.co.u-gov.cineca.it/}unitaLavoroDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dimAnaCofogWPDTO", propOrder = {
    "cdProgetto",
    "cdUa",
    "cofog",
    "dimAna",
    "unitaLavoro"
})
public class DimAnaCofogWPDTO {

    protected String cdProgetto;
    protected String cdUa;
    @XmlElement(nillable = true)
    protected List<CofogCoanDTO> cofog;
    @XmlElement(nillable = true)
    protected List<DimAnaDTO> dimAna;
    @XmlElement(nillable = true)
    protected List<UnitaLavoroDTO> unitaLavoro;

    /**
     * Gets the value of the cdProgetto property.
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
     * Sets the value of the cdProgetto property.
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
     * Gets the value of the cdUa property.
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
     * Sets the value of the cdUa property.
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
     * Gets the value of the cofog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cofog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCofog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CofogCoanDTO }
     * 
     * 
     */
    public List<CofogCoanDTO> getCofog() {
        if (cofog == null) {
            cofog = new ArrayList<CofogCoanDTO>();
        }
        return this.cofog;
    }

    /**
     * Gets the value of the dimAna property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimAna property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimAna().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DimAnaDTO }
     * 
     * 
     */
    public List<DimAnaDTO> getDimAna() {
        if (dimAna == null) {
            dimAna = new ArrayList<DimAnaDTO>();
        }
        return this.dimAna;
    }

    /**
     * Gets the value of the unitaLavoro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitaLavoro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitaLavoro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitaLavoroDTO }
     * 
     * 
     */
    public List<UnitaLavoroDTO> getUnitaLavoro() {
        if (unitaLavoro == null) {
            unitaLavoro = new ArrayList<UnitaLavoroDTO>();
        }
        return this.unitaLavoro;
    }

}

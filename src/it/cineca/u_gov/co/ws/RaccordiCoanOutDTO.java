
package it.cineca.u_gov.co.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per raccordiCoanOutDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="raccordiCoanOutDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dimAna" type="{http://ws.co.u-gov.cineca.it/}raccordiDimAnaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ua" type="{http://ws.co.u-gov.cineca.it/}raccordiUaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vociCoan" type="{http://ws.co.u-gov.cineca.it/}raccordiVociCoanDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "raccordiCoanOutDTO", propOrder = {
    "dimAna",
    "ua",
    "vociCoan"
})
public class RaccordiCoanOutDTO {

    @XmlElement(nillable = true)
    protected List<RaccordiDimAnaDTO> dimAna;
    @XmlElement(nillable = true)
    protected List<RaccordiUaDTO> ua;
    @XmlElement(nillable = true)
    protected List<RaccordiVociCoanDTO> vociCoan;

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
     * {@link RaccordiDimAnaDTO }
     * 
     * 
     */
    public List<RaccordiDimAnaDTO> getDimAna() {
        if (dimAna == null) {
            dimAna = new ArrayList<RaccordiDimAnaDTO>();
        }
        return this.dimAna;
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
     * {@link RaccordiUaDTO }
     * 
     * 
     */
    public List<RaccordiUaDTO> getUa() {
        if (ua == null) {
            ua = new ArrayList<RaccordiUaDTO>();
        }
        return this.ua;
    }

    /**
     * Gets the value of the vociCoan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vociCoan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVociCoan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RaccordiVociCoanDTO }
     * 
     * 
     */
    public List<RaccordiVociCoanDTO> getVociCoan() {
        if (vociCoan == null) {
            vociCoan = new ArrayList<RaccordiVociCoanDTO>();
        }
        return this.vociCoan;
    }

}

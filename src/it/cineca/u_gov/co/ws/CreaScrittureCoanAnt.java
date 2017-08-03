
package it.cineca.u_gov.co.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creaScrittureCoanAnt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creaScrittureCoanAnt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scritture" type="{http://ws.co.u-gov.cineca.it/}nuovaScritturaCoanDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creaScrittureCoanAnt", propOrder = {
    "scritture"
})
public class CreaScrittureCoanAnt {

    protected List<NuovaScritturaCoanDTO> scritture;

    /**
     * Gets the value of the scritture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scritture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScritture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NuovaScritturaCoanDTO }
     * 
     * 
     */
    public List<NuovaScritturaCoanDTO> getScritture() {
        if (scritture == null) {
            scritture = new ArrayList<NuovaScritturaCoanDTO>();
        }
        return this.scritture;
    }

}

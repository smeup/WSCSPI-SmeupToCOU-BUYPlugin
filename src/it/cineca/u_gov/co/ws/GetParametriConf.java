
package it.cineca.u_gov.co.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getParametriConf complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getParametriConf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parametri" type="{http://ws.co.u-gov.cineca.it/}parametriConfDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getParametriConf", propOrder = {
    "parametri"
})
public class GetParametriConf {

    protected List<ParametriConfDTO> parametri;

    /**
     * Gets the value of the parametri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametriConfDTO }
     * 
     * 
     */
    public List<ParametriConfDTO> getParametri() {
        if (parametri == null) {
            parametri = new ArrayList<ParametriConfDTO>();
        }
        return this.parametri;
    }

}

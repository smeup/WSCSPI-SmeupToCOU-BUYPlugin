
package it.cineca.u_gov.co.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getScrCoan complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getScrCoan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scrittureList" type="{http://ws.co.u-gov.cineca.it/}scritturaCoanDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getScrCoan", propOrder = {
    "scrittureList"
})
public class GetScrCoan {

    protected List<ScritturaCoanDTO> scrittureList;

    /**
     * Gets the value of the scrittureList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scrittureList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScrittureList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScritturaCoanDTO }
     * 
     * 
     */
    public List<ScritturaCoanDTO> getScrittureList() {
        if (scrittureList == null) {
            scrittureList = new ArrayList<ScritturaCoanDTO>();
        }
        return this.scrittureList;
    }

}

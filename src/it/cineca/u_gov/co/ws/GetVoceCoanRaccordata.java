
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getVoceCoanRaccordata complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getVoceCoanRaccordata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eseOri" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cdVoceCoanOri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eseDest" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVoceCoanRaccordata", propOrder = {
    "eseOri",
    "cdVoceCoanOri",
    "eseDest"
})
public class GetVoceCoanRaccordata {

    protected Integer eseOri;
    protected String cdVoceCoanOri;
    protected Integer eseDest;

    /**
     * Recupera il valore della proprietà eseOri.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEseOri() {
        return eseOri;
    }

    /**
     * Imposta il valore della proprietà eseOri.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEseOri(Integer value) {
        this.eseOri = value;
    }

    /**
     * Recupera il valore della proprietà cdVoceCoanOri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdVoceCoanOri() {
        return cdVoceCoanOri;
    }

    /**
     * Imposta il valore della proprietà cdVoceCoanOri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdVoceCoanOri(String value) {
        this.cdVoceCoanOri = value;
    }

    /**
     * Recupera il valore della proprietà eseDest.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEseDest() {
        return eseDest;
    }

    /**
     * Imposta il valore della proprietà eseDest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEseDest(Integer value) {
        this.eseDest = value;
    }

}

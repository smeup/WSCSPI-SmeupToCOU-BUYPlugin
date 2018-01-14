
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaContrattiPassivi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaContrattiPassivi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdAppExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cdIndicePA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaContrattiPassivi", propOrder = {
    "cdAppExt",
    "esercizio",
    "cdIndicePA"
})
public class ListaContrattiPassivi {

    protected String cdAppExt;
    protected Integer esercizio;
    protected String cdIndicePA;

    /**
     * Gets the value of the cdAppExt property.
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
     * Sets the value of the cdAppExt property.
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
     * Gets the value of the esercizio property.
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
     * Sets the value of the esercizio property.
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
     * Gets the value of the cdIndicePA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdIndicePA() {
        return cdIndicePA;
    }

    /**
     * Sets the value of the cdIndicePA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdIndicePA(String value) {
        this.cdIndicePA = value;
    }

}

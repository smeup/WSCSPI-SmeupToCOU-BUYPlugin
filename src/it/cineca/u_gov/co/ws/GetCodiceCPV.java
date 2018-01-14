
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getCodiceCPV complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCodiceCPV">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dtReg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="flUltimoLivello" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cdBeneServizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCodiceCPV", propOrder = {
    "dtReg",
    "flUltimoLivello",
    "cdBeneServizio"
})
public class GetCodiceCPV {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtReg;
    protected Boolean flUltimoLivello;
    protected String cdBeneServizio;

    /**
     * Gets the value of the dtReg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtReg() {
        return dtReg;
    }

    /**
     * Sets the value of the dtReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtReg(XMLGregorianCalendar value) {
        this.dtReg = value;
    }

    /**
     * Gets the value of the flUltimoLivello property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlUltimoLivello() {
        return flUltimoLivello;
    }

    /**
     * Sets the value of the flUltimoLivello property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlUltimoLivello(Boolean value) {
        this.flUltimoLivello = value;
    }

    /**
     * Gets the value of the cdBeneServizio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdBeneServizio() {
        return cdBeneServizio;
    }

    /**
     * Sets the value of the cdBeneServizio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdBeneServizio(String value) {
        this.cdBeneServizio = value;
    }

}

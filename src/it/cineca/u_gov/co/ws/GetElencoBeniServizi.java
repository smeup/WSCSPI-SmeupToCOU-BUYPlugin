
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getElencoBeniServizi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getElencoBeniServizi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dtRif" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cdTipoOpIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flCaricoBene" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getElencoBeniServizi", propOrder = {
    "dtRif",
    "cdTipoOpIva",
    "flCaricoBene"
})
public class GetElencoBeniServizi {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtRif;
    protected String cdTipoOpIva;
    protected Boolean flCaricoBene;

    /**
     * Gets the value of the dtRif property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtRif() {
        return dtRif;
    }

    /**
     * Sets the value of the dtRif property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtRif(XMLGregorianCalendar value) {
        this.dtRif = value;
    }

    /**
     * Gets the value of the cdTipoOpIva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdTipoOpIva() {
        return cdTipoOpIva;
    }

    /**
     * Sets the value of the cdTipoOpIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdTipoOpIva(String value) {
        this.cdTipoOpIva = value;
    }

    /**
     * Gets the value of the flCaricoBene property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlCaricoBene() {
        return flCaricoBene;
    }

    /**
     * Sets the value of the flCaricoBene property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlCaricoBene(Boolean value) {
        this.flCaricoBene = value;
    }

}

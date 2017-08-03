
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parametriConfDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parametriConfDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdChiavePrimaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdChiaveSecondaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUnitaFunzionale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strValore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametriConfDTO", propOrder = {
    "cdChiavePrimaria",
    "cdChiaveSecondaria",
    "cdUnitaFunzionale",
    "errore",
    "esercizio",
    "message",
    "strValore"
})
public class ParametriConfDTO {

    protected String cdChiavePrimaria;
    protected String cdChiaveSecondaria;
    protected String cdUnitaFunzionale;
    protected Boolean errore;
    protected String esercizio;
    protected String message;
    protected String strValore;

    /**
     * Gets the value of the cdChiavePrimaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdChiavePrimaria() {
        return cdChiavePrimaria;
    }

    /**
     * Sets the value of the cdChiavePrimaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdChiavePrimaria(String value) {
        this.cdChiavePrimaria = value;
    }

    /**
     * Gets the value of the cdChiaveSecondaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdChiaveSecondaria() {
        return cdChiaveSecondaria;
    }

    /**
     * Sets the value of the cdChiaveSecondaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdChiaveSecondaria(String value) {
        this.cdChiaveSecondaria = value;
    }

    /**
     * Gets the value of the cdUnitaFunzionale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUnitaFunzionale() {
        return cdUnitaFunzionale;
    }

    /**
     * Sets the value of the cdUnitaFunzionale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUnitaFunzionale(String value) {
        this.cdUnitaFunzionale = value;
    }

    /**
     * Gets the value of the errore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErrore() {
        return errore;
    }

    /**
     * Sets the value of the errore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErrore(Boolean value) {
        this.errore = value;
    }

    /**
     * Gets the value of the esercizio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsercizio() {
        return esercizio;
    }

    /**
     * Sets the value of the esercizio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsercizio(String value) {
        this.esercizio = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the strValore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrValore() {
        return strValore;
    }

    /**
     * Sets the value of the strValore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrValore(String value) {
        this.strValore = value;
    }

}

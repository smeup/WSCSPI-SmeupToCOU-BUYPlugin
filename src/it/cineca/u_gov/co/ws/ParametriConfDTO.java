
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per parametriConfDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietà cdChiavePrimaria.
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
     * Imposta il valore della proprietà cdChiavePrimaria.
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
     * Recupera il valore della proprietà cdChiaveSecondaria.
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
     * Imposta il valore della proprietà cdChiaveSecondaria.
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
     * Recupera il valore della proprietà cdUnitaFunzionale.
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
     * Imposta il valore della proprietà cdUnitaFunzionale.
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
     * Recupera il valore della proprietà errore.
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
     * Imposta il valore della proprietà errore.
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
     * Recupera il valore della proprietà esercizio.
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
     * Imposta il valore della proprietà esercizio.
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
     * Recupera il valore della proprietà message.
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
     * Imposta il valore della proprietà message.
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
     * Recupera il valore della proprietà strValore.
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
     * Imposta il valore della proprietà strValore.
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

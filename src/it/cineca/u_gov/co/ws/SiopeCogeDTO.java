
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for siopeCogeDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="siopeCogeDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdSiope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdVoceCoge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsSiope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idVoceRiclCoge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tiVoce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "siopeCogeDTO", propOrder = {
    "cdSiope",
    "cdVoceCoge",
    "dsSiope",
    "esercizio",
    "idVoceRiclCoge",
    "tiVoce"
})
public class SiopeCogeDTO {

    protected String cdSiope;
    protected String cdVoceCoge;
    protected String dsSiope;
    protected Integer esercizio;
    protected Long idVoceRiclCoge;
    protected String tiVoce;

    /**
     * Gets the value of the cdSiope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdSiope() {
        return cdSiope;
    }

    /**
     * Sets the value of the cdSiope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdSiope(String value) {
        this.cdSiope = value;
    }

    /**
     * Gets the value of the cdVoceCoge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdVoceCoge() {
        return cdVoceCoge;
    }

    /**
     * Sets the value of the cdVoceCoge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdVoceCoge(String value) {
        this.cdVoceCoge = value;
    }

    /**
     * Gets the value of the dsSiope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsSiope() {
        return dsSiope;
    }

    /**
     * Sets the value of the dsSiope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsSiope(String value) {
        this.dsSiope = value;
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
     * Gets the value of the idVoceRiclCoge property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdVoceRiclCoge() {
        return idVoceRiclCoge;
    }

    /**
     * Sets the value of the idVoceRiclCoge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdVoceRiclCoge(Long value) {
        this.idVoceRiclCoge = value;
    }

    /**
     * Gets the value of the tiVoce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiVoce() {
        return tiVoce;
    }

    /**
     * Sets the value of the tiVoce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiVoce(String value) {
        this.tiVoce = value;
    }

}

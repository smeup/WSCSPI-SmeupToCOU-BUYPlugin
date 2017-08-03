
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for riclCoanNewDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="riclCoanNewDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdVoceRiclCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denomVoceRiclCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="flConfermato" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idVoceRiclCoan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="segno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiRiclassificato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "riclCoanNewDTO", propOrder = {
    "cdVoceRiclCoan",
    "denomVoceRiclCoan",
    "esercizio",
    "flConfermato",
    "flDefault",
    "idVoceRiclCoan",
    "segno",
    "tiRiclassificato",
    "tiVoce"
})
public class RiclCoanNewDTO {

    protected String cdVoceRiclCoan;
    protected String denomVoceRiclCoan;
    protected Integer esercizio;
    protected Boolean flConfermato;
    protected Boolean flDefault;
    protected Long idVoceRiclCoan;
    protected String segno;
    protected String tiRiclassificato;
    protected String tiVoce;

    /**
     * Gets the value of the cdVoceRiclCoan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdVoceRiclCoan() {
        return cdVoceRiclCoan;
    }

    /**
     * Sets the value of the cdVoceRiclCoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdVoceRiclCoan(String value) {
        this.cdVoceRiclCoan = value;
    }

    /**
     * Gets the value of the denomVoceRiclCoan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenomVoceRiclCoan() {
        return denomVoceRiclCoan;
    }

    /**
     * Sets the value of the denomVoceRiclCoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenomVoceRiclCoan(String value) {
        this.denomVoceRiclCoan = value;
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
     * Gets the value of the flConfermato property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlConfermato() {
        return flConfermato;
    }

    /**
     * Sets the value of the flConfermato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlConfermato(Boolean value) {
        this.flConfermato = value;
    }

    /**
     * Gets the value of the flDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlDefault() {
        return flDefault;
    }

    /**
     * Sets the value of the flDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlDefault(Boolean value) {
        this.flDefault = value;
    }

    /**
     * Gets the value of the idVoceRiclCoan property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdVoceRiclCoan() {
        return idVoceRiclCoan;
    }

    /**
     * Sets the value of the idVoceRiclCoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdVoceRiclCoan(Long value) {
        this.idVoceRiclCoan = value;
    }

    /**
     * Gets the value of the segno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegno() {
        return segno;
    }

    /**
     * Sets the value of the segno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegno(String value) {
        this.segno = value;
    }

    /**
     * Gets the value of the tiRiclassificato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiRiclassificato() {
        return tiRiclassificato;
    }

    /**
     * Sets the value of the tiRiclassificato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiRiclassificato(String value) {
        this.tiRiclassificato = value;
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

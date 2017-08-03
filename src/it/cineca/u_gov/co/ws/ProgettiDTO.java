
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for progettiDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="progettiDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsTipoProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flVincolaWp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idProgetto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idTipoProgetto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nomeProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "progettiDTO", propOrder = {
    "cdProgetto",
    "cup",
    "dsTipoProgetto",
    "flVincolaWp",
    "idProgetto",
    "idTipoProgetto",
    "nomeProgetto"
})
public class ProgettiDTO {

    protected String cdProgetto;
    protected String cup;
    protected String dsTipoProgetto;
    protected Boolean flVincolaWp;
    protected Long idProgetto;
    protected Long idTipoProgetto;
    protected String nomeProgetto;

    /**
     * Gets the value of the cdProgetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdProgetto() {
        return cdProgetto;
    }

    /**
     * Sets the value of the cdProgetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdProgetto(String value) {
        this.cdProgetto = value;
    }

    /**
     * Gets the value of the cup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCup() {
        return cup;
    }

    /**
     * Sets the value of the cup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCup(String value) {
        this.cup = value;
    }

    /**
     * Gets the value of the dsTipoProgetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsTipoProgetto() {
        return dsTipoProgetto;
    }

    /**
     * Sets the value of the dsTipoProgetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsTipoProgetto(String value) {
        this.dsTipoProgetto = value;
    }

    /**
     * Gets the value of the flVincolaWp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlVincolaWp() {
        return flVincolaWp;
    }

    /**
     * Sets the value of the flVincolaWp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlVincolaWp(Boolean value) {
        this.flVincolaWp = value;
    }

    /**
     * Gets the value of the idProgetto property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdProgetto() {
        return idProgetto;
    }

    /**
     * Sets the value of the idProgetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdProgetto(Long value) {
        this.idProgetto = value;
    }

    /**
     * Gets the value of the idTipoProgetto property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTipoProgetto() {
        return idTipoProgetto;
    }

    /**
     * Sets the value of the idTipoProgetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTipoProgetto(Long value) {
        this.idTipoProgetto = value;
    }

    /**
     * Gets the value of the nomeProgetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeProgetto() {
        return nomeProgetto;
    }

    /**
     * Sets the value of the nomeProgetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeProgetto(String value) {
        this.nomeProgetto = value;
    }

}

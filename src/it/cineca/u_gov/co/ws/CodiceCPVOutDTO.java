
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for codiceCPVOutDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="codiceCPVOutDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdCPV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdCPVPadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdCPVProprio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codificaCPV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsCPV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flUltimoLivello" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="livello" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "codiceCPVOutDTO", propOrder = {
    "cdCPV",
    "cdCPVPadre",
    "cdCPVProprio",
    "codificaCPV",
    "dsCPV",
    "flUltimoLivello",
    "livello"
})
public class CodiceCPVOutDTO {

    protected String cdCPV;
    protected String cdCPVPadre;
    protected String cdCPVProprio;
    protected String codificaCPV;
    protected String dsCPV;
    protected Boolean flUltimoLivello;
    protected Integer livello;

    /**
     * Gets the value of the cdCPV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCPV() {
        return cdCPV;
    }

    /**
     * Sets the value of the cdCPV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCPV(String value) {
        this.cdCPV = value;
    }

    /**
     * Gets the value of the cdCPVPadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCPVPadre() {
        return cdCPVPadre;
    }

    /**
     * Sets the value of the cdCPVPadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCPVPadre(String value) {
        this.cdCPVPadre = value;
    }

    /**
     * Gets the value of the cdCPVProprio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCPVProprio() {
        return cdCPVProprio;
    }

    /**
     * Sets the value of the cdCPVProprio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCPVProprio(String value) {
        this.cdCPVProprio = value;
    }

    /**
     * Gets the value of the codificaCPV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodificaCPV() {
        return codificaCPV;
    }

    /**
     * Sets the value of the codificaCPV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodificaCPV(String value) {
        this.codificaCPV = value;
    }

    /**
     * Gets the value of the dsCPV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsCPV() {
        return dsCPV;
    }

    /**
     * Sets the value of the dsCPV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsCPV(String value) {
        this.dsCPV = value;
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
     * Gets the value of the livello property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLivello() {
        return livello;
    }

    /**
     * Sets the value of the livello property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLivello(Integer value) {
        this.livello = value;
    }

}

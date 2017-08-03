
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for valoriBeniInDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="valoriBeniInDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdInvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idInventarioBeni" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pgBene" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pgBeneSub" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valoriBeniInDTO", propOrder = {
    "cdInvent",
    "idInventarioBeni",
    "pgBene",
    "pgBeneSub"
})
public class ValoriBeniInDTO {

    protected String cdInvent;
    protected Long idInventarioBeni;
    protected Long pgBene;
    protected Integer pgBeneSub;

    /**
     * Gets the value of the cdInvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdInvent() {
        return cdInvent;
    }

    /**
     * Sets the value of the cdInvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdInvent(String value) {
        this.cdInvent = value;
    }

    /**
     * Gets the value of the idInventarioBeni property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdInventarioBeni() {
        return idInventarioBeni;
    }

    /**
     * Sets the value of the idInventarioBeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdInventarioBeni(Long value) {
        this.idInventarioBeni = value;
    }

    /**
     * Gets the value of the pgBene property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPgBene() {
        return pgBene;
    }

    /**
     * Sets the value of the pgBene property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPgBene(Long value) {
        this.pgBene = value;
    }

    /**
     * Gets the value of the pgBeneSub property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPgBeneSub() {
        return pgBeneSub;
    }

    /**
     * Sets the value of the pgBeneSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPgBeneSub(Integer value) {
        this.pgBeneSub = value;
    }

}

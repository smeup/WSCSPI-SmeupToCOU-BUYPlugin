
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cancellaBuono complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cancellaBuono">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idBuonoCarScar" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cdInvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgBuonoCarScar" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tiBuono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancellaBuono", propOrder = {
    "idBuonoCarScar",
    "cdInvent",
    "pgBuonoCarScar",
    "tiBuono",
    "esercizio"
})
public class CancellaBuono {

    protected Long idBuonoCarScar;
    protected String cdInvent;
    protected Long pgBuonoCarScar;
    protected String tiBuono;
    protected Integer esercizio;

    /**
     * Gets the value of the idBuonoCarScar property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdBuonoCarScar() {
        return idBuonoCarScar;
    }

    /**
     * Sets the value of the idBuonoCarScar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdBuonoCarScar(Long value) {
        this.idBuonoCarScar = value;
    }

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
     * Gets the value of the pgBuonoCarScar property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPgBuonoCarScar() {
        return pgBuonoCarScar;
    }

    /**
     * Sets the value of the pgBuonoCarScar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPgBuonoCarScar(Long value) {
        this.pgBuonoCarScar = value;
    }

    /**
     * Gets the value of the tiBuono property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiBuono() {
        return tiBuono;
    }

    /**
     * Sets the value of the tiBuono property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiBuono(String value) {
        this.tiBuono = value;
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

}

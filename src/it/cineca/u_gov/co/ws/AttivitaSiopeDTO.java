
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attivitaSiopeDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attivitaSiopeDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdAttivitaGestionale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsAttivitaGestionale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="flDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idAttivitaGestionale" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attivitaSiopeDTO", propOrder = {
    "cdAttivitaGestionale",
    "dsAttivitaGestionale",
    "esercizio",
    "flDefault",
    "idAttivitaGestionale"
})
public class AttivitaSiopeDTO {

    protected String cdAttivitaGestionale;
    protected String dsAttivitaGestionale;
    protected Integer esercizio;
    protected Boolean flDefault;
    protected Long idAttivitaGestionale;

    /**
     * Gets the value of the cdAttivitaGestionale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdAttivitaGestionale() {
        return cdAttivitaGestionale;
    }

    /**
     * Sets the value of the cdAttivitaGestionale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdAttivitaGestionale(String value) {
        this.cdAttivitaGestionale = value;
    }

    /**
     * Gets the value of the dsAttivitaGestionale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsAttivitaGestionale() {
        return dsAttivitaGestionale;
    }

    /**
     * Sets the value of the dsAttivitaGestionale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsAttivitaGestionale(String value) {
        this.dsAttivitaGestionale = value;
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
     * Gets the value of the idAttivitaGestionale property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAttivitaGestionale() {
        return idAttivitaGestionale;
    }

    /**
     * Sets the value of the idAttivitaGestionale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAttivitaGestionale(Long value) {
        this.idAttivitaGestionale = value;
    }

}

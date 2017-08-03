
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modificaUESospesoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modificaUESospesoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anno" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cdRifIstCass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ibanEnte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idRitornoCassiere" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="msgErrore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nuovaUe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoMovIstCass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ueIniziale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificaUESospesoDTO", propOrder = {
    "anno",
    "cdRifIstCass",
    "ibanEnte",
    "idRitornoCassiere",
    "msgErrore",
    "nuovaUe",
    "tipoMovIstCass",
    "ueIniziale"
})
public class ModificaUESospesoDTO {

    protected Integer anno;
    protected String cdRifIstCass;
    protected String ibanEnte;
    protected Long idRitornoCassiere;
    protected String msgErrore;
    protected String nuovaUe;
    protected String tipoMovIstCass;
    protected String ueIniziale;

    /**
     * Gets the value of the anno property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnno() {
        return anno;
    }

    /**
     * Sets the value of the anno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnno(Integer value) {
        this.anno = value;
    }

    /**
     * Gets the value of the cdRifIstCass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdRifIstCass() {
        return cdRifIstCass;
    }

    /**
     * Sets the value of the cdRifIstCass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdRifIstCass(String value) {
        this.cdRifIstCass = value;
    }

    /**
     * Gets the value of the ibanEnte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbanEnte() {
        return ibanEnte;
    }

    /**
     * Sets the value of the ibanEnte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbanEnte(String value) {
        this.ibanEnte = value;
    }

    /**
     * Gets the value of the idRitornoCassiere property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdRitornoCassiere() {
        return idRitornoCassiere;
    }

    /**
     * Sets the value of the idRitornoCassiere property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdRitornoCassiere(Long value) {
        this.idRitornoCassiere = value;
    }

    /**
     * Gets the value of the msgErrore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgErrore() {
        return msgErrore;
    }

    /**
     * Sets the value of the msgErrore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgErrore(String value) {
        this.msgErrore = value;
    }

    /**
     * Gets the value of the nuovaUe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuovaUe() {
        return nuovaUe;
    }

    /**
     * Sets the value of the nuovaUe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuovaUe(String value) {
        this.nuovaUe = value;
    }

    /**
     * Gets the value of the tipoMovIstCass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMovIstCass() {
        return tipoMovIstCass;
    }

    /**
     * Sets the value of the tipoMovIstCass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMovIstCass(String value) {
        this.tipoMovIstCass = value;
    }

    /**
     * Gets the value of the ueIniziale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUeIniziale() {
        return ueIniziale;
    }

    /**
     * Sets the value of the ueIniziale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUeIniziale(String value) {
        this.ueIniziale = value;
    }

}

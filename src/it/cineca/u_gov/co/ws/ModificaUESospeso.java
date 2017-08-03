
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modificaUESospeso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modificaUESospeso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idRitornoCassiere" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codiceUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ibanEnte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoMovIstCass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdRifIstCass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anno" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificaUESospeso", propOrder = {
    "idRitornoCassiere",
    "codiceUE",
    "ibanEnte",
    "tipoMovIstCass",
    "cdRifIstCass",
    "anno"
})
public class ModificaUESospeso {

    protected Long idRitornoCassiere;
    protected String codiceUE;
    protected String ibanEnte;
    protected String tipoMovIstCass;
    protected String cdRifIstCass;
    protected Integer anno;

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
     * Gets the value of the codiceUE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceUE() {
        return codiceUE;
    }

    /**
     * Sets the value of the codiceUE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceUE(String value) {
        this.codiceUE = value;
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

}

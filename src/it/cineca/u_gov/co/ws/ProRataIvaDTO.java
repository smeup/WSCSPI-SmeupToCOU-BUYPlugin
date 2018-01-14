
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for proRataIvaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="proRataIvaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdAteco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdAttivitaIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdRegimeFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsAttivitaIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="flEditoria" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flPrincipale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="percentualeProRata" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tiCampoAttivita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proRataIvaDTO", propOrder = {
    "cdAteco",
    "cdAttivitaIva",
    "cdRegimeFiscale",
    "dsAttivitaIva",
    "esercizio",
    "flEditoria",
    "flPrincipale",
    "percentualeProRata",
    "tiCampoAttivita"
})
public class ProRataIvaDTO {

    protected String cdAteco;
    protected String cdAttivitaIva;
    protected String cdRegimeFiscale;
    protected String dsAttivitaIva;
    protected Integer esercizio;
    protected Boolean flEditoria;
    protected Boolean flPrincipale;
    protected BigDecimal percentualeProRata;
    protected String tiCampoAttivita;

    /**
     * Gets the value of the cdAteco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdAteco() {
        return cdAteco;
    }

    /**
     * Sets the value of the cdAteco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdAteco(String value) {
        this.cdAteco = value;
    }

    /**
     * Gets the value of the cdAttivitaIva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdAttivitaIva() {
        return cdAttivitaIva;
    }

    /**
     * Sets the value of the cdAttivitaIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdAttivitaIva(String value) {
        this.cdAttivitaIva = value;
    }

    /**
     * Gets the value of the cdRegimeFiscale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdRegimeFiscale() {
        return cdRegimeFiscale;
    }

    /**
     * Sets the value of the cdRegimeFiscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdRegimeFiscale(String value) {
        this.cdRegimeFiscale = value;
    }

    /**
     * Gets the value of the dsAttivitaIva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsAttivitaIva() {
        return dsAttivitaIva;
    }

    /**
     * Sets the value of the dsAttivitaIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsAttivitaIva(String value) {
        this.dsAttivitaIva = value;
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
     * Gets the value of the flEditoria property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlEditoria() {
        return flEditoria;
    }

    /**
     * Sets the value of the flEditoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlEditoria(Boolean value) {
        this.flEditoria = value;
    }

    /**
     * Gets the value of the flPrincipale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlPrincipale() {
        return flPrincipale;
    }

    /**
     * Sets the value of the flPrincipale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlPrincipale(Boolean value) {
        this.flPrincipale = value;
    }

    /**
     * Gets the value of the percentualeProRata property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentualeProRata() {
        return percentualeProRata;
    }

    /**
     * Sets the value of the percentualeProRata property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentualeProRata(BigDecimal value) {
        this.percentualeProRata = value;
    }

    /**
     * Gets the value of the tiCampoAttivita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiCampoAttivita() {
        return tiCampoAttivita;
    }

    /**
     * Sets the value of the tiCampoAttivita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiCampoAttivita(String value) {
        this.tiCampoAttivita = value;
    }

}

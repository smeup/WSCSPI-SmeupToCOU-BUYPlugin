
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sezionaleIvaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sezionaleIvaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdAttivitaIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdSezionale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsSezionale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="flAutofatture" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flCorrispettivi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flExtraUe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flFtEl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flIntraUe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flOrdinario" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flSanMarino" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tiAttivoPassivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiBeneServizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "sezionaleIvaDTO", propOrder = {
    "cdAttivitaIva",
    "cdSezionale",
    "dsSezionale",
    "esercizio",
    "flAutofatture",
    "flCorrispettivi",
    "flExtraUe",
    "flFtEl",
    "flIntraUe",
    "flOrdinario",
    "flSanMarino",
    "tiAttivoPassivo",
    "tiBeneServizio",
    "tiCampoAttivita"
})
public class SezionaleIvaDTO {

    protected String cdAttivitaIva;
    protected String cdSezionale;
    protected String dsSezionale;
    protected Integer esercizio;
    protected Boolean flAutofatture;
    protected Boolean flCorrispettivi;
    protected Boolean flExtraUe;
    protected Boolean flFtEl;
    protected Boolean flIntraUe;
    protected Boolean flOrdinario;
    protected Boolean flSanMarino;
    protected String tiAttivoPassivo;
    protected String tiBeneServizio;
    protected String tiCampoAttivita;

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
     * Gets the value of the cdSezionale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdSezionale() {
        return cdSezionale;
    }

    /**
     * Sets the value of the cdSezionale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdSezionale(String value) {
        this.cdSezionale = value;
    }

    /**
     * Gets the value of the dsSezionale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsSezionale() {
        return dsSezionale;
    }

    /**
     * Sets the value of the dsSezionale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsSezionale(String value) {
        this.dsSezionale = value;
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
     * Gets the value of the flAutofatture property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlAutofatture() {
        return flAutofatture;
    }

    /**
     * Sets the value of the flAutofatture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlAutofatture(Boolean value) {
        this.flAutofatture = value;
    }

    /**
     * Gets the value of the flCorrispettivi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlCorrispettivi() {
        return flCorrispettivi;
    }

    /**
     * Sets the value of the flCorrispettivi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlCorrispettivi(Boolean value) {
        this.flCorrispettivi = value;
    }

    /**
     * Gets the value of the flExtraUe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlExtraUe() {
        return flExtraUe;
    }

    /**
     * Sets the value of the flExtraUe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlExtraUe(Boolean value) {
        this.flExtraUe = value;
    }

    /**
     * Gets the value of the flFtEl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlFtEl() {
        return flFtEl;
    }

    /**
     * Sets the value of the flFtEl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlFtEl(Boolean value) {
        this.flFtEl = value;
    }

    /**
     * Gets the value of the flIntraUe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlIntraUe() {
        return flIntraUe;
    }

    /**
     * Sets the value of the flIntraUe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlIntraUe(Boolean value) {
        this.flIntraUe = value;
    }

    /**
     * Gets the value of the flOrdinario property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlOrdinario() {
        return flOrdinario;
    }

    /**
     * Sets the value of the flOrdinario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlOrdinario(Boolean value) {
        this.flOrdinario = value;
    }

    /**
     * Gets the value of the flSanMarino property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlSanMarino() {
        return flSanMarino;
    }

    /**
     * Sets the value of the flSanMarino property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlSanMarino(Boolean value) {
        this.flSanMarino = value;
    }

    /**
     * Gets the value of the tiAttivoPassivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiAttivoPassivo() {
        return tiAttivoPassivo;
    }

    /**
     * Sets the value of the tiAttivoPassivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiAttivoPassivo(String value) {
        this.tiAttivoPassivo = value;
    }

    /**
     * Gets the value of the tiBeneServizio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiBeneServizio() {
        return tiBeneServizio;
    }

    /**
     * Sets the value of the tiBeneServizio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiBeneServizio(String value) {
        this.tiBeneServizio = value;
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

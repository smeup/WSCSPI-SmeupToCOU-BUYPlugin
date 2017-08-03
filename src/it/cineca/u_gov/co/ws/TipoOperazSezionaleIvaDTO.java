
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoOperazSezionaleIvaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoOperazSezionaleIvaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAbSogg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="iva" type="{http://ws.co.u-gov.cineca.it/}ivaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="percIva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="sezionaleIva" type="{http://ws.co.u-gov.cineca.it/}sezionaleIvaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tiCampoAttivita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoOperazioneIva" type="{http://ws.co.u-gov.cineca.it/}tipoOperazioneIvaLightDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoOperazSezionaleIvaDTO", propOrder = {
    "cdUE",
    "idAbSogg",
    "iva",
    "percIva",
    "sezionaleIva",
    "tiCampoAttivita",
    "tipoOperazioneIva"
})
public class TipoOperazSezionaleIvaDTO {

    protected String cdUE;
    protected Long idAbSogg;
    @XmlElement(nillable = true)
    protected List<IvaDTO> iva;
    protected BigDecimal percIva;
    @XmlElement(nillable = true)
    protected List<SezionaleIvaDTO> sezionaleIva;
    protected String tiCampoAttivita;
    @XmlElement(nillable = true)
    protected List<TipoOperazioneIvaLightDTO> tipoOperazioneIva;

    /**
     * Gets the value of the cdUE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUE() {
        return cdUE;
    }

    /**
     * Sets the value of the cdUE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUE(String value) {
        this.cdUE = value;
    }

    /**
     * Gets the value of the idAbSogg property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAbSogg() {
        return idAbSogg;
    }

    /**
     * Sets the value of the idAbSogg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAbSogg(Long value) {
        this.idAbSogg = value;
    }

    /**
     * Gets the value of the iva property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iva property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIva().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IvaDTO }
     * 
     * 
     */
    public List<IvaDTO> getIva() {
        if (iva == null) {
            iva = new ArrayList<IvaDTO>();
        }
        return this.iva;
    }

    /**
     * Gets the value of the percIva property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercIva() {
        return percIva;
    }

    /**
     * Sets the value of the percIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercIva(BigDecimal value) {
        this.percIva = value;
    }

    /**
     * Gets the value of the sezionaleIva property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sezionaleIva property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSezionaleIva().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SezionaleIvaDTO }
     * 
     * 
     */
    public List<SezionaleIvaDTO> getSezionaleIva() {
        if (sezionaleIva == null) {
            sezionaleIva = new ArrayList<SezionaleIvaDTO>();
        }
        return this.sezionaleIva;
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

    /**
     * Gets the value of the tipoOperazioneIva property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoOperazioneIva property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoOperazioneIva().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoOperazioneIvaLightDTO }
     * 
     * 
     */
    public List<TipoOperazioneIvaLightDTO> getTipoOperazioneIva() {
        if (tipoOperazioneIva == null) {
            tipoOperazioneIva = new ArrayList<TipoOperazioneIvaLightDTO>();
        }
        return this.tipoOperazioneIva;
    }

}

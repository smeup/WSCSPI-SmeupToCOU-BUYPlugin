
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ammOrdinativoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ammOrdinativoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dtMaxEmissione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtMaxTrasmissione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idDg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="importoNettoSommeLiquidate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="importoSommeLiquidate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ammOrdinativoDTO", propOrder = {
    "dtMaxEmissione",
    "dtMaxTrasmissione",
    "esercizio",
    "idDg",
    "importoNettoSommeLiquidate",
    "importoSommeLiquidate"
})
public class AmmOrdinativoDTO {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtMaxEmissione;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtMaxTrasmissione;
    protected Integer esercizio;
    protected Long idDg;
    protected BigDecimal importoNettoSommeLiquidate;
    protected BigDecimal importoSommeLiquidate;

    /**
     * Gets the value of the dtMaxEmissione property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtMaxEmissione() {
        return dtMaxEmissione;
    }

    /**
     * Sets the value of the dtMaxEmissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtMaxEmissione(XMLGregorianCalendar value) {
        this.dtMaxEmissione = value;
    }

    /**
     * Gets the value of the dtMaxTrasmissione property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtMaxTrasmissione() {
        return dtMaxTrasmissione;
    }

    /**
     * Sets the value of the dtMaxTrasmissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtMaxTrasmissione(XMLGregorianCalendar value) {
        this.dtMaxTrasmissione = value;
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
     * Gets the value of the idDg property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDg() {
        return idDg;
    }

    /**
     * Sets the value of the idDg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDg(Long value) {
        this.idDg = value;
    }

    /**
     * Gets the value of the importoNettoSommeLiquidate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoNettoSommeLiquidate() {
        return importoNettoSommeLiquidate;
    }

    /**
     * Sets the value of the importoNettoSommeLiquidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoNettoSommeLiquidate(BigDecimal value) {
        this.importoNettoSommeLiquidate = value;
    }

    /**
     * Gets the value of the importoSommeLiquidate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoSommeLiquidate() {
        return importoSommeLiquidate;
    }

    /**
     * Sets the value of the importoSommeLiquidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoSommeLiquidate(BigDecimal value) {
        this.importoSommeLiquidate = value;
    }

}

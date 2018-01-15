
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per ammOrdinativoDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietà dtMaxEmissione.
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
     * Imposta il valore della proprietà dtMaxEmissione.
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
     * Recupera il valore della proprietà dtMaxTrasmissione.
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
     * Imposta il valore della proprietà dtMaxTrasmissione.
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
     * Recupera il valore della proprietà esercizio.
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
     * Imposta il valore della proprietà esercizio.
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
     * Recupera il valore della proprietà idDg.
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
     * Imposta il valore della proprietà idDg.
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
     * Recupera il valore della proprietà importoNettoSommeLiquidate.
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
     * Imposta il valore della proprietà importoNettoSommeLiquidate.
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
     * Recupera il valore della proprietà importoSommeLiquidate.
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
     * Imposta il valore della proprietà importoSommeLiquidate.
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

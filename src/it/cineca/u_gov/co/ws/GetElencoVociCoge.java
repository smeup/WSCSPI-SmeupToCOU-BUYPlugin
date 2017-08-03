
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getElencoVociCoge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getElencoVociCoge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cdUe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoAttivoPassivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCampoAttivita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceBeneServizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceTariffario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getElencoVociCoge", propOrder = {
    "esercizio",
    "cdUe",
    "tipoAttivoPassivo",
    "tipoCampoAttivita",
    "codiceBeneServizio",
    "codiceTariffario"
})
public class GetElencoVociCoge {

    protected Integer esercizio;
    protected String cdUe;
    protected String tipoAttivoPassivo;
    protected String tipoCampoAttivita;
    protected String codiceBeneServizio;
    protected String codiceTariffario;

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
     * Gets the value of the cdUe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUe() {
        return cdUe;
    }

    /**
     * Sets the value of the cdUe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUe(String value) {
        this.cdUe = value;
    }

    /**
     * Gets the value of the tipoAttivoPassivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAttivoPassivo() {
        return tipoAttivoPassivo;
    }

    /**
     * Sets the value of the tipoAttivoPassivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAttivoPassivo(String value) {
        this.tipoAttivoPassivo = value;
    }

    /**
     * Gets the value of the tipoCampoAttivita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCampoAttivita() {
        return tipoCampoAttivita;
    }

    /**
     * Sets the value of the tipoCampoAttivita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCampoAttivita(String value) {
        this.tipoCampoAttivita = value;
    }

    /**
     * Gets the value of the codiceBeneServizio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceBeneServizio() {
        return codiceBeneServizio;
    }

    /**
     * Sets the value of the codiceBeneServizio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceBeneServizio(String value) {
        this.codiceBeneServizio = value;
    }

    /**
     * Gets the value of the codiceTariffario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceTariffario() {
        return codiceTariffario;
    }

    /**
     * Sets the value of the codiceTariffario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceTariffario(String value) {
        this.codiceTariffario = value;
    }

}

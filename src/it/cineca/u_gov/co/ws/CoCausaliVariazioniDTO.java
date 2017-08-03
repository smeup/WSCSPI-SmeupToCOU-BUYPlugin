
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coCausaliVariazioniDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coCausaliVariazioniDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdCauVar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsCauVar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flRisultato" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flSys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flUsaUtente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tiCausale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiSubCausale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coCausaliVariazioniDTO", propOrder = {
    "cdCauVar",
    "dsCauVar",
    "flRisultato",
    "flSys",
    "flUsaUtente",
    "tiCausale",
    "tiSubCausale"
})
public class CoCausaliVariazioniDTO {

    protected String cdCauVar;
    protected String dsCauVar;
    protected Boolean flRisultato;
    protected Boolean flSys;
    protected Boolean flUsaUtente;
    protected String tiCausale;
    protected String tiSubCausale;

    /**
     * Gets the value of the cdCauVar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCauVar() {
        return cdCauVar;
    }

    /**
     * Sets the value of the cdCauVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCauVar(String value) {
        this.cdCauVar = value;
    }

    /**
     * Gets the value of the dsCauVar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsCauVar() {
        return dsCauVar;
    }

    /**
     * Sets the value of the dsCauVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsCauVar(String value) {
        this.dsCauVar = value;
    }

    /**
     * Gets the value of the flRisultato property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlRisultato() {
        return flRisultato;
    }

    /**
     * Sets the value of the flRisultato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlRisultato(Boolean value) {
        this.flRisultato = value;
    }

    /**
     * Gets the value of the flSys property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlSys() {
        return flSys;
    }

    /**
     * Sets the value of the flSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlSys(Boolean value) {
        this.flSys = value;
    }

    /**
     * Gets the value of the flUsaUtente property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlUsaUtente() {
        return flUsaUtente;
    }

    /**
     * Sets the value of the flUsaUtente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlUsaUtente(Boolean value) {
        this.flUsaUtente = value;
    }

    /**
     * Gets the value of the tiCausale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiCausale() {
        return tiCausale;
    }

    /**
     * Sets the value of the tiCausale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiCausale(String value) {
        this.tiCausale = value;
    }

    /**
     * Gets the value of the tiSubCausale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiSubCausale() {
        return tiSubCausale;
    }

    /**
     * Sets the value of the tiSubCausale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiSubCausale(String value) {
        this.tiSubCausale = value;
    }

}

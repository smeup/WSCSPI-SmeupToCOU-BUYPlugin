
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per coCausaliVariazioniDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietà cdCauVar.
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
     * Imposta il valore della proprietà cdCauVar.
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
     * Recupera il valore della proprietà dsCauVar.
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
     * Imposta il valore della proprietà dsCauVar.
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
     * Recupera il valore della proprietà flRisultato.
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
     * Imposta il valore della proprietà flRisultato.
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
     * Recupera il valore della proprietà flSys.
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
     * Imposta il valore della proprietà flSys.
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
     * Recupera il valore della proprietà flUsaUtente.
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
     * Imposta il valore della proprietà flUsaUtente.
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
     * Recupera il valore della proprietà tiCausale.
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
     * Imposta il valore della proprietà tiCausale.
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
     * Recupera il valore della proprietà tiSubCausale.
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
     * Imposta il valore della proprietà tiSubCausale.
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

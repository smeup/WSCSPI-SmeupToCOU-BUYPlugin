
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per progettiDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="progettiDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsTipoProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flVincolaWp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idProgetto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idTipoProgetto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nomeProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "progettiDTO", propOrder = {
    "cdProgetto",
    "cup",
    "dsTipoProgetto",
    "flVincolaWp",
    "idProgetto",
    "idTipoProgetto",
    "nomeProgetto"
})
public class ProgettiDTO {

    protected String cdProgetto;
    protected String cup;
    protected String dsTipoProgetto;
    protected Boolean flVincolaWp;
    protected Long idProgetto;
    protected Long idTipoProgetto;
    protected String nomeProgetto;

    /**
     * Recupera il valore della proprietà cdProgetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdProgetto() {
        return cdProgetto;
    }

    /**
     * Imposta il valore della proprietà cdProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdProgetto(String value) {
        this.cdProgetto = value;
    }

    /**
     * Recupera il valore della proprietà cup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCup() {
        return cup;
    }

    /**
     * Imposta il valore della proprietà cup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCup(String value) {
        this.cup = value;
    }

    /**
     * Recupera il valore della proprietà dsTipoProgetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsTipoProgetto() {
        return dsTipoProgetto;
    }

    /**
     * Imposta il valore della proprietà dsTipoProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsTipoProgetto(String value) {
        this.dsTipoProgetto = value;
    }

    /**
     * Recupera il valore della proprietà flVincolaWp.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlVincolaWp() {
        return flVincolaWp;
    }

    /**
     * Imposta il valore della proprietà flVincolaWp.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlVincolaWp(Boolean value) {
        this.flVincolaWp = value;
    }

    /**
     * Recupera il valore della proprietà idProgetto.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdProgetto() {
        return idProgetto;
    }

    /**
     * Imposta il valore della proprietà idProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdProgetto(Long value) {
        this.idProgetto = value;
    }

    /**
     * Recupera il valore della proprietà idTipoProgetto.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTipoProgetto() {
        return idTipoProgetto;
    }

    /**
     * Imposta il valore della proprietà idTipoProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTipoProgetto(Long value) {
        this.idTipoProgetto = value;
    }

    /**
     * Recupera il valore della proprietà nomeProgetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeProgetto() {
        return nomeProgetto;
    }

    /**
     * Imposta il valore della proprietà nomeProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeProgetto(String value) {
        this.nomeProgetto = value;
    }

}


package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per dimAnaDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="dimAnaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdDimAna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denomDimAna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="flRiportoVinc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idDimAna" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="livello" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoDimAna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dimAnaDTO", propOrder = {
    "cdDimAna",
    "denomDimAna",
    "esercizio",
    "flRiportoVinc",
    "idDimAna",
    "livello",
    "tipoDimAna"
})
public class DimAnaDTO {

    protected String cdDimAna;
    protected String denomDimAna;
    protected Integer esercizio;
    protected Boolean flRiportoVinc;
    protected Long idDimAna;
    protected Integer livello;
    protected String tipoDimAna;

    /**
     * Recupera il valore della proprietà cdDimAna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdDimAna() {
        return cdDimAna;
    }

    /**
     * Imposta il valore della proprietà cdDimAna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdDimAna(String value) {
        this.cdDimAna = value;
    }

    /**
     * Recupera il valore della proprietà denomDimAna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenomDimAna() {
        return denomDimAna;
    }

    /**
     * Imposta il valore della proprietà denomDimAna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenomDimAna(String value) {
        this.denomDimAna = value;
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
     * Recupera il valore della proprietà flRiportoVinc.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlRiportoVinc() {
        return flRiportoVinc;
    }

    /**
     * Imposta il valore della proprietà flRiportoVinc.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlRiportoVinc(Boolean value) {
        this.flRiportoVinc = value;
    }

    /**
     * Recupera il valore della proprietà idDimAna.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDimAna() {
        return idDimAna;
    }

    /**
     * Imposta il valore della proprietà idDimAna.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDimAna(Long value) {
        this.idDimAna = value;
    }

    /**
     * Recupera il valore della proprietà livello.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLivello() {
        return livello;
    }

    /**
     * Imposta il valore della proprietà livello.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLivello(Integer value) {
        this.livello = value;
    }

    /**
     * Recupera il valore della proprietà tipoDimAna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDimAna() {
        return tipoDimAna;
    }

    /**
     * Imposta il valore della proprietà tipoDimAna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDimAna(String value) {
        this.tipoDimAna = value;
    }

}

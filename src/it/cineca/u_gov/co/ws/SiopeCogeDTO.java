
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per siopeCogeDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="siopeCogeDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdSiope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdVoceCoge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsSiope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idVoceRiclCoge" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tiVoce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "siopeCogeDTO", propOrder = {
    "cdSiope",
    "cdVoceCoge",
    "dsSiope",
    "esercizio",
    "idVoceRiclCoge",
    "tiVoce"
})
public class SiopeCogeDTO {

    protected String cdSiope;
    protected String cdVoceCoge;
    protected String dsSiope;
    protected Integer esercizio;
    protected Long idVoceRiclCoge;
    protected String tiVoce;

    /**
     * Recupera il valore della proprietà cdSiope.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdSiope() {
        return cdSiope;
    }

    /**
     * Imposta il valore della proprietà cdSiope.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdSiope(String value) {
        this.cdSiope = value;
    }

    /**
     * Recupera il valore della proprietà cdVoceCoge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdVoceCoge() {
        return cdVoceCoge;
    }

    /**
     * Imposta il valore della proprietà cdVoceCoge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdVoceCoge(String value) {
        this.cdVoceCoge = value;
    }

    /**
     * Recupera il valore della proprietà dsSiope.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsSiope() {
        return dsSiope;
    }

    /**
     * Imposta il valore della proprietà dsSiope.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsSiope(String value) {
        this.dsSiope = value;
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
     * Recupera il valore della proprietà idVoceRiclCoge.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdVoceRiclCoge() {
        return idVoceRiclCoge;
    }

    /**
     * Imposta il valore della proprietà idVoceRiclCoge.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdVoceRiclCoge(Long value) {
        this.idVoceRiclCoge = value;
    }

    /**
     * Recupera il valore della proprietà tiVoce.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiVoce() {
        return tiVoce;
    }

    /**
     * Imposta il valore della proprietà tiVoce.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiVoce(String value) {
        this.tiVoce = value;
    }

}

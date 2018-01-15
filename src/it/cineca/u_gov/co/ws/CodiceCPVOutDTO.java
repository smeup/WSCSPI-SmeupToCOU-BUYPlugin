
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per codiceCPVOutDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="codiceCPVOutDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdCPV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdCPVPadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdCPVProprio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codificaCPV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsCPV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flUltimoLivello" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="livello" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "codiceCPVOutDTO", propOrder = {
    "cdCPV",
    "cdCPVPadre",
    "cdCPVProprio",
    "codificaCPV",
    "dsCPV",
    "flUltimoLivello",
    "livello"
})
public class CodiceCPVOutDTO {

    protected String cdCPV;
    protected String cdCPVPadre;
    protected String cdCPVProprio;
    protected String codificaCPV;
    protected String dsCPV;
    protected Boolean flUltimoLivello;
    protected Integer livello;

    /**
     * Recupera il valore della proprietà cdCPV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCPV() {
        return cdCPV;
    }

    /**
     * Imposta il valore della proprietà cdCPV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCPV(String value) {
        this.cdCPV = value;
    }

    /**
     * Recupera il valore della proprietà cdCPVPadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCPVPadre() {
        return cdCPVPadre;
    }

    /**
     * Imposta il valore della proprietà cdCPVPadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCPVPadre(String value) {
        this.cdCPVPadre = value;
    }

    /**
     * Recupera il valore della proprietà cdCPVProprio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCPVProprio() {
        return cdCPVProprio;
    }

    /**
     * Imposta il valore della proprietà cdCPVProprio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCPVProprio(String value) {
        this.cdCPVProprio = value;
    }

    /**
     * Recupera il valore della proprietà codificaCPV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodificaCPV() {
        return codificaCPV;
    }

    /**
     * Imposta il valore della proprietà codificaCPV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodificaCPV(String value) {
        this.codificaCPV = value;
    }

    /**
     * Recupera il valore della proprietà dsCPV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsCPV() {
        return dsCPV;
    }

    /**
     * Imposta il valore della proprietà dsCPV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsCPV(String value) {
        this.dsCPV = value;
    }

    /**
     * Recupera il valore della proprietà flUltimoLivello.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlUltimoLivello() {
        return flUltimoLivello;
    }

    /**
     * Imposta il valore della proprietà flUltimoLivello.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlUltimoLivello(Boolean value) {
        this.flUltimoLivello = value;
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

}

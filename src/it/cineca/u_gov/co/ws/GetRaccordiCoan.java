
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getRaccordiCoan complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getRaccordiCoan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eseOri" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cdVoceCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdDimAna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eseDest" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRaccordiCoan", propOrder = {
    "eseOri",
    "cdVoceCoan",
    "cdUa",
    "cdDimAna",
    "eseDest"
})
public class GetRaccordiCoan {

    protected Integer eseOri;
    protected String cdVoceCoan;
    protected String cdUa;
    protected String cdDimAna;
    protected Integer eseDest;

    /**
     * Recupera il valore della proprietà eseOri.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEseOri() {
        return eseOri;
    }

    /**
     * Imposta il valore della proprietà eseOri.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEseOri(Integer value) {
        this.eseOri = value;
    }

    /**
     * Recupera il valore della proprietà cdVoceCoan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdVoceCoan() {
        return cdVoceCoan;
    }

    /**
     * Imposta il valore della proprietà cdVoceCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdVoceCoan(String value) {
        this.cdVoceCoan = value;
    }

    /**
     * Recupera il valore della proprietà cdUa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUa() {
        return cdUa;
    }

    /**
     * Imposta il valore della proprietà cdUa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUa(String value) {
        this.cdUa = value;
    }

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
     * Recupera il valore della proprietà eseDest.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEseDest() {
        return eseDest;
    }

    /**
     * Imposta il valore della proprietà eseDest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEseDest(Integer value) {
        this.eseDest = value;
    }

}

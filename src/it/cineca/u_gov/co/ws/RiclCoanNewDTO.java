
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per riclCoanNewDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="riclCoanNewDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdVoceRiclCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denomVoceRiclCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="flConfermato" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idVoceRiclCoan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="segno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiRiclassificato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "riclCoanNewDTO", propOrder = {
    "cdVoceRiclCoan",
    "denomVoceRiclCoan",
    "esercizio",
    "flConfermato",
    "flDefault",
    "idVoceRiclCoan",
    "segno",
    "tiRiclassificato",
    "tiVoce"
})
public class RiclCoanNewDTO {

    protected String cdVoceRiclCoan;
    protected String denomVoceRiclCoan;
    protected Integer esercizio;
    protected Boolean flConfermato;
    protected Boolean flDefault;
    protected Long idVoceRiclCoan;
    protected String segno;
    protected String tiRiclassificato;
    protected String tiVoce;

    /**
     * Recupera il valore della proprietÓ cdVoceRiclCoan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdVoceRiclCoan() {
        return cdVoceRiclCoan;
    }

    /**
     * Imposta il valore della proprietÓ cdVoceRiclCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdVoceRiclCoan(String value) {
        this.cdVoceRiclCoan = value;
    }

    /**
     * Recupera il valore della proprietÓ denomVoceRiclCoan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenomVoceRiclCoan() {
        return denomVoceRiclCoan;
    }

    /**
     * Imposta il valore della proprietÓ denomVoceRiclCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenomVoceRiclCoan(String value) {
        this.denomVoceRiclCoan = value;
    }

    /**
     * Recupera il valore della proprietÓ esercizio.
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
     * Imposta il valore della proprietÓ esercizio.
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
     * Recupera il valore della proprietÓ flConfermato.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlConfermato() {
        return flConfermato;
    }

    /**
     * Imposta il valore della proprietÓ flConfermato.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlConfermato(Boolean value) {
        this.flConfermato = value;
    }

    /**
     * Recupera il valore della proprietÓ flDefault.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlDefault() {
        return flDefault;
    }

    /**
     * Imposta il valore della proprietÓ flDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlDefault(Boolean value) {
        this.flDefault = value;
    }

    /**
     * Recupera il valore della proprietÓ idVoceRiclCoan.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdVoceRiclCoan() {
        return idVoceRiclCoan;
    }

    /**
     * Imposta il valore della proprietÓ idVoceRiclCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdVoceRiclCoan(Long value) {
        this.idVoceRiclCoan = value;
    }

    /**
     * Recupera il valore della proprietÓ segno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegno() {
        return segno;
    }

    /**
     * Imposta il valore della proprietÓ segno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegno(String value) {
        this.segno = value;
    }

    /**
     * Recupera il valore della proprietÓ tiRiclassificato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiRiclassificato() {
        return tiRiclassificato;
    }

    /**
     * Imposta il valore della proprietÓ tiRiclassificato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiRiclassificato(String value) {
        this.tiRiclassificato = value;
    }

    /**
     * Recupera il valore della proprietÓ tiVoce.
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
     * Imposta il valore della proprietÓ tiVoce.
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

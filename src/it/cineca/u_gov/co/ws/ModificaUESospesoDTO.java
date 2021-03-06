
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per modificaUESospesoDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="modificaUESospesoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anno" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cdRifIstCass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ibanEnte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idRitornoCassiere" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="msgErrore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nuovaUe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoMovIstCass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ueIniziale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificaUESospesoDTO", propOrder = {
    "anno",
    "cdRifIstCass",
    "ibanEnte",
    "idRitornoCassiere",
    "msgErrore",
    "nuovaUe",
    "tipoMovIstCass",
    "ueIniziale"
})
public class ModificaUESospesoDTO {

    protected Integer anno;
    protected String cdRifIstCass;
    protected String ibanEnte;
    protected Long idRitornoCassiere;
    protected String msgErrore;
    protected String nuovaUe;
    protected String tipoMovIstCass;
    protected String ueIniziale;

    /**
     * Recupera il valore della proprietÓ anno.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnno() {
        return anno;
    }

    /**
     * Imposta il valore della proprietÓ anno.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnno(Integer value) {
        this.anno = value;
    }

    /**
     * Recupera il valore della proprietÓ cdRifIstCass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdRifIstCass() {
        return cdRifIstCass;
    }

    /**
     * Imposta il valore della proprietÓ cdRifIstCass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdRifIstCass(String value) {
        this.cdRifIstCass = value;
    }

    /**
     * Recupera il valore della proprietÓ ibanEnte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbanEnte() {
        return ibanEnte;
    }

    /**
     * Imposta il valore della proprietÓ ibanEnte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbanEnte(String value) {
        this.ibanEnte = value;
    }

    /**
     * Recupera il valore della proprietÓ idRitornoCassiere.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdRitornoCassiere() {
        return idRitornoCassiere;
    }

    /**
     * Imposta il valore della proprietÓ idRitornoCassiere.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdRitornoCassiere(Long value) {
        this.idRitornoCassiere = value;
    }

    /**
     * Recupera il valore della proprietÓ msgErrore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgErrore() {
        return msgErrore;
    }

    /**
     * Imposta il valore della proprietÓ msgErrore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgErrore(String value) {
        this.msgErrore = value;
    }

    /**
     * Recupera il valore della proprietÓ nuovaUe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuovaUe() {
        return nuovaUe;
    }

    /**
     * Imposta il valore della proprietÓ nuovaUe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuovaUe(String value) {
        this.nuovaUe = value;
    }

    /**
     * Recupera il valore della proprietÓ tipoMovIstCass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMovIstCass() {
        return tipoMovIstCass;
    }

    /**
     * Imposta il valore della proprietÓ tipoMovIstCass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMovIstCass(String value) {
        this.tipoMovIstCass = value;
    }

    /**
     * Recupera il valore della proprietÓ ueIniziale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUeIniziale() {
        return ueIniziale;
    }

    /**
     * Imposta il valore della proprietÓ ueIniziale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUeIniziale(String value) {
        this.ueIniziale = value;
    }

}


package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per modificaUESospeso complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="modificaUESospeso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idRitornoCassiere" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codiceUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ibanEnte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoMovIstCass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdRifIstCass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anno" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificaUESospeso", propOrder = {
    "idRitornoCassiere",
    "codiceUE",
    "ibanEnte",
    "tipoMovIstCass",
    "cdRifIstCass",
    "anno"
})
public class ModificaUESospeso {

    protected Long idRitornoCassiere;
    protected String codiceUE;
    protected String ibanEnte;
    protected String tipoMovIstCass;
    protected String cdRifIstCass;
    protected Integer anno;

    /**
     * Recupera il valore della proprietà idRitornoCassiere.
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
     * Imposta il valore della proprietà idRitornoCassiere.
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
     * Recupera il valore della proprietà codiceUE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceUE() {
        return codiceUE;
    }

    /**
     * Imposta il valore della proprietà codiceUE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceUE(String value) {
        this.codiceUE = value;
    }

    /**
     * Recupera il valore della proprietà ibanEnte.
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
     * Imposta il valore della proprietà ibanEnte.
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
     * Recupera il valore della proprietà tipoMovIstCass.
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
     * Imposta il valore della proprietà tipoMovIstCass.
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
     * Recupera il valore della proprietà cdRifIstCass.
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
     * Imposta il valore della proprietà cdRifIstCass.
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
     * Recupera il valore della proprietà anno.
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
     * Imposta il valore della proprietà anno.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnno(Integer value) {
        this.anno = value;
    }

}


package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per proRataIvaDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="proRataIvaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdAteco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdAttivitaIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdRegimeFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsAttivitaIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="flEditoria" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flPrincipale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="percentualeProRata" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tiCampoAttivita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proRataIvaDTO", propOrder = {
    "cdAteco",
    "cdAttivitaIva",
    "cdRegimeFiscale",
    "dsAttivitaIva",
    "esercizio",
    "flEditoria",
    "flPrincipale",
    "percentualeProRata",
    "tiCampoAttivita"
})
public class ProRataIvaDTO {

    protected String cdAteco;
    protected String cdAttivitaIva;
    protected String cdRegimeFiscale;
    protected String dsAttivitaIva;
    protected Integer esercizio;
    protected Boolean flEditoria;
    protected Boolean flPrincipale;
    protected BigDecimal percentualeProRata;
    protected String tiCampoAttivita;

    /**
     * Recupera il valore della proprietà cdAteco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdAteco() {
        return cdAteco;
    }

    /**
     * Imposta il valore della proprietà cdAteco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdAteco(String value) {
        this.cdAteco = value;
    }

    /**
     * Recupera il valore della proprietà cdAttivitaIva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdAttivitaIva() {
        return cdAttivitaIva;
    }

    /**
     * Imposta il valore della proprietà cdAttivitaIva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdAttivitaIva(String value) {
        this.cdAttivitaIva = value;
    }

    /**
     * Recupera il valore della proprietà cdRegimeFiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdRegimeFiscale() {
        return cdRegimeFiscale;
    }

    /**
     * Imposta il valore della proprietà cdRegimeFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdRegimeFiscale(String value) {
        this.cdRegimeFiscale = value;
    }

    /**
     * Recupera il valore della proprietà dsAttivitaIva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsAttivitaIva() {
        return dsAttivitaIva;
    }

    /**
     * Imposta il valore della proprietà dsAttivitaIva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsAttivitaIva(String value) {
        this.dsAttivitaIva = value;
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
     * Recupera il valore della proprietà flEditoria.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlEditoria() {
        return flEditoria;
    }

    /**
     * Imposta il valore della proprietà flEditoria.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlEditoria(Boolean value) {
        this.flEditoria = value;
    }

    /**
     * Recupera il valore della proprietà flPrincipale.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlPrincipale() {
        return flPrincipale;
    }

    /**
     * Imposta il valore della proprietà flPrincipale.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlPrincipale(Boolean value) {
        this.flPrincipale = value;
    }

    /**
     * Recupera il valore della proprietà percentualeProRata.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentualeProRata() {
        return percentualeProRata;
    }

    /**
     * Imposta il valore della proprietà percentualeProRata.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentualeProRata(BigDecimal value) {
        this.percentualeProRata = value;
    }

    /**
     * Recupera il valore della proprietà tiCampoAttivita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiCampoAttivita() {
        return tiCampoAttivita;
    }

    /**
     * Imposta il valore della proprietà tiCampoAttivita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiCampoAttivita(String value) {
        this.tiCampoAttivita = value;
    }

}


package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per sezionaleIvaDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="sezionaleIvaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdAttivitaIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdSezionale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsSezionale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="flAutofatture" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flCorrispettivi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flExtraUe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flFtEl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flIntraUe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flOrdinario" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flSanMarino" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tiAttivoPassivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiBeneServizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "sezionaleIvaDTO", propOrder = {
    "cdAttivitaIva",
    "cdSezionale",
    "dsSezionale",
    "esercizio",
    "flAutofatture",
    "flCorrispettivi",
    "flExtraUe",
    "flFtEl",
    "flIntraUe",
    "flOrdinario",
    "flSanMarino",
    "tiAttivoPassivo",
    "tiBeneServizio",
    "tiCampoAttivita"
})
public class SezionaleIvaDTO {

    protected String cdAttivitaIva;
    protected String cdSezionale;
    protected String dsSezionale;
    protected Integer esercizio;
    protected Boolean flAutofatture;
    protected Boolean flCorrispettivi;
    protected Boolean flExtraUe;
    protected Boolean flFtEl;
    protected Boolean flIntraUe;
    protected Boolean flOrdinario;
    protected Boolean flSanMarino;
    protected String tiAttivoPassivo;
    protected String tiBeneServizio;
    protected String tiCampoAttivita;

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
     * Recupera il valore della proprietà cdSezionale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdSezionale() {
        return cdSezionale;
    }

    /**
     * Imposta il valore della proprietà cdSezionale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdSezionale(String value) {
        this.cdSezionale = value;
    }

    /**
     * Recupera il valore della proprietà dsSezionale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsSezionale() {
        return dsSezionale;
    }

    /**
     * Imposta il valore della proprietà dsSezionale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsSezionale(String value) {
        this.dsSezionale = value;
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
     * Recupera il valore della proprietà flAutofatture.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlAutofatture() {
        return flAutofatture;
    }

    /**
     * Imposta il valore della proprietà flAutofatture.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlAutofatture(Boolean value) {
        this.flAutofatture = value;
    }

    /**
     * Recupera il valore della proprietà flCorrispettivi.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlCorrispettivi() {
        return flCorrispettivi;
    }

    /**
     * Imposta il valore della proprietà flCorrispettivi.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlCorrispettivi(Boolean value) {
        this.flCorrispettivi = value;
    }

    /**
     * Recupera il valore della proprietà flExtraUe.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlExtraUe() {
        return flExtraUe;
    }

    /**
     * Imposta il valore della proprietà flExtraUe.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlExtraUe(Boolean value) {
        this.flExtraUe = value;
    }

    /**
     * Recupera il valore della proprietà flFtEl.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlFtEl() {
        return flFtEl;
    }

    /**
     * Imposta il valore della proprietà flFtEl.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlFtEl(Boolean value) {
        this.flFtEl = value;
    }

    /**
     * Recupera il valore della proprietà flIntraUe.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlIntraUe() {
        return flIntraUe;
    }

    /**
     * Imposta il valore della proprietà flIntraUe.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlIntraUe(Boolean value) {
        this.flIntraUe = value;
    }

    /**
     * Recupera il valore della proprietà flOrdinario.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlOrdinario() {
        return flOrdinario;
    }

    /**
     * Imposta il valore della proprietà flOrdinario.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlOrdinario(Boolean value) {
        this.flOrdinario = value;
    }

    /**
     * Recupera il valore della proprietà flSanMarino.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlSanMarino() {
        return flSanMarino;
    }

    /**
     * Imposta il valore della proprietà flSanMarino.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlSanMarino(Boolean value) {
        this.flSanMarino = value;
    }

    /**
     * Recupera il valore della proprietà tiAttivoPassivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiAttivoPassivo() {
        return tiAttivoPassivo;
    }

    /**
     * Imposta il valore della proprietà tiAttivoPassivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiAttivoPassivo(String value) {
        this.tiAttivoPassivo = value;
    }

    /**
     * Recupera il valore della proprietà tiBeneServizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiBeneServizio() {
        return tiBeneServizio;
    }

    /**
     * Imposta il valore della proprietà tiBeneServizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiBeneServizio(String value) {
        this.tiBeneServizio = value;
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

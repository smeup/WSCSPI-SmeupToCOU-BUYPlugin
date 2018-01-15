
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per elencoUaDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="elencoUaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdUa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceUo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denominazioneUa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="flAutBudget" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flEsternoEnte" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flProfitto" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flRiportoVinc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flagRiferimento" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tiAusiliarioGenerale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiIntermedioFinale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiProduttivoStruttura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiRealeFittizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiRespCosto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiStrategicoOperativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elencoUaDTO", propOrder = {
    "cdUa",
    "codiceUo",
    "denominazioneUa",
    "esercizio",
    "flAutBudget",
    "flEsternoEnte",
    "flProfitto",
    "flRiportoVinc",
    "flagRiferimento",
    "tiAusiliarioGenerale",
    "tiIntermedioFinale",
    "tiProduttivoStruttura",
    "tiRealeFittizio",
    "tiRespCosto",
    "tiStrategicoOperativo"
})
public class ElencoUaDTO {

    protected String cdUa;
    protected String codiceUo;
    protected String denominazioneUa;
    protected Integer esercizio;
    protected Boolean flAutBudget;
    protected Boolean flEsternoEnte;
    protected Boolean flProfitto;
    protected Boolean flRiportoVinc;
    protected Boolean flagRiferimento;
    protected String tiAusiliarioGenerale;
    protected String tiIntermedioFinale;
    protected String tiProduttivoStruttura;
    protected String tiRealeFittizio;
    protected String tiRespCosto;
    protected String tiStrategicoOperativo;

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
     * Recupera il valore della proprietà codiceUo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceUo() {
        return codiceUo;
    }

    /**
     * Imposta il valore della proprietà codiceUo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceUo(String value) {
        this.codiceUo = value;
    }

    /**
     * Recupera il valore della proprietà denominazioneUa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominazioneUa() {
        return denominazioneUa;
    }

    /**
     * Imposta il valore della proprietà denominazioneUa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominazioneUa(String value) {
        this.denominazioneUa = value;
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
     * Recupera il valore della proprietà flAutBudget.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlAutBudget() {
        return flAutBudget;
    }

    /**
     * Imposta il valore della proprietà flAutBudget.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlAutBudget(Boolean value) {
        this.flAutBudget = value;
    }

    /**
     * Recupera il valore della proprietà flEsternoEnte.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlEsternoEnte() {
        return flEsternoEnte;
    }

    /**
     * Imposta il valore della proprietà flEsternoEnte.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlEsternoEnte(Boolean value) {
        this.flEsternoEnte = value;
    }

    /**
     * Recupera il valore della proprietà flProfitto.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlProfitto() {
        return flProfitto;
    }

    /**
     * Imposta il valore della proprietà flProfitto.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlProfitto(Boolean value) {
        this.flProfitto = value;
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
     * Recupera il valore della proprietà flagRiferimento.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlagRiferimento() {
        return flagRiferimento;
    }

    /**
     * Imposta il valore della proprietà flagRiferimento.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlagRiferimento(Boolean value) {
        this.flagRiferimento = value;
    }

    /**
     * Recupera il valore della proprietà tiAusiliarioGenerale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiAusiliarioGenerale() {
        return tiAusiliarioGenerale;
    }

    /**
     * Imposta il valore della proprietà tiAusiliarioGenerale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiAusiliarioGenerale(String value) {
        this.tiAusiliarioGenerale = value;
    }

    /**
     * Recupera il valore della proprietà tiIntermedioFinale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiIntermedioFinale() {
        return tiIntermedioFinale;
    }

    /**
     * Imposta il valore della proprietà tiIntermedioFinale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiIntermedioFinale(String value) {
        this.tiIntermedioFinale = value;
    }

    /**
     * Recupera il valore della proprietà tiProduttivoStruttura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiProduttivoStruttura() {
        return tiProduttivoStruttura;
    }

    /**
     * Imposta il valore della proprietà tiProduttivoStruttura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiProduttivoStruttura(String value) {
        this.tiProduttivoStruttura = value;
    }

    /**
     * Recupera il valore della proprietà tiRealeFittizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiRealeFittizio() {
        return tiRealeFittizio;
    }

    /**
     * Imposta il valore della proprietà tiRealeFittizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiRealeFittizio(String value) {
        this.tiRealeFittizio = value;
    }

    /**
     * Recupera il valore della proprietà tiRespCosto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiRespCosto() {
        return tiRespCosto;
    }

    /**
     * Imposta il valore della proprietà tiRespCosto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiRespCosto(String value) {
        this.tiRespCosto = value;
    }

    /**
     * Recupera il valore della proprietà tiStrategicoOperativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiStrategicoOperativo() {
        return tiStrategicoOperativo;
    }

    /**
     * Imposta il valore della proprietà tiStrategicoOperativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiStrategicoOperativo(String value) {
        this.tiStrategicoOperativo = value;
    }

}

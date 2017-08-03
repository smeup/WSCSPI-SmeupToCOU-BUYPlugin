
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for elencoUaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the cdUa property.
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
     * Sets the value of the cdUa property.
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
     * Gets the value of the codiceUo property.
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
     * Sets the value of the codiceUo property.
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
     * Gets the value of the denominazioneUa property.
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
     * Sets the value of the denominazioneUa property.
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
     * Gets the value of the esercizio property.
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
     * Sets the value of the esercizio property.
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
     * Gets the value of the flAutBudget property.
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
     * Sets the value of the flAutBudget property.
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
     * Gets the value of the flEsternoEnte property.
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
     * Sets the value of the flEsternoEnte property.
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
     * Gets the value of the flProfitto property.
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
     * Sets the value of the flProfitto property.
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
     * Gets the value of the flRiportoVinc property.
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
     * Sets the value of the flRiportoVinc property.
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
     * Gets the value of the flagRiferimento property.
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
     * Sets the value of the flagRiferimento property.
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
     * Gets the value of the tiAusiliarioGenerale property.
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
     * Sets the value of the tiAusiliarioGenerale property.
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
     * Gets the value of the tiIntermedioFinale property.
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
     * Sets the value of the tiIntermedioFinale property.
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
     * Gets the value of the tiProduttivoStruttura property.
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
     * Sets the value of the tiProduttivoStruttura property.
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
     * Gets the value of the tiRealeFittizio property.
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
     * Sets the value of the tiRealeFittizio property.
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
     * Gets the value of the tiRespCosto property.
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
     * Sets the value of the tiRespCosto property.
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
     * Gets the value of the tiStrategicoOperativo property.
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
     * Sets the value of the tiStrategicoOperativo property.
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

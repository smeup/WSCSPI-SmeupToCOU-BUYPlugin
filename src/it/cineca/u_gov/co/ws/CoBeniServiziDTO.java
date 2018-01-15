
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per coBeniServiziDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="coBeniServiziDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ammCostoStandard" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="cdBeneServizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdIvaDetr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdIvaIndetr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdNomenclIntra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsBeneServizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsMarchio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsUnitaMisura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flCollaudo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flVisibileRda" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idAb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tiBeneServizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiGestInvMag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coBeniServiziDTO", propOrder = {
    "ammCostoStandard",
    "cdBeneServizio",
    "cdIvaDetr",
    "cdIvaIndetr",
    "cdNomenclIntra",
    "dsBeneServizio",
    "dsMarchio",
    "dsUnitaMisura",
    "flCollaudo",
    "flVisibileRda",
    "idAb",
    "tiBeneServizio",
    "tiGestInvMag"
})
public class CoBeniServiziDTO {

    protected BigDecimal ammCostoStandard;
    protected String cdBeneServizio;
    protected String cdIvaDetr;
    protected String cdIvaIndetr;
    protected String cdNomenclIntra;
    protected String dsBeneServizio;
    protected String dsMarchio;
    protected String dsUnitaMisura;
    protected Boolean flCollaudo;
    protected Boolean flVisibileRda;
    protected Integer idAb;
    protected String tiBeneServizio;
    protected String tiGestInvMag;

    /**
     * Recupera il valore della proprietà ammCostoStandard.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmCostoStandard() {
        return ammCostoStandard;
    }

    /**
     * Imposta il valore della proprietà ammCostoStandard.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmCostoStandard(BigDecimal value) {
        this.ammCostoStandard = value;
    }

    /**
     * Recupera il valore della proprietà cdBeneServizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdBeneServizio() {
        return cdBeneServizio;
    }

    /**
     * Imposta il valore della proprietà cdBeneServizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdBeneServizio(String value) {
        this.cdBeneServizio = value;
    }

    /**
     * Recupera il valore della proprietà cdIvaDetr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdIvaDetr() {
        return cdIvaDetr;
    }

    /**
     * Imposta il valore della proprietà cdIvaDetr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdIvaDetr(String value) {
        this.cdIvaDetr = value;
    }

    /**
     * Recupera il valore della proprietà cdIvaIndetr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdIvaIndetr() {
        return cdIvaIndetr;
    }

    /**
     * Imposta il valore della proprietà cdIvaIndetr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdIvaIndetr(String value) {
        this.cdIvaIndetr = value;
    }

    /**
     * Recupera il valore della proprietà cdNomenclIntra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdNomenclIntra() {
        return cdNomenclIntra;
    }

    /**
     * Imposta il valore della proprietà cdNomenclIntra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdNomenclIntra(String value) {
        this.cdNomenclIntra = value;
    }

    /**
     * Recupera il valore della proprietà dsBeneServizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsBeneServizio() {
        return dsBeneServizio;
    }

    /**
     * Imposta il valore della proprietà dsBeneServizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsBeneServizio(String value) {
        this.dsBeneServizio = value;
    }

    /**
     * Recupera il valore della proprietà dsMarchio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsMarchio() {
        return dsMarchio;
    }

    /**
     * Imposta il valore della proprietà dsMarchio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsMarchio(String value) {
        this.dsMarchio = value;
    }

    /**
     * Recupera il valore della proprietà dsUnitaMisura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsUnitaMisura() {
        return dsUnitaMisura;
    }

    /**
     * Imposta il valore della proprietà dsUnitaMisura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsUnitaMisura(String value) {
        this.dsUnitaMisura = value;
    }

    /**
     * Recupera il valore della proprietà flCollaudo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlCollaudo() {
        return flCollaudo;
    }

    /**
     * Imposta il valore della proprietà flCollaudo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlCollaudo(Boolean value) {
        this.flCollaudo = value;
    }

    /**
     * Recupera il valore della proprietà flVisibileRda.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlVisibileRda() {
        return flVisibileRda;
    }

    /**
     * Imposta il valore della proprietà flVisibileRda.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlVisibileRda(Boolean value) {
        this.flVisibileRda = value;
    }

    /**
     * Recupera il valore della proprietà idAb.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAb() {
        return idAb;
    }

    /**
     * Imposta il valore della proprietà idAb.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAb(Integer value) {
        this.idAb = value;
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
     * Recupera il valore della proprietà tiGestInvMag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiGestInvMag() {
        return tiGestInvMag;
    }

    /**
     * Imposta il valore della proprietà tiGestInvMag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiGestInvMag(String value) {
        this.tiGestInvMag = value;
    }

}


package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coBeniServiziDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the ammCostoStandard property.
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
     * Sets the value of the ammCostoStandard property.
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
     * Gets the value of the cdBeneServizio property.
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
     * Sets the value of the cdBeneServizio property.
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
     * Gets the value of the cdIvaDetr property.
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
     * Sets the value of the cdIvaDetr property.
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
     * Gets the value of the cdIvaIndetr property.
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
     * Sets the value of the cdIvaIndetr property.
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
     * Gets the value of the cdNomenclIntra property.
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
     * Sets the value of the cdNomenclIntra property.
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
     * Gets the value of the dsBeneServizio property.
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
     * Sets the value of the dsBeneServizio property.
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
     * Gets the value of the dsMarchio property.
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
     * Sets the value of the dsMarchio property.
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
     * Gets the value of the dsUnitaMisura property.
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
     * Sets the value of the dsUnitaMisura property.
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
     * Gets the value of the flCollaudo property.
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
     * Sets the value of the flCollaudo property.
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
     * Gets the value of the flVisibileRda property.
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
     * Sets the value of the flVisibileRda property.
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
     * Gets the value of the idAb property.
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
     * Sets the value of the idAb property.
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
     * Gets the value of the tiBeneServizio property.
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
     * Sets the value of the tiBeneServizio property.
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
     * Gets the value of the tiGestInvMag property.
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
     * Sets the value of the tiGestInvMag property.
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

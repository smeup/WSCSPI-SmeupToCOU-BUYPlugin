
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tariffarioDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tariffarioDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdIvaDefault" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdNomenclIntra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdTariffario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdTipoSpesaSanitaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsTariffario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flEnpav" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idTariffario" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idUo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="prezzoUnitario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tiBeneServizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiGestInvMag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitaMisura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tariffarioDTO", propOrder = {
    "cdIvaDefault",
    "cdNomenclIntra",
    "cdTariffario",
    "cdTipoSpesaSanitaria",
    "cdUo",
    "dsTariffario",
    "flEnpav",
    "idTariffario",
    "idUo",
    "prezzoUnitario",
    "tiBeneServizio",
    "tiGestInvMag",
    "unitaMisura"
})
public class TariffarioDTO {

    protected String cdIvaDefault;
    protected String cdNomenclIntra;
    protected String cdTariffario;
    protected String cdTipoSpesaSanitaria;
    protected String cdUo;
    protected String dsTariffario;
    protected Boolean flEnpav;
    protected Long idTariffario;
    protected Long idUo;
    protected BigDecimal prezzoUnitario;
    protected String tiBeneServizio;
    protected String tiGestInvMag;
    protected String unitaMisura;

    /**
     * Gets the value of the cdIvaDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdIvaDefault() {
        return cdIvaDefault;
    }

    /**
     * Sets the value of the cdIvaDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdIvaDefault(String value) {
        this.cdIvaDefault = value;
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
     * Gets the value of the cdTariffario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdTariffario() {
        return cdTariffario;
    }

    /**
     * Sets the value of the cdTariffario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdTariffario(String value) {
        this.cdTariffario = value;
    }

    /**
     * Gets the value of the cdTipoSpesaSanitaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdTipoSpesaSanitaria() {
        return cdTipoSpesaSanitaria;
    }

    /**
     * Sets the value of the cdTipoSpesaSanitaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdTipoSpesaSanitaria(String value) {
        this.cdTipoSpesaSanitaria = value;
    }

    /**
     * Gets the value of the cdUo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUo() {
        return cdUo;
    }

    /**
     * Sets the value of the cdUo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUo(String value) {
        this.cdUo = value;
    }

    /**
     * Gets the value of the dsTariffario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsTariffario() {
        return dsTariffario;
    }

    /**
     * Sets the value of the dsTariffario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsTariffario(String value) {
        this.dsTariffario = value;
    }

    /**
     * Gets the value of the flEnpav property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlEnpav() {
        return flEnpav;
    }

    /**
     * Sets the value of the flEnpav property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlEnpav(Boolean value) {
        this.flEnpav = value;
    }

    /**
     * Gets the value of the idTariffario property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTariffario() {
        return idTariffario;
    }

    /**
     * Sets the value of the idTariffario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTariffario(Long value) {
        this.idTariffario = value;
    }

    /**
     * Gets the value of the idUo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdUo() {
        return idUo;
    }

    /**
     * Sets the value of the idUo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdUo(Long value) {
        this.idUo = value;
    }

    /**
     * Gets the value of the prezzoUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrezzoUnitario() {
        return prezzoUnitario;
    }

    /**
     * Sets the value of the prezzoUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrezzoUnitario(BigDecimal value) {
        this.prezzoUnitario = value;
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

    /**
     * Gets the value of the unitaMisura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitaMisura() {
        return unitaMisura;
    }

    /**
     * Sets the value of the unitaMisura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitaMisura(String value) {
        this.unitaMisura = value;
    }

}

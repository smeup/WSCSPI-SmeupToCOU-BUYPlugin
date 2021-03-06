
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tariffarioDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietÓ cdIvaDefault.
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
     * Imposta il valore della proprietÓ cdIvaDefault.
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
     * Recupera il valore della proprietÓ cdNomenclIntra.
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
     * Imposta il valore della proprietÓ cdNomenclIntra.
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
     * Recupera il valore della proprietÓ cdTariffario.
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
     * Imposta il valore della proprietÓ cdTariffario.
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
     * Recupera il valore della proprietÓ cdTipoSpesaSanitaria.
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
     * Imposta il valore della proprietÓ cdTipoSpesaSanitaria.
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
     * Recupera il valore della proprietÓ cdUo.
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
     * Imposta il valore della proprietÓ cdUo.
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
     * Recupera il valore della proprietÓ dsTariffario.
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
     * Imposta il valore della proprietÓ dsTariffario.
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
     * Recupera il valore della proprietÓ flEnpav.
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
     * Imposta il valore della proprietÓ flEnpav.
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
     * Recupera il valore della proprietÓ idTariffario.
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
     * Imposta il valore della proprietÓ idTariffario.
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
     * Recupera il valore della proprietÓ idUo.
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
     * Imposta il valore della proprietÓ idUo.
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
     * Recupera il valore della proprietÓ prezzoUnitario.
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
     * Imposta il valore della proprietÓ prezzoUnitario.
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
     * Recupera il valore della proprietÓ tiBeneServizio.
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
     * Imposta il valore della proprietÓ tiBeneServizio.
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
     * Recupera il valore della proprietÓ tiGestInvMag.
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
     * Imposta il valore della proprietÓ tiGestInvMag.
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
     * Recupera il valore della proprietÓ unitaMisura.
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
     * Imposta il valore della proprietÓ unitaMisura.
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

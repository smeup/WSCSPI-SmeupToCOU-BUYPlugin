
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for gestTariffarioInDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gestTariffarioInDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdTariffa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdTipoSpesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsTariffa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtRiferimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="flEnpav" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="prezzoUnitario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tiBeneServizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "gestTariffarioInDTO", propOrder = {
    "cdIva",
    "cdTariffa",
    "cdTipoSpesa",
    "cdUO",
    "destinazione",
    "dsTariffa",
    "dtRiferimento",
    "flEnpav",
    "prezzoUnitario",
    "tiBeneServizio",
    "unitaMisura"
})
public class GestTariffarioInDTO {

    protected String cdIva;
    protected String cdTariffa;
    protected String cdTipoSpesa;
    protected String cdUO;
    protected String destinazione;
    protected String dsTariffa;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtRiferimento;
    protected Boolean flEnpav;
    protected BigDecimal prezzoUnitario;
    protected String tiBeneServizio;
    protected String unitaMisura;

    /**
     * Gets the value of the cdIva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdIva() {
        return cdIva;
    }

    /**
     * Sets the value of the cdIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdIva(String value) {
        this.cdIva = value;
    }

    /**
     * Gets the value of the cdTariffa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdTariffa() {
        return cdTariffa;
    }

    /**
     * Sets the value of the cdTariffa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdTariffa(String value) {
        this.cdTariffa = value;
    }

    /**
     * Gets the value of the cdTipoSpesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdTipoSpesa() {
        return cdTipoSpesa;
    }

    /**
     * Sets the value of the cdTipoSpesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdTipoSpesa(String value) {
        this.cdTipoSpesa = value;
    }

    /**
     * Gets the value of the cdUO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUO() {
        return cdUO;
    }

    /**
     * Sets the value of the cdUO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUO(String value) {
        this.cdUO = value;
    }

    /**
     * Gets the value of the destinazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinazione() {
        return destinazione;
    }

    /**
     * Sets the value of the destinazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinazione(String value) {
        this.destinazione = value;
    }

    /**
     * Gets the value of the dsTariffa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsTariffa() {
        return dsTariffa;
    }

    /**
     * Sets the value of the dsTariffa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsTariffa(String value) {
        this.dsTariffa = value;
    }

    /**
     * Gets the value of the dtRiferimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtRiferimento() {
        return dtRiferimento;
    }

    /**
     * Sets the value of the dtRiferimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtRiferimento(XMLGregorianCalendar value) {
        this.dtRiferimento = value;
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

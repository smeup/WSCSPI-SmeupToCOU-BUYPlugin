
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per gestTariffarioInDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietà cdIva.
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
     * Imposta il valore della proprietà cdIva.
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
     * Recupera il valore della proprietà cdTariffa.
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
     * Imposta il valore della proprietà cdTariffa.
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
     * Recupera il valore della proprietà cdTipoSpesa.
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
     * Imposta il valore della proprietà cdTipoSpesa.
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
     * Recupera il valore della proprietà cdUO.
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
     * Imposta il valore della proprietà cdUO.
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
     * Recupera il valore della proprietà destinazione.
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
     * Imposta il valore della proprietà destinazione.
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
     * Recupera il valore della proprietà dsTariffa.
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
     * Imposta il valore della proprietà dsTariffa.
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
     * Recupera il valore della proprietà dtRiferimento.
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
     * Imposta il valore della proprietà dtRiferimento.
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
     * Recupera il valore della proprietà flEnpav.
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
     * Imposta il valore della proprietà flEnpav.
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
     * Recupera il valore della proprietà prezzoUnitario.
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
     * Imposta il valore della proprietà prezzoUnitario.
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
     * Recupera il valore della proprietà unitaMisura.
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
     * Imposta il valore della proprietà unitaMisura.
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

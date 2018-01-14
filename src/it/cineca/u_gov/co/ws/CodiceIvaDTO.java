
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for codiceIvaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="codiceIvaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detraibilita" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dsIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="percentualeIva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "codiceIvaDTO", propOrder = {
    "cdIva",
    "detraibilita",
    "dsIva",
    "percentualeIva"
})
public class CodiceIvaDTO {

    protected String cdIva;
    protected BigDecimal detraibilita;
    protected String dsIva;
    protected BigDecimal percentualeIva;

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
     * Gets the value of the detraibilita property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDetraibilita() {
        return detraibilita;
    }

    /**
     * Sets the value of the detraibilita property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDetraibilita(BigDecimal value) {
        this.detraibilita = value;
    }

    /**
     * Gets the value of the dsIva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsIva() {
        return dsIva;
    }

    /**
     * Sets the value of the dsIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsIva(String value) {
        this.dsIva = value;
    }

    /**
     * Gets the value of the percentualeIva property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentualeIva() {
        return percentualeIva;
    }

    /**
     * Sets the value of the percentualeIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentualeIva(BigDecimal value) {
        this.percentualeIva = value;
    }

}

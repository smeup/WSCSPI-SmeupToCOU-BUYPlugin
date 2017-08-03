
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ammontariDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ammontariDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ammIvaDetr" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ammIvaEuro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ammIvaIndetr" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ammIvaProrataCoge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ammPrincipaleCoan" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ammPrincipaleCoge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ammontariDTO", propOrder = {
    "ammIvaDetr",
    "ammIvaEuro",
    "ammIvaIndetr",
    "ammIvaProrataCoge",
    "ammPrincipaleCoan",
    "ammPrincipaleCoge"
})
public class AmmontariDTO {

    protected BigDecimal ammIvaDetr;
    protected BigDecimal ammIvaEuro;
    protected BigDecimal ammIvaIndetr;
    protected BigDecimal ammIvaProrataCoge;
    protected BigDecimal ammPrincipaleCoan;
    protected BigDecimal ammPrincipaleCoge;

    /**
     * Gets the value of the ammIvaDetr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmIvaDetr() {
        return ammIvaDetr;
    }

    /**
     * Sets the value of the ammIvaDetr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmIvaDetr(BigDecimal value) {
        this.ammIvaDetr = value;
    }

    /**
     * Gets the value of the ammIvaEuro property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmIvaEuro() {
        return ammIvaEuro;
    }

    /**
     * Sets the value of the ammIvaEuro property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmIvaEuro(BigDecimal value) {
        this.ammIvaEuro = value;
    }

    /**
     * Gets the value of the ammIvaIndetr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmIvaIndetr() {
        return ammIvaIndetr;
    }

    /**
     * Sets the value of the ammIvaIndetr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmIvaIndetr(BigDecimal value) {
        this.ammIvaIndetr = value;
    }

    /**
     * Gets the value of the ammIvaProrataCoge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmIvaProrataCoge() {
        return ammIvaProrataCoge;
    }

    /**
     * Sets the value of the ammIvaProrataCoge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmIvaProrataCoge(BigDecimal value) {
        this.ammIvaProrataCoge = value;
    }

    /**
     * Gets the value of the ammPrincipaleCoan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmPrincipaleCoan() {
        return ammPrincipaleCoan;
    }

    /**
     * Sets the value of the ammPrincipaleCoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmPrincipaleCoan(BigDecimal value) {
        this.ammPrincipaleCoan = value;
    }

    /**
     * Gets the value of the ammPrincipaleCoge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmPrincipaleCoge() {
        return ammPrincipaleCoge;
    }

    /**
     * Sets the value of the ammPrincipaleCoge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmPrincipaleCoge(BigDecimal value) {
        this.ammPrincipaleCoge = value;
    }

}

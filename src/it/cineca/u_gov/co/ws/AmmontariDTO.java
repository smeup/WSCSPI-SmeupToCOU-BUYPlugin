
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ammontariDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietà ammIvaDetr.
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
     * Imposta il valore della proprietà ammIvaDetr.
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
     * Recupera il valore della proprietà ammIvaEuro.
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
     * Imposta il valore della proprietà ammIvaEuro.
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
     * Recupera il valore della proprietà ammIvaIndetr.
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
     * Imposta il valore della proprietà ammIvaIndetr.
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
     * Recupera il valore della proprietà ammIvaProrataCoge.
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
     * Imposta il valore della proprietà ammIvaProrataCoge.
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
     * Recupera il valore della proprietà ammPrincipaleCoan.
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
     * Imposta il valore della proprietà ammPrincipaleCoan.
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
     * Recupera il valore della proprietà ammPrincipaleCoge.
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
     * Imposta il valore della proprietà ammPrincipaleCoge.
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

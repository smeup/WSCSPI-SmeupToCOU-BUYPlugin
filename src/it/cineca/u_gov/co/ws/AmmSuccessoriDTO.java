
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ammSuccessoriDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ammSuccessoriDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ammontareAperto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ammontareDeiSuccessori" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ammontareDelDocumento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ammontarePagatoIncassato" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="idDg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ammSuccessoriDTO", propOrder = {
    "ammontareAperto",
    "ammontareDeiSuccessori",
    "ammontareDelDocumento",
    "ammontarePagatoIncassato",
    "idDg"
})
public class AmmSuccessoriDTO {

    protected BigDecimal ammontareAperto;
    protected BigDecimal ammontareDeiSuccessori;
    protected BigDecimal ammontareDelDocumento;
    protected BigDecimal ammontarePagatoIncassato;
    protected Long idDg;

    /**
     * Gets the value of the ammontareAperto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmontareAperto() {
        return ammontareAperto;
    }

    /**
     * Sets the value of the ammontareAperto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmontareAperto(BigDecimal value) {
        this.ammontareAperto = value;
    }

    /**
     * Gets the value of the ammontareDeiSuccessori property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmontareDeiSuccessori() {
        return ammontareDeiSuccessori;
    }

    /**
     * Sets the value of the ammontareDeiSuccessori property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmontareDeiSuccessori(BigDecimal value) {
        this.ammontareDeiSuccessori = value;
    }

    /**
     * Gets the value of the ammontareDelDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmontareDelDocumento() {
        return ammontareDelDocumento;
    }

    /**
     * Sets the value of the ammontareDelDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmontareDelDocumento(BigDecimal value) {
        this.ammontareDelDocumento = value;
    }

    /**
     * Gets the value of the ammontarePagatoIncassato property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmontarePagatoIncassato() {
        return ammontarePagatoIncassato;
    }

    /**
     * Sets the value of the ammontarePagatoIncassato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmontarePagatoIncassato(BigDecimal value) {
        this.ammontarePagatoIncassato = value;
    }

    /**
     * Gets the value of the idDg property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDg() {
        return idDg;
    }

    /**
     * Sets the value of the idDg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDg(Long value) {
        this.idDg = value;
    }

}

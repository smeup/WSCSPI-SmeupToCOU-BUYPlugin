
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ammSuccessoriDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietà ammontareAperto.
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
     * Imposta il valore della proprietà ammontareAperto.
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
     * Recupera il valore della proprietà ammontareDeiSuccessori.
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
     * Imposta il valore della proprietà ammontareDeiSuccessori.
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
     * Recupera il valore della proprietà ammontareDelDocumento.
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
     * Imposta il valore della proprietà ammontareDelDocumento.
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
     * Recupera il valore della proprietà ammontarePagatoIncassato.
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
     * Imposta il valore della proprietà ammontarePagatoIncassato.
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
     * Recupera il valore della proprietà idDg.
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
     * Imposta il valore della proprietà idDg.
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

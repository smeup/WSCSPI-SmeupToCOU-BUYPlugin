
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per codiceIvaDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietà detraibilita.
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
     * Imposta il valore della proprietà detraibilita.
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
     * Recupera il valore della proprietà dsIva.
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
     * Imposta il valore della proprietà dsIva.
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
     * Recupera il valore della proprietà percentualeIva.
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
     * Imposta il valore della proprietà percentualeIva.
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

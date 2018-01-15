
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ivaDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ivaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ivaDTO", propOrder = {
    "cdIva",
    "dsIva"
})
public class IvaDTO {

    protected String cdIva;
    protected String dsIva;

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

}

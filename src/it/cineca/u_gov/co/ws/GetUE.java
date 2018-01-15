
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getUE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getUE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cdNodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conUEfiglie" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUE", propOrder = {
    "esercizio",
    "cdNodo",
    "conUEfiglie"
})
public class GetUE {

    protected Integer esercizio;
    protected String cdNodo;
    protected Boolean conUEfiglie;

    /**
     * Recupera il valore della proprietà esercizio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEsercizio() {
        return esercizio;
    }

    /**
     * Imposta il valore della proprietà esercizio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEsercizio(Integer value) {
        this.esercizio = value;
    }

    /**
     * Recupera il valore della proprietà cdNodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdNodo() {
        return cdNodo;
    }

    /**
     * Imposta il valore della proprietà cdNodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdNodo(String value) {
        this.cdNodo = value;
    }

    /**
     * Recupera il valore della proprietà conUEfiglie.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConUEfiglie() {
        return conUEfiglie;
    }

    /**
     * Imposta il valore della proprietà conUEfiglie.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConUEfiglie(Boolean value) {
        this.conUEfiglie = value;
    }

}


package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getElencoCup complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getElencoCup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdNodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiAttivoPassivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flNotaCredito" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getElencoCup", propOrder = {
    "cdNodo",
    "tiAttivoPassivo",
    "flNotaCredito"
})
public class GetElencoCup {

    protected String cdNodo;
    protected String tiAttivoPassivo;
    protected Boolean flNotaCredito;

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
     * Recupera il valore della proprietà tiAttivoPassivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiAttivoPassivo() {
        return tiAttivoPassivo;
    }

    /**
     * Imposta il valore della proprietà tiAttivoPassivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiAttivoPassivo(String value) {
        this.tiAttivoPassivo = value;
    }

    /**
     * Recupera il valore della proprietà flNotaCredito.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlNotaCredito() {
        return flNotaCredito;
    }

    /**
     * Imposta il valore della proprietà flNotaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlNotaCredito(Boolean value) {
        this.flNotaCredito = value;
    }

}

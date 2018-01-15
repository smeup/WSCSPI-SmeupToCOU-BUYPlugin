
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getUAForUO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getUAForUO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAbUO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cdNodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUAForUO", propOrder = {
    "idAbUO",
    "cdNodo",
    "esercizio"
})
public class GetUAForUO {

    protected Long idAbUO;
    protected String cdNodo;
    protected Integer esercizio;

    /**
     * Recupera il valore della proprietà idAbUO.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAbUO() {
        return idAbUO;
    }

    /**
     * Imposta il valore della proprietà idAbUO.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAbUO(Long value) {
        this.idAbUO = value;
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

}

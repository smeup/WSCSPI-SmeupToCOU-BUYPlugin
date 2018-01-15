
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per cancellaBuono complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="cancellaBuono">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idBuonoCarScar" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cdInvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgBuonoCarScar" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tiBuono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "cancellaBuono", propOrder = {
    "idBuonoCarScar",
    "cdInvent",
    "pgBuonoCarScar",
    "tiBuono",
    "esercizio"
})
public class CancellaBuono {

    protected Long idBuonoCarScar;
    protected String cdInvent;
    protected Long pgBuonoCarScar;
    protected String tiBuono;
    protected Integer esercizio;

    /**
     * Recupera il valore della proprietà idBuonoCarScar.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdBuonoCarScar() {
        return idBuonoCarScar;
    }

    /**
     * Imposta il valore della proprietà idBuonoCarScar.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdBuonoCarScar(Long value) {
        this.idBuonoCarScar = value;
    }

    /**
     * Recupera il valore della proprietà cdInvent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdInvent() {
        return cdInvent;
    }

    /**
     * Imposta il valore della proprietà cdInvent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdInvent(String value) {
        this.cdInvent = value;
    }

    /**
     * Recupera il valore della proprietà pgBuonoCarScar.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPgBuonoCarScar() {
        return pgBuonoCarScar;
    }

    /**
     * Imposta il valore della proprietà pgBuonoCarScar.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPgBuonoCarScar(Long value) {
        this.pgBuonoCarScar = value;
    }

    /**
     * Recupera il valore della proprietà tiBuono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiBuono() {
        return tiBuono;
    }

    /**
     * Imposta il valore della proprietà tiBuono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiBuono(String value) {
        this.tiBuono = value;
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

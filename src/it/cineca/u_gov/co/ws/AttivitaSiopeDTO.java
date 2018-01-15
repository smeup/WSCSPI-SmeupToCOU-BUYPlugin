
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per attivitaSiopeDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="attivitaSiopeDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdAttivitaGestionale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsAttivitaGestionale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="flDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idAttivitaGestionale" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attivitaSiopeDTO", propOrder = {
    "cdAttivitaGestionale",
    "dsAttivitaGestionale",
    "esercizio",
    "flDefault",
    "idAttivitaGestionale"
})
public class AttivitaSiopeDTO {

    protected String cdAttivitaGestionale;
    protected String dsAttivitaGestionale;
    protected Integer esercizio;
    protected Boolean flDefault;
    protected Long idAttivitaGestionale;

    /**
     * Recupera il valore della proprietà cdAttivitaGestionale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdAttivitaGestionale() {
        return cdAttivitaGestionale;
    }

    /**
     * Imposta il valore della proprietà cdAttivitaGestionale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdAttivitaGestionale(String value) {
        this.cdAttivitaGestionale = value;
    }

    /**
     * Recupera il valore della proprietà dsAttivitaGestionale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsAttivitaGestionale() {
        return dsAttivitaGestionale;
    }

    /**
     * Imposta il valore della proprietà dsAttivitaGestionale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsAttivitaGestionale(String value) {
        this.dsAttivitaGestionale = value;
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

    /**
     * Recupera il valore della proprietà flDefault.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlDefault() {
        return flDefault;
    }

    /**
     * Imposta il valore della proprietà flDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlDefault(Boolean value) {
        this.flDefault = value;
    }

    /**
     * Recupera il valore della proprietà idAttivitaGestionale.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAttivitaGestionale() {
        return idAttivitaGestionale;
    }

    /**
     * Imposta il valore della proprietà idAttivitaGestionale.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAttivitaGestionale(Long value) {
        this.idAttivitaGestionale = value;
    }

}

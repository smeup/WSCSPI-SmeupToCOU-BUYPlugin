
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per logFsmDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="logFsmDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idDg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="messaggio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logFsmDTO", propOrder = {
    "errore",
    "idDg",
    "messaggio"
})
public class LogFsmDTO {

    protected Boolean errore;
    protected Long idDg;
    protected String messaggio;

    /**
     * Recupera il valore della proprietÓ errore.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErrore() {
        return errore;
    }

    /**
     * Imposta il valore della proprietÓ errore.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErrore(Boolean value) {
        this.errore = value;
    }

    /**
     * Recupera il valore della proprietÓ idDg.
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
     * Imposta il valore della proprietÓ idDg.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDg(Long value) {
        this.idDg = value;
    }

    /**
     * Recupera il valore della proprietÓ messaggio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessaggio() {
        return messaggio;
    }

    /**
     * Imposta il valore della proprietÓ messaggio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessaggio(String value) {
        this.messaggio = value;
    }

}

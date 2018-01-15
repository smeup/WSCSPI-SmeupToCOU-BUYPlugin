
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per logDettaglioCoanDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="logDettaglioCoanDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="progDettaglio" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logDettaglioCoanDTO", propOrder = {
    "errore",
    "progDettaglio"
})
public class LogDettaglioCoanDTO {

    protected String errore;
    protected Long progDettaglio;

    /**
     * Recupera il valore della proprietà errore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrore() {
        return errore;
    }

    /**
     * Imposta il valore della proprietà errore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrore(String value) {
        this.errore = value;
    }

    /**
     * Recupera il valore della proprietà progDettaglio.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProgDettaglio() {
        return progDettaglio;
    }

    /**
     * Imposta il valore della proprietà progDettaglio.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProgDettaglio(Long value) {
        this.progDettaglio = value;
    }

}

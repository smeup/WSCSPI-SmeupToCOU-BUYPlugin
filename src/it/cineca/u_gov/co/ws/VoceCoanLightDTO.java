
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per voceCoanLightDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="voceCoanLightDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdVoceCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsVoceCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flSchedaBudget" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idVoceCoan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voceCoanLightDTO", propOrder = {
    "cdVoceCoan",
    "dsVoceCoan",
    "flSchedaBudget",
    "idVoceCoan"
})
public class VoceCoanLightDTO {

    protected String cdVoceCoan;
    protected String dsVoceCoan;
    protected Boolean flSchedaBudget;
    protected Long idVoceCoan;

    /**
     * Recupera il valore della proprietÓ cdVoceCoan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdVoceCoan() {
        return cdVoceCoan;
    }

    /**
     * Imposta il valore della proprietÓ cdVoceCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdVoceCoan(String value) {
        this.cdVoceCoan = value;
    }

    /**
     * Recupera il valore della proprietÓ dsVoceCoan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsVoceCoan() {
        return dsVoceCoan;
    }

    /**
     * Imposta il valore della proprietÓ dsVoceCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsVoceCoan(String value) {
        this.dsVoceCoan = value;
    }

    /**
     * Recupera il valore della proprietÓ flSchedaBudget.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlSchedaBudget() {
        return flSchedaBudget;
    }

    /**
     * Imposta il valore della proprietÓ flSchedaBudget.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlSchedaBudget(Boolean value) {
        this.flSchedaBudget = value;
    }

    /**
     * Recupera il valore della proprietÓ idVoceCoan.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdVoceCoan() {
        return idVoceCoan;
    }

    /**
     * Imposta il valore della proprietÓ idVoceCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdVoceCoan(Long value) {
        this.idVoceCoan = value;
    }

}

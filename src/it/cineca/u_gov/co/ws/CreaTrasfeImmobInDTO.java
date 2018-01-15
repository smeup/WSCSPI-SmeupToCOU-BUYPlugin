
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per creaTrasfeImmobInDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="creaTrasfeImmobInDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdImmobilizzazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdVoceCoge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "creaTrasfeImmobInDTO", propOrder = {
    "cdImmobilizzazione",
    "cdVoceCoge",
    "esercizio"
})
public class CreaTrasfeImmobInDTO {

    protected String cdImmobilizzazione;
    protected String cdVoceCoge;
    protected Integer esercizio;

    /**
     * Recupera il valore della proprietà cdImmobilizzazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdImmobilizzazione() {
        return cdImmobilizzazione;
    }

    /**
     * Imposta il valore della proprietà cdImmobilizzazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdImmobilizzazione(String value) {
        this.cdImmobilizzazione = value;
    }

    /**
     * Recupera il valore della proprietà cdVoceCoge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdVoceCoge() {
        return cdVoceCoge;
    }

    /**
     * Imposta il valore della proprietà cdVoceCoge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdVoceCoge(String value) {
        this.cdVoceCoge = value;
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

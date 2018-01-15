
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per creaTrasfeCategInDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="creaTrasfeCategInDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdCategGruppo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdVoceCoge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creaTrasfeCategInDTO", propOrder = {
    "cdCategGruppo",
    "cdVoceCoge"
})
public class CreaTrasfeCategInDTO {

    protected String cdCategGruppo;
    protected String cdVoceCoge;

    /**
     * Recupera il valore della proprietà cdCategGruppo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCategGruppo() {
        return cdCategGruppo;
    }

    /**
     * Imposta il valore della proprietà cdCategGruppo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCategGruppo(String value) {
        this.cdCategGruppo = value;
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

}

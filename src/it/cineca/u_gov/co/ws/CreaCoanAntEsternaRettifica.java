
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per creaCoanAntEsternaRettifica complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="creaCoanAntEsternaRettifica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdAppExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDettaglioDoc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "creaCoanAntEsternaRettifica", propOrder = {
    "cdAppExt",
    "idDettaglioDoc",
    "esercizio"
})
public class CreaCoanAntEsternaRettifica {

    protected String cdAppExt;
    protected Long idDettaglioDoc;
    protected Integer esercizio;

    /**
     * Recupera il valore della proprietà cdAppExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdAppExt() {
        return cdAppExt;
    }

    /**
     * Imposta il valore della proprietà cdAppExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdAppExt(String value) {
        this.cdAppExt = value;
    }

    /**
     * Recupera il valore della proprietà idDettaglioDoc.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDettaglioDoc() {
        return idDettaglioDoc;
    }

    /**
     * Imposta il valore della proprietà idDettaglioDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDettaglioDoc(Long value) {
        this.idDettaglioDoc = value;
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

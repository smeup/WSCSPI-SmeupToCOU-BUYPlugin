
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per getUAVoceCoanProgetto complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getUAVoceCoanProgetto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dtRegistrazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cdNodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdBeneServizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUAVoceCoanProgetto", propOrder = {
    "dtRegistrazione",
    "cdNodo",
    "cdBeneServizio"
})
public class GetUAVoceCoanProgetto {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtRegistrazione;
    protected String cdNodo;
    protected String cdBeneServizio;

    /**
     * Recupera il valore della proprietà dtRegistrazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtRegistrazione() {
        return dtRegistrazione;
    }

    /**
     * Imposta il valore della proprietà dtRegistrazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtRegistrazione(XMLGregorianCalendar value) {
        this.dtRegistrazione = value;
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
     * Recupera il valore della proprietà cdBeneServizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdBeneServizio() {
        return cdBeneServizio;
    }

    /**
     * Imposta il valore della proprietà cdBeneServizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdBeneServizio(String value) {
        this.cdBeneServizio = value;
    }

}

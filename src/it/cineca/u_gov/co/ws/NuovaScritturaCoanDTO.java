
package it.cineca.u_gov.co.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per nuovaScritturaCoanDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="nuovaScritturaCoanDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dettagli" type="{http://ws.co.u-gov.cineca.it/}nuovoDettaglioCoanDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dsScrCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtRegistrazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="progScrittura" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nuovaScritturaCoanDTO", propOrder = {
    "dettagli",
    "dsScrCoan",
    "dtRegistrazione",
    "esercizio",
    "progScrittura"
})
public class NuovaScritturaCoanDTO {

    @XmlElement(nillable = true)
    protected List<NuovoDettaglioCoanDTO> dettagli;
    protected String dsScrCoan;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtRegistrazione;
    protected Integer esercizio;
    protected Long progScrittura;

    /**
     * Gets the value of the dettagli property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dettagli property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDettagli().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NuovoDettaglioCoanDTO }
     * 
     * 
     */
    public List<NuovoDettaglioCoanDTO> getDettagli() {
        if (dettagli == null) {
            dettagli = new ArrayList<NuovoDettaglioCoanDTO>();
        }
        return this.dettagli;
    }

    /**
     * Recupera il valore della proprietà dsScrCoan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsScrCoan() {
        return dsScrCoan;
    }

    /**
     * Imposta il valore della proprietà dsScrCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsScrCoan(String value) {
        this.dsScrCoan = value;
    }

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
     * Recupera il valore della proprietà progScrittura.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProgScrittura() {
        return progScrittura;
    }

    /**
     * Imposta il valore della proprietà progScrittura.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProgScrittura(Long value) {
        this.progScrittura = value;
    }

}

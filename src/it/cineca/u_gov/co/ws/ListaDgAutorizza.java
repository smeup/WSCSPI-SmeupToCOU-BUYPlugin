
package it.cineca.u_gov.co.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per listaDgAutorizza complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="listaDgAutorizza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dtInizio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtFine" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nomeTipoDg" type="{http://ws.co.u-gov.cineca.it/}tipoDgStatoDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nomeTipoAttore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAbAttore" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaDgAutorizza", propOrder = {
    "dtInizio",
    "dtFine",
    "nomeTipoDg",
    "nomeTipoAttore",
    "idAbAttore"
})
public class ListaDgAutorizza {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtInizio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtFine;
    protected List<TipoDgStatoDTO> nomeTipoDg;
    protected String nomeTipoAttore;
    protected Long idAbAttore;

    /**
     * Recupera il valore della proprietà dtInizio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtInizio() {
        return dtInizio;
    }

    /**
     * Imposta il valore della proprietà dtInizio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtInizio(XMLGregorianCalendar value) {
        this.dtInizio = value;
    }

    /**
     * Recupera il valore della proprietà dtFine.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtFine() {
        return dtFine;
    }

    /**
     * Imposta il valore della proprietà dtFine.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtFine(XMLGregorianCalendar value) {
        this.dtFine = value;
    }

    /**
     * Gets the value of the nomeTipoDg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nomeTipoDg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNomeTipoDg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoDgStatoDTO }
     * 
     * 
     */
    public List<TipoDgStatoDTO> getNomeTipoDg() {
        if (nomeTipoDg == null) {
            nomeTipoDg = new ArrayList<TipoDgStatoDTO>();
        }
        return this.nomeTipoDg;
    }

    /**
     * Recupera il valore della proprietà nomeTipoAttore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeTipoAttore() {
        return nomeTipoAttore;
    }

    /**
     * Imposta il valore della proprietà nomeTipoAttore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeTipoAttore(String value) {
        this.nomeTipoAttore = value;
    }

    /**
     * Recupera il valore della proprietà idAbAttore.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAbAttore() {
        return idAbAttore;
    }

    /**
     * Imposta il valore della proprietà idAbAttore.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAbAttore(Long value) {
        this.idAbAttore = value;
    }

}

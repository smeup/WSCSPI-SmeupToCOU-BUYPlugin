
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per getElencoBeniServizi complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getElencoBeniServizi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dtRif" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cdTipoOpIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flCaricoBene" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getElencoBeniServizi", propOrder = {
    "dtRif",
    "cdTipoOpIva",
    "flCaricoBene"
})
public class GetElencoBeniServizi {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtRif;
    protected String cdTipoOpIva;
    protected Boolean flCaricoBene;

    /**
     * Recupera il valore della proprietà dtRif.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtRif() {
        return dtRif;
    }

    /**
     * Imposta il valore della proprietà dtRif.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtRif(XMLGregorianCalendar value) {
        this.dtRif = value;
    }

    /**
     * Recupera il valore della proprietà cdTipoOpIva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdTipoOpIva() {
        return cdTipoOpIva;
    }

    /**
     * Imposta il valore della proprietà cdTipoOpIva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdTipoOpIva(String value) {
        this.cdTipoOpIva = value;
    }

    /**
     * Recupera il valore della proprietà flCaricoBene.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlCaricoBene() {
        return flCaricoBene;
    }

    /**
     * Imposta il valore della proprietà flCaricoBene.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlCaricoBene(Boolean value) {
        this.flCaricoBene = value;
    }

}

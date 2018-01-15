
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per getElencoTariffari complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getElencoTariffari">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataRif" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cdTipoOpIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUoOrigine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getElencoTariffari", propOrder = {
    "dataRif",
    "cdTipoOpIva",
    "cdUoOrigine"
})
public class GetElencoTariffari {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataRif;
    protected String cdTipoOpIva;
    protected String cdUoOrigine;

    /**
     * Recupera il valore della proprietà dataRif.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRif() {
        return dataRif;
    }

    /**
     * Imposta il valore della proprietà dataRif.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRif(XMLGregorianCalendar value) {
        this.dataRif = value;
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
     * Recupera il valore della proprietà cdUoOrigine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUoOrigine() {
        return cdUoOrigine;
    }

    /**
     * Imposta il valore della proprietà cdUoOrigine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUoOrigine(String value) {
        this.cdUoOrigine = value;
    }

}

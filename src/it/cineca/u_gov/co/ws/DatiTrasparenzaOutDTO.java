
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per datiTrasparenzaOutDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="datiTrasparenzaOutDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtTrasmissione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="importo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiTrasparenzaOutDTO", propOrder = {
    "cig",
    "dtTrasmissione",
    "importo"
})
public class DatiTrasparenzaOutDTO {

    protected String cig;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtTrasmissione;
    protected BigDecimal importo;

    /**
     * Recupera il valore della proprietà cig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCig() {
        return cig;
    }

    /**
     * Imposta il valore della proprietà cig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCig(String value) {
        this.cig = value;
    }

    /**
     * Recupera il valore della proprietà dtTrasmissione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtTrasmissione() {
        return dtTrasmissione;
    }

    /**
     * Imposta il valore della proprietà dtTrasmissione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtTrasmissione(XMLGregorianCalendar value) {
        this.dtTrasmissione = value;
    }

    /**
     * Recupera il valore della proprietà importo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporto() {
        return importo;
    }

    /**
     * Imposta il valore della proprietà importo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporto(BigDecimal value) {
        this.importo = value;
    }

}

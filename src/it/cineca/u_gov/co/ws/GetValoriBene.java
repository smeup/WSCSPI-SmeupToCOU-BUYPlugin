
package it.cineca.u_gov.co.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per getValoriBene complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getValoriBene">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dtRif" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="beni" type="{http://ws.co.u-gov.cineca.it/}valoriBeniInDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getValoriBene", propOrder = {
    "dtRif",
    "beni"
})
public class GetValoriBene {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtRif;
    protected List<ValoriBeniInDTO> beni;

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
     * Gets the value of the beni property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beni property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeni().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValoriBeniInDTO }
     * 
     * 
     */
    public List<ValoriBeniInDTO> getBeni() {
        if (beni == null) {
            beni = new ArrayList<ValoriBeniInDTO>();
        }
        return this.beni;
    }

}

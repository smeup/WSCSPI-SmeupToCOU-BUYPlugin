
package it.cineca.u_gov.co.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for creaBuonoCaricoScarico complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creaBuonoCaricoScarico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdAppExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoScrittura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flMassivo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dtRegistrazioneBuono" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dgs" type="{http://ws.co.u-gov.cineca.it/}creaBuonoInDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creaBuonoCaricoScarico", propOrder = {
    "cdAppExt",
    "tipoScrittura",
    "flMassivo",
    "dtRegistrazioneBuono",
    "dgs"
})
public class CreaBuonoCaricoScarico {

    protected String cdAppExt;
    protected String tipoScrittura;
    protected Boolean flMassivo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtRegistrazioneBuono;
    protected List<CreaBuonoInDTO> dgs;

    /**
     * Gets the value of the cdAppExt property.
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
     * Sets the value of the cdAppExt property.
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
     * Gets the value of the tipoScrittura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoScrittura() {
        return tipoScrittura;
    }

    /**
     * Sets the value of the tipoScrittura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoScrittura(String value) {
        this.tipoScrittura = value;
    }

    /**
     * Gets the value of the flMassivo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlMassivo() {
        return flMassivo;
    }

    /**
     * Sets the value of the flMassivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlMassivo(Boolean value) {
        this.flMassivo = value;
    }

    /**
     * Gets the value of the dtRegistrazioneBuono property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtRegistrazioneBuono() {
        return dtRegistrazioneBuono;
    }

    /**
     * Sets the value of the dtRegistrazioneBuono property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtRegistrazioneBuono(XMLGregorianCalendar value) {
        this.dtRegistrazioneBuono = value;
    }

    /**
     * Gets the value of the dgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreaBuonoInDTO }
     * 
     * 
     */
    public List<CreaBuonoInDTO> getDgs() {
        if (dgs == null) {
            dgs = new ArrayList<CreaBuonoInDTO>();
        }
        return this.dgs;
    }

}

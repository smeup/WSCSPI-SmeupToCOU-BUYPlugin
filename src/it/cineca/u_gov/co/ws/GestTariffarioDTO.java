
package it.cineca.u_gov.co.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gestTariffarioDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gestTariffarioDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lista" type="{http://ws.co.u-gov.cineca.it/}gestTariffarioOutDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipoOperazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gestTariffarioDTO", propOrder = {
    "lista",
    "tipoOperazione"
})
public class GestTariffarioDTO {

    @XmlElement(nillable = true)
    protected List<GestTariffarioOutDTO> lista;
    protected String tipoOperazione;

    /**
     * Gets the value of the lista property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lista property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLista().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GestTariffarioOutDTO }
     * 
     * 
     */
    public List<GestTariffarioOutDTO> getLista() {
        if (lista == null) {
            lista = new ArrayList<GestTariffarioOutDTO>();
        }
        return this.lista;
    }

    /**
     * Gets the value of the tipoOperazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOperazione() {
        return tipoOperazione;
    }

    /**
     * Sets the value of the tipoOperazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOperazione(String value) {
        this.tipoOperazione = value;
    }

}

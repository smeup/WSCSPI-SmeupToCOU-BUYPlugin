
package it.cineca.u_gov.co.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creaTrasfeDetOutDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creaTrasfeDetOutDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdCategGruppo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cdImmobilizzazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="vociPossibili" type="{http://ws.co.u-gov.cineca.it/}creaTrasfeVociOutDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creaTrasfeDetOutDTO", propOrder = {
    "cdCategGruppo",
    "cdImmobilizzazione",
    "esercizio",
    "vociPossibili"
})
public class CreaTrasfeDetOutDTO {

    @XmlElement(nillable = true)
    protected List<String> cdCategGruppo;
    protected String cdImmobilizzazione;
    protected Integer esercizio;
    @XmlElement(nillable = true)
    protected List<CreaTrasfeVociOutDTO> vociPossibili;

    /**
     * Gets the value of the cdCategGruppo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdCategGruppo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCdCategGruppo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCdCategGruppo() {
        if (cdCategGruppo == null) {
            cdCategGruppo = new ArrayList<String>();
        }
        return this.cdCategGruppo;
    }

    /**
     * Gets the value of the cdImmobilizzazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdImmobilizzazione() {
        return cdImmobilizzazione;
    }

    /**
     * Sets the value of the cdImmobilizzazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdImmobilizzazione(String value) {
        this.cdImmobilizzazione = value;
    }

    /**
     * Gets the value of the esercizio property.
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
     * Sets the value of the esercizio property.
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
     * Gets the value of the vociPossibili property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vociPossibili property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVociPossibili().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreaTrasfeVociOutDTO }
     * 
     * 
     */
    public List<CreaTrasfeVociOutDTO> getVociPossibili() {
        if (vociPossibili == null) {
            vociPossibili = new ArrayList<CreaTrasfeVociOutDTO>();
        }
        return this.vociPossibili;
    }

}

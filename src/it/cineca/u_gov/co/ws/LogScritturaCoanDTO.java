
package it.cineca.u_gov.co.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per logScritturaCoanDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="logScritturaCoanDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dettagli" type="{http://ws.co.u-gov.cineca.it/}logDettaglioCoanDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="errore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idScrCoan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "logScritturaCoanDTO", propOrder = {
    "dettagli",
    "errore",
    "idScrCoan",
    "progScrittura"
})
public class LogScritturaCoanDTO {

    @XmlElement(nillable = true)
    protected List<LogDettaglioCoanDTO> dettagli;
    protected String errore;
    protected Long idScrCoan;
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
     * {@link LogDettaglioCoanDTO }
     * 
     * 
     */
    public List<LogDettaglioCoanDTO> getDettagli() {
        if (dettagli == null) {
            dettagli = new ArrayList<LogDettaglioCoanDTO>();
        }
        return this.dettagli;
    }

    /**
     * Recupera il valore della proprietà errore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrore() {
        return errore;
    }

    /**
     * Imposta il valore della proprietà errore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrore(String value) {
        this.errore = value;
    }

    /**
     * Recupera il valore della proprietà idScrCoan.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdScrCoan() {
        return idScrCoan;
    }

    /**
     * Imposta il valore della proprietà idScrCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdScrCoan(Long value) {
        this.idScrCoan = value;
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

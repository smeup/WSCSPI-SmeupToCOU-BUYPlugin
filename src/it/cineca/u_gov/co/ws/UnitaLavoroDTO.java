
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per unitaLavoroDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="unitaLavoroDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdUnitaLavoro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsUnitaLavoro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idUnitaLavoro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unitaLavoroDTO", propOrder = {
    "cdUnitaLavoro",
    "dsUnitaLavoro",
    "idUnitaLavoro"
})
public class UnitaLavoroDTO {

    protected String cdUnitaLavoro;
    protected String dsUnitaLavoro;
    protected Long idUnitaLavoro;

    /**
     * Recupera il valore della proprietà cdUnitaLavoro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUnitaLavoro() {
        return cdUnitaLavoro;
    }

    /**
     * Imposta il valore della proprietà cdUnitaLavoro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUnitaLavoro(String value) {
        this.cdUnitaLavoro = value;
    }

    /**
     * Recupera il valore della proprietà dsUnitaLavoro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsUnitaLavoro() {
        return dsUnitaLavoro;
    }

    /**
     * Imposta il valore della proprietà dsUnitaLavoro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsUnitaLavoro(String value) {
        this.dsUnitaLavoro = value;
    }

    /**
     * Recupera il valore della proprietà idUnitaLavoro.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdUnitaLavoro() {
        return idUnitaLavoro;
    }

    /**
     * Imposta il valore della proprietà idUnitaLavoro.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdUnitaLavoro(Long value) {
        this.idUnitaLavoro = value;
    }

}

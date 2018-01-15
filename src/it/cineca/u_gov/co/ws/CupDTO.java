
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per cupDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="cupDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsCup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idUo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tiAttivoPassivoEntrambe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cupDTO", propOrder = {
    "cup",
    "dsCup",
    "idUo",
    "tiAttivoPassivoEntrambe"
})
public class CupDTO {

    protected String cup;
    protected String dsCup;
    protected Long idUo;
    protected String tiAttivoPassivoEntrambe;

    /**
     * Recupera il valore della proprietà cup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCup() {
        return cup;
    }

    /**
     * Imposta il valore della proprietà cup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCup(String value) {
        this.cup = value;
    }

    /**
     * Recupera il valore della proprietà dsCup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsCup() {
        return dsCup;
    }

    /**
     * Imposta il valore della proprietà dsCup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsCup(String value) {
        this.dsCup = value;
    }

    /**
     * Recupera il valore della proprietà idUo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdUo() {
        return idUo;
    }

    /**
     * Imposta il valore della proprietà idUo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdUo(Long value) {
        this.idUo = value;
    }

    /**
     * Recupera il valore della proprietà tiAttivoPassivoEntrambe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiAttivoPassivoEntrambe() {
        return tiAttivoPassivoEntrambe;
    }

    /**
     * Imposta il valore della proprietà tiAttivoPassivoEntrambe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiAttivoPassivoEntrambe(String value) {
        this.tiAttivoPassivoEntrambe = value;
    }

}


package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per respProgettoDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="respProgettoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAb" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idProgetto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nomeEsteso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respProgettoDTO", propOrder = {
    "cdProgetto",
    "idAb",
    "idProgetto",
    "nomeEsteso",
    "nomeProgetto"
})
public class RespProgettoDTO {

    protected String cdProgetto;
    protected Long idAb;
    protected Long idProgetto;
    protected String nomeEsteso;
    protected String nomeProgetto;

    /**
     * Recupera il valore della proprietà cdProgetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdProgetto() {
        return cdProgetto;
    }

    /**
     * Imposta il valore della proprietà cdProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdProgetto(String value) {
        this.cdProgetto = value;
    }

    /**
     * Recupera il valore della proprietà idAb.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAb() {
        return idAb;
    }

    /**
     * Imposta il valore della proprietà idAb.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAb(Long value) {
        this.idAb = value;
    }

    /**
     * Recupera il valore della proprietà idProgetto.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdProgetto() {
        return idProgetto;
    }

    /**
     * Imposta il valore della proprietà idProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdProgetto(Long value) {
        this.idProgetto = value;
    }

    /**
     * Recupera il valore della proprietà nomeEsteso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEsteso() {
        return nomeEsteso;
    }

    /**
     * Imposta il valore della proprietà nomeEsteso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEsteso(String value) {
        this.nomeEsteso = value;
    }

    /**
     * Recupera il valore della proprietà nomeProgetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeProgetto() {
        return nomeProgetto;
    }

    /**
     * Imposta il valore della proprietà nomeProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeProgetto(String value) {
        this.nomeProgetto = value;
    }

}

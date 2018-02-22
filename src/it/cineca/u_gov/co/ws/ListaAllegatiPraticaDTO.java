
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per listaAllegatiPraticaDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="listaAllegatiPraticaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdTipoAllegato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsAllegato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsTipoDg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idDgAllegato" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nomeFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaAllegatiPraticaDTO", propOrder = {
    "cdTipoAllegato",
    "dsAllegato",
    "dsTipoDg",
    "idDg",
    "idDgAllegato",
    "nomeFile"
})
public class ListaAllegatiPraticaDTO {

    protected String cdTipoAllegato;
    protected String dsAllegato;
    protected String dsTipoDg;
    protected Long idDg;
    protected Long idDgAllegato;
    protected String nomeFile;

    /**
     * Recupera il valore della proprietà cdTipoAllegato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdTipoAllegato() {
        return cdTipoAllegato;
    }

    /**
     * Imposta il valore della proprietà cdTipoAllegato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdTipoAllegato(String value) {
        this.cdTipoAllegato = value;
    }

    /**
     * Recupera il valore della proprietà dsAllegato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsAllegato() {
        return dsAllegato;
    }

    /**
     * Imposta il valore della proprietà dsAllegato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsAllegato(String value) {
        this.dsAllegato = value;
    }

    /**
     * Recupera il valore della proprietà dsTipoDg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsTipoDg() {
        return dsTipoDg;
    }

    /**
     * Imposta il valore della proprietà dsTipoDg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsTipoDg(String value) {
        this.dsTipoDg = value;
    }

    /**
     * Recupera il valore della proprietà idDg.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDg() {
        return idDg;
    }

    /**
     * Imposta il valore della proprietà idDg.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDg(Long value) {
        this.idDg = value;
    }

    /**
     * Recupera il valore della proprietà idDgAllegato.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDgAllegato() {
        return idDgAllegato;
    }

    /**
     * Imposta il valore della proprietà idDgAllegato.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDgAllegato(Long value) {
        this.idDgAllegato = value;
    }

    /**
     * Recupera il valore della proprietà nomeFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFile() {
        return nomeFile;
    }

    /**
     * Imposta il valore della proprietà nomeFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFile(String value) {
        this.nomeFile = value;
    }

}

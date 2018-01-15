
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getElencoVociCoge complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getElencoVociCoge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cdUe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoAttivoPassivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCampoAttivita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceBeneServizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceTariffario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getElencoVociCoge", propOrder = {
    "esercizio",
    "cdUe",
    "tipoAttivoPassivo",
    "tipoCampoAttivita",
    "codiceBeneServizio",
    "codiceTariffario"
})
public class GetElencoVociCoge {

    protected Integer esercizio;
    protected String cdUe;
    protected String tipoAttivoPassivo;
    protected String tipoCampoAttivita;
    protected String codiceBeneServizio;
    protected String codiceTariffario;

    /**
     * Recupera il valore della proprietà esercizio.
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
     * Imposta il valore della proprietà esercizio.
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
     * Recupera il valore della proprietà cdUe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUe() {
        return cdUe;
    }

    /**
     * Imposta il valore della proprietà cdUe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUe(String value) {
        this.cdUe = value;
    }

    /**
     * Recupera il valore della proprietà tipoAttivoPassivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAttivoPassivo() {
        return tipoAttivoPassivo;
    }

    /**
     * Imposta il valore della proprietà tipoAttivoPassivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAttivoPassivo(String value) {
        this.tipoAttivoPassivo = value;
    }

    /**
     * Recupera il valore della proprietà tipoCampoAttivita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCampoAttivita() {
        return tipoCampoAttivita;
    }

    /**
     * Imposta il valore della proprietà tipoCampoAttivita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCampoAttivita(String value) {
        this.tipoCampoAttivita = value;
    }

    /**
     * Recupera il valore della proprietà codiceBeneServizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceBeneServizio() {
        return codiceBeneServizio;
    }

    /**
     * Imposta il valore della proprietà codiceBeneServizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceBeneServizio(String value) {
        this.codiceBeneServizio = value;
    }

    /**
     * Recupera il valore della proprietà codiceTariffario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceTariffario() {
        return codiceTariffario;
    }

    /**
     * Imposta il valore della proprietà codiceTariffario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceTariffario(String value) {
        this.codiceTariffario = value;
    }

}

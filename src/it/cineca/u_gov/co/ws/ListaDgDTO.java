
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per listaDgDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="listaDgDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dsDg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtDocRif" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtRegistrazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fornitore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="imponibile" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="iva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nomeTipoDg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numDocRif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numRegistrazione" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="progetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="richiedente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statoAutorizzazionePagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statoAvanzamentoRda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totale" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valutatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaDgDTO", propOrder = {
    "dsDg",
    "dtDocRif",
    "dtRegistrazione",
    "fornitore",
    "idDg",
    "imponibile",
    "iva",
    "nomeTipoDg",
    "numDocRif",
    "numRegistrazione",
    "progetto",
    "richiedente",
    "statoAutorizzazionePagamento",
    "statoAvanzamentoRda",
    "totale",
    "valutatore"
})
public class ListaDgDTO {

    protected String dsDg;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtDocRif;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtRegistrazione;
    protected String fornitore;
    protected Long idDg;
    protected BigDecimal imponibile;
    protected BigDecimal iva;
    protected String nomeTipoDg;
    protected String numDocRif;
    protected Long numRegistrazione;
    protected String progetto;
    protected String richiedente;
    protected String statoAutorizzazionePagamento;
    protected String statoAvanzamentoRda;
    protected BigDecimal totale;
    protected String valutatore;

    /**
     * Recupera il valore della propriet� dsDg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsDg() {
        return dsDg;
    }

    /**
     * Imposta il valore della propriet� dsDg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsDg(String value) {
        this.dsDg = value;
    }

    /**
     * Recupera il valore della propriet� dtDocRif.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtDocRif() {
        return dtDocRif;
    }

    /**
     * Imposta il valore della propriet� dtDocRif.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtDocRif(XMLGregorianCalendar value) {
        this.dtDocRif = value;
    }

    /**
     * Recupera il valore della propriet� dtRegistrazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtRegistrazione() {
        return dtRegistrazione;
    }

    /**
     * Imposta il valore della propriet� dtRegistrazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtRegistrazione(XMLGregorianCalendar value) {
        this.dtRegistrazione = value;
    }

    /**
     * Recupera il valore della propriet� fornitore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFornitore() {
        return fornitore;
    }

    /**
     * Imposta il valore della propriet� fornitore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFornitore(String value) {
        this.fornitore = value;
    }

    /**
     * Recupera il valore della propriet� idDg.
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
     * Imposta il valore della propriet� idDg.
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
     * Recupera il valore della propriet� imponibile.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImponibile() {
        return imponibile;
    }

    /**
     * Imposta il valore della propriet� imponibile.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImponibile(BigDecimal value) {
        this.imponibile = value;
    }

    /**
     * Recupera il valore della propriet� iva.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIva() {
        return iva;
    }

    /**
     * Imposta il valore della propriet� iva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIva(BigDecimal value) {
        this.iva = value;
    }

    /**
     * Recupera il valore della propriet� nomeTipoDg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeTipoDg() {
        return nomeTipoDg;
    }

    /**
     * Imposta il valore della propriet� nomeTipoDg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeTipoDg(String value) {
        this.nomeTipoDg = value;
    }

    /**
     * Recupera il valore della propriet� numDocRif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDocRif() {
        return numDocRif;
    }

    /**
     * Imposta il valore della propriet� numDocRif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDocRif(String value) {
        this.numDocRif = value;
    }

    /**
     * Recupera il valore della propriet� numRegistrazione.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumRegistrazione() {
        return numRegistrazione;
    }

    /**
     * Imposta il valore della propriet� numRegistrazione.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumRegistrazione(Long value) {
        this.numRegistrazione = value;
    }

    /**
     * Recupera il valore della propriet� progetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgetto() {
        return progetto;
    }

    /**
     * Imposta il valore della propriet� progetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgetto(String value) {
        this.progetto = value;
    }

    /**
     * Recupera il valore della propriet� richiedente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRichiedente() {
        return richiedente;
    }

    /**
     * Imposta il valore della propriet� richiedente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRichiedente(String value) {
        this.richiedente = value;
    }

    /**
     * Recupera il valore della propriet� statoAutorizzazionePagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoAutorizzazionePagamento() {
        return statoAutorizzazionePagamento;
    }

    /**
     * Imposta il valore della propriet� statoAutorizzazionePagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoAutorizzazionePagamento(String value) {
        this.statoAutorizzazionePagamento = value;
    }

    /**
     * Recupera il valore della propriet� statoAvanzamentoRda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoAvanzamentoRda() {
        return statoAvanzamentoRda;
    }

    /**
     * Imposta il valore della propriet� statoAvanzamentoRda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoAvanzamentoRda(String value) {
        this.statoAvanzamentoRda = value;
    }

    /**
     * Recupera il valore della propriet� totale.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotale() {
        return totale;
    }

    /**
     * Imposta il valore della propriet� totale.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotale(BigDecimal value) {
        this.totale = value;
    }

    /**
     * Recupera il valore della propriet� valutatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValutatore() {
        return valutatore;
    }

    /**
     * Imposta il valore della propriet� valutatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValutatore(String value) {
        this.valutatore = value;
    }

}


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
 *         &lt;element name="pagato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pagato",
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
    protected String pagato;
    protected String progetto;
    protected String richiedente;
    protected String statoAutorizzazionePagamento;
    protected String statoAvanzamentoRda;
    protected BigDecimal totale;
    protected String valutatore;

    /**
     * Recupera il valore della proprietÓ dsDg.
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
     * Imposta il valore della proprietÓ dsDg.
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
     * Recupera il valore della proprietÓ dtDocRif.
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
     * Imposta il valore della proprietÓ dtDocRif.
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
     * Recupera il valore della proprietÓ dtRegistrazione.
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
     * Imposta il valore della proprietÓ dtRegistrazione.
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
     * Recupera il valore della proprietÓ fornitore.
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
     * Imposta il valore della proprietÓ fornitore.
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
     * Recupera il valore della proprietÓ idDg.
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
     * Imposta il valore della proprietÓ idDg.
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
     * Recupera il valore della proprietÓ imponibile.
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
     * Imposta il valore della proprietÓ imponibile.
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
     * Recupera il valore della proprietÓ iva.
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
     * Imposta il valore della proprietÓ iva.
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
     * Recupera il valore della proprietÓ nomeTipoDg.
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
     * Imposta il valore della proprietÓ nomeTipoDg.
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
     * Recupera il valore della proprietÓ numDocRif.
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
     * Imposta il valore della proprietÓ numDocRif.
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
     * Recupera il valore della proprietÓ numRegistrazione.
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
     * Imposta il valore della proprietÓ numRegistrazione.
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
     * Recupera il valore della proprietÓ pagato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagato() {
        return pagato;
    }

    /**
     * Imposta il valore della proprietÓ pagato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagato(String value) {
        this.pagato = value;
    }

    /**
     * Recupera il valore della proprietÓ progetto.
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
     * Imposta il valore della proprietÓ progetto.
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
     * Recupera il valore della proprietÓ richiedente.
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
     * Imposta il valore della proprietÓ richiedente.
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
     * Recupera il valore della proprietÓ statoAutorizzazionePagamento.
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
     * Imposta il valore della proprietÓ statoAutorizzazionePagamento.
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
     * Recupera il valore della proprietÓ statoAvanzamentoRda.
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
     * Imposta il valore della proprietÓ statoAvanzamentoRda.
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
     * Recupera il valore della proprietÓ totale.
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
     * Imposta il valore della proprietÓ totale.
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
     * Recupera il valore della proprietÓ valutatore.
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
     * Imposta il valore della proprietÓ valutatore.
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

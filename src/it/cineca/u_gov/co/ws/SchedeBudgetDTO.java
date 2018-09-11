
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per schedeBudgetDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="schedeBudgetDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdAttivita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdDettaglio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdObiettivoStrategico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdScheda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdVoceCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsAttivita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsObiettivoStrategico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsUa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsVoceCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flNonDefinito" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="importo1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="importo2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="importo3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="motivazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeDettaglio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeScheda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schedeBudgetDTO", propOrder = {
    "cdAttivita",
    "cdDettaglio",
    "cdObiettivoStrategico",
    "cdProgetto",
    "cdScheda",
    "cdUa",
    "cdVoceCoan",
    "dsAttivita",
    "dsObiettivoStrategico",
    "dsProgetto",
    "dsUa",
    "dsVoceCoan",
    "flNonDefinito",
    "importo1",
    "importo2",
    "importo3",
    "motivazione",
    "nomeDettaglio",
    "nomeScheda",
    "note"
})
public class SchedeBudgetDTO {

    protected String cdAttivita;
    protected String cdDettaglio;
    protected String cdObiettivoStrategico;
    protected String cdProgetto;
    protected String cdScheda;
    protected String cdUa;
    protected String cdVoceCoan;
    protected String dsAttivita;
    protected String dsObiettivoStrategico;
    protected String dsProgetto;
    protected String dsUa;
    protected String dsVoceCoan;
    protected Boolean flNonDefinito;
    protected BigDecimal importo1;
    protected BigDecimal importo2;
    protected BigDecimal importo3;
    protected String motivazione;
    protected String nomeDettaglio;
    protected String nomeScheda;
    protected String note;

    /**
     * Recupera il valore della proprietà cdAttivita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdAttivita() {
        return cdAttivita;
    }

    /**
     * Imposta il valore della proprietà cdAttivita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdAttivita(String value) {
        this.cdAttivita = value;
    }

    /**
     * Recupera il valore della proprietà cdDettaglio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdDettaglio() {
        return cdDettaglio;
    }

    /**
     * Imposta il valore della proprietà cdDettaglio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdDettaglio(String value) {
        this.cdDettaglio = value;
    }

    /**
     * Recupera il valore della proprietà cdObiettivoStrategico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdObiettivoStrategico() {
        return cdObiettivoStrategico;
    }

    /**
     * Imposta il valore della proprietà cdObiettivoStrategico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdObiettivoStrategico(String value) {
        this.cdObiettivoStrategico = value;
    }

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
     * Recupera il valore della proprietà cdScheda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdScheda() {
        return cdScheda;
    }

    /**
     * Imposta il valore della proprietà cdScheda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdScheda(String value) {
        this.cdScheda = value;
    }

    /**
     * Recupera il valore della proprietà cdUa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUa() {
        return cdUa;
    }

    /**
     * Imposta il valore della proprietà cdUa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUa(String value) {
        this.cdUa = value;
    }

    /**
     * Recupera il valore della proprietà cdVoceCoan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdVoceCoan() {
        return cdVoceCoan;
    }

    /**
     * Imposta il valore della proprietà cdVoceCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdVoceCoan(String value) {
        this.cdVoceCoan = value;
    }

    /**
     * Recupera il valore della proprietà dsAttivita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsAttivita() {
        return dsAttivita;
    }

    /**
     * Imposta il valore della proprietà dsAttivita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsAttivita(String value) {
        this.dsAttivita = value;
    }

    /**
     * Recupera il valore della proprietà dsObiettivoStrategico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsObiettivoStrategico() {
        return dsObiettivoStrategico;
    }

    /**
     * Imposta il valore della proprietà dsObiettivoStrategico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsObiettivoStrategico(String value) {
        this.dsObiettivoStrategico = value;
    }

    /**
     * Recupera il valore della proprietà dsProgetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsProgetto() {
        return dsProgetto;
    }

    /**
     * Imposta il valore della proprietà dsProgetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsProgetto(String value) {
        this.dsProgetto = value;
    }

    /**
     * Recupera il valore della proprietà dsUa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsUa() {
        return dsUa;
    }

    /**
     * Imposta il valore della proprietà dsUa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsUa(String value) {
        this.dsUa = value;
    }

    /**
     * Recupera il valore della proprietà dsVoceCoan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsVoceCoan() {
        return dsVoceCoan;
    }

    /**
     * Imposta il valore della proprietà dsVoceCoan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsVoceCoan(String value) {
        this.dsVoceCoan = value;
    }

    /**
     * Recupera il valore della proprietà flNonDefinito.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlNonDefinito() {
        return flNonDefinito;
    }

    /**
     * Imposta il valore della proprietà flNonDefinito.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlNonDefinito(Boolean value) {
        this.flNonDefinito = value;
    }

    /**
     * Recupera il valore della proprietà importo1.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporto1() {
        return importo1;
    }

    /**
     * Imposta il valore della proprietà importo1.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporto1(BigDecimal value) {
        this.importo1 = value;
    }

    /**
     * Recupera il valore della proprietà importo2.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporto2() {
        return importo2;
    }

    /**
     * Imposta il valore della proprietà importo2.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporto2(BigDecimal value) {
        this.importo2 = value;
    }

    /**
     * Recupera il valore della proprietà importo3.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporto3() {
        return importo3;
    }

    /**
     * Imposta il valore della proprietà importo3.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporto3(BigDecimal value) {
        this.importo3 = value;
    }

    /**
     * Recupera il valore della proprietà motivazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivazione() {
        return motivazione;
    }

    /**
     * Imposta il valore della proprietà motivazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivazione(String value) {
        this.motivazione = value;
    }

    /**
     * Recupera il valore della proprietà nomeDettaglio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeDettaglio() {
        return nomeDettaglio;
    }

    /**
     * Imposta il valore della proprietà nomeDettaglio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeDettaglio(String value) {
        this.nomeDettaglio = value;
    }

    /**
     * Recupera il valore della proprietà nomeScheda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeScheda() {
        return nomeScheda;
    }

    /**
     * Imposta il valore della proprietà nomeScheda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeScheda(String value) {
        this.nomeScheda = value;
    }

    /**
     * Recupera il valore della proprietà note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Imposta il valore della proprietà note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}

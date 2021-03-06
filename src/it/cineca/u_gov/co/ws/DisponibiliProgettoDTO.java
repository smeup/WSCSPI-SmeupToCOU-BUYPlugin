
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per disponibiliProgettoDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="disponibiliProgettoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdProgetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdVoceCoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disponibileEsercizioCosto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="disponibileEsercizioRicavo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="disponibilePluriCosto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="disponibilePluriRicavo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="disponibileTotaleCosto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="disponibileTotaleRicavo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="previsioneDefinitivaEsercizioCosto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="previsioneDefinitivaEsercizioRicavo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="previsioneDefinitivaPluriCosto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="previsioneDefinitivaPluriRicavo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="previsioneDefinitivaTotaleCosto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="previsioneDefinitivaTotaleRicavo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totScrAutEsercizioCosto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totScrAutEsercizioRicavo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totScrAutPluriCosto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totScrAutPluriRicavo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totScrAutTotaleCosto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totScrAutTotaleRicavo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disponibiliProgettoDTO", propOrder = {
    "cdProgetto",
    "cdUa",
    "cdVoceCoan",
    "disponibileEsercizioCosto",
    "disponibileEsercizioRicavo",
    "disponibilePluriCosto",
    "disponibilePluriRicavo",
    "disponibileTotaleCosto",
    "disponibileTotaleRicavo",
    "esercizio",
    "previsioneDefinitivaEsercizioCosto",
    "previsioneDefinitivaEsercizioRicavo",
    "previsioneDefinitivaPluriCosto",
    "previsioneDefinitivaPluriRicavo",
    "previsioneDefinitivaTotaleCosto",
    "previsioneDefinitivaTotaleRicavo",
    "totScrAutEsercizioCosto",
    "totScrAutEsercizioRicavo",
    "totScrAutPluriCosto",
    "totScrAutPluriRicavo",
    "totScrAutTotaleCosto",
    "totScrAutTotaleRicavo"
})
public class DisponibiliProgettoDTO {

    protected String cdProgetto;
    protected String cdUa;
    protected String cdVoceCoan;
    protected BigDecimal disponibileEsercizioCosto;
    protected BigDecimal disponibileEsercizioRicavo;
    protected BigDecimal disponibilePluriCosto;
    protected BigDecimal disponibilePluriRicavo;
    protected BigDecimal disponibileTotaleCosto;
    protected BigDecimal disponibileTotaleRicavo;
    protected Integer esercizio;
    protected BigDecimal previsioneDefinitivaEsercizioCosto;
    protected BigDecimal previsioneDefinitivaEsercizioRicavo;
    protected BigDecimal previsioneDefinitivaPluriCosto;
    protected BigDecimal previsioneDefinitivaPluriRicavo;
    protected BigDecimal previsioneDefinitivaTotaleCosto;
    protected BigDecimal previsioneDefinitivaTotaleRicavo;
    protected BigDecimal totScrAutEsercizioCosto;
    protected BigDecimal totScrAutEsercizioRicavo;
    protected BigDecimal totScrAutPluriCosto;
    protected BigDecimal totScrAutPluriRicavo;
    protected BigDecimal totScrAutTotaleCosto;
    protected BigDecimal totScrAutTotaleRicavo;

    /**
     * Recupera il valore della proprietÓ cdProgetto.
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
     * Imposta il valore della proprietÓ cdProgetto.
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
     * Recupera il valore della proprietÓ cdUa.
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
     * Imposta il valore della proprietÓ cdUa.
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
     * Recupera il valore della proprietÓ cdVoceCoan.
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
     * Imposta il valore della proprietÓ cdVoceCoan.
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
     * Recupera il valore della proprietÓ disponibileEsercizioCosto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisponibileEsercizioCosto() {
        return disponibileEsercizioCosto;
    }

    /**
     * Imposta il valore della proprietÓ disponibileEsercizioCosto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisponibileEsercizioCosto(BigDecimal value) {
        this.disponibileEsercizioCosto = value;
    }

    /**
     * Recupera il valore della proprietÓ disponibileEsercizioRicavo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisponibileEsercizioRicavo() {
        return disponibileEsercizioRicavo;
    }

    /**
     * Imposta il valore della proprietÓ disponibileEsercizioRicavo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisponibileEsercizioRicavo(BigDecimal value) {
        this.disponibileEsercizioRicavo = value;
    }

    /**
     * Recupera il valore della proprietÓ disponibilePluriCosto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisponibilePluriCosto() {
        return disponibilePluriCosto;
    }

    /**
     * Imposta il valore della proprietÓ disponibilePluriCosto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisponibilePluriCosto(BigDecimal value) {
        this.disponibilePluriCosto = value;
    }

    /**
     * Recupera il valore della proprietÓ disponibilePluriRicavo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisponibilePluriRicavo() {
        return disponibilePluriRicavo;
    }

    /**
     * Imposta il valore della proprietÓ disponibilePluriRicavo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisponibilePluriRicavo(BigDecimal value) {
        this.disponibilePluriRicavo = value;
    }

    /**
     * Recupera il valore della proprietÓ disponibileTotaleCosto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisponibileTotaleCosto() {
        return disponibileTotaleCosto;
    }

    /**
     * Imposta il valore della proprietÓ disponibileTotaleCosto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisponibileTotaleCosto(BigDecimal value) {
        this.disponibileTotaleCosto = value;
    }

    /**
     * Recupera il valore della proprietÓ disponibileTotaleRicavo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisponibileTotaleRicavo() {
        return disponibileTotaleRicavo;
    }

    /**
     * Imposta il valore della proprietÓ disponibileTotaleRicavo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisponibileTotaleRicavo(BigDecimal value) {
        this.disponibileTotaleRicavo = value;
    }

    /**
     * Recupera il valore della proprietÓ esercizio.
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
     * Imposta il valore della proprietÓ esercizio.
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
     * Recupera il valore della proprietÓ previsioneDefinitivaEsercizioCosto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrevisioneDefinitivaEsercizioCosto() {
        return previsioneDefinitivaEsercizioCosto;
    }

    /**
     * Imposta il valore della proprietÓ previsioneDefinitivaEsercizioCosto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrevisioneDefinitivaEsercizioCosto(BigDecimal value) {
        this.previsioneDefinitivaEsercizioCosto = value;
    }

    /**
     * Recupera il valore della proprietÓ previsioneDefinitivaEsercizioRicavo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrevisioneDefinitivaEsercizioRicavo() {
        return previsioneDefinitivaEsercizioRicavo;
    }

    /**
     * Imposta il valore della proprietÓ previsioneDefinitivaEsercizioRicavo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrevisioneDefinitivaEsercizioRicavo(BigDecimal value) {
        this.previsioneDefinitivaEsercizioRicavo = value;
    }

    /**
     * Recupera il valore della proprietÓ previsioneDefinitivaPluriCosto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrevisioneDefinitivaPluriCosto() {
        return previsioneDefinitivaPluriCosto;
    }

    /**
     * Imposta il valore della proprietÓ previsioneDefinitivaPluriCosto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrevisioneDefinitivaPluriCosto(BigDecimal value) {
        this.previsioneDefinitivaPluriCosto = value;
    }

    /**
     * Recupera il valore della proprietÓ previsioneDefinitivaPluriRicavo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrevisioneDefinitivaPluriRicavo() {
        return previsioneDefinitivaPluriRicavo;
    }

    /**
     * Imposta il valore della proprietÓ previsioneDefinitivaPluriRicavo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrevisioneDefinitivaPluriRicavo(BigDecimal value) {
        this.previsioneDefinitivaPluriRicavo = value;
    }

    /**
     * Recupera il valore della proprietÓ previsioneDefinitivaTotaleCosto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrevisioneDefinitivaTotaleCosto() {
        return previsioneDefinitivaTotaleCosto;
    }

    /**
     * Imposta il valore della proprietÓ previsioneDefinitivaTotaleCosto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrevisioneDefinitivaTotaleCosto(BigDecimal value) {
        this.previsioneDefinitivaTotaleCosto = value;
    }

    /**
     * Recupera il valore della proprietÓ previsioneDefinitivaTotaleRicavo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrevisioneDefinitivaTotaleRicavo() {
        return previsioneDefinitivaTotaleRicavo;
    }

    /**
     * Imposta il valore della proprietÓ previsioneDefinitivaTotaleRicavo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrevisioneDefinitivaTotaleRicavo(BigDecimal value) {
        this.previsioneDefinitivaTotaleRicavo = value;
    }

    /**
     * Recupera il valore della proprietÓ totScrAutEsercizioCosto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotScrAutEsercizioCosto() {
        return totScrAutEsercizioCosto;
    }

    /**
     * Imposta il valore della proprietÓ totScrAutEsercizioCosto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotScrAutEsercizioCosto(BigDecimal value) {
        this.totScrAutEsercizioCosto = value;
    }

    /**
     * Recupera il valore della proprietÓ totScrAutEsercizioRicavo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotScrAutEsercizioRicavo() {
        return totScrAutEsercizioRicavo;
    }

    /**
     * Imposta il valore della proprietÓ totScrAutEsercizioRicavo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotScrAutEsercizioRicavo(BigDecimal value) {
        this.totScrAutEsercizioRicavo = value;
    }

    /**
     * Recupera il valore della proprietÓ totScrAutPluriCosto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotScrAutPluriCosto() {
        return totScrAutPluriCosto;
    }

    /**
     * Imposta il valore della proprietÓ totScrAutPluriCosto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotScrAutPluriCosto(BigDecimal value) {
        this.totScrAutPluriCosto = value;
    }

    /**
     * Recupera il valore della proprietÓ totScrAutPluriRicavo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotScrAutPluriRicavo() {
        return totScrAutPluriRicavo;
    }

    /**
     * Imposta il valore della proprietÓ totScrAutPluriRicavo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotScrAutPluriRicavo(BigDecimal value) {
        this.totScrAutPluriRicavo = value;
    }

    /**
     * Recupera il valore della proprietÓ totScrAutTotaleCosto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotScrAutTotaleCosto() {
        return totScrAutTotaleCosto;
    }

    /**
     * Imposta il valore della proprietÓ totScrAutTotaleCosto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotScrAutTotaleCosto(BigDecimal value) {
        this.totScrAutTotaleCosto = value;
    }

    /**
     * Recupera il valore della proprietÓ totScrAutTotaleRicavo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotScrAutTotaleRicavo() {
        return totScrAutTotaleRicavo;
    }

    /**
     * Imposta il valore della proprietÓ totScrAutTotaleRicavo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotScrAutTotaleRicavo(BigDecimal value) {
        this.totScrAutTotaleRicavo = value;
    }

}

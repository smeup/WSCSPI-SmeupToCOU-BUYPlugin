
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for disponibileBudgetDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="disponibileBudgetDTO">
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
 *         &lt;element name="flDisponibilita" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "disponibileBudgetDTO", propOrder = {
    "cdProgetto",
    "cdUa",
    "cdVoceCoan",
    "disponibileEsercizioCosto",
    "disponibileEsercizioRicavo",
    "disponibilePluriCosto",
    "disponibilePluriRicavo",
    "disponibileTotaleCosto",
    "disponibileTotaleRicavo",
    "flDisponibilita",
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
public class DisponibileBudgetDTO {

    protected String cdProgetto;
    protected String cdUa;
    protected String cdVoceCoan;
    protected BigDecimal disponibileEsercizioCosto;
    protected BigDecimal disponibileEsercizioRicavo;
    protected BigDecimal disponibilePluriCosto;
    protected BigDecimal disponibilePluriRicavo;
    protected BigDecimal disponibileTotaleCosto;
    protected BigDecimal disponibileTotaleRicavo;
    protected Boolean flDisponibilita;
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
     * Gets the value of the cdProgetto property.
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
     * Sets the value of the cdProgetto property.
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
     * Gets the value of the cdUa property.
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
     * Sets the value of the cdUa property.
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
     * Gets the value of the cdVoceCoan property.
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
     * Sets the value of the cdVoceCoan property.
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
     * Gets the value of the disponibileEsercizioCosto property.
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
     * Sets the value of the disponibileEsercizioCosto property.
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
     * Gets the value of the disponibileEsercizioRicavo property.
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
     * Sets the value of the disponibileEsercizioRicavo property.
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
     * Gets the value of the disponibilePluriCosto property.
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
     * Sets the value of the disponibilePluriCosto property.
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
     * Gets the value of the disponibilePluriRicavo property.
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
     * Sets the value of the disponibilePluriRicavo property.
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
     * Gets the value of the disponibileTotaleCosto property.
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
     * Sets the value of the disponibileTotaleCosto property.
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
     * Gets the value of the disponibileTotaleRicavo property.
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
     * Sets the value of the disponibileTotaleRicavo property.
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
     * Gets the value of the flDisponibilita property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlDisponibilita() {
        return flDisponibilita;
    }

    /**
     * Sets the value of the flDisponibilita property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlDisponibilita(Boolean value) {
        this.flDisponibilita = value;
    }

    /**
     * Gets the value of the previsioneDefinitivaEsercizioCosto property.
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
     * Sets the value of the previsioneDefinitivaEsercizioCosto property.
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
     * Gets the value of the previsioneDefinitivaEsercizioRicavo property.
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
     * Sets the value of the previsioneDefinitivaEsercizioRicavo property.
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
     * Gets the value of the previsioneDefinitivaPluriCosto property.
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
     * Sets the value of the previsioneDefinitivaPluriCosto property.
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
     * Gets the value of the previsioneDefinitivaPluriRicavo property.
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
     * Sets the value of the previsioneDefinitivaPluriRicavo property.
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
     * Gets the value of the previsioneDefinitivaTotaleCosto property.
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
     * Sets the value of the previsioneDefinitivaTotaleCosto property.
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
     * Gets the value of the previsioneDefinitivaTotaleRicavo property.
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
     * Sets the value of the previsioneDefinitivaTotaleRicavo property.
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
     * Gets the value of the totScrAutEsercizioCosto property.
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
     * Sets the value of the totScrAutEsercizioCosto property.
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
     * Gets the value of the totScrAutEsercizioRicavo property.
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
     * Sets the value of the totScrAutEsercizioRicavo property.
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
     * Gets the value of the totScrAutPluriCosto property.
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
     * Sets the value of the totScrAutPluriCosto property.
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
     * Gets the value of the totScrAutPluriRicavo property.
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
     * Sets the value of the totScrAutPluriRicavo property.
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
     * Gets the value of the totScrAutTotaleCosto property.
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
     * Sets the value of the totScrAutTotaleCosto property.
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
     * Gets the value of the totScrAutTotaleRicavo property.
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
     * Sets the value of the totScrAutTotaleRicavo property.
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


package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ueDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ueDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amministrazioneCentrale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="autonomia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cdUe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codiceUo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denominazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="riferimento" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ueDTO", propOrder = {
    "amministrazioneCentrale",
    "autonomia",
    "cdUe",
    "codiceUo",
    "denominazione",
    "esercizio",
    "riferimento"
})
public class UeDTO {

    protected Boolean amministrazioneCentrale;
    protected Boolean autonomia;
    protected String cdUe;
    protected String codiceUo;
    protected String denominazione;
    protected Integer esercizio;
    protected Boolean riferimento;

    /**
     * Recupera il valore della propriet� amministrazioneCentrale.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAmministrazioneCentrale() {
        return amministrazioneCentrale;
    }

    /**
     * Imposta il valore della propriet� amministrazioneCentrale.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAmministrazioneCentrale(Boolean value) {
        this.amministrazioneCentrale = value;
    }

    /**
     * Recupera il valore della propriet� autonomia.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutonomia() {
        return autonomia;
    }

    /**
     * Imposta il valore della propriet� autonomia.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutonomia(Boolean value) {
        this.autonomia = value;
    }

    /**
     * Recupera il valore della propriet� cdUe.
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
     * Imposta il valore della propriet� cdUe.
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
     * Recupera il valore della propriet� codiceUo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceUo() {
        return codiceUo;
    }

    /**
     * Imposta il valore della propriet� codiceUo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceUo(String value) {
        this.codiceUo = value;
    }

    /**
     * Recupera il valore della propriet� denominazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominazione() {
        return denominazione;
    }

    /**
     * Imposta il valore della propriet� denominazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominazione(String value) {
        this.denominazione = value;
    }

    /**
     * Recupera il valore della propriet� esercizio.
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
     * Imposta il valore della propriet� esercizio.
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
     * Recupera il valore della propriet� riferimento.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRiferimento() {
        return riferimento;
    }

    /**
     * Imposta il valore della propriet� riferimento.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRiferimento(Boolean value) {
        this.riferimento = value;
    }

}

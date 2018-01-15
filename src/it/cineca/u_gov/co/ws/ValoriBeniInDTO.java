
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per valoriBeniInDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="valoriBeniInDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdInvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idInventarioBeni" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pgBene" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pgBeneSub" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valoriBeniInDTO", propOrder = {
    "cdInvent",
    "idInventarioBeni",
    "pgBene",
    "pgBeneSub"
})
public class ValoriBeniInDTO {

    protected String cdInvent;
    protected Long idInventarioBeni;
    protected Long pgBene;
    protected Integer pgBeneSub;

    /**
     * Recupera il valore della proprietà cdInvent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdInvent() {
        return cdInvent;
    }

    /**
     * Imposta il valore della proprietà cdInvent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdInvent(String value) {
        this.cdInvent = value;
    }

    /**
     * Recupera il valore della proprietà idInventarioBeni.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdInventarioBeni() {
        return idInventarioBeni;
    }

    /**
     * Imposta il valore della proprietà idInventarioBeni.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdInventarioBeni(Long value) {
        this.idInventarioBeni = value;
    }

    /**
     * Recupera il valore della proprietà pgBene.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPgBene() {
        return pgBene;
    }

    /**
     * Imposta il valore della proprietà pgBene.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPgBene(Long value) {
        this.pgBene = value;
    }

    /**
     * Recupera il valore della proprietà pgBeneSub.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPgBeneSub() {
        return pgBeneSub;
    }

    /**
     * Imposta il valore della proprietà pgBeneSub.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPgBeneSub(Integer value) {
        this.pgBeneSub = value;
    }

}

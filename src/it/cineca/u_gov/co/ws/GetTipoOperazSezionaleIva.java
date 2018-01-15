
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per getTipoOperazSezionaleIva complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getTipoOperazSezionaleIva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tiCampoAttivita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAbSogg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="partIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codFis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ragioneSoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtReg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cdUO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="percIva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTipoOperazSezionaleIva", propOrder = {
    "tiCampoAttivita",
    "idAbSogg",
    "partIva",
    "codFis",
    "ragioneSoc",
    "dtReg",
    "cdUO",
    "percIva"
})
public class GetTipoOperazSezionaleIva {

    protected String tiCampoAttivita;
    protected Long idAbSogg;
    protected String partIva;
    protected String codFis;
    protected String ragioneSoc;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtReg;
    protected String cdUO;
    protected BigDecimal percIva;

    /**
     * Recupera il valore della proprietà tiCampoAttivita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiCampoAttivita() {
        return tiCampoAttivita;
    }

    /**
     * Imposta il valore della proprietà tiCampoAttivita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiCampoAttivita(String value) {
        this.tiCampoAttivita = value;
    }

    /**
     * Recupera il valore della proprietà idAbSogg.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAbSogg() {
        return idAbSogg;
    }

    /**
     * Imposta il valore della proprietà idAbSogg.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAbSogg(Long value) {
        this.idAbSogg = value;
    }

    /**
     * Recupera il valore della proprietà partIva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartIva() {
        return partIva;
    }

    /**
     * Imposta il valore della proprietà partIva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartIva(String value) {
        this.partIva = value;
    }

    /**
     * Recupera il valore della proprietà codFis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodFis() {
        return codFis;
    }

    /**
     * Imposta il valore della proprietà codFis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodFis(String value) {
        this.codFis = value;
    }

    /**
     * Recupera il valore della proprietà ragioneSoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRagioneSoc() {
        return ragioneSoc;
    }

    /**
     * Imposta il valore della proprietà ragioneSoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRagioneSoc(String value) {
        this.ragioneSoc = value;
    }

    /**
     * Recupera il valore della proprietà dtReg.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtReg() {
        return dtReg;
    }

    /**
     * Imposta il valore della proprietà dtReg.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtReg(XMLGregorianCalendar value) {
        this.dtReg = value;
    }

    /**
     * Recupera il valore della proprietà cdUO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUO() {
        return cdUO;
    }

    /**
     * Imposta il valore della proprietà cdUO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUO(String value) {
        this.cdUO = value;
    }

    /**
     * Recupera il valore della proprietà percIva.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercIva() {
        return percIva;
    }

    /**
     * Imposta il valore della proprietà percIva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercIva(BigDecimal value) {
        this.percIva = value;
    }

}

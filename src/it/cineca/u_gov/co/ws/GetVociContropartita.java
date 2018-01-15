
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getVociContropartita complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getVociContropartita">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esercizio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tiAttivoPassivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAb" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVociContropartita", propOrder = {
    "esercizio",
    "tiAttivoPassivo",
    "idAb"
})
public class GetVociContropartita {

    protected Integer esercizio;
    protected String tiAttivoPassivo;
    protected Long idAb;

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
     * Recupera il valore della proprietà tiAttivoPassivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiAttivoPassivo() {
        return tiAttivoPassivo;
    }

    /**
     * Imposta il valore della proprietà tiAttivoPassivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiAttivoPassivo(String value) {
        this.tiAttivoPassivo = value;
    }

    /**
     * Recupera il valore della proprietà idAb.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAb() {
        return idAb;
    }

    /**
     * Imposta il valore della proprietà idAb.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAb(Long value) {
        this.idAb = value;
    }

}

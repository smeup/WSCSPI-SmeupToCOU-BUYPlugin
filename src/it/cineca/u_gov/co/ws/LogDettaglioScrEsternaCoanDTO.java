
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per logDettaglioScrEsternaCoanDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="logDettaglioScrEsternaCoanDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ammontareDet" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="idScrCoanDet" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pgDetScr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logDettaglioScrEsternaCoanDTO", propOrder = {
    "ammontareDet",
    "idScrCoanDet",
    "pgDetScr"
})
public class LogDettaglioScrEsternaCoanDTO {

    protected BigDecimal ammontareDet;
    protected Long idScrCoanDet;
    protected Long pgDetScr;

    /**
     * Recupera il valore della proprietà ammontareDet.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmontareDet() {
        return ammontareDet;
    }

    /**
     * Imposta il valore della proprietà ammontareDet.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmontareDet(BigDecimal value) {
        this.ammontareDet = value;
    }

    /**
     * Recupera il valore della proprietà idScrCoanDet.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdScrCoanDet() {
        return idScrCoanDet;
    }

    /**
     * Imposta il valore della proprietà idScrCoanDet.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdScrCoanDet(Long value) {
        this.idScrCoanDet = value;
    }

    /**
     * Recupera il valore della proprietà pgDetScr.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPgDetScr() {
        return pgDetScr;
    }

    /**
     * Imposta il valore della proprietà pgDetScr.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPgDetScr(Long value) {
        this.pgDetScr = value;
    }

}

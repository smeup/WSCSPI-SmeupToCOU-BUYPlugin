
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per totScrAutSchBudDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="totScrAutSchBudDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSchedaBudget" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totScrittureAut" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "totScrAutSchBudDTO", propOrder = {
    "idSchedaBudget",
    "totScrittureAut"
})
public class TotScrAutSchBudDTO {

    protected Long idSchedaBudget;
    protected BigDecimal totScrittureAut;

    /**
     * Recupera il valore della proprietà idSchedaBudget.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdSchedaBudget() {
        return idSchedaBudget;
    }

    /**
     * Imposta il valore della proprietà idSchedaBudget.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdSchedaBudget(Long value) {
        this.idSchedaBudget = value;
    }

    /**
     * Recupera il valore della proprietà totScrittureAut.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotScrittureAut() {
        return totScrittureAut;
    }

    /**
     * Imposta il valore della proprietà totScrittureAut.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotScrittureAut(BigDecimal value) {
        this.totScrittureAut = value;
    }

}

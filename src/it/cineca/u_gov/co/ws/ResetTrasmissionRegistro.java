
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per resetTrasmissionRegistro complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="resetTrasmissionRegistro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idRegistro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resetTrasmissionRegistro", propOrder = {
    "idRegistro"
})
public class ResetTrasmissionRegistro {

    protected Long idRegistro;

    /**
     * Recupera il valore della proprietà idRegistro.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdRegistro() {
        return idRegistro;
    }

    /**
     * Imposta il valore della proprietà idRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdRegistro(Long value) {
        this.idRegistro = value;
    }

}


package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tipiFattura.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipiFattura">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NN"/>
 *     &lt;enumeration value="FT"/>
 *     &lt;enumeration value="NC"/>
 *     &lt;enumeration value="ND"/>
 *     &lt;enumeration value="CR"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="DA"/>
 *     &lt;enumeration value="PF"/>
 *     &lt;enumeration value="AU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipiFattura")
@XmlEnum
public enum TipiFattura {

    NN,
    FT,
    NC,
    ND,
    CR,
    CA,
    DA,
    PF,
    AU;

    public String value() {
        return name();
    }

    public static TipiFattura fromValue(String v) {
        return valueOf(v);
    }

}

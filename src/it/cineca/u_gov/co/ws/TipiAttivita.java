
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipiAttivita.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipiAttivita">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="P"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipiAttivita")
@XmlEnum
public enum TipiAttivita {

    C,
    I,
    P;

    public String value() {
        return name();
    }

    public static TipiAttivita fromValue(String v) {
        return valueOf(v);
    }

}

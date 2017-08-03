
package it.cineca.u_gov.co.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipiAttivoPassivo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipiAttivoPassivo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="P"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipiAttivoPassivo")
@XmlEnum
public enum TipiAttivoPassivo {

    A,
    P;

    public String value() {
        return name();
    }

    public static TipiAttivoPassivo fromValue(String v) {
        return valueOf(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.11 at 09:49:02 AM CEST 
//


package sk.sepa.schema.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemittanceLocationMethod2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RemittanceLocationMethod2Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FAXI"/>
 *     &lt;enumeration value="EDIC"/>
 *     &lt;enumeration value="URID"/>
 *     &lt;enumeration value="EMAL"/>
 *     &lt;enumeration value="POST"/>
 *     &lt;enumeration value="SMSM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RemittanceLocationMethod2Code")
@XmlEnum
public enum RemittanceLocationMethod2Code {

    FAXI,
    EDIC,
    URID,
    EMAL,
    POST,
    SMSM;

    public String value() {
        return name();
    }

    public static RemittanceLocationMethod2Code fromValue(String v) {
        return valueOf(v);
    }

}

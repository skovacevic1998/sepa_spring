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
 * <p>Java class for ChequeType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChequeType2Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CCHQ"/>
 *     &lt;enumeration value="CCCH"/>
 *     &lt;enumeration value="BCHQ"/>
 *     &lt;enumeration value="DRFT"/>
 *     &lt;enumeration value="ELDR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChequeType2Code")
@XmlEnum
public enum ChequeType2Code {

    CCHQ,
    CCCH,
    BCHQ,
    DRFT,
    ELDR;

    public String value() {
        return name();
    }

    public static ChequeType2Code fromValue(String v) {
        return valueOf(v);
    }

}

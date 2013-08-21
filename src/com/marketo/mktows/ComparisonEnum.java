
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComparisonEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComparisonEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQ"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="LE"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="GE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ComparisonEnum")
@XmlEnum
public enum ComparisonEnum {

    EQ,
    NE,
    LT,
    LE,
    GT,
    GE;

    public String value() {
        return name();
    }

    public static ComparisonEnum fromValue(String v) {
        return valueOf(v);
    }

}

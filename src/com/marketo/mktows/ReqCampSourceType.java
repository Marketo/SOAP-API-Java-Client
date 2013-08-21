
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReqCampSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReqCampSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MKTOWS"/>
 *     &lt;enumeration value="SALES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReqCampSourceType")
@XmlEnum
public enum ReqCampSourceType {

    MKTOWS,
    SALES;

    public String value() {
        return name();
    }

    public static ReqCampSourceType fromValue(String v) {
        return valueOf(v);
    }

}

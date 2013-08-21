
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOperationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListOperationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADDTOLIST"/>
 *     &lt;enumeration value="CLEARLIST"/>
 *     &lt;enumeration value="ISMEMBEROFLIST"/>
 *     &lt;enumeration value="REMOVEFROMLIST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListOperationType")
@XmlEnum
public enum ListOperationType {

    ADDTOLIST,
    CLEARLIST,
    ISMEMBEROFLIST,
    REMOVEFROMLIST;

    public String value() {
        return name();
    }

    public static ListOperationType fromValue(String v) {
        return valueOf(v);
    }

}

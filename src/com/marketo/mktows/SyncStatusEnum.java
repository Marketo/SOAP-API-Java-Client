
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SyncStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATED"/>
 *     &lt;enumeration value="UPDATED"/>
 *     &lt;enumeration value="DELETED"/>
 *     &lt;enumeration value="FAILED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SyncStatusEnum")
@XmlEnum
public enum SyncStatusEnum {

    CREATED,
    UPDATED,
    DELETED,
    FAILED;

    public String value() {
        return name();
    }

    public static SyncStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}

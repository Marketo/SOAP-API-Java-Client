
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncOperationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SyncOperationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UPSERT"/>
 *     &lt;enumeration value="INSERT"/>
 *     &lt;enumeration value="UPDATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SyncOperationEnum")
@XmlEnum
public enum SyncOperationEnum {

    UPSERT,
    INSERT,
    UPDATE;

    public String value() {
        return name();
    }

    public static SyncOperationEnum fromValue(String v) {
        return valueOf(v);
    }

}

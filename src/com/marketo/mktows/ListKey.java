
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keyType" type="{http://www.marketo.com/mktows/}ListKeyType"/>
 *         &lt;element name="keyValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListKey", propOrder = {
    "keyType",
    "keyValue"
})
public class ListKey {

    @XmlElement(required = true)
    protected ListKeyType keyType;
    @XmlElement(required = true)
    protected String keyValue;

    /**
     * Gets the value of the keyType property.
     * 
     * @return
     *     possible object is
     *     {@link ListKeyType }
     *     
     */
    public ListKeyType getKeyType() {
        return keyType;
    }

    /**
     * Sets the value of the keyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListKeyType }
     *     
     */
    public void setKeyType(ListKeyType value) {
        this.keyType = value;
    }

    /**
     * Gets the value of the keyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyValue() {
        return keyValue;
    }

    /**
     * Sets the value of the keyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyValue(String value) {
        this.keyValue = value;
    }

}


package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LeadKeySelector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeadKeySelector">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.marketo.com/mktows/}LeadSelector">
 *       &lt;sequence>
 *         &lt;element name="keyType" type="{http://www.marketo.com/mktows/}LeadKeyRef"/>
 *         &lt;element name="keyValues" type="{http://www.marketo.com/mktows/}ArrayOfString"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeadKeySelector", propOrder = {
    "keyType",
    "keyValues"
})
public class LeadKeySelector
    extends LeadSelector
{

    @XmlElement(required = true)
    protected LeadKeyRef keyType;
    @XmlElement(required = true)
    protected ArrayOfString keyValues;

    /**
     * Gets the value of the keyType property.
     * 
     * @return
     *     possible object is
     *     {@link LeadKeyRef }
     *     
     */
    public LeadKeyRef getKeyType() {
        return keyType;
    }

    /**
     * Sets the value of the keyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadKeyRef }
     *     
     */
    public void setKeyType(LeadKeyRef value) {
        this.keyType = value;
    }

    /**
     * Gets the value of the keyValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getKeyValues() {
        return keyValues;
    }

    /**
     * Sets the value of the keyValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setKeyValues(ArrayOfString value) {
        this.keyValues = value;
    }

}

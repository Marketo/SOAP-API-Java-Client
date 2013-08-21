
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TagStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TagStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tagValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusList" type="{http://www.marketo.com/mktows/}ArrayOfProgressionStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TagStatus", propOrder = {
    "tagValue",
    "statusList"
})
public class TagStatus {

    @XmlElement(required = true)
    protected String tagValue;
    @XmlElement(required = true)
    protected ArrayOfProgressionStatus statusList;

    /**
     * Gets the value of the tagValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagValue() {
        return tagValue;
    }

    /**
     * Sets the value of the tagValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagValue(String value) {
        this.tagValue = value;
    }

    /**
     * Gets the value of the statusList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProgressionStatus }
     *     
     */
    public ArrayOfProgressionStatus getStatusList() {
        return statusList;
    }

    /**
     * Sets the value of the statusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProgressionStatus }
     *     
     */
    public void setStatusList(ArrayOfProgressionStatus value) {
        this.statusList = value;
    }

}

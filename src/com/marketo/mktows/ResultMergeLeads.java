
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultMergeLeads complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultMergeLeads">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mergeStatus" type="{http://www.marketo.com/mktows/}MergeStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultMergeLeads", propOrder = {
    "mergeStatus"
})
public class ResultMergeLeads {

    @XmlElement(required = true)
    protected MergeStatus mergeStatus;

    /**
     * Gets the value of the mergeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MergeStatus }
     *     
     */
    public MergeStatus getMergeStatus() {
        return mergeStatus;
    }

    /**
     * Sets the value of the mergeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MergeStatus }
     *     
     */
    public void setMergeStatus(MergeStatus value) {
        this.mergeStatus = value;
    }

}

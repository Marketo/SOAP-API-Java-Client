
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgressionStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgressionStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="progressionStatus" type="{http://www.marketo.com/mktows/}ArrayOfAttrib" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgressionStatus", propOrder = {
    "progressionStatus"
})
public class ProgressionStatus {

    protected ArrayOfAttrib progressionStatus;

    /**
     * Gets the value of the progressionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttrib }
     *     
     */
    public ArrayOfAttrib getProgressionStatus() {
        return progressionStatus;
    }

    /**
     * Sets the value of the progressionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttrib }
     *     
     */
    public void setProgressionStatus(ArrayOfAttrib value) {
        this.progressionStatus = value;
    }

}

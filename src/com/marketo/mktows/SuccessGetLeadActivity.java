
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuccessGetLeadActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuccessGetLeadActivity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="leadActivityList" type="{http://www.marketo.com/mktows/}LeadActivityList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuccessGetLeadActivity", propOrder = {
    "leadActivityList"
})
@XmlRootElement(name = "successGetLeadActivity")
public class SuccessGetLeadActivity {

    @XmlElement(required = true)
    protected LeadActivityList leadActivityList;

    /**
     * Gets the value of the leadActivityList property.
     * 
     * @return
     *     possible object is
     *     {@link LeadActivityList }
     *     
     */
    public LeadActivityList getLeadActivityList() {
        return leadActivityList;
    }

    /**
     * Sets the value of the leadActivityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadActivityList }
     *     
     */
    public void setLeadActivityList(LeadActivityList value) {
        this.leadActivityList = value;
    }

}

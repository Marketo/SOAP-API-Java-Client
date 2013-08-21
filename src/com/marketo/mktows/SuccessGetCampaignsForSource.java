
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuccessGetCampaignsForSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuccessGetCampaignsForSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.marketo.com/mktows/}ResultGetCampaignsForSource"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuccessGetCampaignsForSource", propOrder = {
    "result"
})
@XmlRootElement(name = "successGetCampaignsForSource")
public class SuccessGetCampaignsForSource {

    @XmlElement(required = true)
    protected ResultGetCampaignsForSource result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultGetCampaignsForSource }
     *     
     */
    public ResultGetCampaignsForSource getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultGetCampaignsForSource }
     *     
     */
    public void setResult(ResultGetCampaignsForSource value) {
        this.result = value;
    }

}

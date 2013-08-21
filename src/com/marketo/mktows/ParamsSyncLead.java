
package com.marketo.mktows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamsSyncLead complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamsSyncLead">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="leadRecord" type="{http://www.marketo.com/mktows/}LeadRecord"/>
 *         &lt;element name="returnLead" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="marketoCookie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamsSyncLead", propOrder = {
    "leadRecord",
    "returnLead",
    "marketoCookie"
})
@XmlRootElement(name = "paramsSyncLead")
public class ParamsSyncLead {

    @XmlElement(required = true)
    protected LeadRecord leadRecord;
    protected boolean returnLead;
    @XmlElementRef(name = "marketoCookie", type = JAXBElement.class)
    protected JAXBElement<String> marketoCookie;

    /**
     * Gets the value of the leadRecord property.
     * 
     * @return
     *     possible object is
     *     {@link LeadRecord }
     *     
     */
    public LeadRecord getLeadRecord() {
        return leadRecord;
    }

    /**
     * Sets the value of the leadRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadRecord }
     *     
     */
    public void setLeadRecord(LeadRecord value) {
        this.leadRecord = value;
    }

    /**
     * Gets the value of the returnLead property.
     * 
     */
    public boolean isReturnLead() {
        return returnLead;
    }

    /**
     * Sets the value of the returnLead property.
     * 
     */
    public void setReturnLead(boolean value) {
        this.returnLead = value;
    }

    /**
     * Gets the value of the marketoCookie property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketoCookie() {
        return marketoCookie;
    }

    /**
     * Sets the value of the marketoCookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketoCookie(JAXBElement<String> value) {
        this.marketoCookie = ((JAXBElement<String> ) value);
    }

}

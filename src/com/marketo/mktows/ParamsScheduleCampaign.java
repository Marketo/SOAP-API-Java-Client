
package com.marketo.mktows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ParamsScheduleCampaign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamsScheduleCampaign">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="programName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="campaignName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="campaignRunAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="programTokenList" type="{http://www.marketo.com/mktows/}ArrayOfAttrib" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamsScheduleCampaign", propOrder = {
    "programName",
    "campaignName",
    "campaignRunAt",
    "programTokenList"
})
@XmlRootElement(name = "paramsScheduleCampaign")
public class ParamsScheduleCampaign {

    @XmlElement(required = true)
    protected String programName;
    @XmlElement(required = true)
    protected String campaignName;
    @XmlElementRef(name = "campaignRunAt", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> campaignRunAt;
    @XmlElementRef(name = "programTokenList", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAttrib> programTokenList;

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * Gets the value of the campaignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the value of the campaignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignName(String value) {
        this.campaignName = value;
    }

    /**
     * Gets the value of the campaignRunAt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCampaignRunAt() {
        return campaignRunAt;
    }

    /**
     * Sets the value of the campaignRunAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCampaignRunAt(JAXBElement<XMLGregorianCalendar> value) {
        this.campaignRunAt = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the programTokenList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttrib }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAttrib> getProgramTokenList() {
        return programTokenList;
    }

    /**
     * Sets the value of the programTokenList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttrib }{@code >}
     *     
     */
    public void setProgramTokenList(JAXBElement<ArrayOfAttrib> value) {
        this.programTokenList = ((JAXBElement<ArrayOfAttrib> ) value);
    }

}

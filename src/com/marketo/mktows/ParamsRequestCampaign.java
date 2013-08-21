
package com.marketo.mktows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamsRequestCampaign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamsRequestCampaign">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="source" type="{http://www.marketo.com/mktows/}ReqCampSourceType"/>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="leadList" type="{http://www.marketo.com/mktows/}ArrayOfLeadKey" minOccurs="0"/>
 *         &lt;element name="programName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ParamsRequestCampaign", propOrder = {
    "source",
    "campaignId",
    "leadList",
    "programName",
    "campaignName",
    "programTokenList"
})
@XmlRootElement(name = "paramsRequestCampaign")
public class ParamsRequestCampaign {

    @XmlElement(required = true)
    protected ReqCampSourceType source;
    @XmlElementRef(name = "campaignId", type = JAXBElement.class)
    protected JAXBElement<Integer> campaignId;
    @XmlElementRef(name = "leadList", type = JAXBElement.class)
    protected JAXBElement<ArrayOfLeadKey> leadList;
    @XmlElementRef(name = "programName", type = JAXBElement.class)
    protected JAXBElement<String> programName;
    @XmlElementRef(name = "campaignName", type = JAXBElement.class)
    protected JAXBElement<String> campaignName;
    @XmlElementRef(name = "programTokenList", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAttrib> programTokenList;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ReqCampSourceType }
     *     
     */
    public ReqCampSourceType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqCampSourceType }
     *     
     */
    public void setSource(ReqCampSourceType value) {
        this.source = value;
    }

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCampaignId(JAXBElement<Integer> value) {
        this.campaignId = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the leadList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLeadKey }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLeadKey> getLeadList() {
        return leadList;
    }

    /**
     * Sets the value of the leadList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLeadKey }{@code >}
     *     
     */
    public void setLeadList(JAXBElement<ArrayOfLeadKey> value) {
        this.leadList = ((JAXBElement<ArrayOfLeadKey> ) value);
    }

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProgramName(JAXBElement<String> value) {
        this.programName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the campaignName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the value of the campaignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCampaignName(JAXBElement<String> value) {
        this.campaignName = ((JAXBElement<String> ) value);
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

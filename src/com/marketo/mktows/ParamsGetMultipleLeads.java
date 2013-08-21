
package com.marketo.mktows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ParamsGetMultipleLeads complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamsGetMultipleLeads">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="leadSelector" type="{http://www.marketo.com/mktows/}LeadSelector" minOccurs="0"/>
 *         &lt;element name="lastUpdatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="streamPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batchSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="includeAttributes" type="{http://www.marketo.com/mktows/}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamsGetMultipleLeads", propOrder = {
    "leadSelector",
    "lastUpdatedAt",
    "streamPosition",
    "batchSize",
    "includeAttributes"
})
@XmlRootElement(name = "paramsGetMultipleLeads")
public class ParamsGetMultipleLeads {

    protected LeadSelector leadSelector;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdatedAt;
    @XmlElementRef(name = "streamPosition", type = JAXBElement.class)
    protected JAXBElement<String> streamPosition;
    @XmlElementRef(name = "batchSize", type = JAXBElement.class)
    protected JAXBElement<Integer> batchSize;
    protected ArrayOfString includeAttributes;

    /**
     * Gets the value of the leadSelector property.
     * 
     * @return
     *     possible object is
     *     {@link LeadSelector }
     *     
     */
    public LeadSelector getLeadSelector() {
        return leadSelector;
    }

    /**
     * Sets the value of the leadSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadSelector }
     *     
     */
    public void setLeadSelector(LeadSelector value) {
        this.leadSelector = value;
    }

    /**
     * Gets the value of the lastUpdatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    /**
     * Sets the value of the lastUpdatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdatedAt(XMLGregorianCalendar value) {
        this.lastUpdatedAt = value;
    }

    /**
     * Gets the value of the streamPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStreamPosition() {
        return streamPosition;
    }

    /**
     * Sets the value of the streamPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStreamPosition(JAXBElement<String> value) {
        this.streamPosition = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the batchSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBatchSize() {
        return batchSize;
    }

    /**
     * Sets the value of the batchSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBatchSize(JAXBElement<Integer> value) {
        this.batchSize = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the includeAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getIncludeAttributes() {
        return includeAttributes;
    }

    /**
     * Sets the value of the includeAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setIncludeAttributes(ArrayOfString value) {
        this.includeAttributes = value;
    }

}

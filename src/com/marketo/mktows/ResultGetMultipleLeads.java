
package com.marketo.mktows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultGetMultipleLeads complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultGetMultipleLeads">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="remainingCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="newStreamPosition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="leadRecordList" type="{http://www.marketo.com/mktows/}ArrayOfLeadRecord" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultGetMultipleLeads", propOrder = {
    "returnCount",
    "remainingCount",
    "newStreamPosition",
    "leadRecordList"
})
public class ResultGetMultipleLeads {

    protected int returnCount;
    protected int remainingCount;
    @XmlElement(required = true)
    protected String newStreamPosition;
    @XmlElementRef(name = "leadRecordList", type = JAXBElement.class)
    protected JAXBElement<ArrayOfLeadRecord> leadRecordList;

    /**
     * Gets the value of the returnCount property.
     * 
     */
    public int getReturnCount() {
        return returnCount;
    }

    /**
     * Sets the value of the returnCount property.
     * 
     */
    public void setReturnCount(int value) {
        this.returnCount = value;
    }

    /**
     * Gets the value of the remainingCount property.
     * 
     */
    public int getRemainingCount() {
        return remainingCount;
    }

    /**
     * Sets the value of the remainingCount property.
     * 
     */
    public void setRemainingCount(int value) {
        this.remainingCount = value;
    }

    /**
     * Gets the value of the newStreamPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewStreamPosition() {
        return newStreamPosition;
    }

    /**
     * Sets the value of the newStreamPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewStreamPosition(String value) {
        this.newStreamPosition = value;
    }

    /**
     * Gets the value of the leadRecordList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLeadRecord }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLeadRecord> getLeadRecordList() {
        return leadRecordList;
    }

    /**
     * Sets the value of the leadRecordList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLeadRecord }{@code >}
     *     
     */
    public void setLeadRecordList(JAXBElement<ArrayOfLeadRecord> value) {
        this.leadRecordList = ((JAXBElement<ArrayOfLeadRecord> ) value);
    }

}

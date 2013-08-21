
package com.marketo.mktows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultSyncLead complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultSyncLead">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="leadId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="syncStatus" type="{http://www.marketo.com/mktows/}SyncStatus"/>
 *         &lt;element name="leadRecord" type="{http://www.marketo.com/mktows/}LeadRecord" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultSyncLead", propOrder = {
    "leadId",
    "syncStatus",
    "leadRecord"
})
public class ResultSyncLead {

    protected int leadId;
    @XmlElement(required = true)
    protected SyncStatus syncStatus;
    @XmlElementRef(name = "leadRecord", type = JAXBElement.class)
    protected JAXBElement<LeadRecord> leadRecord;

    /**
     * Gets the value of the leadId property.
     * 
     */
    public int getLeadId() {
        return leadId;
    }

    /**
     * Sets the value of the leadId property.
     * 
     */
    public void setLeadId(int value) {
        this.leadId = value;
    }

    /**
     * Gets the value of the syncStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SyncStatus }
     *     
     */
    public SyncStatus getSyncStatus() {
        return syncStatus;
    }

    /**
     * Sets the value of the syncStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncStatus }
     *     
     */
    public void setSyncStatus(SyncStatus value) {
        this.syncStatus = value;
    }

    /**
     * Gets the value of the leadRecord property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LeadRecord }{@code >}
     *     
     */
    public JAXBElement<LeadRecord> getLeadRecord() {
        return leadRecord;
    }

    /**
     * Sets the value of the leadRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LeadRecord }{@code >}
     *     
     */
    public void setLeadRecord(JAXBElement<LeadRecord> value) {
        this.leadRecord = ((JAXBElement<LeadRecord> ) value);
    }

}

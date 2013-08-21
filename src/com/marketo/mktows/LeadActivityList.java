
package com.marketo.mktows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LeadActivityList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeadActivityList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="remainingCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="newStartPosition" type="{http://www.marketo.com/mktows/}StreamPosition"/>
 *         &lt;element name="activityRecordList" type="{http://www.marketo.com/mktows/}ArrayOfActivityRecord" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeadActivityList", propOrder = {
    "returnCount",
    "remainingCount",
    "newStartPosition",
    "activityRecordList"
})
public class LeadActivityList {

    protected int returnCount;
    protected int remainingCount;
    @XmlElement(required = true)
    protected StreamPosition newStartPosition;
    @XmlElementRef(name = "activityRecordList", type = JAXBElement.class)
    protected JAXBElement<ArrayOfActivityRecord> activityRecordList;

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
     * Gets the value of the newStartPosition property.
     * 
     * @return
     *     possible object is
     *     {@link StreamPosition }
     *     
     */
    public StreamPosition getNewStartPosition() {
        return newStartPosition;
    }

    /**
     * Sets the value of the newStartPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamPosition }
     *     
     */
    public void setNewStartPosition(StreamPosition value) {
        this.newStartPosition = value;
    }

    /**
     * Gets the value of the activityRecordList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfActivityRecord }{@code >}
     *     
     */
    public JAXBElement<ArrayOfActivityRecord> getActivityRecordList() {
        return activityRecordList;
    }

    /**
     * Sets the value of the activityRecordList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfActivityRecord }{@code >}
     *     
     */
    public void setActivityRecordList(JAXBElement<ArrayOfActivityRecord> value) {
        this.activityRecordList = ((JAXBElement<ArrayOfActivityRecord> ) value);
    }

}

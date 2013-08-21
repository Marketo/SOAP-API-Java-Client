
package com.marketo.mktows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StreamPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreamPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="latestCreatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="oldestCreatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="activityCreatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamPosition", propOrder = {
    "latestCreatedAt",
    "oldestCreatedAt",
    "activityCreatedAt",
    "offset"
})
public class StreamPosition {

    @XmlElementRef(name = "latestCreatedAt", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> latestCreatedAt;
    @XmlElementRef(name = "oldestCreatedAt", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> oldestCreatedAt;
    @XmlElementRef(name = "activityCreatedAt", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> activityCreatedAt;
    @XmlElementRef(name = "offset", type = JAXBElement.class)
    protected JAXBElement<String> offset;

    /**
     * Gets the value of the latestCreatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLatestCreatedAt() {
        return latestCreatedAt;
    }

    /**
     * Sets the value of the latestCreatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLatestCreatedAt(JAXBElement<XMLGregorianCalendar> value) {
        this.latestCreatedAt = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the oldestCreatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOldestCreatedAt() {
        return oldestCreatedAt;
    }

    /**
     * Sets the value of the oldestCreatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOldestCreatedAt(JAXBElement<XMLGregorianCalendar> value) {
        this.oldestCreatedAt = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the activityCreatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActivityCreatedAt() {
        return activityCreatedAt;
    }

    /**
     * Sets the value of the activityCreatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActivityCreatedAt(JAXBElement<XMLGregorianCalendar> value) {
        this.activityCreatedAt = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOffset(JAXBElement<String> value) {
        this.offset = ((JAXBElement<String> ) value);
    }

}

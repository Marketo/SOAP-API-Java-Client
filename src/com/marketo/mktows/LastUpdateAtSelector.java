
package com.marketo.mktows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LastUpdateAtSelector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LastUpdateAtSelector">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.marketo.com/mktows/}LeadSelector">
 *       &lt;sequence>
 *         &lt;element name="latestUpdatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="oldestUpdatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LastUpdateAtSelector", propOrder = {
    "latestUpdatedAt",
    "oldestUpdatedAt"
})
public class LastUpdateAtSelector
    extends LeadSelector
{

    @XmlElementRef(name = "latestUpdatedAt", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> latestUpdatedAt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar oldestUpdatedAt;

    /**
     * Gets the value of the latestUpdatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLatestUpdatedAt() {
        return latestUpdatedAt;
    }

    /**
     * Sets the value of the latestUpdatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLatestUpdatedAt(JAXBElement<XMLGregorianCalendar> value) {
        this.latestUpdatedAt = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the oldestUpdatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOldestUpdatedAt() {
        return oldestUpdatedAt;
    }

    /**
     * Sets the value of the oldestUpdatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOldestUpdatedAt(XMLGregorianCalendar value) {
        this.oldestUpdatedAt = value;
    }

}

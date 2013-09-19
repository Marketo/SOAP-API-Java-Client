
package com.marketo.mktows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamsGetLeadChanges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamsGetLeadChanges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startPosition" type="{http://www.marketo.com/mktows/}StreamPosition"/>
 *         &lt;element name="activityFilter" type="{http://www.marketo.com/mktows/}ActivityTypeFilter" minOccurs="0"/>
 *         &lt;element name="batchSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="leadSelector" type="{http://www.marketo.com/mktows/}LeadSelector" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamsGetLeadChanges", propOrder = {
    "startPosition",
    "activityFilter",
    "batchSize",
    "leadSelector"
})
@XmlRootElement(name = "paramsGetLeadChanges")
public class ParamsGetLeadChanges {

    @XmlElement(required = true)
    protected StreamPosition startPosition;
    @XmlElementRef(name = "activityFilter", type = JAXBElement.class)
    protected JAXBElement<ActivityTypeFilter> activityFilter;
    @XmlElementRef(name = "batchSize", type = JAXBElement.class)
    protected JAXBElement<Integer> batchSize;
    protected LeadSelector leadSelector;

    /**
     * Gets the value of the startPosition property.
     * 
     * @return
     *     possible object is
     *     {@link StreamPosition }
     *     
     */
    public StreamPosition getStartPosition() {
        return startPosition;
    }

    /**
     * Sets the value of the startPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamPosition }
     *     
     */
    public void setStartPosition(StreamPosition value) {
        this.startPosition = value;
    }

    /**
     * Gets the value of the activityFilter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActivityTypeFilter }{@code >}
     *     
     */
    public JAXBElement<ActivityTypeFilter> getActivityFilter() {
        return activityFilter;
    }

    /**
     * Sets the value of the activityFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActivityTypeFilter }{@code >}
     *     
     */
    public void setActivityFilter(JAXBElement<ActivityTypeFilter> value) {
        this.activityFilter = ((JAXBElement<ActivityTypeFilter> ) value);
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

}

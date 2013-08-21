
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityTypeFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityTypeFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="includeTypes" type="{http://www.marketo.com/mktows/}ArrayOfActivityType" minOccurs="0"/>
 *         &lt;element name="excludeTypes" type="{http://www.marketo.com/mktows/}ArrayOfActivityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityTypeFilter", propOrder = {
    "includeTypes",
    "excludeTypes"
})
public class ActivityTypeFilter {

    protected ArrayOfActivityType includeTypes;
    protected ArrayOfActivityType excludeTypes;

    /**
     * Gets the value of the includeTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActivityType }
     *     
     */
    public ArrayOfActivityType getIncludeTypes() {
        return includeTypes;
    }

    /**
     * Sets the value of the includeTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActivityType }
     *     
     */
    public void setIncludeTypes(ArrayOfActivityType value) {
        this.includeTypes = value;
    }

    /**
     * Gets the value of the excludeTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActivityType }
     *     
     */
    public ArrayOfActivityType getExcludeTypes() {
        return excludeTypes;
    }

    /**
     * Sets the value of the excludeTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActivityType }
     *     
     */
    public void setExcludeTypes(ArrayOfActivityType value) {
        this.excludeTypes = value;
    }

}

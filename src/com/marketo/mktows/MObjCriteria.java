
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MObjCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MObjCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attrName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comparison" type="{http://www.marketo.com/mktows/}ComparisonEnum"/>
 *         &lt;element name="attrValue" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MObjCriteria", propOrder = {
    "attrName",
    "comparison",
    "attrValue"
})
public class MObjCriteria {

    @XmlElement(required = true)
    protected String attrName;
    @XmlElement(required = true)
    protected ComparisonEnum comparison;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object attrValue;

    /**
     * Gets the value of the attrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * Sets the value of the attrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrName(String value) {
        this.attrName = value;
    }

    /**
     * Gets the value of the comparison property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonEnum }
     *     
     */
    public ComparisonEnum getComparison() {
        return comparison;
    }

    /**
     * Sets the value of the comparison property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonEnum }
     *     
     */
    public void setComparison(ComparisonEnum value) {
        this.comparison = value;
    }

    /**
     * Gets the value of the attrValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAttrValue() {
        return attrValue;
    }

    /**
     * Sets the value of the attrValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAttrValue(Object value) {
        this.attrValue = value;
    }

}

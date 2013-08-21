
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeAttrib complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeAttrib">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attrType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attrList" type="{http://www.marketo.com/mktows/}ArrayOfAttrib" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeAttrib", propOrder = {
    "attrType",
    "attrList"
})
public class TypeAttrib {

    @XmlElement(required = true)
    protected String attrType;
    protected ArrayOfAttrib attrList;

    /**
     * Gets the value of the attrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrType() {
        return attrType;
    }

    /**
     * Sets the value of the attrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrType(String value) {
        this.attrType = value;
    }

    /**
     * Gets the value of the attrList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttrib }
     *     
     */
    public ArrayOfAttrib getAttrList() {
        return attrList;
    }

    /**
     * Sets the value of the attrList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttrib }
     *     
     */
    public void setAttrList(ArrayOfAttrib value) {
        this.attrList = value;
    }

}

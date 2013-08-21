
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MObjectMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MObjectMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isCustom" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isVirtual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fieldList" type="{http://www.marketo.com/mktows/}ArrayOfMObjFieldMetadata"/>
 *         &lt;element name="updatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MObjectMetadata", propOrder = {
    "name",
    "description",
    "isCustom",
    "isVirtual",
    "fieldList",
    "updatedAt"
})
public class MObjectMetadata {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String description;
    protected boolean isCustom;
    protected boolean isVirtual;
    @XmlElement(required = true)
    protected ArrayOfMObjFieldMetadata fieldList;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAt;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the isCustom property.
     * 
     */
    public boolean isIsCustom() {
        return isCustom;
    }

    /**
     * Sets the value of the isCustom property.
     * 
     */
    public void setIsCustom(boolean value) {
        this.isCustom = value;
    }

    /**
     * Gets the value of the isVirtual property.
     * 
     */
    public boolean isIsVirtual() {
        return isVirtual;
    }

    /**
     * Sets the value of the isVirtual property.
     * 
     */
    public void setIsVirtual(boolean value) {
        this.isVirtual = value;
    }

    /**
     * Gets the value of the fieldList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMObjFieldMetadata }
     *     
     */
    public ArrayOfMObjFieldMetadata getFieldList() {
        return fieldList;
    }

    /**
     * Sets the value of the fieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMObjFieldMetadata }
     *     
     */
    public void setFieldList(ArrayOfMObjFieldMetadata value) {
        this.fieldList = value;
    }

    /**
     * Gets the value of the updatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of the updatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedAt(XMLGregorianCalendar value) {
        this.updatedAt = value;
    }

}

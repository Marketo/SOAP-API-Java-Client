
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MObjFieldMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MObjFieldMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceObject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isReadonly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isUpdateBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isPrimaryKey" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isCustom" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isDynamic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dynamicFieldRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "MObjFieldMetadata", propOrder = {
    "name",
    "description",
    "displayName",
    "sourceObject",
    "dataType",
    "size",
    "isReadonly",
    "isUpdateBlocked",
    "isName",
    "isPrimaryKey",
    "isCustom",
    "isDynamic",
    "dynamicFieldRef",
    "updatedAt"
})
public class MObjFieldMetadata {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, nillable = true)
    protected String displayName;
    @XmlElement(required = true, nillable = true)
    protected String sourceObject;
    @XmlElement(required = true)
    protected String dataType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer size;
    protected boolean isReadonly;
    protected boolean isUpdateBlocked;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isName;
    protected boolean isPrimaryKey;
    protected boolean isCustom;
    protected boolean isDynamic;
    @XmlElement(required = true, nillable = true)
    protected String dynamicFieldRef;
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
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the sourceObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceObject() {
        return sourceObject;
    }

    /**
     * Sets the value of the sourceObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceObject(String value) {
        this.sourceObject = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSize(Integer value) {
        this.size = value;
    }

    /**
     * Gets the value of the isReadonly property.
     * 
     */
    public boolean isIsReadonly() {
        return isReadonly;
    }

    /**
     * Sets the value of the isReadonly property.
     * 
     */
    public void setIsReadonly(boolean value) {
        this.isReadonly = value;
    }

    /**
     * Gets the value of the isUpdateBlocked property.
     * 
     */
    public boolean isIsUpdateBlocked() {
        return isUpdateBlocked;
    }

    /**
     * Sets the value of the isUpdateBlocked property.
     * 
     */
    public void setIsUpdateBlocked(boolean value) {
        this.isUpdateBlocked = value;
    }

    /**
     * Gets the value of the isName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsName() {
        return isName;
    }

    /**
     * Sets the value of the isName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsName(Boolean value) {
        this.isName = value;
    }

    /**
     * Gets the value of the isPrimaryKey property.
     * 
     */
    public boolean isIsPrimaryKey() {
        return isPrimaryKey;
    }

    /**
     * Sets the value of the isPrimaryKey property.
     * 
     */
    public void setIsPrimaryKey(boolean value) {
        this.isPrimaryKey = value;
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
     * Gets the value of the isDynamic property.
     * 
     */
    public boolean isIsDynamic() {
        return isDynamic;
    }

    /**
     * Sets the value of the isDynamic property.
     * 
     */
    public void setIsDynamic(boolean value) {
        this.isDynamic = value;
    }

    /**
     * Gets the value of the dynamicFieldRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicFieldRef() {
        return dynamicFieldRef;
    }

    /**
     * Sets the value of the dynamicFieldRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicFieldRef(String value) {
        this.dynamicFieldRef = value;
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

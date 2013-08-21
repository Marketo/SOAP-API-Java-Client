
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="externalKey" type="{http://www.marketo.com/mktows/}Attrib" minOccurs="0"/>
 *         &lt;element name="createdAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="attribList" type="{http://www.marketo.com/mktows/}ArrayOfAttrib" minOccurs="0"/>
 *         &lt;element name="typeAttribList" type="{http://www.marketo.com/mktows/}ArrayOfTypeAttrib" minOccurs="0"/>
 *         &lt;element name="associationList" type="{http://www.marketo.com/mktows/}ArrayOfMObjAssociation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MObject", propOrder = {
    "type",
    "id",
    "externalKey",
    "createdAt",
    "updatedAt",
    "attribList",
    "typeAttribList",
    "associationList"
})
public class MObject {

    @XmlElement(required = true)
    protected String type;
    protected Integer id;
    protected Attrib externalKey;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAt;
    protected ArrayOfAttrib attribList;
    protected ArrayOfTypeAttrib typeAttribList;
    protected ArrayOfMObjAssociation associationList;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the externalKey property.
     * 
     * @return
     *     possible object is
     *     {@link Attrib }
     *     
     */
    public Attrib getExternalKey() {
        return externalKey;
    }

    /**
     * Sets the value of the externalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attrib }
     *     
     */
    public void setExternalKey(Attrib value) {
        this.externalKey = value;
    }

    /**
     * Gets the value of the createdAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedAt(XMLGregorianCalendar value) {
        this.createdAt = value;
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

    /**
     * Gets the value of the attribList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttrib }
     *     
     */
    public ArrayOfAttrib getAttribList() {
        return attribList;
    }

    /**
     * Sets the value of the attribList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttrib }
     *     
     */
    public void setAttribList(ArrayOfAttrib value) {
        this.attribList = value;
    }

    /**
     * Gets the value of the typeAttribList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTypeAttrib }
     *     
     */
    public ArrayOfTypeAttrib getTypeAttribList() {
        return typeAttribList;
    }

    /**
     * Sets the value of the typeAttribList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTypeAttrib }
     *     
     */
    public void setTypeAttribList(ArrayOfTypeAttrib value) {
        this.typeAttribList = value;
    }

    /**
     * Gets the value of the associationList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMObjAssociation }
     *     
     */
    public ArrayOfMObjAssociation getAssociationList() {
        return associationList;
    }

    /**
     * Sets the value of the associationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMObjAssociation }
     *     
     */
    public void setAssociationList(ArrayOfMObjAssociation value) {
        this.associationList = value;
    }

}

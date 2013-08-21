
package com.marketo.mktows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LeadRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeadRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignSysPersonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignSysType" type="{http://www.marketo.com/mktows/}ForeignSysType" minOccurs="0"/>
 *         &lt;element name="leadAttributeList" type="{http://www.marketo.com/mktows/}ArrayOfAttribute" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeadRecord", propOrder = {
    "id",
    "email",
    "foreignSysPersonId",
    "foreignSysType",
    "leadAttributeList"
})
public class LeadRecord {

    @XmlElementRef(name = "Id", type = JAXBElement.class)
    protected JAXBElement<Integer> id;
    @XmlElementRef(name = "Email", type = JAXBElement.class)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "ForeignSysPersonId", type = JAXBElement.class)
    protected JAXBElement<String> foreignSysPersonId;
    @XmlElementRef(name = "ForeignSysType", type = JAXBElement.class)
    protected JAXBElement<ForeignSysType> foreignSysType;
    @XmlElementRef(name = "leadAttributeList", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAttribute> leadAttributeList;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setId(JAXBElement<Integer> value) {
        this.id = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the foreignSysPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForeignSysPersonId() {
        return foreignSysPersonId;
    }

    /**
     * Sets the value of the foreignSysPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForeignSysPersonId(JAXBElement<String> value) {
        this.foreignSysPersonId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the foreignSysType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ForeignSysType }{@code >}
     *     
     */
    public JAXBElement<ForeignSysType> getForeignSysType() {
        return foreignSysType;
    }

    /**
     * Sets the value of the foreignSysType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ForeignSysType }{@code >}
     *     
     */
    public void setForeignSysType(JAXBElement<ForeignSysType> value) {
        this.foreignSysType = ((JAXBElement<ForeignSysType> ) value);
    }

    /**
     * Gets the value of the leadAttributeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttribute }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAttribute> getLeadAttributeList() {
        return leadAttributeList;
    }

    /**
     * Sets the value of the leadAttributeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttribute }{@code >}
     *     
     */
    public void setLeadAttributeList(JAXBElement<ArrayOfAttribute> value) {
        this.leadAttributeList = ((JAXBElement<ArrayOfAttribute> ) value);
    }

}

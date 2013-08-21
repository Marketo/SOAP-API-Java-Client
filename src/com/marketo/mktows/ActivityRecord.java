
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
 * <p>Java class for ActivityRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="activityDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="activityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mktgAssetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activityAttributes" type="{http://www.marketo.com/mktows/}ArrayOfAttribute" minOccurs="0"/>
 *         &lt;element name="campaign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mktPersonId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="foreignSysId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foreignSysOrgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityRecord", propOrder = {
    "id",
    "activityDateTime",
    "activityType",
    "mktgAssetName",
    "activityAttributes",
    "campaign",
    "personName",
    "mktPersonId",
    "foreignSysId",
    "orgName",
    "foreignSysOrgId"
})
public class ActivityRecord {

    protected int id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activityDateTime;
    @XmlElement(required = true)
    protected String activityType;
    protected String mktgAssetName;
    @XmlElementRef(name = "activityAttributes", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAttribute> activityAttributes;
    @XmlElementRef(name = "campaign", type = JAXBElement.class)
    protected JAXBElement<String> campaign;
    @XmlElementRef(name = "personName", type = JAXBElement.class)
    protected JAXBElement<String> personName;
    @XmlElement(required = true)
    protected String mktPersonId;
    @XmlElementRef(name = "foreignSysId", type = JAXBElement.class)
    protected JAXBElement<String> foreignSysId;
    @XmlElementRef(name = "orgName", type = JAXBElement.class)
    protected JAXBElement<String> orgName;
    @XmlElementRef(name = "foreignSysOrgId", type = JAXBElement.class)
    protected JAXBElement<String> foreignSysOrgId;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the activityDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityDateTime() {
        return activityDateTime;
    }

    /**
     * Sets the value of the activityDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivityDateTime(XMLGregorianCalendar value) {
        this.activityDateTime = value;
    }

    /**
     * Gets the value of the activityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityType() {
        return activityType;
    }

    /**
     * Sets the value of the activityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityType(String value) {
        this.activityType = value;
    }

    /**
     * Gets the value of the mktgAssetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktgAssetName() {
        return mktgAssetName;
    }

    /**
     * Sets the value of the mktgAssetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktgAssetName(String value) {
        this.mktgAssetName = value;
    }

    /**
     * Gets the value of the activityAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttribute }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAttribute> getActivityAttributes() {
        return activityAttributes;
    }

    /**
     * Sets the value of the activityAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttribute }{@code >}
     *     
     */
    public void setActivityAttributes(JAXBElement<ArrayOfAttribute> value) {
        this.activityAttributes = ((JAXBElement<ArrayOfAttribute> ) value);
    }

    /**
     * Gets the value of the campaign property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCampaign() {
        return campaign;
    }

    /**
     * Sets the value of the campaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCampaign(JAXBElement<String> value) {
        this.campaign = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonName(JAXBElement<String> value) {
        this.personName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mktPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktPersonId() {
        return mktPersonId;
    }

    /**
     * Sets the value of the mktPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktPersonId(String value) {
        this.mktPersonId = value;
    }

    /**
     * Gets the value of the foreignSysId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForeignSysId() {
        return foreignSysId;
    }

    /**
     * Sets the value of the foreignSysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForeignSysId(JAXBElement<String> value) {
        this.foreignSysId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgName(JAXBElement<String> value) {
        this.orgName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the foreignSysOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForeignSysOrgId() {
        return foreignSysOrgId;
    }

    /**
     * Sets the value of the foreignSysOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForeignSysOrgId(JAXBElement<String> value) {
        this.foreignSysOrgId = ((JAXBElement<String> ) value);
    }

}

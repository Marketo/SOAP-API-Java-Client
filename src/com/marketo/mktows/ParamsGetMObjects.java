
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamsGetMObjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamsGetMObjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="externalKey" type="{http://www.marketo.com/mktows/}Attrib" minOccurs="0"/>
 *         &lt;element name="mObjCriteriaList" type="{http://www.marketo.com/mktows/}ArrayOfMObjCriteria" minOccurs="0"/>
 *         &lt;element name="mObjAssociationList" type="{http://www.marketo.com/mktows/}ArrayOfMObjAssociation" minOccurs="0"/>
 *         &lt;element name="includeDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="streamPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamsGetMObjects", propOrder = {
    "type",
    "id",
    "externalKey",
    "mObjCriteriaList",
    "mObjAssociationList",
    "includeDetails",
    "streamPosition"
})
@XmlRootElement(name = "paramsGetMObjects")
public class ParamsGetMObjects {

    @XmlElement(required = true)
    protected String type;
    protected Integer id;
    protected Attrib externalKey;
    protected ArrayOfMObjCriteria mObjCriteriaList;
    protected ArrayOfMObjAssociation mObjAssociationList;
    protected Boolean includeDetails;
    protected String streamPosition;

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
     * Gets the value of the mObjCriteriaList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMObjCriteria }
     *     
     */
    public ArrayOfMObjCriteria getMObjCriteriaList() {
        return mObjCriteriaList;
    }

    /**
     * Sets the value of the mObjCriteriaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMObjCriteria }
     *     
     */
    public void setMObjCriteriaList(ArrayOfMObjCriteria value) {
        this.mObjCriteriaList = value;
    }

    /**
     * Gets the value of the mObjAssociationList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMObjAssociation }
     *     
     */
    public ArrayOfMObjAssociation getMObjAssociationList() {
        return mObjAssociationList;
    }

    /**
     * Sets the value of the mObjAssociationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMObjAssociation }
     *     
     */
    public void setMObjAssociationList(ArrayOfMObjAssociation value) {
        this.mObjAssociationList = value;
    }

    /**
     * Gets the value of the includeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeDetails() {
        return includeDetails;
    }

    /**
     * Sets the value of the includeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeDetails(Boolean value) {
        this.includeDetails = value;
    }

    /**
     * Gets the value of the streamPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreamPosition() {
        return streamPosition;
    }

    /**
     * Sets the value of the streamPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreamPosition(String value) {
        this.streamPosition = value;
    }

}

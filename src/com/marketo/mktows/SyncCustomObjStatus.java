
package com.marketo.mktows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncCustomObjStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncCustomObjStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customObjKeyList" type="{http://www.marketo.com/mktows/}ArrayOfAttribute" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.marketo.com/mktows/}SyncStatusEnum"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncCustomObjStatus", propOrder = {
    "objTypeName",
    "customObjKeyList",
    "status",
    "error"
})
public class SyncCustomObjStatus {

    @XmlElement(required = true)
    protected String objTypeName;
    @XmlElementRef(name = "customObjKeyList", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAttribute> customObjKeyList;
    @XmlElement(required = true)
    protected SyncStatusEnum status;
    @XmlElementRef(name = "error", type = JAXBElement.class)
    protected JAXBElement<String> error;

    /**
     * Gets the value of the objTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjTypeName() {
        return objTypeName;
    }

    /**
     * Sets the value of the objTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjTypeName(String value) {
        this.objTypeName = value;
    }

    /**
     * Gets the value of the customObjKeyList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttribute }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAttribute> getCustomObjKeyList() {
        return customObjKeyList;
    }

    /**
     * Sets the value of the customObjKeyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttribute }{@code >}
     *     
     */
    public void setCustomObjKeyList(JAXBElement<ArrayOfAttribute> value) {
        this.customObjKeyList = ((JAXBElement<ArrayOfAttribute> ) value);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SyncStatusEnum }
     *     
     */
    public SyncStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncStatusEnum }
     *     
     */
    public void setStatus(SyncStatusEnum value) {
        this.status = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setError(JAXBElement<String> value) {
        this.error = ((JAXBElement<String> ) value);
    }

}

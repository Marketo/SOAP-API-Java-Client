
package com.marketo.mktows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultGetCustomObjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultGetCustomObjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="returnCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="remainingCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="newStreamPosition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customObjList" type="{http://www.marketo.com/mktows/}ArrayOfCustomObj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultGetCustomObjects", propOrder = {
    "objTypeName",
    "returnCount",
    "remainingCount",
    "newStreamPosition",
    "customObjList"
})
public class ResultGetCustomObjects {

    @XmlElement(required = true)
    protected String objTypeName;
    protected int returnCount;
    protected int remainingCount;
    @XmlElement(required = true)
    protected String newStreamPosition;
    @XmlElementRef(name = "customObjList", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCustomObj> customObjList;

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
     * Gets the value of the returnCount property.
     * 
     */
    public int getReturnCount() {
        return returnCount;
    }

    /**
     * Sets the value of the returnCount property.
     * 
     */
    public void setReturnCount(int value) {
        this.returnCount = value;
    }

    /**
     * Gets the value of the remainingCount property.
     * 
     */
    public int getRemainingCount() {
        return remainingCount;
    }

    /**
     * Sets the value of the remainingCount property.
     * 
     */
    public void setRemainingCount(int value) {
        this.remainingCount = value;
    }

    /**
     * Gets the value of the newStreamPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewStreamPosition() {
        return newStreamPosition;
    }

    /**
     * Sets the value of the newStreamPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewStreamPosition(String value) {
        this.newStreamPosition = value;
    }

    /**
     * Gets the value of the customObjList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomObj }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCustomObj> getCustomObjList() {
        return customObjList;
    }

    /**
     * Sets the value of the customObjList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomObj }{@code >}
     *     
     */
    public void setCustomObjList(JAXBElement<ArrayOfCustomObj> value) {
        this.customObjList = ((JAXBElement<ArrayOfCustomObj> ) value);
    }

}

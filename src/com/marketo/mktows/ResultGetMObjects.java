
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultGetMObjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultGetMObjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hasMore" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newStreamPosition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mObjectList" type="{http://www.marketo.com/mktows/}ArrayOfMObject" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultGetMObjects", propOrder = {
    "returnCount",
    "hasMore",
    "newStreamPosition",
    "mObjectList"
})
public class ResultGetMObjects {

    protected int returnCount;
    protected boolean hasMore;
    @XmlElement(required = true)
    protected String newStreamPosition;
    protected ArrayOfMObject mObjectList;

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
     * Gets the value of the hasMore property.
     * 
     */
    public boolean isHasMore() {
        return hasMore;
    }

    /**
     * Sets the value of the hasMore property.
     * 
     */
    public void setHasMore(boolean value) {
        this.hasMore = value;
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
     * Gets the value of the mObjectList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMObject }
     *     
     */
    public ArrayOfMObject getMObjectList() {
        return mObjectList;
    }

    /**
     * Sets the value of the mObjectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMObject }
     *     
     */
    public void setMObjectList(ArrayOfMObject value) {
        this.mObjectList = value;
    }

}

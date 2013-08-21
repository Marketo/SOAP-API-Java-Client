
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamsSyncMObjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamsSyncMObjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mObjectList" type="{http://www.marketo.com/mktows/}ArrayOfMObject"/>
 *         &lt;element name="operation" type="{http://www.marketo.com/mktows/}SyncOperationEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamsSyncMObjects", propOrder = {
    "mObjectList",
    "operation"
})
@XmlRootElement(name = "paramsSyncMObjects")
public class ParamsSyncMObjects {

    @XmlElement(required = true)
    protected ArrayOfMObject mObjectList;
    @XmlElement(required = true)
    protected SyncOperationEnum operation;

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

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link SyncOperationEnum }
     *     
     */
    public SyncOperationEnum getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncOperationEnum }
     *     
     */
    public void setOperation(SyncOperationEnum value) {
        this.operation = value;
    }

}

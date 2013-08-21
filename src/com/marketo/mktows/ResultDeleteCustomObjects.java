
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultDeleteCustomObjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultDeleteCustomObjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deleteCustomObjStatusList" type="{http://www.marketo.com/mktows/}ArrayOfSyncCustomObjStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultDeleteCustomObjects", propOrder = {
    "deleteCustomObjStatusList"
})
public class ResultDeleteCustomObjects {

    @XmlElement(required = true)
    protected ArrayOfSyncCustomObjStatus deleteCustomObjStatusList;

    /**
     * Gets the value of the deleteCustomObjStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSyncCustomObjStatus }
     *     
     */
    public ArrayOfSyncCustomObjStatus getDeleteCustomObjStatusList() {
        return deleteCustomObjStatusList;
    }

    /**
     * Sets the value of the deleteCustomObjStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSyncCustomObjStatus }
     *     
     */
    public void setDeleteCustomObjStatusList(ArrayOfSyncCustomObjStatus value) {
        this.deleteCustomObjStatusList = value;
    }

}

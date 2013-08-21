
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultSyncCustomObjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultSyncCustomObjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="syncCustomObjStatusList" type="{http://www.marketo.com/mktows/}ArrayOfSyncCustomObjStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultSyncCustomObjects", propOrder = {
    "syncCustomObjStatusList"
})
public class ResultSyncCustomObjects {

    @XmlElement(required = true)
    protected ArrayOfSyncCustomObjStatus syncCustomObjStatusList;

    /**
     * Gets the value of the syncCustomObjStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSyncCustomObjStatus }
     *     
     */
    public ArrayOfSyncCustomObjStatus getSyncCustomObjStatusList() {
        return syncCustomObjStatusList;
    }

    /**
     * Sets the value of the syncCustomObjStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSyncCustomObjStatus }
     *     
     */
    public void setSyncCustomObjStatusList(ArrayOfSyncCustomObjStatus value) {
        this.syncCustomObjStatusList = value;
    }

}

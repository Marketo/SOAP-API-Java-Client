
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultDeleteMObjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultDeleteMObjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mObjStatusList" type="{http://www.marketo.com/mktows/}ArrayOfMObjStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultDeleteMObjects", propOrder = {
    "mObjStatusList"
})
public class ResultDeleteMObjects {

    @XmlElement(required = true)
    protected ArrayOfMObjStatus mObjStatusList;

    /**
     * Gets the value of the mObjStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMObjStatus }
     *     
     */
    public ArrayOfMObjStatus getMObjStatusList() {
        return mObjStatusList;
    }

    /**
     * Sets the value of the mObjStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMObjStatus }
     *     
     */
    public void setMObjStatusList(ArrayOfMObjStatus value) {
        this.mObjStatusList = value;
    }

}

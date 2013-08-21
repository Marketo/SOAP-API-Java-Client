
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultDescribeMObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultDescribeMObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metadata" type="{http://www.marketo.com/mktows/}MObjectMetadata"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultDescribeMObject", propOrder = {
    "metadata"
})
public class ResultDescribeMObject {

    @XmlElement(required = true)
    protected MObjectMetadata metadata;

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link MObjectMetadata }
     *     
     */
    public MObjectMetadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MObjectMetadata }
     *     
     */
    public void setMetadata(MObjectMetadata value) {
        this.metadata = value;
    }

}

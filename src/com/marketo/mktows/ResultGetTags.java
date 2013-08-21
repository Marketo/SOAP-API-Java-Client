
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultGetTags complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultGetTags">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tagList" type="{http://www.marketo.com/mktows/}ArrayOfTag"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultGetTags", propOrder = {
    "tagList"
})
public class ResultGetTags {

    @XmlElement(required = true)
    protected ArrayOfTag tagList;

    /**
     * Gets the value of the tagList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTag }
     *     
     */
    public ArrayOfTag getTagList() {
        return tagList;
    }

    /**
     * Sets the value of the tagList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTag }
     *     
     */
    public void setTagList(ArrayOfTag value) {
        this.tagList = value;
    }

}

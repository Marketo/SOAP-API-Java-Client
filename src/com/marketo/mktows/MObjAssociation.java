
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MObjAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MObjAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mObjType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="externalKey" type="{http://www.marketo.com/mktows/}Attrib" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MObjAssociation", propOrder = {
    "mObjType",
    "id",
    "externalKey"
})
public class MObjAssociation {

    @XmlElement(required = true)
    protected String mObjType;
    protected Integer id;
    protected Attrib externalKey;

    /**
     * Gets the value of the mObjType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMObjType() {
        return mObjType;
    }

    /**
     * Sets the value of the mObjType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMObjType(String value) {
        this.mObjType = value;
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

}

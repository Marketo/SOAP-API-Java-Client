
package com.marketo.mktows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamsListOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamsListOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listOperation" type="{http://www.marketo.com/mktows/}ListOperationType"/>
 *         &lt;element name="listKey" type="{http://www.marketo.com/mktows/}ListKey"/>
 *         &lt;element name="listMemberList" type="{http://www.marketo.com/mktows/}ArrayOfLeadKey"/>
 *         &lt;element name="strict" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamsListOperation", propOrder = {
    "listOperation",
    "listKey",
    "listMemberList",
    "strict"
})
@XmlRootElement(name = "paramsListOperation")
public class ParamsListOperation {

    @XmlElement(required = true)
    protected ListOperationType listOperation;
    @XmlElement(required = true)
    protected ListKey listKey;
    @XmlElement(required = true)
    protected ArrayOfLeadKey listMemberList;
    @XmlElementRef(name = "strict", type = JAXBElement.class)
    protected JAXBElement<Boolean> strict;

    /**
     * Gets the value of the listOperation property.
     * 
     * @return
     *     possible object is
     *     {@link ListOperationType }
     *     
     */
    public ListOperationType getListOperation() {
        return listOperation;
    }

    /**
     * Sets the value of the listOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOperationType }
     *     
     */
    public void setListOperation(ListOperationType value) {
        this.listOperation = value;
    }

    /**
     * Gets the value of the listKey property.
     * 
     * @return
     *     possible object is
     *     {@link ListKey }
     *     
     */
    public ListKey getListKey() {
        return listKey;
    }

    /**
     * Sets the value of the listKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListKey }
     *     
     */
    public void setListKey(ListKey value) {
        this.listKey = value;
    }

    /**
     * Gets the value of the listMemberList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLeadKey }
     *     
     */
    public ArrayOfLeadKey getListMemberList() {
        return listMemberList;
    }

    /**
     * Sets the value of the listMemberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLeadKey }
     *     
     */
    public void setListMemberList(ArrayOfLeadKey value) {
        this.listMemberList = value;
    }

    /**
     * Gets the value of the strict property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getStrict() {
        return strict;
    }

    /**
     * Sets the value of the strict property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setStrict(JAXBElement<Boolean> value) {
        this.strict = ((JAXBElement<Boolean> ) value);
    }

}

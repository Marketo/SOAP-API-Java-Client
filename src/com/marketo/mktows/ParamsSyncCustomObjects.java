
package com.marketo.mktows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamsSyncCustomObjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamsSyncCustomObjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customObjList" type="{http://www.marketo.com/mktows/}ArrayOfCustomObj"/>
 *         &lt;element name="operation" type="{http://www.marketo.com/mktows/}SyncOperationEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamsSyncCustomObjects", propOrder = {
    "objTypeName",
    "customObjList",
    "operation"
})
@XmlRootElement(name = "paramsSyncCustomObjects")
public class ParamsSyncCustomObjects {

    @XmlElement(required = true)
    protected String objTypeName;
    @XmlElement(required = true)
    protected ArrayOfCustomObj customObjList;
    @XmlElementRef(name = "operation", type = JAXBElement.class)
    protected JAXBElement<SyncOperationEnum> operation;

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
     * Gets the value of the customObjList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomObj }
     *     
     */
    public ArrayOfCustomObj getCustomObjList() {
        return customObjList;
    }

    /**
     * Sets the value of the customObjList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomObj }
     *     
     */
    public void setCustomObjList(ArrayOfCustomObj value) {
        this.customObjList = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SyncOperationEnum }{@code >}
     *     
     */
    public JAXBElement<SyncOperationEnum> getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SyncOperationEnum }{@code >}
     *     
     */
    public void setOperation(JAXBElement<SyncOperationEnum> value) {
        this.operation = ((JAXBElement<SyncOperationEnum> ) value);
    }

}


package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamsMergeLeads complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamsMergeLeads">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="winningLeadKeyList" type="{http://www.marketo.com/mktows/}ArrayOfAttribute"/>
 *         &lt;element name="losingLeadKeyLists" type="{http://www.marketo.com/mktows/}ArrayOfKeyList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamsMergeLeads", propOrder = {
    "winningLeadKeyList",
    "losingLeadKeyLists"
})
@XmlRootElement(name = "paramsMergeLeads")
public class ParamsMergeLeads {

    @XmlElement(required = true)
    protected ArrayOfAttribute winningLeadKeyList;
    @XmlElement(required = true)
    protected ArrayOfKeyList losingLeadKeyLists;

    /**
     * Gets the value of the winningLeadKeyList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttribute }
     *     
     */
    public ArrayOfAttribute getWinningLeadKeyList() {
        return winningLeadKeyList;
    }

    /**
     * Sets the value of the winningLeadKeyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttribute }
     *     
     */
    public void setWinningLeadKeyList(ArrayOfAttribute value) {
        this.winningLeadKeyList = value;
    }

    /**
     * Gets the value of the losingLeadKeyLists property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyList }
     *     
     */
    public ArrayOfKeyList getLosingLeadKeyLists() {
        return losingLeadKeyLists;
    }

    /**
     * Sets the value of the losingLeadKeyLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyList }
     *     
     */
    public void setLosingLeadKeyLists(ArrayOfKeyList value) {
        this.losingLeadKeyLists = value;
    }

}


package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultImportToList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultImportToList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="importStatus" type="{http://www.marketo.com/mktows/}ImportToListStatusEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultImportToList", propOrder = {
    "importStatus"
})
public class ResultImportToList {

    @XmlElement(required = true)
    protected ImportToListStatusEnum importStatus;

    /**
     * Gets the value of the importStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ImportToListStatusEnum }
     *     
     */
    public ImportToListStatusEnum getImportStatus() {
        return importStatus;
    }

    /**
     * Sets the value of the importStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportToListStatusEnum }
     *     
     */
    public void setImportStatus(ImportToListStatusEnum value) {
        this.importStatus = value;
    }

}

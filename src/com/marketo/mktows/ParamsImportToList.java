
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamsImportToList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamsImportToList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="programName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="importFileHeader" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="importFileRows" type="{http://www.marketo.com/mktows/}ArrayOfString"/>
 *         &lt;element name="importListMode" type="{http://www.marketo.com/mktows/}ImportToListModeEnum"/>
 *         &lt;element name="listName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clearList" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="campaignName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamsImportToList", propOrder = {
    "programName",
    "importFileHeader",
    "importFileRows",
    "importListMode",
    "listName",
    "clearList",
    "campaignName"
})
@XmlRootElement(name = "paramsImportToList")
public class ParamsImportToList {

    @XmlElement(required = true)
    protected String programName;
    @XmlElement(required = true)
    protected String importFileHeader;
    @XmlElement(required = true)
    protected ArrayOfString importFileRows;
    @XmlElement(required = true)
    protected ImportToListModeEnum importListMode;
    @XmlElement(required = true)
    protected String listName;
    protected boolean clearList;
    @XmlElement(required = true, nillable = true)
    protected String campaignName;

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * Gets the value of the importFileHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportFileHeader() {
        return importFileHeader;
    }

    /**
     * Sets the value of the importFileHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportFileHeader(String value) {
        this.importFileHeader = value;
    }

    /**
     * Gets the value of the importFileRows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getImportFileRows() {
        return importFileRows;
    }

    /**
     * Sets the value of the importFileRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setImportFileRows(ArrayOfString value) {
        this.importFileRows = value;
    }

    /**
     * Gets the value of the importListMode property.
     * 
     * @return
     *     possible object is
     *     {@link ImportToListModeEnum }
     *     
     */
    public ImportToListModeEnum getImportListMode() {
        return importListMode;
    }

    /**
     * Sets the value of the importListMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportToListModeEnum }
     *     
     */
    public void setImportListMode(ImportToListModeEnum value) {
        this.importListMode = value;
    }

    /**
     * Gets the value of the listName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListName() {
        return listName;
    }

    /**
     * Sets the value of the listName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListName(String value) {
        this.listName = value;
    }

    /**
     * Gets the value of the clearList property.
     * 
     */
    public boolean isClearList() {
        return clearList;
    }

    /**
     * Sets the value of the clearList property.
     * 
     */
    public void setClearList(boolean value) {
        this.clearList = value;
    }

    /**
     * Gets the value of the campaignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the value of the campaignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignName(String value) {
        this.campaignName = value;
    }

}

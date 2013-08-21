
package com.marketo.mktows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ResultGetImportToListStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultGetImportToListStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.marketo.com/mktows/}ImportToListStatusEnum"/>
 *         &lt;element name="startedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="estimatedTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="estimatedRows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rowsImported" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rowsFailed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rowsIgnored" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="importSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultGetImportToListStatus", propOrder = {
    "status",
    "startedTime",
    "endedTime",
    "estimatedTime",
    "estimatedRows",
    "rowsImported",
    "rowsFailed",
    "rowsIgnored",
    "importSummary"
})
public class ResultGetImportToListStatus {

    @XmlElement(required = true)
    protected ImportToListStatusEnum status;
    @XmlElementRef(name = "startedTime", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> startedTime;
    @XmlElementRef(name = "endedTime", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> endedTime;
    @XmlElementRef(name = "estimatedTime", type = JAXBElement.class)
    protected JAXBElement<Integer> estimatedTime;
    @XmlElementRef(name = "estimatedRows", type = JAXBElement.class)
    protected JAXBElement<Integer> estimatedRows;
    @XmlElementRef(name = "rowsImported", type = JAXBElement.class)
    protected JAXBElement<Integer> rowsImported;
    @XmlElementRef(name = "rowsFailed", type = JAXBElement.class)
    protected JAXBElement<Integer> rowsFailed;
    @XmlElementRef(name = "rowsIgnored", type = JAXBElement.class)
    protected JAXBElement<Integer> rowsIgnored;
    @XmlElementRef(name = "importSummary", type = JAXBElement.class)
    protected JAXBElement<String> importSummary;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ImportToListStatusEnum }
     *     
     */
    public ImportToListStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportToListStatusEnum }
     *     
     */
    public void setStatus(ImportToListStatusEnum value) {
        this.status = value;
    }

    /**
     * Gets the value of the startedTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartedTime() {
        return startedTime;
    }

    /**
     * Sets the value of the startedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartedTime(JAXBElement<XMLGregorianCalendar> value) {
        this.startedTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the endedTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndedTime() {
        return endedTime;
    }

    /**
     * Sets the value of the endedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndedTime(JAXBElement<XMLGregorianCalendar> value) {
        this.endedTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the estimatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEstimatedTime() {
        return estimatedTime;
    }

    /**
     * Sets the value of the estimatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEstimatedTime(JAXBElement<Integer> value) {
        this.estimatedTime = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the estimatedRows property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEstimatedRows() {
        return estimatedRows;
    }

    /**
     * Sets the value of the estimatedRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEstimatedRows(JAXBElement<Integer> value) {
        this.estimatedRows = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rowsImported property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRowsImported() {
        return rowsImported;
    }

    /**
     * Sets the value of the rowsImported property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRowsImported(JAXBElement<Integer> value) {
        this.rowsImported = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rowsFailed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRowsFailed() {
        return rowsFailed;
    }

    /**
     * Sets the value of the rowsFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRowsFailed(JAXBElement<Integer> value) {
        this.rowsFailed = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the rowsIgnored property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRowsIgnored() {
        return rowsIgnored;
    }

    /**
     * Sets the value of the rowsIgnored property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRowsIgnored(JAXBElement<Integer> value) {
        this.rowsIgnored = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the importSummary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImportSummary() {
        return importSummary;
    }

    /**
     * Sets the value of the importSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImportSummary(JAXBElement<String> value) {
        this.importSummary = ((JAXBElement<String> ) value);
    }

}

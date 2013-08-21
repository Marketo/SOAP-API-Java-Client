
package com.marketo.mktows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationHeaderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenticationHeaderInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mktowsUserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestSignature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestTimestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="audit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticationHeaderInfo", propOrder = {
    "mktowsUserId",
    "requestSignature",
    "requestTimestamp",
    "audit",
    "mode"
})
@XmlRootElement(name = "AuthenticationHeader")
public class AuthenticationHeader {

    @XmlElement(required = true)
    protected String mktowsUserId;
    @XmlElement(required = true)
    protected String requestSignature;
    @XmlElement(required = true)
    protected String requestTimestamp;
    protected String audit;
    protected Integer mode;

    /**
     * Gets the value of the mktowsUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktowsUserId() {
        return mktowsUserId;
    }

    /**
     * Sets the value of the mktowsUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktowsUserId(String value) {
        this.mktowsUserId = value;
    }

    /**
     * Gets the value of the requestSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestSignature() {
        return requestSignature;
    }

    /**
     * Sets the value of the requestSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestSignature(String value) {
        this.requestSignature = value;
    }

    /**
     * Gets the value of the requestTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTimestamp() {
        return requestTimestamp;
    }

    /**
     * Sets the value of the requestTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTimestamp(String value) {
        this.requestTimestamp = value;
    }

    /**
     * Gets the value of the audit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudit() {
        return audit;
    }

    /**
     * Sets the value of the audit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudit(String value) {
        this.audit = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMode(Integer value) {
        this.mode = value;
    }

}

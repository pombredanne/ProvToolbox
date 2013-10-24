package org.openprovenance.prov.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.builder.JAXBEqualsBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBHashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBToStringBuilder;
import org.openprovenance.prov.model.Attribute;


/**
 * <p>Java class for Influence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Influence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="influencee" type="{http://www.w3.org/ns/prov#}IDRef"/>
 *         &lt;element name="influencer" type="{http://www.w3.org/ns/prov#}IDRef"/>
 *         &lt;element ref="{http://www.w3.org/ns/prov#}label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/ns/prov#}type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/ns/prov#}id"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Influence", propOrder = {
    "influencee",
    "influencer",
    "label",
    //"type",
    //"any"
    "all"
})
public class WasInfluencedBy implements Equals, HashCode, ToString, org.openprovenance.prov.model.WasInfluencedBy, HasAllAttributes
{

    @XmlElement(required = true, type = org.openprovenance.prov.xml.IDRef.class)
    protected org.openprovenance.prov.model.IDRef influencee;
    @XmlElement(required = true, type = org.openprovenance.prov.xml.IDRef.class)
    protected org.openprovenance.prov.model.IDRef influencer;
    @XmlElement(type = org.openprovenance.prov.xml.InternationalizedString.class)
    protected List<org.openprovenance.prov.model.InternationalizedString> label;
    
    transient protected List<org.openprovenance.prov.model.Type> type;
    transient protected List<org.openprovenance.prov.model.OtherAttribute> others;
    
    @XmlAnyElement
    protected List<Attribute> all;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/ns/prov#")
    protected QName id;

    /**
     * Gets the value of the influencee property.
     * 
     * @return
     *     possible object is
     *     {@link org.openprovenance.prov.xml.IDRef }
     *     
     */
    public org.openprovenance.prov.model.IDRef getInfluencee() {
        return influencee;
    }

    /**
     * Sets the value of the influencee property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.openprovenance.prov.xml.IDRef }
     *     
     */
    public void setInfluencee(org.openprovenance.prov.model.IDRef value) {
        this.influencee = value;
    }

    /**
     * Gets the value of the influencer property.
     * 
     * @return
     *     possible object is
     *     {@link org.openprovenance.prov.xml.IDRef }
     *     
     */
    public org.openprovenance.prov.model.IDRef getInfluencer() {
        return influencer;
    }

    /**
     * Sets the value of the influencer property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.openprovenance.prov.xml.IDRef }
     *     
     */
    public void setInfluencer(org.openprovenance.prov.model.IDRef value) {
        this.influencer = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the label property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.openprovenance.prov.xml.InternationalizedString }
     * 
     * 
     */
    public List<org.openprovenance.prov.model.InternationalizedString> getLabel() {
        if (label == null) {
            label = new ArrayList<org.openprovenance.prov.model.InternationalizedString>();
        }
        return this.label;
    }

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.openprovenance.prov.xml.Type }
     * 
     * 
     */


    public List<org.openprovenance.prov.model.Type> getType() {
        if (type == null) {
            type=AttributeList.populateKnownAttributes(this,all, org.openprovenance.prov.model.Type.class);
        } 
        return this.type;
    }


    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    

    public List<Attribute> getAny() {
  	System.out.println("** legacy getAny()");
  	return null;
      }

    public List<org.openprovenance.prov.model.OtherAttribute> getOthers() {
	if (others == null) {
	    others=AttributeList.populateKnownAttributes(this,all, org.openprovenance.prov.model.OtherAttribute.class);
	} 
	return this.others;
    }
     
    
    /** Gets the List of all attributes
     * @see org.openprovenance.prov.xml.HasAllAttributes#getAll()
     */
    @Override
    public List<Attribute> getAllAttributes() {
        if (all == null) {
            all = new SortedAttributeList<Attribute>();
        }
        return this.all;
    }
 

    
    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setId(QName value) {
        this.id = value;
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof WasInfluencedBy)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final WasInfluencedBy that = ((WasInfluencedBy) object);
        equalsBuilder.append(this.getInfluencee(), that.getInfluencee());
        equalsBuilder.append(this.getInfluencer(), that.getInfluencer());
        equalsBuilder.append(this.getLabel(), that.getLabel());
        equalsBuilder.append(this.getType(), that.getType());
        equalsBuilder.append(this.getOthers(), that.getOthers());
        equalsBuilder.append(this.getId(), that.getId());
    }

    public boolean equals(Object object) {
        if (!(object instanceof WasInfluencedBy)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EqualsBuilder equalsBuilder = new JAXBEqualsBuilder();
        equals(object, equalsBuilder);
        return equalsBuilder.isEquals();
    }

    public void hashCode(HashCodeBuilder hashCodeBuilder) {
        hashCodeBuilder.append(this.getInfluencee());
        hashCodeBuilder.append(this.getInfluencer());
        hashCodeBuilder.append(this.getLabel());
        hashCodeBuilder.append(this.getType());
        hashCodeBuilder.append(this.getOthers());
        hashCodeBuilder.append(this.getId());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            org.openprovenance.prov.model.IDRef theInfluencee;
            theInfluencee = this.getInfluencee();
            toStringBuilder.append("influencee", theInfluencee);
        }
        {
            org.openprovenance.prov.model.IDRef theInfluencer;
            theInfluencer = this.getInfluencer();
            toStringBuilder.append("influencer", theInfluencer);
        }
        {
            List<org.openprovenance.prov.model.InternationalizedString> theLabel;
            theLabel = this.getLabel();
            toStringBuilder.append("label", theLabel);
        }
        {
            List<org.openprovenance.prov.model.Type> theType;
            theType = this.getType();
            toStringBuilder.append("type", theType);
        }
        {
            List<org.openprovenance.prov.model.OtherAttribute> theOthers;
            theOthers = this.getOthers();
            toStringBuilder.append("others", theOthers);
        }
        {
            QName theId;
            theId = this.getId();
            toStringBuilder.append("id", theId);
        }
        { //TODO: only now, for debugging.
            toStringBuilder.append("all", getAllAttributes());
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

}
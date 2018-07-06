//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.05.31 at 06:14:58 PM MSK
//


package com.thegrizzlylabs.sardineandroid.model;


import com.thegrizzlylabs.sardineandroid.ElementConverter;
import com.thegrizzlylabs.sardineandroid.util.SardineUtil;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>Java class for anonymous complex type.</p>
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <p>
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element ref="{DAV:}creationdate" minOccurs="0"/&gt;
 *         &lt;element ref="{DAV:}displayname" minOccurs="0"/&gt;
 *         &lt;element ref="{DAV:}getcontentlanguage" minOccurs="0"/&gt;
 *         &lt;element ref="{DAV:}getcontentlength" minOccurs="0"/&gt;
 *         &lt;element ref="{DAV:}getcontenttype" minOccurs="0"/&gt;
 *         &lt;element ref="{DAV:}getetag" minOccurs="0"/&gt;
 *         &lt;element ref="{DAV:}getlastmodified" minOccurs="0"/&gt;
 *         &lt;element ref="{DAV:}lockdiscovery" minOccurs="0"/&gt;
 *         &lt;element ref="{DAV:}resourcetype" minOccurs="0"/&gt;
 *         &lt;element ref="{DAV:}supportedlock" minOccurs="0"/&gt;
 *         &lt;element ref="{DAV:}quota-available-bytes" minOccurs="0"/&gt;
 *         &lt;element ref="{DAV:}quota-used-bytes" minOccurs="0"/&gt;
 *         &lt;any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */

@Root(strict = false)
@Namespace(prefix = "D", reference = "DAV:")
public class Prop {

    @Element(required = false)
    protected String creationdate;

    @Element(required = false)
    protected String displayname;

    @Element(required = false)
    protected String getcontentlanguage;

    @Element(required = false)
    protected String getcontentlength;

    @Element(required = false)
    protected String getcontenttype;

    @Element(required = false)
    protected String getetag;

    @Element(required = false)
    protected String getlastmodified;

    @Element(required = false)
    protected Lockdiscovery lockdiscovery;

    @Element(required = false)
    protected Resourcetype resourcetype;

    @Element(required = false)
    protected Supportedlock supportedlock;

    @Element(name = "quota-available-bytes", required = false)
    protected QuotaAvailableBytes quotaAvailableBytes;

    @Element(name = "quota-used-bytes", required = false)
    protected QuotaUsedBytes quotaUsedBytes;

    protected List<org.w3c.dom.Element> any;

    public Resourcetype getResourcetype() {
        return resourcetype;
    }

    public String getCreationdate() {
        return creationdate;
    }

    public String getGetlastmodified() {
        return getlastmodified;
    }

    public String getGetetag() {
        return getetag;
    }

    public String getGetcontenttype() {
        return getcontenttype;
    }

    public String getGetcontentlength() {
        return getcontentlength;
    }

    public String getGetcontentlanguage() {
        return getcontentlanguage;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public void setGetcontentlanguage(String getcontentlanguage) {
        this.getcontentlanguage = getcontentlanguage;
    }

    public void setGetcontentlength(String getcontentlength) {
        this.getcontentlength = getcontentlength;
    }

    public void setGetcontenttype(String getcontenttype) {
        this.getcontenttype = getcontenttype;
    }

    public void setGetetag(String getetag) {
        this.getetag = getetag;
    }

    public void setGetlastmodified(String getlastmodified) {
        this.getlastmodified = getlastmodified;
    }

    //ACL elements
    @Element(required = false)
    protected Owner owner;

    @Element(required = false)
    protected Group group;

    @Element(required = false)
    protected Acl acl;


    @Element(name="principal-collection-set", required = false)
    protected PrincipalCollectionSet principalCollectionSet;

    @Element(name="principal-URL", required = false)
    protected PrincipalURL principalURL;

    /**
     * Gets the value of the lockdiscovery property.
     *
     * @return possible object is
     * {@link Lockdiscovery }
     */
    public Lockdiscovery getLockdiscovery() {
        return lockdiscovery;
    }

    /**
     * Sets the value of the lockdiscovery property.
     *
     * @param value allowed object is
     *              {@link Lockdiscovery }
     */
    public void setLockdiscovery(Lockdiscovery value) {
        this.lockdiscovery = value;
    }

    /**
     * Gets the value of the quotaAvailableBytes property.
     *
     * @return possible object is
     * {@link QuotaAvailableBytes }
     */
    public QuotaAvailableBytes getQuotaAvailableBytes() {
        return quotaAvailableBytes;
    }

    /**
     * Sets the value of the quotaAvailableBytes property.
     *
     * @param value allowed object is
     *              {@link QuotaAvailableBytes }
     */
    public void setQuotaAvailableBytes(QuotaAvailableBytes value) {
        this.quotaAvailableBytes = value;
    }

    /**
     * Gets the value of the quotaUsedBytes property.
     *
     * @return possible object is
     * {@link QuotaUsedBytes }
     */
    public QuotaUsedBytes getQuotaUsedBytes() {
        return quotaUsedBytes;
    }

    /**
     * Sets the value of the quotaUsedBytes property.
     *
     * @param value allowed object is
     *              {@link QuotaUsedBytes }
     */
    public void setQuotaUsedBytes(QuotaUsedBytes value) {
        this.quotaUsedBytes = value;
    }

    /**
     * Gets the value of the any property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     */
    public List<org.w3c.dom.Element> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Acl getAcl() {
        return acl;
    }

    public void setAcl(Acl acl) {
        this.acl = acl;
    }

	public PrincipalCollectionSet getPrincipalCollectionSet() {
		return principalCollectionSet;
	}

	public void setPrincipalCollectionSet(PrincipalCollectionSet principalCollectionSet) {
		this.principalCollectionSet = principalCollectionSet;
	}

	public PrincipalURL getPrincipalURL() {
		return principalURL;
	}

	public void setPrincipalURL(PrincipalURL principalURL) {
		this.principalURL = principalURL;
	}

    public static class PropConverter implements Converter<Prop> {

        private Serializer serializer;

        public PropConverter(Serializer serializer) {
            this.serializer = serializer;
        }

        private Map<String, Field> getPropElements() {
            Map<String, Field> elementsFields = new HashMap<>();
            for (Field field : Prop.class.getDeclaredFields()) {
                Element fieldAnnotation = field.getAnnotation(Element.class);
                if (fieldAnnotation != null) {
                    String name = fieldAnnotation.name().equals("") ? field.getName() : fieldAnnotation.name();
                    elementsFields.put(name, field);
                }
            }
            return elementsFields;
        }

        @Override
        public Prop read(InputNode node) throws Exception {
            Map<String, Field> propElements = getPropElements();
            Prop prop = new Prop();
            List<org.w3c.dom.Element> anyElements = prop.getAny();
            InputNode childNode;
            while((childNode = node.getNext()) != null) {
                if (propElements.containsKey(childNode.getName())) {
                    Field field = propElements.get(childNode.getName());
                    field.set(prop, serializer.read(field.getType(), childNode));
                } else {
                    org.w3c.dom.Element element = ElementConverter.read(childNode);
                    anyElements.add(element);
                }
            }
            return prop;
        }

        @Override
        public void write(OutputNode node, Prop prop) throws Exception {
            for(org.w3c.dom.Element domElement : prop.getAny()) {
                ElementConverter.write(node, domElement);
            }
            Map<String, Field> propElements = getPropElements();
            for (String fieldName : propElements.keySet()) {
                Field field = propElements.get(fieldName);
                Object value = field.get(prop);
                if (value == null) {
                    continue;
                }
                if (value instanceof String) {
                    OutputNode childNode = node.getChild(fieldName);
                    childNode.setReference(SardineUtil.DEFAULT_NAMESPACE_URI);
                    childNode.setValue((String)value);
                } else {
                    serializer.write(field.getType(), node);
                }
            }
        }
    }
}

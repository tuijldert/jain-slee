/*
 * JBoss, Home of Professional Open Source
 *
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a full listing
 * of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU General Public License, v. 2.0.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License,
 * v. 2.0 along with this distribution; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */
package org.mobicents.slee.resource.diameter.sh.events.avp.userdata;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import net.java.slee.resource.diameter.sh.events.avp.userdata.PublicIdentity;
import net.java.slee.resource.diameter.sh.events.avp.userdata.PublicIdentityExtension;


/**
 * <p>Java class for tPublicIdentity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tPublicIdentity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IMSPublicIdentity" type="{}tIMSPublicIdentity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MSISDN" type="{}tMSISDN" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Extension" type="{}tPublicIdentityExtension" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPublicIdentity", propOrder = {
    "imsPublicIdentity",
    "msisdn",
    "extension",
    "any"
})
public class TPublicIdentity implements PublicIdentity {

    @XmlElement(name = "IMSPublicIdentity")
    protected List<String> imsPublicIdentity;
    @XmlElement(name = "MSISDN")
    protected List<String> msisdn;
    @XmlElement(name = "Extension")
    protected PublicIdentityExtension extension;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.PublicIdentity#getIMSPublicIdentity()
     */
    public List<String> getIMSPublicIdentity() {
        if (imsPublicIdentity == null) {
            imsPublicIdentity = new ArrayList<String>();
        }
        return this.imsPublicIdentity;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.PublicIdentity#getMSISDN()
     */
    public List<String> getMSISDN() {
        if (msisdn == null) {
            msisdn = new ArrayList<String>();
        }
        return this.msisdn;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.PublicIdentity#getExtension()
     */
    public PublicIdentityExtension getExtension() {
        return extension;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.PublicIdentity#setExtension(org.mobicents.slee.resource.diameter.sh.events.avp.userdata.TPublicIdentityExtension)
     */
    public void setExtension(PublicIdentityExtension value) {
        this.extension = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.PublicIdentity#getAny()
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
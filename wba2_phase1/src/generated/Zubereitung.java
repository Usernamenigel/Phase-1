//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.13 um 09:55:47 PM CEST 
//


package generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Beschreibung"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{}Arbeitszeit"/>
 *       &lt;attribute ref="{}Schwierigkeit"/>
 *       &lt;attribute ref="{}Brennwert"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "beschreibung"
})
@XmlRootElement(name = "Zubereitung")
public class Zubereitung {

    @XmlElement(name = "Beschreibung", required = true)
    protected Beschreibung beschreibung;
    @XmlAttribute(name = "Arbeitszeit")
    protected BigInteger arbeitszeit;
    @XmlAttribute(name = "Schwierigkeit")
    protected String schwierigkeit;
    @XmlAttribute(name = "Brennwert")
    protected BigInteger brennwert;

    /**
     * Ruft den Wert der beschreibung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Beschreibung }
     *     
     */
    public Beschreibung getBeschreibung() {
        return beschreibung;
    }

    /**
     * Legt den Wert der beschreibung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Beschreibung }
     *     
     */
    public void setBeschreibung(Beschreibung value) {
        this.beschreibung = value;
    }

    /**
     * Ruft den Wert der arbeitszeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getArbeitszeit() {
        return arbeitszeit;
    }

    /**
     * Legt den Wert der arbeitszeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setArbeitszeit(BigInteger value) {
        this.arbeitszeit = value;
    }

    /**
     * Ruft den Wert der schwierigkeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchwierigkeit() {
        return schwierigkeit;
    }

    /**
     * Legt den Wert der schwierigkeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchwierigkeit(String value) {
        this.schwierigkeit = value;
    }

    /**
     * Ruft den Wert der brennwert-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBrennwert() {
        return brennwert;
    }

    /**
     * Legt den Wert der brennwert-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBrennwert(BigInteger value) {
        this.brennwert = value;
    }

}

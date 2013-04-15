//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.13 um 09:55:47 PM CEST 
//


package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Bild_QNAME = new QName("", "Bild");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Kochbuch }
     * 
     */
    public Kochbuch createKochbuch() {
        return new Kochbuch();
    }

    /**
     * Create an instance of {@link Rezept }
     * 
     */
    public Rezept createRezept() {
        return new Rezept();
    }

    /**
     * Create an instance of {@link Zutaten }
     * 
     */
    public Zutaten createZutaten() {
        return new Zutaten();
    }

    /**
     * Create an instance of {@link Zutat }
     * 
     */
    public Zutat createZutat() {
        return new Zutat();
    }

    /**
     * Create an instance of {@link Zubereitung }
     * 
     */
    public Zubereitung createZubereitung() {
        return new Zubereitung();
    }

    /**
     * Create an instance of {@link Beschreibung }
     * 
     */
    public Beschreibung createBeschreibung() {
        return new Beschreibung();
    }

    /**
     * Create an instance of {@link Schritt }
     * 
     */
    public Schritt createSchritt() {
        return new Schritt();
    }

    /**
     * Create an instance of {@link Kommentare }
     * 
     */
    public Kommentare createKommentare() {
        return new Kommentare();
    }

    /**
     * Create an instance of {@link Benutzer }
     * 
     */
    public Benutzer createBenutzer() {
        return new Benutzer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Bild")
    public JAXBElement<String> createBild(String value) {
        return new JAXBElement<String>(_Bild_QNAME, String.class, null, value);
    }

}

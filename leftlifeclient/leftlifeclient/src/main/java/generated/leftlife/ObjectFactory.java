
package generated.leftlife;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.leftlife package. 
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

    private final static QName _AnneesRestantesAVivreResponse_QNAME = new QName("http://lifeleft.com/", "anneesRestantesAVivreResponse");
    private final static QName _AnneesRestantesAVivre_QNAME = new QName("http://lifeleft.com/", "anneesRestantesAVivre");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.leftlife
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnneesRestantesAVivre }
     * 
     */
    public AnneesRestantesAVivre createAnneesRestantesAVivre() {
        return new AnneesRestantesAVivre();
    }

    /**
     * Create an instance of {@link AnneesRestantesAVivreResponse }
     * 
     */
    public AnneesRestantesAVivreResponse createAnneesRestantesAVivreResponse() {
        return new AnneesRestantesAVivreResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnneesRestantesAVivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lifeleft.com/", name = "anneesRestantesAVivreResponse")
    public JAXBElement<AnneesRestantesAVivreResponse> createAnneesRestantesAVivreResponse(AnneesRestantesAVivreResponse value) {
        return new JAXBElement<AnneesRestantesAVivreResponse>(_AnneesRestantesAVivreResponse_QNAME, AnneesRestantesAVivreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnneesRestantesAVivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lifeleft.com/", name = "anneesRestantesAVivre")
    public JAXBElement<AnneesRestantesAVivre> createAnneesRestantesAVivre(AnneesRestantesAVivre value) {
        return new JAXBElement<AnneesRestantesAVivre>(_AnneesRestantesAVivre_QNAME, AnneesRestantesAVivre.class, null, value);
    }

}

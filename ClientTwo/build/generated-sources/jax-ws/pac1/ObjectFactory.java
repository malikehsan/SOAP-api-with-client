
package pac1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pac1 package. 
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

    private final static QName _HelloResponse_QNAME = new QName("http://pac1/", "helloResponse");
    private final static QName _Operation3_QNAME = new QName("http://pac1/", "operation3");
    private final static QName _Hello_QNAME = new QName("http://pac1/", "hello");
    private final static QName _Operation3Response_QNAME = new QName("http://pac1/", "operation3Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pac1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Operation3 }
     * 
     */
    public Operation3 createOperation3() {
        return new Operation3();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Operation3Response }
     * 
     */
    public Operation3Response createOperation3Response() {
        return new Operation3Response();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pac1/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pac1/", name = "operation3")
    public JAXBElement<Operation3> createOperation3(Operation3 value) {
        return new JAXBElement<Operation3>(_Operation3_QNAME, Operation3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pac1/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pac1/", name = "operation3Response")
    public JAXBElement<Operation3Response> createOperation3Response(Operation3Response value) {
        return new JAXBElement<Operation3Response>(_Operation3Response_QNAME, Operation3Response.class, null, value);
    }

}

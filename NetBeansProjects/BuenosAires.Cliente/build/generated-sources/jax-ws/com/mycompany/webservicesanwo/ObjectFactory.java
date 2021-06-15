
package com.mycompany.webservicesanwo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.webservicesanwo package. 
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

    private final static QName _ConsultarProductos_QNAME = new QName("http://webservicesanwo.mycompany.com/", "ConsultarProductos");
    private final static QName _ConsultarProductosDisponiblesResponse_QNAME = new QName("http://webservicesanwo.mycompany.com/", "ConsultarProductosDisponiblesResponse");
    private final static QName _ConsultarProductosResponse_QNAME = new QName("http://webservicesanwo.mycompany.com/", "ConsultarProductosResponse");
    private final static QName _ConsultarProductosDisponibles_QNAME = new QName("http://webservicesanwo.mycompany.com/", "ConsultarProductosDisponibles");
    private final static QName _ReservarProductoResponse_QNAME = new QName("http://webservicesanwo.mycompany.com/", "ReservarProductoResponse");
    private final static QName _ReservarProducto_QNAME = new QName("http://webservicesanwo.mycompany.com/", "ReservarProducto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.webservicesanwo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarProductos }
     * 
     */
    public ConsultarProductos createConsultarProductos() {
        return new ConsultarProductos();
    }

    /**
     * Create an instance of {@link ConsultarProductosDisponiblesResponse }
     * 
     */
    public ConsultarProductosDisponiblesResponse createConsultarProductosDisponiblesResponse() {
        return new ConsultarProductosDisponiblesResponse();
    }

    /**
     * Create an instance of {@link ConsultarProductosResponse }
     * 
     */
    public ConsultarProductosResponse createConsultarProductosResponse() {
        return new ConsultarProductosResponse();
    }

    /**
     * Create an instance of {@link ConsultarProductosDisponibles }
     * 
     */
    public ConsultarProductosDisponibles createConsultarProductosDisponibles() {
        return new ConsultarProductosDisponibles();
    }

    /**
     * Create an instance of {@link ReservarProductoResponse }
     * 
     */
    public ReservarProductoResponse createReservarProductoResponse() {
        return new ReservarProductoResponse();
    }

    /**
     * Create an instance of {@link ReservarProducto }
     * 
     */
    public ReservarProducto createReservarProducto() {
        return new ReservarProducto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesanwo.mycompany.com/", name = "ConsultarProductos")
    public JAXBElement<ConsultarProductos> createConsultarProductos(ConsultarProductos value) {
        return new JAXBElement<ConsultarProductos>(_ConsultarProductos_QNAME, ConsultarProductos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProductosDisponiblesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesanwo.mycompany.com/", name = "ConsultarProductosDisponiblesResponse")
    public JAXBElement<ConsultarProductosDisponiblesResponse> createConsultarProductosDisponiblesResponse(ConsultarProductosDisponiblesResponse value) {
        return new JAXBElement<ConsultarProductosDisponiblesResponse>(_ConsultarProductosDisponiblesResponse_QNAME, ConsultarProductosDisponiblesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProductosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesanwo.mycompany.com/", name = "ConsultarProductosResponse")
    public JAXBElement<ConsultarProductosResponse> createConsultarProductosResponse(ConsultarProductosResponse value) {
        return new JAXBElement<ConsultarProductosResponse>(_ConsultarProductosResponse_QNAME, ConsultarProductosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProductosDisponibles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesanwo.mycompany.com/", name = "ConsultarProductosDisponibles")
    public JAXBElement<ConsultarProductosDisponibles> createConsultarProductosDisponibles(ConsultarProductosDisponibles value) {
        return new JAXBElement<ConsultarProductosDisponibles>(_ConsultarProductosDisponibles_QNAME, ConsultarProductosDisponibles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesanwo.mycompany.com/", name = "ReservarProductoResponse")
    public JAXBElement<ReservarProductoResponse> createReservarProductoResponse(ReservarProductoResponse value) {
        return new JAXBElement<ReservarProductoResponse>(_ReservarProductoResponse_QNAME, ReservarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesanwo.mycompany.com/", name = "ReservarProducto")
    public JAXBElement<ReservarProducto> createReservarProducto(ReservarProducto value) {
        return new JAXBElement<ReservarProducto>(_ReservarProducto_QNAME, ReservarProducto.class, null, value);
    }

}

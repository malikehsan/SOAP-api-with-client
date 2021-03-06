
package pack1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Calc1", targetNamespace = "http://pack1/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calc1 {


    /**
     * 
     * @param num1
     * @param num2
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://pack1/", className = "pack1.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://pack1/", className = "pack1.AddResponse")
    @Action(input = "http://pack1/Calc1/addRequest", output = "http://pack1/Calc1/addResponse")
    public int add(
        @WebParam(name = "num1", targetNamespace = "")
        int num1,
        @WebParam(name = "num2", targetNamespace = "")
        int num2);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://pack1/", className = "pack1.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://pack1/", className = "pack1.HelloResponse")
    @Action(input = "http://pack1/Calc1/helloRequest", output = "http://pack1/Calc1/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}

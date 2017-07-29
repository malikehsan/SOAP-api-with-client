/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pac1;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author malik
 */
@WebService(serviceName = "multiply")
@Stateless()
public class multiply {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation3")
    public int operation3(@WebParam(name = "parameter") int parameter, @WebParam(name = "parameter1") int parameter1) {
       
        return parameter+parameter1;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienttwo;

/**
 *
 * @author malik
 */
public class ClientTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(operation3(3,6));
    }

    private static int operation3(int parameter, int parameter1) {
        pac1.Multiply_Service service = new pac1.Multiply_Service();
        pac1.Multiply port = service.getMultiplyPort();
        return port.operation3(parameter, parameter1);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcclient;

/**
 *
 * @author malik
 */
public class CalcClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num = 15;
       int num2= 25; 
       
       System.out.println(add(num,num2));
    }

    private static int add(int num1, int num2) {
        pack1.Calc1_Service service = new pack1.Calc1_Service();
        pack1.Calc1 port = service.getCalc1Port();
        return port.add(num1, num2);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorclient;

/**
 *
 * @author Siva Cheerla
 */
public class CalculatorClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(addition(25, 65));
    }

    private static int addition(int num1, int num2) {
        com.siva.soap.CalculatorService_Service service = new com.siva.soap.CalculatorService_Service();
        com.siva.soap.CalculatorService port = service.getCalculatorServicePort();
        return port.addition(num1, num2);
    }

}

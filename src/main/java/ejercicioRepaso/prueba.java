/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioRepaso;

/**
 *
 * @author aleja
 */
public class prueba {
    
    public static void main(String[] args) {
        
        MiIP ip1 = new MiIP();
        MiIP ip2 = new MiIP("-1", "0", "190", "5");
        
        System.out.println("-------------------------------------------------");
        System.out.println(ip1.toString());
        System.out.println("-------------------------------------------------");
        System.out.println(ip2.toString());
        System.out.println(ip2.toStringBinary());
        System.out.println(ip2.toStringHex());
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author aleja
 */
public class ej08 {
    
    public static void main(String[] args) {
        
        //declaramos las variables que vamos a necesitar
        Scanner teclado = new Scanner(System.in);
        
        int longitud;
        int[] repeticiones;
        
        System.out.println("Longitud del array?");
        longitud = teclado.nextInt();
        
        repeticiones = new int[longitud];
        
        for (int i = 0; i < repeticiones.length; i++) {
            
            System.out.println("Numero de repeticiones la " 
                    + (i+1) + "a vez:");
            repeticiones[i] = teclado.nextInt();            
        }
        
        for (int i = 0; i < repeticiones.length; i++) {
            
            for (int j=0; j < repeticiones[i]; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
        }
    }
}

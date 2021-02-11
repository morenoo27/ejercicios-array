/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio26;

/**
 *
 * @author alejandro
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        Pila pila1 = new Pila(5);
        
        pila1.push('a');
        pila1.show();
        System.out.println("--------------------------------------------");
        pila1.push('f');
        pila1.show();
        System.out.println("--------------------------------------------");
        pila1.push('g');
        pila1.show();
        System.out.println("--------------------------------------------");
        pila1.push('z');
        pila1.show();
        System.out.println("--------------------------------------------");
        pila1.push('t');
        pila1.show();
        System.out.println("--------------------------------------------");
        pila1.push('q');
        pila1.show();
        System.out.println("--------------------------------------------");
        pila1.push('b');
        pila1.show();
        System.out.println("--------------------------------------------");
    }
}

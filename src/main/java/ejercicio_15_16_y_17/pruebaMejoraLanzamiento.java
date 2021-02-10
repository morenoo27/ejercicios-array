/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_15_16_y_17;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class pruebaMejoraLanzamiento {
    
    public static void main(String[] args) {
        
        //creamos un scanner
        Scanner teclado = new Scanner(System.in);
        
        //creamos la variable para el ejercicio 17
        int tiradas;
        System.out.println("Cuantas tiradas?");
        tiradas = teclado.nextInt();
        
        //una vez eso, creamos el objeto para la mejora
        mejoraLanzarMoneda tiradaMejorada = new mejoraLanzarMoneda(tiradas);
        
        tiradaMejorada.llenarArray();
        tiradaMejorada.imprimir();
        
        //de manera adiciona, podemos mostrar el numero de caras y de cruces
        System.out.println("Monedas de caras: " + tiradaMejorada.caras());
        System.out.println("Monedas de cruces: " + tiradaMejorada.cruz());
    }
}

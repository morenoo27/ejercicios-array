/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_15_16_y_17;


/**
 *
 * @author aleja
 */
public class pruebaLanzarMoneda {
    
    public static void main(String[] args) {
               
        //creamos un objeto para la clase lanzarMoneda
        lanzarMoneda tirada1 = new lanzarMoneda();

        tirada1.llenarArray();//con esto tiramos las monedas
        tirada1.imprimir();//mostramos los resultados
        
        //de manera adiciona, podemos mostrar el numero de caras y de cruces
        System.out.println("Monedas de caras: " + tirada1.caras());
        System.out.println("Monedas de cruces: " + tirada1.cruz());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_15_16_y_17;

import java.util.Random;

/**
 *
 * @author aleja
 */
public class lanzarMoneda {

    //atributo del lanzamonedas
    private boolean[] monedas = new boolean[1000];//longitud del array

    public lanzarMoneda() {
    }//como no hay nada, todo es nulo, entonces el array se inicualiza a false

    public static boolean lanzar() {

        //creamos el ramdon
        Random random = new Random();
        
        //aqui randomizamos el valor de la moneda(true o false)
        boolean moneda = random.nextBoolean();

        return moneda;
    }

    public boolean[] llenarArray() {

        //recorremos el array para tirar las monedas de una en una
        for (int i = 0; i < monedas.length; i++) {

            //almacenamos cada una de las tiradas en el array
            this.monedas[i] = lanzarMoneda.lanzar();

        }
        //devolvemos el array con los datos ya almacenados
        return monedas;
    }

    public int caras() {

        //inicializamos un contador de las que salen cara
        int caras = 0;

        for (int i = 0; i < monedas.length; i++) {

            if (monedas[i]) {
                caras++;
            }
        }

        return caras;
    }

    public int cruz() {

        int cruz = 0;

        for (int i = 0; i < monedas.length; i++) {

            if (!monedas[i]) {
                cruz++;
            }
        }

        return cruz;
    }

    public void imprimir() {
        
        //creamos un array para almacenar los resultado a iumprimir
        String[] resultados = new String[monedas.length];
        //el monedas.length ahi lo que hace es que los arrays vayan acorde y no 
        //ocurran bugs
        
        //iniciamos un for para almacenar cada uno de los resultados
        for (int i = 0; i < resultados.length; i++) {
            
            if (monedas[i]) {
                resultados[i] = "Cara";
            } else {
                resultados[i] = "Cruz";
            }
        }
        
        //otro for para imprimir los resultados
        for (int i = 0; i < resultados.length; i++) {
            
            System.out.println("La tirada numero " + (i+1) + " ha salido "
                + resultados[i]+".");
        }                    
    }
}

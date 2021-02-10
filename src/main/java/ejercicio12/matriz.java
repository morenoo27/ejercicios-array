/**
 * Declara e inicializa una matriz de caracteres de 2x3.
 * Implementa un método que recibe una matriz de caracteres y la imprime por
 * consola.
 */
package ejercicio12;

import java.util.Random;

/**
 *
 * @author aleja
 */
public class matriz {

    public static void main(String[] args) {

        //declaramos la matriz 2 x 3
        final int FILAS = 2;
        final int COLUMNAS = 2;
        int[][] matriz = new int[FILAS][COLUMNAS];

        //cramos un objeto random
        Random random = new Random();
        
        //matriz.length == FILA
        //matriz[i].length == columnas

        for (int i = 0; i < FILAS; i++) {
            //aqui recorreremos las columnas
            for (int j = 0; j < COLUMNAS; j++) {

                matriz[i][j] = random.nextInt(10);
            }
        }

        //lo mostramos
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                
                System.out.println(matriz[i][j]); 
            }
        }
    }
}

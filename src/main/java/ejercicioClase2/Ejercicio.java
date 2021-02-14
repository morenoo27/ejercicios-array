/**
 *
 * Mayor en fila y menor en columna
 *
 * vamos a tener dos ejemplos para comprobar si funciona el programa
 *
 * ejemplos:
 *
 *      1   2   12
 *      4   5   30
 *      18  5   47
 *
 * aqui se supone que deberia salir el 12
 */
package ejercicioClase2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Ejercicio {

    //declaramos la matriz de ints
    static int[][] matriz;

    //importamos el objeto random
    static Random random = new Random();

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Selecciona metodo:\n"
                + "1) Manual\n"
                + "2) Aleatorio");
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                //metodo para crear de manera manual
                generarManualmente();
                break;
            case 2:
                //generamos de forma aleatoria los numeros del array(llenando el array)
                generearAleatoria();
                break;
        }

        System.out.println("---------------------------------------");

        //una vez generada la matriz, lamostramos
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println("");
            System.out.println("---------------------------------------");
        }

        boolean numFilaPos = true, numColPos = true;
        int aux = 0;
        int j = 0;
        int i;

        //ahora vamosa com la seleccion
        for (i = 0; i < matriz.length; i++) {

            for (j = 0; j < matriz[i].length; j++) {

                aux = comprobar(i, j);

                if (aux != -1) {
                    break;
                }
            }
            if (aux != -1) {
                break;
            }
        }

        //mostramos por pantalla el resultado
        if (aux != -1) {

            System.out.println("Solucion: " + aux + ", en la posicion (" + (i + 1) + "," + (j + 1) + ")");
        } else {

            System.out.println("No hay un numero que cumpla las normas");
        }
    }

    private static int comprobar(int i, int j) {

        boolean posCandidato = true, candidato = true;
        int numero = matriz[i][j], aux = 0;

        //primero comprobamos que el numero sea mayor que todos los de la FILA
        for (int k = 0; k < matriz[i].length; k++) {

            aux = matriz[i][k];
            //para ello miramos si hay alguno mayor, y si lo hay el candidato 
            //no sera el que buscamos
            if (numero < aux) {

                posCandidato = false;
                break;
            }
        }

        //una vez recorrido todo el array, y visto que no hay ninguno mayor 
        //que el en la fila, miramos si es el mas chico de la columna
        //si despues de comprobarlos todos, no se encuentra ninguno que cumpla
        //eso, dara -1
        if (posCandidato) {

            for (int h = 0; h < matriz.length; h++) {

                if (numero > aux) {

                    candidato = false;
                }
            }
        }

        //si finalmente, es el candidato que buscamos, 
        //devolveremos el numero que es
        if (posCandidato && candidato) {
            return numero;
        } else {
            return -1;
        }
    }

    private static void generearAleatoria() {

        //generamos aleatoriamente el tamaño de la matriz
        int tamañoMatriz = random.nextInt(10) + 1;

        matriz = new int[tamañoMatriz][tamañoMatriz];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = random.nextInt(50) + 1;
            }
        }
    }

    private static void generarManualmente() {

        //pedimos el tamaño de la matriz
        System.out.println("Tamaño?");
        int tamañoMatriz = teclado.nextInt();

        matriz = new int[tamañoMatriz][tamañoMatriz];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.println("Numero (" + i + "," + j + "):");
                matriz[i][j] = teclado.nextInt();
            }
        }
    }
}

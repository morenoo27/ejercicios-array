package ejercicio23;

import java.util.ArrayList;
import java.util.Random;

/*
Crear una clase que contenga como atributo una lista (ArrayList) de números enteros Integer.  Además tendrá los siguientes métodos:

    Generar lista, que genera una lista de números aleatorios en el intervalo [10 : 100]. 
    Imprimir la lista de números generados.
    Imprimir la suma de los números pares.
    Imprimir la cantidad de números impares. 
    Devolver el elemento mayor.
    Devolver el elemento menor.
    Obtener el tamaño de la lista.
    Borrar un elemento de la lista, según su posición.
    Borrar un elemento de la lista, según su valor. Si hay varios, los borra todos.
    Modificar un elemento de la lista, según su posición

 */
/**
 *
 * @author alejandro
 */
public class Ejercicio23 {

    private static ArrayList<Integer> numeros;

    public Ejercicio23(int aux) {

        numeros = new ArrayList<>(aux);//definimos la longitud
        generarLista(aux); //accedemos al metodo
    }

    public void imprimir() {

        numeros.forEach(System.out::println); //muestra cada uno de los elementos del arraylist
    }

    public void sumaPares() {

        //creamosun contador auxiliar
        int aux = 0;
        //recorremos el array con un for
        for (int i = 0; i < numeros.size(); i++) {

            if (numeros.get(i) % 2 == 0) {
                aux += numeros.get(i);
            }
        }

        System.out.println("Suma de toso los pares: " + aux);
    }

    public void sumaImpares() {

        //creamosun contador auxiliar
        int aux = 0;
        //recorremos el array con un for
        for (int i = 0; i < numeros.size(); i++) {

            if (!(numeros.get(i) % 2 == 0)) {
                aux++;
            }
        }

        System.out.println("Suma de numeros impares: " + aux);
    }

    public int compararMayor() {

        //creamos el numero mayor
        int mayor = 0;

        //recorremos el el array
        for (int i = 0; i < numeros.size(); i++) {

            if (mayor < numeros.get(i)) {
                mayor = numeros.get(i);
            }
        }
        return mayor;
    }

    public int compararMenor() {

        //creamos el numero mayor
        int menor = numeros.get(0);

        //recorremos el el array
        for (int i = 0; i < numeros.size(); i++) {

            if (menor > numeros.get(i)) {
                menor = numeros.get(i);
            }
        }
        return menor;
    }

    public void longitud() {

        System.out.println("La longitud del array es: " + numeros.size());
    }

    public void quitar(int aux) {

        numeros.remove(aux);
    }

    public void borrarValor(int aux) {

        for (int i = 0; i < numeros.size(); i++) {

            if (numeros.get(i) == aux) {
                numeros.remove(i);
            }
        }
    }
    
    public void modificar (int posicion, int numero) {
        
        numeros.set(posicion, numero);
    }

    private static void generarLista(int aux) {

        Random random = new Random();//generamos objeto random

        if (aux > 0) {
            for (int i = 0; i < aux; i++) {

                int n = 10, m = 100;
                int enteroAleatorio = random.nextInt(m - n + 1) + n;
                numeros.add(enteroAleatorio);
            }
        } else if (aux < 0) {
            Math.abs(aux);//lo convertimos en positivo
            for (int i = 0; i < aux; i++) {

                int n = 10, m = 100;
                int enteroAleatorio = random.nextInt(m - n + 1) + n;
                numeros.add(enteroAleatorio);
            }
        } else {
            System.out.println("No hay numeros suficienntes para crear array");
        }
    }    
}

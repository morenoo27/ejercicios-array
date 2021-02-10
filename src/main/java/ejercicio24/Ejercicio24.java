/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author aleja
 */
public class Ejercicio24 {

    private ArrayList<Integer> numeros;

    public Ejercicio24(int numero1, int numero2) {

        this.numeros = new ArrayList<>();//arraylist no hace falta tamaño
        
        int aux = generarAleatorio(numero1, numero2);

        for (int i = 0; i < aux; i++) {

            this.numeros.add(generarAleatorio(50, 100));
        }
    }

    public Ejercicio24() {

        this.numeros = new ArrayList<>();
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    public void imprimir() {

        this.numeros.forEach(System.out::println); //muestra cada uno de los elementos del arraylist
    }
    
    public ArrayList almacenarPares() {
        
        ArrayList<Integer> numerosPares = new ArrayList<>();
        
        //pillamos el arrayList del objeto y lo recorremos con un for
        for (int i = 0; i < this.numeros.size(); i++) {

            if (this.numeros.get(i) %2 == 0) {
                
                numerosPares.add(this.numeros.get(i));
            }
        }
        return numerosPares;
    }
    
    public ArrayList almacenarImpares() {
        
        ArrayList<Integer> numerosImpares = new ArrayList<>();
        
        //pillamos el arrayList del objeto y lo recorremos con un for
        for (int i = 0; i < this.numeros.size(); i++) {

            if (this.numeros.get(i) %2 != 0) {
                
                numerosImpares.add(this.numeros.get(i));
            }
        }
        return numerosImpares;
    }
    
    public static Ejercicio24 clonar1pero2NO(Ejercicio24 objeto1, Ejercicio24 objeto2) {

        //aqui recibimos objetos que tienen DENTRO arraylists, entonces los que 
        //necesitamos es el arraylist del objeto, por lo tanto tenemos que 
        //primero recibir dicho arraylist con el metodo getNumeros() y despues 
        //usarlo como si fuera un arraylist con sus metodos propios de los
        //arraylists
        Ejercicio24 lista = new Ejercicio24();

        ArrayList<Integer> listacopiada = new ArrayList<>();

        boolean noEsta = true;//con true nos referimos 

        for (int i = 0; i < objeto1.getNumeros().size(); i++) {

            //vamos a recibir el primer numero de la lista en un auxiliar
            int aux = objeto1.getNumeros().get(i);
  
            noEsta = true;
            
            for (int j = 0; j < objeto2.getNumeros().size(); j++) {

                if (aux == objeto2.getNumeros().get(j)) {
                    noEsta = false;
                }
            }
            if (noEsta) {
                listacopiada.add(aux);
            }
        }
        
        /**
         * y aqui, como tenemos un arraylist, hacemos un set para meter dicho
         * array en el objeto
         */
        lista.setNumeros(listacopiada);

        return lista;
    }

    private static int generarAleatorio(int numero1, int numero2) {

        Random random = new Random();

        int enteroAleatorio = random.nextInt(numero2 - numero1 + 1) + numero1;

        return enteroAleatorio;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24;

import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class prueba {
    
    public static void main(String[] args) {
        
        Ejercicio24 lista1 = new Ejercicio24(5, 15);
        //creamos la lista uno con los valores que queremos
        
        Ejercicio24 lista2 = new Ejercicio24(10, 20);
        
        
        System.out.println("Lista 1:");
        lista1.imprimir();//imprimimos lista 1
        System.out.println("Lista 2:");
        lista2.imprimir();
        
        Ejercicio24 lista3 = new Ejercicio24();//ceramos una lista por defecto
        lista3 = Ejercicio24.clonar1pero2NO(lista1, lista2);
        //usamos el metodo clonarlo
        //explicacion del funcionamiento en la clase
        
        System.out.println("Lista 3:");
        lista3.imprimir();
        
        
        Ejercicio24 lista4 = new Ejercicio24();
        
        //creamos el array list pares con los pares de la lista 1
        ArrayList<Integer> pares = lista1.almacenarPares();
        
        ArrayList<Integer> impares = lista2.almacenarImpares(); 
        
        //metemos el array list que queramos priemro
        lista4.setNumeros(pares);
        
        //luego con un for que recorra el arraylist que falta, añadimos los 
        //numeros que falten
        for (int i = 0; i < impares.size(); i++) {
            
            lista4.getNumeros().add(impares.get(i));
        }
        
        System.out.println("Lista 4:");
        lista4.imprimir();
    }
}

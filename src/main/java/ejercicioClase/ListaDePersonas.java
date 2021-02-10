/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioClase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author aleja
 */
public class ListaDePersonas {

    private ArrayList<Persona> Lista = new ArrayList<>();

    public void insertar(Persona persona) {

        Lista.add(persona);
    }

    public void borrar(int posisicion) {

        Lista.remove(posisicion);
    }

    public void modificar(int posicion, Persona persona) {

        Lista.set(posicion, persona);
    }

    public void imprimir() {

        for (int i = 0; i < Lista.size(); i++) {

            System.out.println(Lista.get(i).toString());
        }
    }

    public void ordenarPorNombres() {

        Comparator<Persona> criterio = (p1, p2) -> p1.getNombre().compareTo(p2.getNombre());
        Collections.sort(Lista, criterio);

    }

//    public void ordenarPorDNI() {
//
//        Comparator<Persona> criterio = (p1, p2) -> p1.getDNI().compareTo(p2.getDNI());
//        Collections.sort(Lista, criterio);
//    }

    public void ordenarPorApellidos() {

        Comparator<Persona> criterio = (p1, p2) -> p1.getApellido().compareTo(p2.getApellido());
        Collections.sort(Lista, criterio);
    }

    public int buscarPorNombre(Persona persona) {

        Comparator<Persona> criterio = (p1, p2) -> p1.getNombre().compareTo(p2.getNombre());
        
        Collections.sort(Lista, criterio);
        
        int aux = Collections.binarySearch(Lista, persona, criterio);

        return aux;
    }

//    public int buscarPorDNI(Persona persona) {
//
//        Comparator<Persona> criterio = (p1, p2) -> p1.getDNI().compareTo(p2.getDNI());
//    
//        Collections.sort(Lista, criterio);
//    
//        int aux = Collections.binarySearch(Lista, persona, criterio);
//
//        return aux;
//    }

    public int buscarPorApellidos(Persona persona) {

        Comparator<Persona> criterio = (p1, p2) -> p1.getApellido().compareTo(p2.getApellido());
        
        Collections.sort(Lista, criterio);
        
        int aux = Collections.binarySearch(Lista, persona, criterio);

        return aux;
    }

    public boolean estaVacio(int posicion) {

        return Lista.get(posicion) == null;
    }
}

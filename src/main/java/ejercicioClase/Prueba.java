/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioClase;

/**
 *
 * @author aleja
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        Persona yo = new Persona();
        
        Persona p1 = new Persona("Machocus", "Guapo", 5165132);
        Persona p2 = new Persona("Vico", "Grande", 3616547);
        Persona p3 = new Persona();
        
        
        p3.setNombre("Cristina");
        p3.setApellido("Guitierrez");
        p3.setDNI(65485215);
        
        ListaDePersonas lista = new ListaDePersonas();
        
        lista.insertar(yo);
        lista.insertar(p1);
        lista.insertar(p2);
        lista.insertar(p2);
        
        lista.imprimir();
        System.out.println("--------");
        lista.borrar(3);
        lista.imprimir();
        
        System.out.println("--------");
        
        lista.modificar(2, p3);
        lista.imprimir();

        System.out.println("--------");
        
        lista.ordenarPorApellidos();
        lista.imprimir();
        
        System.out.println("--------");
        
        int posicion = lista.buscarPorNombre(p2);
        System.out.println(posicion);        
    }
}

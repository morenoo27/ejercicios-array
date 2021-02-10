/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio23;

/**
 *
 * @author aleja
 */
public class prueba {

    public static void main(String[] args) {

        Ejercicio23 lista = new Ejercicio23(8);

        
        lista.imprimir();
        System.out.println("---------------LINGITUD--------------------------");
        lista.longitud();
        System.out.println("---------------MAYOR Y MENOR---------------------");
        System.out.println("Mayor: " + lista.compararMayor() + "  y menor: " + lista.compararMenor());
        System.out.println("---------------PARES E IMPARES-------------------");
        lista.sumaPares();
        lista.sumaImpares();
        System.out.println("-------------------ELIMINAR----------------------");
        lista.borrarValor(25);
        lista.quitar(3);
        lista.imprimir();
        System.out.println("-------------------MODIFICAR----------------------");
        lista.modificar(3, 11);
        lista.imprimir();
    }
}

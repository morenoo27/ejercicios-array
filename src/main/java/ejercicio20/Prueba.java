/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Prueba {
    
    static Scanner tec = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        
        Avion a1 = new Avion();
        Avion a2 = new Avion(20, 5);
        
        System.out.println("En que avion te quires subir: \n"
                + "1) Aerolineas Moreno\n"
                + "2) Chocus Airlines");
        int avion = tec.nextInt();
        
        switch(avion){
            case 1:
                avion1(a1);
                break;
            case 2:
                avion2(a2);
                break;
        }
    }

    private static void avion1(Avion a1) {
        
        int opcion = menu();
        
        switch(opcion){
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
        }
    }

    private static void avion2(Avion a2) {
        
        int opcion = menu();
        
        switch(opcion){
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                   
                break;
        }
    }

    private static int menu() {
        int opcion = 0;
        
        boolean repite = false;
        do {
            //mostramos por pantalla el mensaje
            System.out.println("1) Reservar\n"
                    + "2) Cancelar\n"
                    + "3) Salir\n");
            opcion = tec.nextInt();

            switch (opcion) {
                case 1:
                    opcion = 1;
                    break;
                case 2:
                    opcion = 2;
                    break;
                case 3:
                    System.out.println("¿Desea salir?");
                    
                    //captamos la prespuesta y comparamos si es si
                    String salir = tec.next();
                    if (salir.equalsIgnoreCase("si")) {
                        repite = true;
                    } else {
                        repite = false;
                    }
                    break;
                
            }
        } while (opcion < 1 || opcion > 3 || !repite);
        return opcion;
    }
}

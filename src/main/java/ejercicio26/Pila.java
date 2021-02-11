/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio26;

import java.util.ArrayList;

/**
 *
 * @author alejandro
 */
public class Pila {

    private ArrayList<Character> pila;
    private int totalPushes;

    public Pila(int numero) {

        this.pila = new ArrayList<>();
        this.totalPushes = numero;
    }

    public void push(char caracter) {

        if (this.pila.size() == this.totalPushes) {

            this.pila.remove(this.pila.size() - 1);

            this.pila.add(caracter);
        } else {

            this.pila.add(caracter);
        }

    }

    public void pop() {

        if (!this.isEmpty()) {
            this.pila.remove(this.pila.size() - 1);
        } else {
            System.out.println("No puedo eliminar si no hay nada en la pila bro");
        }
    }

    public boolean isFull() {

        if (this.pila.size() == this.totalPushes) {

            System.out.println("Pila llena");
            return true;
        }
        return false;
    }

    public boolean isEmpty() {

        if (this.pila.size() == 0) {//0 y null valdrian ambos ?

            System.out.println("Pila vacia");
            return true;
        }
        return false;
    }

    public void dimension() {

        System.out.println("Elementos en la pila: " + this.pila.size());
    }

    public void show() {

        for (int i = 0; i < this.pila.size(); i++) {

            System.out.println("| " + this.pila.get(i) + " |");
            System.out.println("-----");
        }
    }
}

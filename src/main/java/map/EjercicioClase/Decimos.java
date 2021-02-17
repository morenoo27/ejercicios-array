/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.EjercicioClase;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author alejandro
 */
public class Decimos {
    
    private String numero;
    
    
    static Random random = new Random();

    public Decimos() {
    
        this.numero = generarDecimo();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Decimos other = (Decimos) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }
    
    

    private String generarDecimo() {
        
        //creamos aleatoriament el numero del decimo con in Integer
        Integer numero = random.nextInt(100000);
        
        String numeroConvertido = String.valueOf(numero);
        
        //String numeroConvertido = String.valueOf(random.nextInt(100000));
        
        return numeroConvertido.format("%05d", numeroConvertido);
    }

    
    
    
}

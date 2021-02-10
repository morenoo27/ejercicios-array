/**
 * Inventar una clase con dos tres atributos
 * Incluir getters/setters/toString/equals/hashcode
 *
 * Crear una clase Lista de objetos para tu clase inventada
 * con los métodos típicos de insertar, borrar, obtener, modificar, imprimir
 *
 * Además incluir métodos para ordenar por un par de atributos y luego búsqueda
 * binaria por esos mismos atributos.
 * 
 */
package ejercicioClase;

import java.util.Objects;

/**
 *
 * @author alejandro
 */

public class Persona {

    private String nombre, apellido;
    private int DNI;

    public Persona() {

        this.DNI = 3216547;
        this.nombre = "Alejandro";
        this.apellido = "Moreno";
    }

    public Persona(String nombre, String apellido, int DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    //GETTERS AND SETTERS
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    //TO STRING
    
    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI;
    }

    //HASH CODE
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + Objects.hashCode(this.apellido);
        hash = 89 * hash + this.DNI;
        return hash;
    }

    //EQUALS
    
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
        final Persona other = (Persona) obj;
        if (this.DNI != other.DNI) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;


/**
 *
 * @author aleja
 */
public class Cancion {
    
    
    //definimos la variables que vamos a usar. Son de tipo String
    //Estas variables deben ser privadas
    private String titulo;
    private String autor;

    //creamos la clase por defecto
    public Cancion() {
        autor = "";
        titulo = "";
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }

    
}

package ar.edu.unahur.obj2.tp1;

import java.util.ArrayList;
import java.util.List;

public class Disco {
    private String titulo;
    private String autor;
    private Genero genero;
    public List<Cancion> canciones = new ArrayList<>();


    public Disco(String titulo, String autor, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

   /* public void agregarCancion(Cancion cancion) {
         canciones.add(cancion);
    }

    */

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Genero getGenero() {
        return genero;
    }

    /*public List<Cancion> getCanciones() {
        return canciones;
    }

     */

    @Override
    public String toString() {
        return "Disco{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero=" + genero +
               // ", canciones=" + canciones +
                '}';
    }
}

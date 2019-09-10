package ar.edu.unahur.obj2.tp1;

import java.util.ArrayList;
import java.util.List;

public class Disco implements Comparable<Disco>{
    private String titulo;
    private Artista artista;
    private Genero genero;
    public List<Cancion> canciones = new ArrayList<>();



    public Disco(String titulo, Artista artista, Genero genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
    }

   public void agregarCancion(Cancion cancion) {
         canciones.add(cancion);
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getAutor() {
        return artista;
    }

    public Genero getGenero() {
        return genero;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    @Override
    public int compareTo(Disco o) {
        return this.titulo.compareTo(o.getTitulo());
    }


    @Override
    public String toString() {
        return "Disco{" +
                "titulo='" + titulo + '\'' +
                ", genero=" + genero +
                '}';
    }
}

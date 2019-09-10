package ar.edu.unahur.obj2.tp1;

import java.util.ArrayList;
import java.util.List;

public class Cancion implements Comparable<Cancion>,Reproducible{
    private String titulo;
    private float duracion;
    private Artista artista;
    private Genero genero;
    public List<Disco> discosPertenece = new ArrayList<>();
    private int reproducciones = 0;

    public Cancion(String titulo, float duracion, Artista artista, Genero genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.artista = artista;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public Float getDuracion() {
        return duracion;
    }

    public Artista getNombreDeArtista() {
        return artista;
    }

    public Genero getGenero() {
        return genero;
    }

    public List<Disco> getDiscos() {
        return discosPertenece;
    }

    public void agregarDiscos(Disco disco) {
        discosPertenece.add(disco);
    }

    public int compareTo(Cancion c) {
      return this.titulo.compareTo(c.getTitulo());
    }

    @Override
    public void reproducir() {
        reproducciones++;
    }

    public int getReproducciones() {
        return reproducciones;
    }
    @Override
    public String toString() {
        return "Cancion{" +
                "titulo='" + titulo + '\'' +
                ", genero=" + genero +
                '}';
    }
}

package ar.edu.unahur.obj2.tp1;

import java.util.ArrayList;
import java.util.List;

public class Cancion implements Comparable<Cancion>{
    private String titulo;
    private int duracion;
    private String nombreAutor;
    public List<Disco> discosPertenece = new ArrayList<>();

    public Cancion(String titulo, int duracion, String nombreAutor) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.nombreAutor = nombreAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public List<Disco> getDiscos() {
        return discosPertenece;
    }

    public void agregarDiscos(Disco disco) {
        discosPertenece.add(disco);

    }

    public int compareTo(Cancion c) {
        int r;
        r = getTitulo().compareTo(c.getTitulo());
        if(r==0){
            r = getTitulo().compareTo(c.getTitulo());
        }
        return r;

    }



    @Override
    public String toString() {
        return "Cancion{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                ", nombreAutor='" + nombreAutor + '\'' +
                ", discosPertenece=" + discosPertenece +
                '}';
    }
}

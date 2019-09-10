package ar.edu.unahur.obj2.tp1;

import java.util.ArrayList;
import java.util.List;

public class Artista implements Comparable<Artista>{
    private String nombre;
    public List<Disco> discosDelArtista = new ArrayList<>();

    public Artista(String nombre) {
        this.nombre = nombre;
    }

    public void agregarDiscos(Disco disco) {
        discosDelArtista.add(disco);
    }


    public String getNombre() {
        return nombre;
    }

   public List<Disco> getDiscos() { return discosDelArtista; }


    @Override
    public int compareTo(Artista o) {
        return this.nombre.compareTo(o.getNombre());
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombre='" + nombre + '\'' +
                ", discos=" + discosDelArtista +
                '}';
    }


}

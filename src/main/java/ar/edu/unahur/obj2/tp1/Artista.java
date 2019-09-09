package ar.edu.unahur.obj2.tp1;

import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String nombre;
    public List<Disco> discosArtista = new ArrayList<>();

    public Artista(String nombre) {
        this.nombre = nombre;
    }

    public void agregarDiscos(Disco disco) {
        discosArtista.add(disco);
    }


    public String getNombre() {
        return nombre;
    }

   public List<Disco> getDiscos() { return discosArtista; }

    @Override
    public String toString() {
        return "Artista{" +
                "nombre='" + nombre + '\'' +
                ", discos=" + discosArtista +
                '}';
    }


}

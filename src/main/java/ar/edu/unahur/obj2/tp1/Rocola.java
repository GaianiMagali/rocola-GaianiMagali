package ar.edu.unahur.obj2.tp1;

import java.util.*;
import java.util.stream.Collectors;


public class Rocola{
     List<Disco> discosDisponibles = new ArrayList<>();
     List<Cancion> cancionesDisponibles = new ArrayList<>();
     private Cancion cancionRandom;
     Random rnd = new Random();
     int valorRandom = rnd.nextInt(cancionesDisponibles.size()+1);
     private float precioCancion = 10.50f;
     private float Saldo = 0;
     private float dineroRecaudado = 0;

    public void setPrecioCancion(float precioCancion) {
        this.precioCancion = precioCancion;
    }



    public void agregarDiscos(Disco disco) {
        discosDisponibles.add(disco);
    }

    public void agregarCanciones(Cancion cancion) {
        cancionesDisponibles.add(cancion);
    }

    public List<Disco> getDiscosRocola() {
        return discosDisponibles;
    }

    public List<Cancion> getCancionesRocola() {
        return cancionesDisponibles;
    }

    //CANCIONES ORDENADAS POR TITULO
    public List<Cancion> cancionesOrdenadas() {
        return getDiscosRocola().stream()
            .flatMap(d -> d.getCanciones().stream())
            .sorted()
            .collect(Collectors.toList());
    }

    //DISCOS ORDENADOS POR TITULO
    public List<Disco> discosOrdenados(){
        return getDiscosRocola().stream()
                .sorted()
                .collect(Collectors.toList());
    }

    //NOMBRES ORDENADOS POR NOMBRE
    public List<Artista> artistasOrdenados(){
        return getDiscosRocola().stream()
                .map(a -> a.getAutor())
                .sorted()
                .collect(Collectors.toList());
    }

    //DISCOS ORDENADOS POR GENERO

   public List<Disco> discosPorGenero(Genero genero) {
       return discosDisponibles.stream().filter(disco -> disco.getGenero().equals(genero))
               .sorted()
               .collect(Collectors.toList());
   }

   //CANCIONES POR GENERO
   public List<Cancion> cancionesPorGenero(Genero genero) {
      return cancionesOrdenadas().stream()
              .filter(disco -> disco.getGenero().equals(genero))
              .sorted()
              .collect(Collectors.toList());
   }

    public void reproducir(Cancion cancion){
        if(this.Saldo >= this.precioCancion) {
            cancion.reproducir();
            this.Saldo -= this.precioCancion;
            this.dineroRecaudado += this.precioCancion;
        }
        else{
            Exception exception = new RuntimeException("Saldo Insuficiente");
            System.out.println(exception);
        }
    }
    public void reproducir(Disco disco) {

        if (disco.getCanciones() != null && this.Saldo >= this.precioCancion * disco.getCanciones().size()) {
            disco.getCanciones().stream().forEach(c -> c.reproducir());
            this.Saldo -= this.precioCancion * disco.getCanciones().size();
            this.dineroRecaudado += this.precioCancion * disco.getCanciones().size();
        }
        else{
            Exception exception = new RuntimeException("Saldo Insuficiente");
            System.out.println(exception);
        }
    }

    public void reproducirCancionRamdon(){
        cancionRandom = getCancionesRocola().stream().collect(Collectors.toList())
                .get(valorRandom);
        cancionRandom.reproducir();
    }

    public float getSaldo() {
        return Saldo;
    }

    public void cargarSaldo(float saldo) {
        Saldo += saldo;
    }

    public float getDineroRecaudado() {
        return dineroRecaudado;
    }

    @Override
    public String toString() {
        return "Rocola{" +
                "discosDisponibles=" + discosDisponibles +
                '}';
    }
}

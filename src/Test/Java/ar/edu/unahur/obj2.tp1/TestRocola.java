package ar.edu.unahur.obj2.tp1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static ar.edu.unahur.obj2.tp1.Genero.*;

import static org.testng.Assert.assertEquals;

public class TestRocola {

    Rocola rocola;
    Disco disco1;
    Disco disco2;
    Disco disco3;
    Disco disco4;
    Disco disco5;
    Disco disco6;
    Cancion cancion1;
    Cancion cancion2;
    Cancion cancion3;
    Cancion cancion4;
    Cancion cancion5;
    Cancion cancion6;
    Artista artista1;
    Artista artista2;
    Artista artista3;
    Artista artista4;
    Artista artista5;
    Artista artista6;


    @BeforeMethod
    public void setUp() {

        //CREACION DE LA ROCOLA
        rocola = new Rocola();

        //Creacion de Artistas
        artista1 = new Artista("Slipknot");
        artista2 = new Artista("Michael Jackson");
        artista3 = new Artista("Eminem");
        artista4 = new Artista("Cazzu");
        artista5 = new Artista("Metallica");
        artista6 = new Artista("Billie Eilish");

        //CREACION DE DISCOS
        disco1 = new Disco("We Are Not Your Kind",artista1,Rock);
        disco2 = new Disco("Dangerous",artista2, Pop);
        disco3 = new Disco("Revival",artista3, HipHop);
        disco4 = new Disco("C14",artista4, Trap );
        disco5 = new Disco("Death Magnetic",artista5,Rock);
        disco6 = new Disco("When We All Fall Asleep, Where Do We Go?",artista6, Pop);

        //Creacion de canciones
       cancion1 = new Cancion("Spiders", 4.30f,artista1,Genero.Rock);
       cancion2 = new Cancion("Black or White", 4.30f,artista2,Genero.Pop);
       cancion3 = new Cancion("Castle", 4.06f,artista3,Genero.HipHop);
       cancion4 = new Cancion("Maldades",3.10f,artista4,Genero.Trap);
       cancion5 = new Cancion("The Unforgiven",5.03f,artista5,Genero.Rock);
       cancion6 = new Cancion("Bad Guy",3.14f,artista6,Genero.Pop);

        //DISCOS DISPONIBLES QUE POSSE LA ROCOLA
        rocola.agregarDiscos(disco1);
        rocola.agregarDiscos(disco2);
        rocola.agregarDiscos(disco3);
        rocola.agregarDiscos(disco4);
        rocola.agregarDiscos(disco5);
        rocola.agregarDiscos(disco6);

        //CANCIONES DISPONIBLES QUE POSSE LA ROCOLA
        rocola.agregarCanciones(cancion1);
        rocola.agregarCanciones(cancion2);
        rocola.agregarCanciones(cancion3);
        rocola.agregarCanciones(cancion4);
        rocola.agregarCanciones(cancion5);
        rocola.agregarCanciones(cancion6);

        //CANCIONES DE CADA DISCO
        disco1.agregarCancion(cancion1);
        disco2.agregarCancion(cancion2);
        disco3.agregarCancion(cancion3);
        disco4.agregarCancion(cancion4);
        disco5.agregarCancion(cancion5);
        disco6.agregarCancion(cancion6);

        //DISCOS A LOS QUE PERTENECE CADA CANCION
        cancion1.agregarDiscos(disco1);
        cancion2.agregarDiscos(disco2);
        cancion3.agregarDiscos(disco3);
        cancion4.agregarDiscos(disco4);
        cancion5.agregarDiscos(disco5);
        cancion6.agregarDiscos(disco6);

        //DISCOS DEL ARTISTA
        artista1.agregarDiscos(disco1);
        artista2.agregarDiscos(disco2);
        artista3.agregarDiscos(disco3);
        artista4.agregarDiscos(disco4);
        artista5.agregarDiscos(disco5);
        artista6.agregarDiscos(disco6);

    }

    //PARTE 1
    @Test
    protected void discosDisponiblesEnRocola() {
        List<Disco> discosRocola = Stream.of(disco1,disco2,disco3,disco4,disco5,disco6).collect(Collectors.toList());
        assertEquals(rocola.getDiscosRocola(),discosRocola);
    }

    @Test
    protected void CancionesDisponiblesRocola() {
        List<Cancion> cancionesDisponibles= Stream.of(cancion1,cancion2,cancion3,cancion4,cancion5,cancion6).collect(Collectors.toList());
        assertEquals(rocola.getCancionesRocola(),cancionesDisponibles);
    }

    @Test
    protected void cancionesPorDisco() {
        List<Cancion> cancionesDelDisco= Stream.of(cancion1).collect(Collectors.toList());
        assertEquals(disco1.getCanciones(),cancionesDelDisco);
    }


    @Test
    protected void discosPertenecientesAcancion() {
        List<Disco> cancionesDelDisco= Stream.of(disco2).collect(Collectors.toList());
        assertEquals(cancion2.getDiscos(),cancionesDelDisco);
    }

    @Test
    protected void discosDelArtista() {
        List<Disco> discos = Stream.of(disco4).collect(Collectors.toList());
        assertEquals(artista4.getDiscos(),discos);
    }


    @Test
    protected void ListarCancionesPorOrden() {
        List<Cancion> listaDeCancionesOrdenadas= Stream.of(cancion6,cancion2,cancion3,cancion4,cancion1,cancion5).collect(Collectors.toList());
        assertEquals(rocola.cancionesOrdenadas(),listaDeCancionesOrdenadas);
    }


    @Test
    protected void ListarDiscosPorOrden() {
        List<Disco> listaDiscosOrdenados = Stream.of(disco4,disco2,disco5,disco3,disco1,disco6).collect(Collectors.toList());
        assertEquals(rocola.discosOrdenados(),listaDiscosOrdenados);
    }

    @Test
    protected void ListarArtistasPorOrden() {
        List<Artista> listaArtistasOrdenados = Stream.of(artista6,artista4,artista3,artista5,artista2,artista1).collect(Collectors.toList());
        assertEquals(rocola.artistasOrdenados(),listaArtistasOrdenados);
    }

    @Test
    protected void DiscosPorGenero() {
        List<Disco> discosPop = Stream.of(disco2,disco6).collect(Collectors.toList());
        assertEquals(rocola.discosPorGenero(Genero.Pop),discosPop);
    }


    @Test
    protected void CancionesPorGenero() {
        List<Cancion> cancionesPop = Stream.of(cancion1,cancion5).collect(Collectors.toList());
        assertEquals(rocola.cancionesPorGenero(Genero.Rock),cancionesPop);
    }

    //PARTE 2

    @Test
    protected void reproducir(){
        rocola.cargarSaldo(70.50f);
        assertEquals(rocola.getSaldo(),70.50f);

        rocola.reproducir(cancion2);
        assertEquals(rocola.getSaldo(),60.0f);
        assertEquals(rocola.getDineroRecaudado(),10.50f);


        rocola.reproducir(disco1);
        assertEquals(rocola.getSaldo(),49.50f);
        assertEquals(rocola.getDineroRecaudado(),21.0f);

    }

    @Test
    protected void cantidadDeReproducciones(){
        rocola.cargarSaldo(70.50f);
        rocola.reproducir(cancion2);
        rocola.reproducir(cancion2);
        assertEquals(cancion2.getReproducciones(),2);
    }





}

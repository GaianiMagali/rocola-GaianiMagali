package ar.edu.unahur.obj2.tp1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static ar.edu.unahur.obj2.tp1.Genero.*;
import static ar.edu.unahur.obj2.tp1.Rocola.*;

public class TP1 {

    public static void main(String[] args) {

        //Creacion de discos
        Disco disco1 = new Disco("We Are Not Your Kind", "Slipknot", Rock);
        Disco disco2 = new Disco("Dangerous", "Michael Jackson", Pop);
        Disco disco3 = new Disco("Revival", "Eminem", HipHop);
        Disco disco4 = new Disco("C14", "Cazzu", Trap );
        Disco disco5 = new Disco("Obscure","John Adams",Clasico);
        Disco disco6 = new Disco("Planet Waves","Bob Dylan",Folk);

        //Creacion de canciones
        Cancion cancion1 = new Cancion("Spiders", 4, "Slipknot");
        Cancion cancion2 = new Cancion("Black or White", 4, "Michael Jackson");
        Cancion cancion3 = new Cancion("Castle", 4, "Eminem");
        Cancion cancion4 = new Cancion("Maldades",3,"Cazzu");
        Cancion cancion5 = new Cancion("American Standard",10,"John Adams");
        Cancion cancion6 = new Cancion("Forever Young",4,"Bob Dylan");

        //Creacion de Artistas
        Artista artista1 = new Artista("Slipknot");
        Artista artista2 = new Artista("Michael Jackson");
        Artista artista3 = new Artista("Eminem");
        Artista artista4 = new Artista("Cazzu");
        Artista artista5 = new Artista("John Adams");
        Artista artista6 = new Artista("Bob Dylan");

        //Creacion de Rocola

        artista1.agregarDiscos(disco1);
       // disco1.agregarCancion(cancion1);
        cancion1.agregarDiscos(disco1);


        List<Cancion> cancionesLista = Stream.of(cancion1,cancion3,cancion2).collect(Collectors.toList());
        Collections.sort(cancionesLista);

        List<Disco> discos = Stream.of(disco1,disco2).collect(Collectors.toList());

        Rocola rocola1 = new Rocola();
        rocola1.agregarDiscos(disco1);

        //System.out.println(discos);
        System.out.println(cancionesLista);
        System.out.println(rocola1);

    }
}
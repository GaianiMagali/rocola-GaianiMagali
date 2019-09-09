package ar.edu.unahur.obj2.tp1;

import java.util.ArrayList;
import java.util.List;


public class Rocola{
     List<Disco> discosDisponibles = new ArrayList<>();

    public void agregarDiscos(Disco disco) {
        discosDisponibles.add(disco);
    }

    @Override
    public String toString() {
        return "Rocola{" +
                "discosDisponibles=" + discosDisponibles +
                '}';
    }
}

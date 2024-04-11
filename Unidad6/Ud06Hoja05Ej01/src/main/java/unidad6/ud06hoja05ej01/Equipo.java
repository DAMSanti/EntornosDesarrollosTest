package unidad6.ud06hoja05ej01;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author DAM104
 */
public class Equipo {
    private SortedSet<Jugador> plantilla;

    public Equipo() {
        plantilla = new TreeSet<>(new JugadorComparator());
    }

    public void insertaJugador(Jugador jugador) {
        if (plantilla.add(jugador)) {
            System.out.println("El jugador ha sido añadido satisfactoriamente");
        } else {
            System.out.println("No se ha podido añadir el jugador a la lista.");
        }
    }

    public Jugador buscarJugador(String jugador) {
        Jugador encontrado = null;
        for (Jugador player : plantilla) {
            if (player.getNombre().equalsIgnoreCase(jugador)) {
                encontrado = player;
            }
        }
        if (encontrado == null) {
            System.out.println("No se ha encontrado el jugador.");
        }
        return encontrado;
    }

    public void borrarJugador(Jugador jugador) {
        if (jugador != null) {
            plantilla.remove(jugador);
        } else {
            System.out.println("No se puede borrar un jugador que no existe.");
        }

    }

    public String mostrar() {
        String cadena = "";
        Iterator<Jugador> it = plantilla.iterator();
        while (it.hasNext()) {
            cadena += String.format("%s\n", it.next().toString());
        }
        return cadena;
    }

    public Jugador masBajo() {
        /* double minest = 300;
        Jugador bajo = null;
        for (Jugador jugador : plantilla) {
            if (jugador.getEstatura()<minest) {
                minest = jugador.getEstatura();
                bajo = jugador;
            }
        }*/
        return plantilla.first();
        //return bajo;
    }
    
    public Jugador masAlto() {
        /*double maxest = 0;
        Jugador alto = null;
        for (Jugador jugador : plantilla) {
            if (jugador.getEstatura()>maxest) {
                maxest = jugador.getEstatura();
                alto = jugador;
            }
        }*/
        //return alto;
        return plantilla.last();
    }
    
    public SortedSet<Jugador> dosMetros() {
        SortedSet<Jugador> dosMetros;
        dosMetros = new TreeSet<>();
        for (Jugador jugador : plantilla) {
            if (jugador.getEstatura()>2) {
                dosMetros.add(jugador);
            }
        }
        return dosMetros;
    }
}

/*
 * 
 * 1.- Diseñar un programa para llevar el control de los jugadores de un equipo
 * de baloncesto. Para
 * ello crea la clase Jugador que tenga un nombre y una estatura. Tendrá un
 * constructor y los
 * métodos necesarios para su manipulación, así como para introducirlo en una
 * estructura de datos
 * que no permita duplicados y siempre se mantenga ordenado por su altura.
 * Crear una clase Equipo con la colección anterior y los siguientes métodos:
 * • Constructor
 * • Método para insertar
 * • Método para borrar un jugador
 * • Método Mostrar todos devuelve una cadena de caracteres con todos los
 * jugadores de
 * la colección
 * • Método que devuelva el jugador más bajo
 * • Método que devuelva el jugador más alto
 * • Método que devuelva una SortedSet con los jugadores de más de 2 metros
 * Crear un menú en la clase Principal y probar los métodos anteriores
 * 
 */
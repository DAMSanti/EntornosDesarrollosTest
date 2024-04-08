package unidad6.ud06hoja05ej01;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author DAM104
 */
public class Jugador implements Comparable<Jugador> {
    private String nombre;
    private double estatura;

    public Jugador(String nombre, double estatura) {
        this.nombre = nombre;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hash(this.nombre.toLowerCase());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        return nombre.equalsIgnoreCase(other.nombre);
        // return Objects.equals(this.nombre.toLowerCase(), other.nombre.toLowerCase());
        // return this.nombre.equalsIgnoreCase(other.nombre);
    }

    @Override
    public int compareTo(Jugador o) {
        int aux = 0;
        if (this.estatura < o.estatura) {
            aux = 1;
        } else if (this.estatura > o.estatura) {
            aux = -1;
        }
        return aux;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", estatura=" + estatura + '}';
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

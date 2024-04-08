package unidad6.ud06hoja05ej01;

import java.util.Objects;

/**
 *
 * @author DAM104
 */
public class Ud06Hoja05Ej01 {

    public static void main(String[] args) {
        Jugador j1 = new Jugador("Kobe Briant", 2.12);
        Jugador j2 = new Jugador("michael jordan", 2.03);
        Jugador j3 = new Jugador("Michael Jordan", 2.07);
        Jugador j4 = new Jugador("Pau Gasol", 1.97);
        
        Equipo e1 = new Equipo();
        
        e1.insertaJugador(j4);
        e1.insertaJugador(j3);
        e1.insertaJugador(j2);
        e1.insertaJugador(j1);
        
        System.out.println(e1.mostrar() + "\n\n\n");
        
        e1.borrarJugador(e1.buscarJugador("Kobe Briant"));
        //e1.borrarJugador(j3);
        
        System.out.println(e1.mostrar());
    }
}


/*

1.- Diseñar un programa para llevar el control de los jugadores de un equipo de baloncesto. Para
ello crea la clase Jugador que tenga un nombre y una estatura. Tendrá un constructor y los
métodos necesarios para su manipulación, así como para introducirlo en una estructura de datos
que no permita duplicados y siempre se mantenga ordenado por su altura.
Crear una clase Equipo con la colección anterior y los siguientes métodos:
• Constructor
• Método para insertar
• Método para borrar un jugador
• Método Mostrar todos devuelve una cadena de caracteres con todos los jugadores de
la colección
• Método que devuelva el jugador más bajo
• Método que devuelva el jugador más alto
• Método que devuelva una SortedSet con los jugadores de más de 2 metros
Crear un menú en la clase Principal y probar los métodos anteriores

*/
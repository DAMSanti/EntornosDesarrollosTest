package fechas.fechas02;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Santi
 */
public class Mascota {
    private String nombre;
    private LocalDate dob;
    
    public Mascota(String nombre, int ano, int mes, int dia) {
        this.nombre = nombre ;
        this.dob = LocalDate.of(ano, mes, dia);
    }
    
    public int getEdad() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }
    
    public String toString() {
        DateTimeFormatter formatoFecha= DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy");
        return String.format("La mascota llamada %s, nació el %s", this.nombre, this.dob.format(formatoFecha));
    }
}



/*

2. - Crear una clase Mascota que tenga un nombre y una fecha de nacimiento (de tipo
LocalDate) como atributos y los siguientes métodos:
• Constructor que recibe como parámetro un nombre, un año, un mes y un día y
establece el valor del nombre y de la fecha de nacimiento.
• Método getEdad que devuelve el número de años de la mascota
• Método toString que devuelve información sobre la mascota
Crear también una clase Veterinario que tiene un array de mascotas a las que atiende.
Además, tendrá un contador de mascotas. Se pide:
• Un constructor que establece contador a 0 y cree un array con un número amplio de
mascotas.
• Un método añadir que recibe una mascota y la añada al array.
• Un método mostrar que devuelve una cadena con todos los datos sobre las mascotas
del veterinario.
• Método mostrarMayores que devuelve una cadena con los datos de las mascotas de
más de 5 años
Realiza la prueba del programa creando un veterinario y añadiendo varias mascotas. Llama a
los métodos mostrar y mostrarMayores y mostrad los resultados por pantalla.

*/
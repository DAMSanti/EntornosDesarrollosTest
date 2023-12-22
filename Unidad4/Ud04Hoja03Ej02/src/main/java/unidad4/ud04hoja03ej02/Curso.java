package unidad4.ud04hoja03ej02;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Curso {
    private final String curso;
    private final String[] alumnos;
    
    public Curso(int dimension) {
        Scanner teclado = new Scanner(System.in);
        this.curso="--DAW--";
        alumnos = new String[dimension];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("[" + (i+1) + "/" + alumnos.length + "] Introduce el nombre del alumno: ");
            alumnos[i] = teclado.nextLine();
        }
        System.out.println("");
    }
    
    public void iniciales() {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("[" + (i+1) + "/" + alumnos.length + "] " + alumnos[i].substring(0, 1).toUpperCase().concat("."));
        }
        System.out.println("");
    }
    
    public void desplaza() {
        String aux="";
        for (int i = alumnos.length-1; i >= 0; i--) {
            if (i == alumnos.length-1) {
                aux = alumnos[i];
                alumnos[i] = alumnos[0];
            } else if (i > 0) { 
                alumnos[i+1] = alumnos[i];
            } else {
                alumnos[i+1] = alumnos[i];
                alumnos[i] = aux;
            }
        }
    }
    
    public String verNombre(int posicion) {
        if (posicion > alumnos.length) {
            return "La posicion que has introducido no corresponde a ningun alumno.";
        } else {
            return String.format("El alumno en la posicion %d es %s", posicion, alumnos[posicion-1]);
        }
    }
    
    public boolean esDAW() {
        return curso.contains("DAW");
    }
    
    public void mostrarNombres() {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i]);
        }
        System.out.println("");
    }
}



/*

2.- Diseñar una clase llamada Curso que tiene como atributos privados: el nombre del curso y
un array con los nombres de los alumnos del curso y como miembros públicos:


• Un constructor que recibe como argumento el número de alumnos dimensiona el array
y pide los nombres por teclado.


• Un método llamado iniciales que muestra la primera letra seguida de punto de todos
los nombres.


• Un método llamado desplaza que desplaza todos los nombres un lugar a la derecha de
forma que el último pasa a ocupar la primera posición.


• Un método llamado verNombre que recibe como argumento una posición y devuelve el
nombre que está en esa posición. Consideramos posición 1 al primer elemento.


• Un método llamado esDaw que devuelve verdadero si el nombre del curso tiene las
siglas “DAW” en cualquier lugar del nombre y falso en otro caso.


Desde una función principal declarar objetos de la clase gente y probar los métodos de la clase.

*/
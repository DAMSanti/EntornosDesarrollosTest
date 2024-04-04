package unidad6.ud06hoja03ej01;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Academia {
    private LinkedList<Curso> cursos;

    public Academia() {
        this.cursos = new LinkedList<>();
    }

    public void introduceFinal(Curso curso) {
        System.out.println(cursos.add(curso) ? "Se ha insertado el curso correctamente" : "No se ha podido introducir el curso");
    }

    public void introduceIndex(Curso curso, int index) {
        int tamano = cursos.size();
        if (index > tamano && index > 0) {
            cursos.add(index, curso);
            if (cursos.size()!=tamano) {
                System.out.println("Se ha introducido el curso de forma satisfactoria.");
            }
        } else {
            System.out.println("Se ha introducido un indice incorrecto");
        }
        
    }

    private Curso buscar(String codigo) {
        Curso encontrado = null;
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                encontrado = curso;
            }
        }
        return encontrado;
    }

    public void borrar(String codigo) {
        Curso curso = buscar(codigo);
        if (curso != null) {
            cursos.remove(curso);
        } else {
            System.out.println("No se encontró ningún curso con el código " + codigo + " en la lista.");
        }
    }

    public void modificar(String codigo, int horas) {
        Curso curso = buscar(codigo);
        if (curso != null) {
            curso.setnHoras(horas);
        } else {
            System.out.println("No se encontró ningún curso con el código " + codigo + " en la lista.");
        }
    }

    public void mostrar() {
        System.out.println("CURSOS:");
        for (Curso curso : cursos) {
            System.out.print(curso + "\n");
        }
    }
}

/*
 * 
 * 
 * 
 * /*
 * 
 * 1.- Realizar un proyecto que permita manejar una lista (LinkedList) de los
 * cursos que imparte
 * una academia.
 * Crear una clase Curso (código, descripción, nHoras) con dos constructores uno
 * que pida todos
 * los datos por teclado y otro que los recibe como argumentos y los métodos get
 * y set que estimes
 * necesarios.
 * Crear una clase Academia que tenga como elemento privado una lista de tipo
 * Curso y los
 * métodos necesarios para llevar a cabo las tareas que presentaremos en el menú
 * que
 * ejecutaremos desde la clase Principal:
 * • Añadir un nuevo curso al final de la lista
 * • Insertar un nuevo curso en cualquier posición
 * • Borrar un curso dado su código
 * • Modificar el número de Horas de un curso dado su código
 * • Mostrar todos los cursos
 * • Salir
 * Pulse opción: _
 * Valida que la descripción sólo contenga letras y que el número de horas sea
 * un entero positivo.
 * 
 */

package unidad6.ud06hoja03ej01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Ud06Hoja03Ej01 {

    public static void main(String[] args) {
        Academia damacademy = new Academia();
        boolean salir = false;
        Scanner teclado;
        int n = 0;
        do {
            System.out.println("BIENVENIDO AL SISTEMA DE GESTION DE ACADEMIA DAM");
            System.out.print(
                    "Opciones:\n\t1.- Añadir un nuevo curso al final de la lista\n\t2.- Insertar un nuevo curso en cualquier posicion\n\t3.- Borrar un curso dado su codigo\n\t4.- Modificar el numero de horas e un curso dado su codigo\n\t5.- Mostrar todos los cursos\n\t6.- Salir\nPulse opcion:");
            teclado = new Scanner(System.in);
            try {
                n = teclado.nextInt();
                switch (n) {
                    case 1 -> {
                        damacademy.introduceFinal(new Curso());
                    }
                    case 2 -> {
                        try {
                            teclado = new Scanner(System.in);
                            System.out.print("En que posicion quieres introducir el curso:");
                            int index = teclado.nextInt();
                            damacademy.introduceIndex(new Curso(), index);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("El indice esta fuera de rango");
                        }
                    }
                    case 3 -> {
                        try {
                            teclado = new Scanner(System.in);
                            System.out.print("Introduce el codigo del curso a eliminar:");
                            String codigo = teclado.nextLine();
                            if (codigo.length() > 0) {
                                damacademy.borrar(codigo);
                            } else {
                                System.out.println("Debes introducir una codigo en formato valido.");
                            }
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("El indice esta fuera de rango");
                        }
                    }
                    case 4 -> {
                        System.out.print("Ingrese el código del curso que desea modificar: ");
                        String codigoModificar = teclado.next();
                        System.out.print("Ingrese el nuevo número de horas: ");
                        int nuevasHoras = teclado.nextInt();
                        damacademy.modificar(codigoModificar, nuevasHoras);
                    }
                    case 5 -> {
                        damacademy.mostrar();
                    }
                    case 6 -> {
                        salir = true;
                    }
                    default -> {
                        System.out.println("Introduce una opcion valida");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un valor numerico correcto.");
            }
        } while (!salir);
    }
}

/*
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

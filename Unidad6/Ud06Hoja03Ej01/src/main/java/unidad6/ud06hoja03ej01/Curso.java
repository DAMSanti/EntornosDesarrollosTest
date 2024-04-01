package unidad6.ud06hoja03ej01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Santi
 */

public class Curso {
    private String codigo;
    private String descripcion;
    private int nHoras;

    public Curso() {
        Scanner teclado = new Scanner(System.in);
        boolean formatoCodigoCorrecto = false;
        do {
            System.out.print("Ingrese el Codigo: ");
            String codigoInput = teclado.nextLine();
            if (codigoInput.length() > 0) {
                this.codigo = codigoInput;
                formatoCodigoCorrecto = true;
            } else {
                System.out.println("Debes introducir un codigo");
            }
        } while (!formatoCodigoCorrecto);
        boolean formatoDescCorrecto = false;
        do {
            System.out.print("Ingrese la descripcion: ");
            String descInput = teclado.nextLine();
            if (descInput.matches("[a-zA-Z]{3,}")) {
                this.descripcion = descInput;
                formatoDescCorrecto = true;
            } else {
                System.out.println("Debes introducir una descripcion valida, solo debe contener letras.");
            }
        } while (!formatoDescCorrecto);
        boolean formatoHorasCorrecto = false;
        do {
            try {
                teclado = new Scanner(System.in);
                System.out.print("Ingrese el nº de horas: ");
                int nhorasInput = teclado.nextInt();
                if (nhorasInput > 0) {
                    this.nHoras = nhorasInput;
                    formatoHorasCorrecto = true;
                } else {
                    System.out.println("El valor de las horas debe ser positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un valor numerico correcto.");
            }
        } while (!formatoHorasCorrecto);
    }

    public Curso(String codigo, String descripcion, int nHoras) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nHoras = nHoras;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    public String toString() {
        return String.format("Curso: Codigo: %s - Descripcion: %s - nº de Horas: %d", this.codigo, this.descripcion,
                this.nHoras);
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

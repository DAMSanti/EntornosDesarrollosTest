package unidad05.ud05hoja04ej02;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Programador extends Empleado{
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;
    
    public Programador(String nombre, String departamento, int edad, boolean casado, double salario, int lineas, String lenguaje) {
        super(nombre, departamento, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineas;
        this.lenguajeDominante = lenguaje;
    }
    
    public Programador() {
        super();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los datos especificos de programador");
        System.out.print("Introduce las lineas de codigo por hora: ");
        this.lineasDeCodigoPorHora = teclado.nextInt();
        System.out.print("Introduce el lenguaje dominante: ");
        teclado = new Scanner(System.in);
        this.lenguajeDominante = teclado.nextLine();
    }
    
    public int getLineas() {
        return this.lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

}


/*

2) Programador (Especialización de Empleado). Clase que hereda de Empleado todos
los atributos y métodos.
Atributos:
- lineasDeCodigoPorHora: tipo entero
- lenguajeDominante: tipo cadena
Métodos:
- Constructor con y sin parámetros de entrada. El constructor sin parámetro deberá
solicitar los datos por teclado

*/
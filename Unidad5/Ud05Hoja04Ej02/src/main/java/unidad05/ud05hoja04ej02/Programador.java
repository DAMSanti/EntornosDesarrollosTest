package unidad05.ud05hoja04ej02;

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
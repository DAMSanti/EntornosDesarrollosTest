package unidad05.ud05hoja04ej02;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Empleado {
    protected String nombre, departamento;
    protected int edad;
    protected boolean casado;
    protected double salario;
    
    public Empleado(String nombre, String departamento, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }
    
    public Empleado() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los datos del empleado");
        System.out.print("Introduce el nombre: ");
        this.nombre = teclado.nextLine();
        System.out.print("Introduce el departamento: ");
        teclado = new Scanner(System.in);
        this.departamento = teclado.nextLine();
        System.out.print("Introduce la edad: ");
        teclado = new Scanner(System.in);
        this.edad = teclado.nextInt();
        System.out.print("Introduce el salario: ");
        teclado = new Scanner(System.in);
        this.salario = teclado.nextDouble();
        System.out.print("Estado Civil [True=casado, False=soltero]: ");
        teclado = new Scanner(System.in);
        this.casado = teclado.nextBoolean();
    }
    
    public Categoria devuelveCategoria() {
        Categoria cat = null;
        if (this.edad <= 21) {
            cat = Categoria.principiante;
        } else if (this.edad > 21 && this.edad <= 35) {
            cat = Categoria.intermedio;
        } else {
            cat = Categoria.senior;
        }
        return cat;
    }
    
    public String toString() {
        return String.format("NOMBRE: %s\nDEPARTAMENTO: %s\nEDAD: %d\nESTADO CIVIL: %s\nSALARIO: %,.2f€\n---------------\n", nombre, departamento, edad, this.casado ? "Casado" : "Soltero", salario);
    }
    
    public void aumentaSalario(int aumento) {
        this.salario += this.salario*aumento/100;
    }
}

/*

1) Empleado:
Atributos:
- Nombre: tipo cadena
- Departamento: tipo cadena
- Edad: entero entre 18 y 65 años
- Casado: boolean
- Salario: tipo numérico doble
Métodos:
- Constructor con y sin parámetros de entrada. El constructor sin parámetros deberá
solicitar los datos por teclado.
- Método que permita mostrar la clasificación según la edad, teniendo en cuenta el
siguiente algoritmo:
Si edad es menor o igual a 21, Principiante
Si edad es >=22 y <=35, Intermedio
Si edad es >35, Senior

- Imprimir los datos del empleado por pantalla
- Un método que permita aumentar el salario en un porcentaje que sería pasado
como parámetro al método.

*/
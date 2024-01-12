package unidad4.ud04hoja06ej01;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Articulo {
    private int existencias;
    private String codigo, descripcion;
    
    public Articulo() {
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.print("Introduce el codigo del producto: ");
        this.codigo = teclado.nextLine();
        teclado = new Scanner(System.in);
        System.out.print("Introduce la descripción del producto: ");
        this.descripcion = teclado.nextLine();
        teclado = new Scanner(System.in);
        System.out.print("Introduce la cantidad: ");
        this.existencias = teclado.nextInt();
    }

    public int getExistencias() {
        return existencias;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public boolean lowStock(int n) {
        boolean low = false;
        if (existencias < n ) {
            low = true;
        }
        return low;
    }
}


/* 

1.- Crear una clase llamada Articulo con los atributos: código, descripción y existencias, un
constructor que pide por teclado sus valores y se los asigne a los atributos y métodos que
devuelvan los valores del código, descripción y existencias.
Crear otra clase llamada Almacén que tenga como atributo privado un array de tipo Articulo, un
constructor que dimensione el array al número pasado como argumento, un método llamado
llenar que llene el array almacén con los datos de los artículos y un método pedidos que nos
muestre los datos de los artículos que tienes existencias por debajo de 10 unidades.


*/
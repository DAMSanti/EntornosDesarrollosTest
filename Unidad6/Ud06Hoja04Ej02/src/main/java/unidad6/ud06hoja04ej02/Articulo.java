package unidad6.ud06hoja04ej02;

import java.util.Objects;
import java.util.Scanner;

public class Articulo {
    private String codigo;
    private String descripcion;
    private int existencias;

    public Articulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el código del artículo: ");
        codigo = scanner.nextLine();
        System.out.print("Ingrese la descripción del artículo: ");
        descripcion = scanner.nextLine();
        System.out.print("Ingrese las existencias del artículo: ");
        existencias = scanner.nextInt();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getExistencias() {
        return existencias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Articulo articulo = (Articulo) o;
        return codigo.equals(articulo.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    public String toString() {
        return "Código: " + codigo + ", Descripción: " + descripcion + ", Existencias: " + existencias;
    }

}

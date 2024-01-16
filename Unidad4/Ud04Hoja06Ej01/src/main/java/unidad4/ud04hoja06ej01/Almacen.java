package unidad4.ud04hoja06ej01;

/**
 *
 * @author DAM104
 */

public class Almacen {
    private Articulo[] articulos;
    
    public Almacen (int n) {
        this.articulos = new Articulo[n];
    }
    
    public void llenar() {
        System.out.println("EDICION DEL INVENTARIO");
        for (int i = 0; i < articulos.length; i++) {
            articulos[i] = new Articulo();
        }
    }
    
    public void mostrar() {
        for (int i = 0; i < articulos.length; i++) {
            System.out.println(this.articulos[i]);
        }
    }
    
    public String lowStock() {
        String cadena = "ARTICULOS CON STOCK BAJO:\n";
        for (int i = 0; i < articulos.length; i++) {
            if (this.articulos[i].lowStock(10)) {
                cadena += "CODIGO: " + articulos[i].getCodigo() + "\n"
                        +"DESCRIPCION: " + articulos[i].getDescripcion() + "\n"
                        +"STOCK: " + articulos[i].getExistencias() + "\n\n";
            }
        }
        return cadena;
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
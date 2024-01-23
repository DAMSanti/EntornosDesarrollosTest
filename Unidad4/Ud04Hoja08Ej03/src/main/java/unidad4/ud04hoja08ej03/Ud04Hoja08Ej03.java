package unidad4.ud04hoja08ej03;

import static java.lang.Integer.parseInt;

/**
 *
 * @author DAM104
 */
public class Ud04Hoja08Ej03 {
    private String nombre;
    private double sueldo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public static void show(String nombre, double sueldo) {
        System.out.printf("NOMBRE: %s\nEDAD: %,.2f\n", nombre, sueldo);
    }
    
    public static void obligacionImpositiva(double sueldo) {
        if (sueldo > 3000) {
            System.out.println("Debes pagar impuestos.");
        } else {
            System.out.println("No es necesario que pagues impuestos.");
        }
    }
    
    public static void main(String[] args) {
        if (args.length==2) {
            Ud04Hoja08Ej03 e1 = new Ud04Hoja08Ej03();
            e1.setNombre(args[0]);
            int sueldo = parseInt(args[1], 10);
            e1.setSueldo(sueldo);
            show(args[0], Double.parseDouble(args[1]));
            obligacionImpositiva(Double.parseDouble(args[1]));
        } else {
            System.out.println("No se han introducido los datos correctos.");
        }
    }
}


/*

3.- Confeccionar una clase que represente un empleado. Definir como atributos su nombre y su
sueldo. Confeccionar los métodos para modificar el objeto (métodos set), otro para imprimir sus
datos y por último uno que imprima un mensaje si debe pagar impuestos (si el sueldo supera a
3000). La clase debe contener el Main. Los datos del empleado se introducen en la línea de
comandos.

*/
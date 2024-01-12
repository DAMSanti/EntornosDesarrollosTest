package unidad04.ud04hoja06ej02;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Ud04Hoja06Ej02 {

    public static void main(String[] args) {
        System.out.println("CREACION DE BASE DE DATOS DE CLIENTES DEL BANCO");
        Banco santander = new Banco(3);
        Scanner teclado;
        boolean salir = false;
        do {
            teclado = new Scanner(System.in);
            System.out.println("\nMENU DEL BANCO\n\n1.-Ingresar un cliente\n2.-Mostrar los usuarios\n3.-Buscar un cliente\n4.-Eliminar un cliente\n5.-Salir\n");
            int n = teclado.nextInt();
            switch (n) {
                case 1->{
                    santander.ingresar();
                }
                case 2->{
                    System.out.println(santander.mostrar());
                }
                case 3->{
                    teclado = new Scanner(System.in);
                    System.out.println("Introduce el codigo del usuario que quieras buscar: ");
                    System.out.println(santander.buscar(teclado.nextInt()));
                }
                case 4->{
                    teclado = new Scanner(System.in);
                    System.out.println("Introduce el codigo del usuario que quieras eliminar: ");
                    santander.eliminar(teclado.nextInt());
                }
                case 5->{
                    salir = true ;
                }
                default->System.out.println("La opcion introducida no es correcta");
            }
        } while (!salir);
        
    }
}




/*

2.- Diseñar una clase llamada Cliente formada por los atributos: código, nombre, apellidos,
teléfono y saldo junto con los métodos necesarios para su manipulación.
Otra clase, denominada Banco estará formada por un array de usuarios del banco y un contador
de usuarios de banco. Un constructor que introduce por parámetro el número máximo de
clientes de un banco inicializando a ese número los usuarios del banco. Métodos que permitan
ingresar un usuario (tendremos en cuenta que el código de usuario corresponde con el número
del usuario del banco) y el resto de los datos se piden por teclado, buscar un usuario devuelve
una cadena de texto con la información del usuario, eliminar un usuario y mostrar que nos
muestra la relación de los usuarios del banco. En los dos últimos métodos tendrán como
parámetro de entrada él código de usuario. Siempre controlando que no podemos sobrepasar
el número de usuarios del banco.


Crea en la clase principal un menú repetitivo con las siguientes opciones 1. Ingresar un cliente,
2. Mostrar los usuarios del banco, 3. Buscar un cliente – pediremos por teclado el código del
cliente a buscar, 4. Eliminar un cliente- pediremos por teclado el código del cliente a eliminar, 5.
Salir.

*/
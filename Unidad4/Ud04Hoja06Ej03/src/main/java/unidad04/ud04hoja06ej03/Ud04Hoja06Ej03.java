package unidad04.ud04hoja06ej03;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Ud04Hoja06Ej03 {

    public static void main(String[] args) {
        System.out.println("CREACION DE AGENDA DE CONTACTOS");
        Agenda miscontactos = new Agenda(3);
        Scanner teclado;
        boolean salir = false;
        do {
            teclado = new Scanner(System.in);
            System.out.println("\nAGENDA DE TELEFONOS\n\n1.-Nuevo contacto\n2.-Mostrar la agenda\n3.-Buscar contacto\n4.-Numero de contactos\n5.-Modificar contacto\n6.-Salir\n");
            int n = teclado.nextInt();
            switch (n) {
                case 1->{
                    miscontactos.insertar();
                }
                case 2->{
                    System.out.println(miscontactos.mostrar());
                }
                case 3->{
                    teclado = new Scanner(System.in);
                    System.out.println("Introduce el nombre del contacto a buscar: ");
                    System.out.println(miscontactos.buscar(teclado.nextLine()));
                }
                case 4->{
                    System.out.println("Tienes " + Agenda.getContactos() + " contactos guardados en la agenda");
                }
                case 5->{
                    teclado = new Scanner(System.in);
                    System.out.println("Introduce el nombre del contacto a modificar: ");
                    miscontactos.modificar(teclado.nextLine());
                }
                case 6->{
                    salir = true ;
                }
                default->System.out.println("La opcion introducida no es correcta");
            }
        } while (!salir);
    }
}



/*
Crea en la clase principal un menú repetitivo con las siguientes opciones 1. Nuevo contacto, 2.
Mostrar la agenda, 3. Buscar contacto, pide el nombre de la persona a buscar y si la encuentra
muestra su información, 4. Ver el número de contactos de la agenda, 5. Modificar teléfono de
una agenda, pide el nombre de la persona a cambiar el teléfono y la encuentra se cambia el
teléfono, 6. Salir.
PD. Como sólo se busca por nombre es posible que tengamos más de una persona a mostrar o
a modificar.

*/

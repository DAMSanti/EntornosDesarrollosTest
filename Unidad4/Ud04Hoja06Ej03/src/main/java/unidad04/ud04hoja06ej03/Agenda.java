package unidad04.ud04hoja06ej03;

import java.util.Scanner;

/**
 *
 * @author Santi
 */

public class Agenda {
    private Persona[] agenda;
    private static int contactos;
    
    public Agenda(int n) {
        this.contactos = 0 ;
        agenda = new Persona[n];
    }
    
    public void insertar() {
        if (agenda.length>contactos) {
            this.agenda[contactos] = new Persona("","");
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce el nombre del contacto: ");
            this.agenda[contactos].setNombre(teclado.nextLine());
            teclado = new Scanner(System.in);
            System.out.println("Introduce el telefono del contacto: ");
            this.agenda[contactos].setTelefono(teclado.nextLine());
            contactos++;            
        } else {
            System.out.println("La lista de contactos está llena, deberás eliminar un contacto para introducir más.");
        }
    }

    public static int getContactos() {
        return contactos;
    }
    
    public String mostrar() {
        String cadena = "";
        for (int i = 0; i < this.contactos; i++) {
            cadena += String.format("NOMBRE: %s\nTELEFONO: %s\n\n", agenda[i].getNombre(), agenda[i].getTelefono());
        }
        return cadena;
    }
    
    public String buscar(String nombre) {
        String cadena = "";
        for (int i = 0; i < this.contactos; i++) {
            if (this.agenda[i].getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                cadena += String.format("NOMBRE: %s\nTELEFONO: %s\n\n", agenda[i].getNombre(), agenda[i].getTelefono());
            }
        }
        return cadena;
    }
   
    public void modificar(String nombre) {
        Scanner teclado;
        int[] lista = buscacontactos(nombre);
        if (lista.length==0) {
            System.out.println("No se ha encontrado el contacto."); 
        }else if (lista.length>1) {
            System.out.println("Hay mas de un contacto con ese nombre, que contacto quieres modificar, introduce el numero de la opcion: ");
            teclado = new Scanner(System.in);
            int n = teclado.nextInt();
            if (n<=1 || n>lista.length) {
                System.out.println("La opcion introducida no es valida");
            } else {
                System.out.println("Contacto a modificar: ");
                System.out.printf("NOMBRE: %s\nTELEFONO: %s\n\n", agenda[lista[n-1]].getNombre(), agenda[lista[n-1]].getTelefono());
                modifica(lista, n-1);
            }
        } else {
            modifica(lista,0);
        }
    }
    
    public void modifica(int[] lista, int opcion) {
        System.out.println("\n1.-Modificar nombre\n2.-Modificar telefono\n");
        Scanner teclado = new Scanner(System.in);
        int m=teclado.nextInt();
        switch (m) {
            case 1->{
                System.out.println("Introduce el nuevo nombre: ");
                teclado = new Scanner(System.in);
                agenda[lista[opcion]].setNombre(teclado.nextLine());
            }
            case 2->{
                System.out.println("Introduce el nuevo telefono: ");
                teclado = new Scanner(System.in);
                agenda[lista[opcion]].setTelefono(teclado.nextLine());                        
            }
            default->System.out.println("Opcion introducida invalida.");
        }
        System.out.println("Contacto modificado con exito: ");
        System.out.printf("NOMBRE: %s\nTELEFONO: %s\n\n", agenda[lista[opcion]].getNombre(), agenda[lista[opcion]].getTelefono());        
    }
    
    public int[] buscacontactos(String nombre) {
        String cadena = "";
        int cont = 0 ;
        int[] lista = new int[0];
        for (int i = 0; i < this.contactos; i++) {
            if (this.agenda[i].getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                cadena += String.format("OPCION: %d\nNOMBRE: %s\nTELEFONO: %s\n\n", cont+1, agenda[i].getNombre(), agenda[i].getTelefono());
                        
                int[] aux = new int[lista.length];
                for (int j = 0; j < aux.length; j++) {
                    aux[j]=lista[j];
                }

                lista = new int[lista.length+1];
                for (int j = 0; j < lista.length; j++) {
                    if (j<lista.length-1) {
                        lista[j] = aux[j];
                    } else {
                        lista[j] = i;
                    }
                } 
                cont++;
            }
        }
        if (lista.length>1) {
            System.out.println(cadena);
        }
        return lista;
    }
}





/*
Diseñar también una clase llamada Agenda que tiene como miembros privados un array de personas y un contador de personas que vamos
metiendo en la agenda, un constructor que pone el contador a 0 y dimensiona el array al tamaño
que le pasamos como argumento, un método insertar que permite añadir una persona a la
agenda (controlar que no meta más personas que las que caben en la agenda), un método
mostrar que lista la información de la agenda,

un método buscar que pasado un nombre como argumento visualiza los datos de esa persona de la agenda y 


un método modificar que pasado un nombre como argumento si lo encuentra muestra el teléfono actual y pide que introduzca
un nuevo teléfono modificando el dato en la agenda.

Crea en la clase principal un menú repetitivo con las siguientes opciones 1. Nuevo contacto, 2.
Mostrar la agenda, 3. Buscar contacto, pide el nombre de la persona a buscar y si la encuentra
muestra su información, 4. Ver el número de contactos de la agenda, 5. Modificar teléfono de
una agenda, pide el nombre de la persona a cambiar el teléfono y la encuentra se cambia el
teléfono, 6. Salir.
PD. Como sólo se busca por nombre es posible que tengamos más de una persona a mostrar o
a modificar.

*/

package unidad05.ud05hoja02ej02;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja02Ej02 {

    public static void main(String[] args) {
        Scanner teclado;
        String nom, desc;
        double precio, descuento;
        int ano, mes;
        Articulo[] lista = new Articulo[2];
        for (int i = 0; i < lista.length; i++) {
            if (i<(lista.length/2)) {
                System.out.println("Introduce el nombre del articulo: ");
                teclado = new Scanner(System.in);
                nom = teclado.nextLine();
                System.out.println("Introduce la descripcion del articulo: ");
                teclado = new Scanner(System.in);
                desc = teclado.nextLine();
                System.out.println("Introduce el precio del articulo: ");
                teclado = new Scanner(System.in);
                precio = teclado.nextDouble();
                System.out.println("Introduce el año de caducidad del articulo: ");
                teclado = new Scanner(System.in);
                ano = teclado.nextInt();
                System.out.println("Introduce el mes de caducidad del articulo: ");
                teclado = new Scanner(System.in);
                mes = teclado.nextInt();
                lista[i] = new Perecedero(nom, desc, precio, ano, mes); 
            } else {
                System.out.println("Introduce el nombre del articulo: ");
                teclado = new Scanner(System.in);
                nom = teclado.nextLine();
                System.out.println("Introduce la descripcion del articulo: ");
                teclado = new Scanner(System.in);
                desc = teclado.nextLine();
                System.out.println("Introduce el precio del articulo: ");
                teclado = new Scanner(System.in);
                precio = teclado.nextDouble();
                System.out.println("Introduce el descuento del articulo: ");
                teclado = new Scanner(System.in);
                descuento = teclado.nextDouble();
                lista[i] = new EnPromocion(nom, desc, precio, descuento); 
            }
        }
        System.out.println("\nARTICULOS EN PROMOCION");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] instanceof EnPromocion) {
                System.out.println(lista[i].toString());                
            }
        }
        System.out.println("\nARTICULOS PERECEDEROS");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] instanceof Perecedero) {
                System.out.println(lista[i].toString());                
            }
        }
        System.out.println("\nARTICULOS CADUCADOS");
        Perecedero aux;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] instanceof Perecedero) {
                aux = (Perecedero) lista[i];
                aux.caducado();
            }
        }
        
    }
}

package unidad05.ud05hoja02ej02;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja02Ej02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Articulo[] lista = new Articulo[10];
        for (int i = 0; i < 10; i++) {
            switch(i) {
                case 0 -> lista[i] = new Perecedero("Fruta", "Productos frescos", 19.99, 2021, 1);
                case 1 -> lista[i] = new Perecedero("Yogurt", "Productos frescos", 9.99, 2025, 11);
                case 2 -> lista[i] = new Perecedero("Paracetamol", "Medicamentos", 1.17, 2031, 6);
                case 3 -> lista[i] = new Perecedero("Puerros", "Productos frescos", 4.50, 2023, 8);
                case 4 -> lista[i] = new Perecedero("Merluza", "Productos frescos", 23.99, 2024, 1);
                case 5 -> lista[i] = new EnPromocion("DVD", "Tecnología", 60.50, 10);
                case 6 -> lista[i] = new EnPromocion("Bicicleta", "Deporte", 350.10, 5);
                case 7 -> lista[i] = new EnPromocion("Maquina de Escribir", "Tecnología", 160.00, 60);
                case 8 -> lista[i] = new EnPromocion("Tarjeta Regalo", "Regalos", 20.00, 3);
                case 9 -> lista[i] = new EnPromocion("Television", "Tecnología", 1250.50, 15);                
            }
        }
        
        Articulo[] promo = Articulo.BuscaTipo(lista, 1);
        for (int i = 0; i < promo.length; i++) {
            System.out.println(promo[i].toString());
        }
        System.out.println("\n\n--------------Presiona ENTER para continuar----------------");
        teclado.nextLine();
        
        Articulo[] perec = Articulo.BuscaTipo(lista, 2);
        for (int i = 0; i < perec.length; i++) {
            System.out.println(perec[i].toString());
        }
       
        System.out.println("\n\n--------------Presiona ENTER para continuar----------------");
        teclado.nextLine();
        
        Perecedero aux;
        System.out.println("\n--- ARTICULOS CADUCADOS ---");
        for (int i = 0; i < perec.length; i++) {
            aux = (Perecedero) perec[i];
            aux.caducado();
        }
        System.out.println("\n--- AARTICULO CON MAYOR DESCUENTO ---");
        System.out.println(EnPromocion.mayorDescuento(promo).toString());
    }
}

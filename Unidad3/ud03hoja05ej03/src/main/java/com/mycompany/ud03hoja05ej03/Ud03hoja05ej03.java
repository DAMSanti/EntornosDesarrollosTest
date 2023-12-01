package com.mycompany.ud03hoja05ej03;

import java.util.Scanner;
/**
 *
 * @author Santiago Tamayo
 */
public class Ud03hoja05ej03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Reloj r = new Reloj(70,70,70);
        /*
        boolean quit = false;
        while (!quit) {
            System.out.println(r.muestrahora());
            System.out.println("Quieres efectuar cambios a la hora?");
            System.out.println("1.- Subir la hora\n2.- Bajar la hora\n3.- Subir los minutos\n4.- Bajar los minutos\n5.- Subir los segundos\n6.- Bajar los segundos\n7.- Salir");
            int n = teclado.nextInt();
            switch (n) {
                case 1-> r.confighora(1);
                case 2-> r.confighora(0);
                case 3-> r.configminuto(1);
                case 4-> r.configminuto(0);
                case 5-> r.configsegundo(1);
                case 6-> r.configsegundo(0);
                case 7-> quit = true;
                default -> System.out.println("Opcion introducida no valida.");
            }
        }
        */
        r.calculaHora();
    }
}

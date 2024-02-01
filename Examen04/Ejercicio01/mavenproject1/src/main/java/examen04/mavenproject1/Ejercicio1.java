package examen04.mavenproject1;

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////
///////// Santiago Manuel Tamayo Arozamena                               /////////
///////// DAM 1                                                          /////////
///////// Programación                                                   /////////
///////// Examen de Programacion                                         /////////
/////////////////////////////////////////////////////////////////////////////////

public class Ejercicio1 {

    public static void main(String[] args) {
        int[] numeros = new int[7];
        int n;
        if (args.length == 7) {
            for (int i = 0; i < args.length; i++) {
                numeros[i] = Integer.parseInt(args[i]);
            }
        } else {
            System.out.println("No se han introducido 7 numeros.");
        }
        OperacionesVector v1 = new OperacionesVector(numeros);
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.print("\nMenu de opciones:\n1.- Mostrar vector\n2.- Encontrar numero primo\n3.- Invertir vector\n4.- Divisores\n5.- Salir\n\nIngrese la opción deseada: ");
            n = teclado.nextInt();
            switch(n) {
                case 1->{
                    v1.mostrar();
                }
                case 2->{
                    v1.encontrarPrimo();
                }
                case 3->{
                    v1.invertirVector();
                    System.out.println("Vector invertido correctamente");
                    v1.mostrar();
                }
                case 4->{
                    System.out.print("Introduce el numero para calcular los divisores: ");
                    int d = teclado.nextInt();
                    v1.divisores(d);
                    v1.mostrar();
                }
                case 5->{
                    System.out.println("Hasta la vista!");
                }
                default->{
                    System.out.println("Opcion introducida no válida.");
                }
            }
            
        } while (n!=5);
    }
}

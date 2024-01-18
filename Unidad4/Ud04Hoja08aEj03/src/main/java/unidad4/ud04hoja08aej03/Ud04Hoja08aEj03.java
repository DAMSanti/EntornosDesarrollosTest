package unidad4.ud04hoja08aej03;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ud04Hoja08aEj03 {

    public static void main(String[] args) {
        Pais Españita = new Pais("España");
        Scanner teclado;
        int n;
        do {
            System.out.printf("\n\nBASE DE DATOS DE PAISES\n%s\n1.- Insertar una nueva ciudad\n2.- Buscar la ciudad con mas habitantes\n3.- Buscar una ciudad\n4.- Obtener la poblacion media de las ciudades\n5.- Mostrar informacion\n6.- Salir\n", Españita.getNombre());
            teclado = new Scanner(System.in);
            n = teclado.nextInt();
            switch (n) {
                case 1-> Españita.insertar();
                case 2-> System.out.println(Españita.topHabitantes().toString());
                case 3-> {
                    teclado = new Scanner(System.in);
                    System.out.print("Introduce el nombre de la ciudad que quieras buscar: ");
                    if (Españita.existe(teclado.nextLine())) {
                        System.out.println("Se ha encontrado la ciudad que estabas buscando.");
                    } else {
                        System.out.println("NO se ha encontrado la ciudad que estabas buscando.");
                    }
                }
                case 4-> {
                    System.out.printf("La población media de las ciudades de %s es de %d", Españita.getNombre(), Españita.poblacionMedia());
                }
                case 5-> {
                    System.out.println(Españita.toString());
                }
                case 6-> {
                    System.out.println("Hasta Luego");
                }
                default-> {
                    System.out.println("Has introducido una opcion incorrecta");
                }
            }
        } while (n!=6);
    }
}

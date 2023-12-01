package unidad1.hoja3x07;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de input de información y utilización de datos                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import java.util.Scanner;

    public class Hoja3x07 {
        public static void main(String[ ] args) {
            // Creamos objeto teclado
            Scanner teclado = new Scanner(System.in);
            
            // Declaramos variables a utilizar
            int hormiga, arana, cochi; 
            
            // Entrada de datos            
            System.out.println("\n\tCONTADOR DE PATAS\n");
            System.out.print("Cantidad de hormigas atrapadas: ");
            hormiga=teclado.nextInt();
            System.out.print("Cantidad de arañas atrapadas: ");
            arana=teclado.nextInt();
            System.out.print("Cantidad de cochinillas atrapadas: ");
            cochi=teclado.nextInt();

            //Presentacion del resultado
            System.out.println("\nEl numero total de patas es de: " + ( hormiga * 6 + arana * 8 + cochi * 14 ));

        }
    }
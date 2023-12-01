package unidad1.hoja2x3;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de input de información y utilización de datos                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import java.util.Scanner;

    public class Hoja2x3 {
        public static void main(String[ ] args) {
            // Creamos objeto teclado
            Scanner teclado = new Scanner(System.in);
            
            // Declaramos variables a utilizar
            double importe ; 
            final double TASA = 166.386 ;
            
            // Entrada de datos            
            System.out.println("\n\tCALCULADORA DE PRECIO EN PESETAS\n");
            System.out.print("Intoduce el precio de la vivienda: ");
            importe=teclado.nextDouble();
                    
            //Presentacion del resultado
            System.out.println("\n\n\t   CONVERSION");
            System.out.printf("El precio de la vivienda en euros es:\t %,.2f €\n" , importe);
            System.out.printf("El precio de la vivienda en pesetas es:\t %.0f ptas.\n" , (importe*TASA));
        }
    }
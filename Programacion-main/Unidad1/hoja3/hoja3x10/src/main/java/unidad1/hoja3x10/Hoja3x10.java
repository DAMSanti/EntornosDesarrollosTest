package unidad1.hoja3x10;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de input de información y utilización de datos                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import java.util.Scanner;

    public class Hoja3x10 {
        public static void main(String[ ] args) {
            // Creamos objeto teclado
            Scanner teclado = new Scanner(System.in);
            
            // Declaramos variables a utilizar
            double distancia; 
            
            // Entrada de datos            
            System.out.println("\n\tDISTANCIA DE LANZAMIENTO\n");
            System.out.print("Introduce la distancia del lanzamiento en metros: ");
            distancia=teclado.nextDouble();

            // Calculamos el resultado
            distancia = distancia * 100;
            
            //Presentacion del resultado
            System.out.printf("\nLa distancia registrada es de: %,.0f centimetros ", distancia);

        }
    }
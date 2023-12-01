package unidad1.hoja3x05;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de input de información y utilización de datos                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import java.util.Scanner;

    public class Hoja3x05 {
        public static void main(String[ ] args) {
            // Creamos objeto teclado
            Scanner teclado = new Scanner(System.in);
            
            // Declaramos variables a utilizar
            int tiempo, horas, minutos, segundos; 
            
            // Entrada de datos            
            System.out.println("\n\tCALCULADORA DE TIEMPOS\n");
            System.out.print("Intoduce un tiempo en segundos: ");
            tiempo=teclado.nextInt();

            //Calculo de resultados              
            segundos = tiempo%60 ;
            tiempo = tiempo/60 ;
            minutos = tiempo%60 ;
            horas = tiempo/60 ;
                    
            //Presentacion del resultado
            System.out.printf("El tiempo especificado corresponde a: %02d:%02d:%02d", horas, minutos, segundos);

        }
    }
package unidad1.hoja3x09;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de input de información y utilización de datos                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import java.util.Scanner;

    public class Hoja3x09 {
        public static void main(String[ ] args) {
            // Creamos objeto teclado
            Scanner teclado = new Scanner(System.in);
            
            // Declaramos variables a utilizar
            int numero1, numero2; 
            boolean resultado;
            
            // Entrada de datos            
            System.out.println("\n\tCOMPARADOR DE NUMERO\n");
            System.out.print("Introduce el primer numero: ");
            numero1=teclado.nextInt();
            System.out.print("Introduce el segundo numero: ");
            numero2=teclado.nextInt();

            // Comprobacion de igualdad
            resultado = (numero1==numero2);

            //Presentacion del resultado
            System.out.println("\nEl resultado de la comparacion es: " + resultado);

        }
    }
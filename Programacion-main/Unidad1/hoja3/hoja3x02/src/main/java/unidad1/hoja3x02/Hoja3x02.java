package unidad1.hoja3x02;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de input de información y utilización de datos                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import java.util.Scanner;

    public class Hoja3x02 {
        public static void main(String[ ] args) {
            // Creamos objeto teclado
            Scanner teclado = new Scanner(System.in);
            
            // Declaramos variables a utilizar
            int numero, numero2, resto, resultado;
            
            // Entrada de datos            
            System.out.println("\n\tCALCULADORA DE MULTIPLOS DE 7\n");
            System.out.print("Intoduce un numero: ");
            numero=teclado.nextInt();

            //Calculo de resultados              
            resto = numero % 7;
            resultado = 7 - resto;
                    
            //Presentacion del resultado
            System.out.println("\nPara que " + numero + " sea multiplo de 7 hay que sumarle " + resultado);
            
            System.out.print("\nIntoduce un segundo numero: ");
            numero2=teclado.nextInt();
            
            //Calculo de resultados              
            resto = numero % numero2;
            resultado = numero2 - resto;
                    
            //Presentacion del resultado
            System.out.println("\nPara que " + numero + " sea multiplo de " + numero2 + " hay que sumarle " + resultado);
        }
    }
package code.hoja1x5;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de input de información y utilización de datos                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import java.util.Scanner;

    public class Hoja1x5 {
        public static void main(String[ ] args) {
            // Creamos objeto teclado
            Scanner teclado = new Scanner(System.in);
            
            // Declaramos variables a utilizar
            double num1, num2, resultado;
            
            // Entrada de datos
            System.out.print("Intoduce el primer número: ");
            num1=teclado.nextInt();
            System.out.print("Introduce el segundo número: ");
            num2=teclado.nextInt(); 
            
            //Calculo de resultados
            System.out.println("x = " + num1 + " y = " + num2 );
            resultado = num1 + num2 ;
            System.out.println("x + y = " + resultado );
            resultado = num1 - num2 ;
            System.out.println("x - y = " + resultado );
            resultado = num1 * num2 ;
            System.out.println("x * y = " + resultado );
            resultado = num1 / num2 ;
            System.out.println("x / y = " + resultado );
            resultado= Math.pow(num1, 2) ;
            System.out.println("x^2 = " + resultado );
            resultado= Math.pow(num1, 0.5) ;
            System.out.println("√x = " + resultado );
            
        }
    }
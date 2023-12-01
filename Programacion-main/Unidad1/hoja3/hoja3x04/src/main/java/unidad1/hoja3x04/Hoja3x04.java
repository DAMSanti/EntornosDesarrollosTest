package unidad1.hoja3x04;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de input de información y utilización de datos                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import java.util.Scanner;
//import java.lang.Math;

    public class Hoja3x04 {
        public static void main(String[ ] args) {
            // Creamos objeto teclado
            Scanner teclado = new Scanner(System.in);
            
            // Declaramos variables a utilizar
            int a, b, c; 
            double resultado1, resultado2;
            
            // Entrada de datos            
            System.out.println("\n\tCALCULADORA DE POLINOMIOS DE SEGUNDO GRADO\n");
            System.out.println("y=ax²+bx+c");
            System.out.print("Intoduce el valor de a: ");
            a=teclado.nextInt();
            System.out.print("Intoduce el valor de b: ");
            b=teclado.nextInt();
            System.out.print("Intoduce el valor de c: ");
            c=teclado.nextInt();

            //Calculo de resultados              
            resultado1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
            resultado2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
                    
            //Presentacion del resultado
            System.out.println("\nResultado 1 y= " + resultado1);
            System.out.println("Resultado 2 y= " + resultado2);

        }
    }
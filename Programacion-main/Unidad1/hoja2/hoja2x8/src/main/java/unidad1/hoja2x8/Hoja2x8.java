package unidad1.hoja2x8;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de input de información y utilización de datos                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import java.util.Scanner;
//import java.lang.Math;

    public class Hoja2x8 {
        public static void main(String[ ] args) {
            // Creamos objeto teclado
            Scanner teclado = new Scanner(System.in);
            
            // Declaramos variables a utilizar
            double radio;
            
            // Entrada de datos            
            System.out.println("\n\tCALCULADORA DE AREA Y PERIMETRO DE UN CIRCULO\n");
            System.out.print("Intoduce el radio: ");
            radio=teclado.nextDouble();
                    
            //Presentacion del resultado
            System.out.printf("El area del circulo es: %,.2f unidades²\n" , Math.PI * (radio * radio)) ;
            System.out.printf("El perimetro es igual a: %,.2f unidades\n" , (Math.PI * radio * 2)) ;
        }
    }

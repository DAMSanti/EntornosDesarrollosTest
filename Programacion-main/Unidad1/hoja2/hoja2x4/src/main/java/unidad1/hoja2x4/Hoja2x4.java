package unidad1.hoja2x4;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de input de información y utilización de datos                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import java.util.Scanner;

    public class Hoja2x4 {
        public static void main(String[ ] args) {
            // Creamos objeto teclado
            Scanner teclado = new Scanner(System.in);
            
            // Declaramos variables a utilizar
            double base, altura;
            
            // Entrada de datos            
            System.out.println("\n\tCALCULADORA DE AREA DE TRIANGULO\n");
            System.out.print("Intoduce la base: ");
            base=teclado.nextDouble();
            System.out.print("Introduce la altura: ");
            altura=teclado.nextDouble(); 
                    
            //Presentacion del resultado
            System.out.printf("El area del triangulo es: %,.2f unidades cuadradas." , (base*altura)/2) ;
        }
    }
package unidad1.hoja2x6;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de input de información y utilización de datos                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import java.util.Scanner;
import java.lang.Math;

    public class Hoja2x6 {
        public static void main(String[ ] args) {
            // Creamos objeto teclado
            Scanner teclado = new Scanner(System.in);
            
            // Declaramos variables a utilizar
            double radio, altura;
            
            // Entrada de datos            
            System.out.println("\n\tCALCULADORA DE AREA Y VOLUMEN DE CILINDRO\n");
            System.out.print("Intoduce el radio: ");
            radio=teclado.nextDouble();
            System.out.print("Introduce la altura: ");
            altura=teclado.nextDouble(); 
                    
            //Presentacion del resultado
            System.out.printf("El area lateral del cilindro es: %,.2f unidades²\n" , 2 * Math.PI * radio * altura) ;
            System.out.printf("Su volumen es igual a: %,.2f unidades³\n" , (Math.PI * (radio*radio) * altura)) ;
        }
    }
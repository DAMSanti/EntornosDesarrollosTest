package unidad1.ejercicio4;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////                Ejercicios de los apuntes                                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import java.util.Scanner;

    public class Ejercicio4 {
        public static void main(String[] args) {
            
            // Creamos objeto teclado
            Scanner teclado = new Scanner(System.in);
            
            double n1;
            double n2;
            
            // Entrada de datos  
            System.out.println("\tCALCULADORA DE MEDIA\n");
            System.out.print("Introduce el primer numero: ");
            n1=teclado.nextDouble();
            System.out.print("Introduce el segundo numero: ");
            n2=teclado.nextDouble();
            
            
            System.out.println("La media es " + ((n1+n2)/2) );
                    
    }
}

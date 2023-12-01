package unidad1.hoja3x01;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de input de información y utilización de datos                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import java.util.Scanner;

    public class Hoja3x01 {
        public static void main(String[ ] args) {
            // Creamos objeto teclado
            Scanner teclado = new Scanner(System.in);
            
            // Declaramos variables a utilizar
            double baseimp, IVA;
            String porcent = "%";
            
            // Entrada de datos            
            System.out.println("\n\tCALCULADORA DE IVA\n");
            System.out.print("Intoduce la base imponible: ");
            baseimp=teclado.nextDouble();
            System.out.print("¿Que IVA hay que aplicar? ");
            IVA=teclado.nextDouble(); 
                    
            //Presentacion del resultado
            System.out.println("\n\n\t   FACTURA\n");
            System.out.printf("Base Imponible:\t\t%,.2f €\n" , baseimp);
            System.out.printf("IVA %.2f%s: \t\t%,.2f €" , IVA , porcent, ((baseimp *((100+IVA)/100))-baseimp));
            System.out.println("\n\n-----------------------------------------\n");
            System.out.printf("TOTAL : \t\t%,.2f €" ,  (baseimp *((100+IVA)/100)));
        }
    }
package unidad1.hoja2x5;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de input de información y utilización de datos                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import javax.swing.JOptionPane;

    public class Hoja2x5 {
        public static void main(String[ ] args) {            
            // Declaramos variables a utilizar
            String baseimp, porcent = "%";
            double precio;
            
            // Entrada de datos   
            baseimp = JOptionPane.showInputDialog("Escriba un numero");
            precio = Double.parseDouble(baseimp);
                    
            //Presentacion del resultado
            System.out.println("\n\n\t   FACTURA");
            System.out.printf("Base Imponible:\t\t%,.2f €\n" , precio);
            System.out.printf("IVA 21%s: \t\t%,.2f €" ,porcent, (precio * 1.21));
            System.out.printf("\nEl precio despues de aplicar 10%s de descuento: \t\t%,.2f €\n" ,porcent, ((precio * 1.21)*0.9));
        }
    }
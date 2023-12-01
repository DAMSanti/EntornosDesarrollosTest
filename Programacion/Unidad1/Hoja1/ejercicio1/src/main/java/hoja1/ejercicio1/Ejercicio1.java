package hoja1.ejercicio1;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de definición de variables y asignación de valores                  //////////
//////////////////////////////////////////////////////////////////////////////////////////////////

public class Ejercicio1 {
    
    //Definimos los posibles valores de Sexos    
    enum Sexos {M,V}
    
    //Aqui empieza el main, que es donde empieza a ejecutarse el programa.
    public static void main(String[] args) {
        // Escogemos boolean porque los valores solo pueden ser vferdadero o falso.
        boolean casado=true;
        // Final indica que MAXIMO es una constante
        final int MAXIMO=999999;
        //Elegimos byte, short o long en base al tamaño maximo para reservar en memoria.
        byte diasem=1;
        short diaanual=300;
        Sexos sexo = Sexos.M;
        long miliseg = 1298332800000L;
        // Asignamos una variable float porque se trata de datos con decimales.
        float totalfactura = 10350.678F;
        long poblacion = 6775235741L;
        
        
        //Utilizamos println para mostrar las variables en consola.
        System.out.println("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
        System.out.println("\tEl valor de la variable casado es: " + casado );
        System.out.println("\tEl valor de la variable MAXIMO es: " + MAXIMO );
        System.out.println("\tEl valor de la variable dia de la semana es: " + diasem );
        System.out.println("\tEl valor de la variable dia del año es: " + diaanual );
        System.out.println("\tEl valor de la variable SEXO es: " + sexo );
        System.out.println("\tEl valor de la variable milisegundos es: " + miliseg );
        System.out.println("\tEl valor de la variable total factura es: " + totalfactura );
        System.out.println("\tEl valor de la variable poblacion es: " + poblacion );
        
        //Utilizamos print para mostrar las variables en consola.
        System.out.print("\n\n----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----\n");
        System.out.print("\tEl valor de la variable casado es: " + casado );
        System.out.print("\n\tEl valor de la variable MAXIMO es: " + MAXIMO );
        System.out.print("\n\tEl valor de la variable dia de la semana es: " + diasem );
        System.out.print("\n\tEl valor de la variable dia del año es: " + diaanual );
        System.out.print("\n\tEl valor de la variable SEXO es: " + sexo );
        System.out.print("\n\tEl valor de la variable milisegundos es: " + miliseg );
        System.out.print("\n\tEl valor de la variable total factura es: " + totalfactura );
        System.out.print("\n\tEl valor de la variable poblacion es: " + poblacion );
        
        //Utilizamos printf para mostrar las variables en consola.
        System.out.printf("\n\n----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
        System.out.printf("\n\tEl valor de la variable casado es: %s" , casado );
        System.out.printf("\n\tEl valor de la variable MAXIMO es: %d" , MAXIMO );
        System.out.printf("\n\tEl valor de la variable dia de la semana es: %d" , diasem );
        System.out.printf("\n\tEl valor de la variable dia del año es: %d" , diaanual );
        System.out.printf("\n\tEl valor de la variable SEXO es: %s" , sexo );
        System.out.printf("\n\tEl valor de la variable milisegundos es: %d" , miliseg );
        System.out.printf("\n\tEl valor de la variable total factura es: %,.2f" , totalfactura );
        System.out.printf("\n\tEl valor de la variable total factura en notacion cientifica es: %e" , totalfactura );
        System.out.printf("\n\tEl valor de la variable poblacion es: %,d" , poblacion );
    
    //Este es el corchete que termina el main
    }
}

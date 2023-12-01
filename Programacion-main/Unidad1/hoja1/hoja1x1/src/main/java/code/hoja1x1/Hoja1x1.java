package code.hoja1x1;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de definición de variables y asignación de valores                  //////////
//////////////////////////////////////////////////////////////////////////////////////////////////   

    public class Hoja1x1 {
        // El sexo a pesar de ser un caracter, no es de libre eleccion sino que solo puede ser uno de estos valores.
        enum Sexos {M,V};
        // Aqui empieza el main del programa, que es el punto donde comienza a ejecutarse.
        public static void main(String[ ] args) {
            // Boolean porque solo puede ser verdadero o falso, eleccion binaria.
            boolean casado=true;
            // byte, short, int y long en base a la maxima memoria de los numeros, 8, 16, 32 y 64 bits respectivamente de memoria reservada.
            final int MAXIMO = 999999;
            byte diasem = 1;
            short diaanual = 300;
            Sexos sexo = Sexos.M;
            long miliseg = 1298332800000L;
            // Utilizo float y no double porque dudo que una factura tenga muchos decimales. De ser una factura
            // por ejemplo en Bitcoins por productos de bajo precio usaría double.
            float totalfactura = 10350.678F;
            long poblacion = 6775235741L;
            
            //Usando solo la orden println
            System.out.println("----- EJERCICIO DE VARIABLES Y TUPOS DE DATOS -----");
            System.out.println("\tEl valor de la variable casado es " + casado);
            System.out.println("\tEl valor de la variable MAXIMO es " + MAXIMO);
            System.out.println("\tEl valor de la variable diasem es " + diasem);
            System.out.println("\tEl valor de la variable diaanual es " + diaanual);
            System.out.println("\tEl valor de la variable sexo es " + sexo);
            System.out.println("\tEl valor de la variable miliseg es " + miliseg);
            System.out.println("\tEl valor de la variable totalfactura es " + totalfactura);
            System.out.println("\tEl valor de la variable poblacion es " + poblacion);
            
            //Usando solo la orden print
            System.out.print("\n----- EJERCICIO DE VARIABLES Y TUPOS DE DATOS -----\r");
            System.out.print("\tEl valor de la variable casado es " + casado + "\r");
            System.out.print("\tEl valor de la variable MAXIMO es " + MAXIMO + "\r");
            System.out.print("\tEl valor de la variable diasem es " + diasem + "\r");
            System.out.print("\tEl valor de la variable diaanual es " + diaanual + "\r");
            System.out.print("\tEl valor de la variable sexo es " + sexo + "\r");
            System.out.print("\tEl valor de la variable miliseg es " + miliseg + "\r");
            System.out.print("\tEl valor de la variable totalfactura es " + totalfactura + "\r");
            System.out.print("\tEl valor de la variable poblacion es " + poblacion + "\r");
            
            //Usando solo la orden printf
            System.out.printf("\n\n----- EJERCICIO DE VARIABLES Y TUPOS DE DATOS -----\r");
            System.out.printf("\tEl valor de la variable casado es %s\r ", casado );
            System.out.printf("\tEl valor de la variable MAXIMO es %d\r", MAXIMO );
            System.out.printf("\tEl valor de la variable diasem es %d\r", diasem );
            System.out.printf("\tEl valor de la variable diaanual es %d\r", diaanual );
            System.out.printf("\tEl valor de la variable sexo es %s\r", sexo);
            System.out.printf("\tEl valor de la variable miliseg es %d\r", miliseg );
            System.out.printf("\tEl valor de la variable totalfactura es %f\r", totalfactura );
            System.out.printf("\tEl valor de la variable totalfactura en notacion cientifica es %e\r", totalfactura );
            System.out.printf("\tEl valor de la variable poblacion es %,d\r", poblacion );
        // Esta llave pone fin al main
        }
    // Y esta llave pone fin a la clase Ejercicio1
    }

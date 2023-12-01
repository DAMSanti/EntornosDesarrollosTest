package unidad1.hoja2x7;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de definición de variables y asignación de valores                  //////////
//////////////////////////////////////////////////////////////////////////////////////////////////

    public class Hoja2x7 {

        public static void main(String[ ] args) {
            int a = 23, b = 56 ;
            
            System.out.printf("Los valores inciales son:\ta = %d\tb = %d\n", a, b);
            
            int temp = a;
            a = b;
            b = temp;
            
            System.out.printf("Los valores actualizados son:\ta = %d\tb = %d\n", a, b);
        }
    }
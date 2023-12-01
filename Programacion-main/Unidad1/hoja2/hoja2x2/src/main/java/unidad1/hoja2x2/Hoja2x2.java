package unidad1.hoja2x2;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de input de información y utilización de datos                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

    public class Hoja2x2 {

        public static void main(String [] args){
            boolean w, x=true, y=true,z=false;
            w=x && y || x && z || y && z;
            System.out.println("El resultado es: " + w );
        }
    }
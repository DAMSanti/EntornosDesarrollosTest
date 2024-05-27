package unidad7.ud07hoja01ej01;

import java.io.File;

/**
 *
 * @author DAM104
 */
public class Ud07Hoja01Ej01 {

    public static void main(String[] args) {
        File fichero=new File("prueba.txt");
        if(fichero.exists()){
            System.out.println("El fichero existe");
        }else{
            System.out.println("El fichero no existe");
        }
    }
}

package unidad7.ud07hoja01ej02;

import java.io.File;
import java.nio.file.Files;

/**
 *
 * @author DAM104
 */
public class Ud07Hoja01Ej02 {

    public static void main(String[] args) {
        File fichero=new File("prueba.txt");
        if(fichero.exists()){
            System.out.println(fichero.getName());
            System.out.println(fichero.getAbsolutePath());
            System.out.println(fichero.canRead());
            System.out.println(fichero.canWrite());
            System.out.println(fichero.length());
        }else{
            System.out.println("El fichero no existe");
        }
    }
}

//2.- Buscar un fichero en una ruta determinada y sacar por pantalla

//a) Su nombre
//b) Su ruta de acceso
//c) Si es de lectura
//d) Si es de escritura
//e) Su tamaño.
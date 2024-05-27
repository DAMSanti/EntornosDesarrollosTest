package unidad7.ud07hoja1ej03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DAM104
 */
public class Ud07Hoja1Ej03 {

    public static void main(String[] args) {
        File fichero = new File("prueba.txt");
        BufferedWriter br = null;
        try {
            br = new BufferedWriter(new FileWriter(fichero, true)); //si el fichero existe añade información
            br.write(" ");
            br.write(System.lineSeparator());
        } catch (IOException ex) {
            System.err.println(ex.toString());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
            }
        }
    }
}


// 3.- Crear un fichero en una ruta determinada

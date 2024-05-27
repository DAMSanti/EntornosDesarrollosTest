package unidad7.ud07hoja01ej04;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ud07Hoja01Ej04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre de la carpeta:");
        String directoryName = scanner.nextLine();

        Path startPath = Paths.get(directoryName);
        try {
            Files.walk(startPath)
                .filter(Files::isRegularFile) // Filtra solo los archivos, excluyendo los directorios
                .forEach(System.out::println);  
        } catch (AccessDeniedException ex) {
            System.out.println("Permiso denegado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//4.- Realizar un programa que lleve a cabo las siguientes tareas:
//a) Solicitar al usuario el nombre de un directorio
//b) Mostrar por pantalla los nombres de los ficheros que hay en el directorio solicitado
//y en todos los subdirectorios de éste.



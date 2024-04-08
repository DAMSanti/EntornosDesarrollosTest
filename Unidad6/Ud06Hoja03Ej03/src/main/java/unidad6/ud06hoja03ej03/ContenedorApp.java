package unidad6.ud06hoja03ej03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class ContenedorApp {

    private static LinkedList<Contenedor> contenedores = new LinkedList<>();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Listar contenedores almacenados");
            System.out.println("2. Almacenar un contenedor");
            System.out.println("3. Retirar un contenedor");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    listarContenedores();
                }
                case 2 -> {
                    almacenarContenedor();
                }
                case 3 -> {
                    retirarContenedor();
                }
                case 4 -> {
                    System.out.println("Saliendo...");
                }
                default -> {
                    System.out.println("Opción inválida");
                }
            }
        } while (opcion != 4);
    }

    private static void listarContenedores() {
        if (contenedores.isEmpty()) {
            System.out.println("No hay contenedores almacenados");
        } else {
            System.out.println("Contenedores almacenados:");
            for (Contenedor contenedor : contenedores) {
                System.out.println(contenedor);
            }
        }
    }

    private static Contenedor almacenarContenedor() {
        Scanner scanner = new Scanner(System.in);
        Contenedor contenedor = null;
        LocalDateTime fechaHoraFormated = null;
        
        boolean datosValidos = false;
        do {
            try {
                System.out.print("Ingrese el código del contenedor: ");
                String codigo = scanner.nextLine();

                if (!codigo.matches("\\d{4}")) {
                    throw new IllegalArgumentException("El código debe ser una cadena de 4 dígitos");
                }

                System.out.print("Ingrese el origen del contenedor: ");
                String origen = scanner.nextLine();

                if (!origen.matches("[A-Z][a-z]{0,15}")) {
                    throw new IllegalArgumentException("El origen debe empezar con una letra mayúscula seguida de un máximo de 15 letras minúsculas");
                }

                System.out.print("Ingrese la fecha y hora de almacenamiento (dd/mm/yyyy hh:mm:ss): ");
                String fechaHora = scanner.nextLine();
                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                    fechaHoraFormated = LocalDateTime.parse(fechaHora, formatter);
                    datosValidos = true;
                } catch (DateTimeParseException e) {
                    System.out.println("Error: Formato de fecha inválido. Introduce una fecha en el formato correcto.");
                }
                contenedor = new Contenedor(codigo, origen, fechaHoraFormated);
                contenedores.add(contenedor);

                System.out.println("Contenedor almacenado correctamente");
                datosValidos = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error al almacenar el contenedor: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error excepcion desconodida: " + e.getMessage());
            }
        } while (!datosValidos);
        return contenedor;
    }

    private static void retirarContenedor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el código del contenedor a retirar: ");
        String codigo = scanner.nextLine();

        Contenedor contenedorEncontrado = null;
        boolean valido = false ;
        for (int i = 0; i < contenedores.size() && !valido; i++) {        
            if (contenedores.get(i).getCodigo().equals(codigo)) {
                contenedorEncontrado = contenedores.get(i);
                valido = true;
            }            
        }

        if (contenedorEncontrado != null) {
            contenedores.remove(contenedorEncontrado);
            System.out.println("Contenedor retirado correctamente");
            System.out.println("Tiempo en el almacén: " + contenedorEncontrado.getTiempoEnAlmacen());
        } else {
            System.out.println("No se encontró el contenedor con el código especificado");
        }
    }
}

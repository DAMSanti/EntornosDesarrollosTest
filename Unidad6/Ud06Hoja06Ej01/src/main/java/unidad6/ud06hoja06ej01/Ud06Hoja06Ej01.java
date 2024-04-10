package unidad6.ud06hoja06ej01;

/**
 *
 * @author rathm
 */
public class Ud06Hoja06Ej01 {

    public static void main(String[] args) {
        GestorSeries gestor = new GestorSeries();
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Añadir serie");
            System.out.println("2. Eliminar serie");
            System.out.println("3. Ver series almacenadas");
            System.out.println("4. Añadir capítulo a una serie ya almacenada (pide nombre por teclado)");
            System.out.println("5. Borrar capítulo de una serie ya almacenada (pide nombre por teclado)");
            System.out.println("6. Ver capítulos de una serie ya almacenada (pide nombre por teclado)");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = Entrada.leerInt();

            switch (opcion) {
                case 1-> {
                    gestor.crearSerie();
                }
                case 2-> {
                    gestor.eliminarSerie(Entrada.leerString("Introduce el nombre de la serie: ", 2, 30));
                }
                case 3-> {
                    gestor.verSeries();
                }
                case 4-> {
                    gestor.crearCapitulo();
                }
                case 5-> {
                    gestor.eliminarCapitulo();
                }
                case 6-> {
                    gestor.verCapitulos();
                }
                case 7-> {
                    System.out.println("Saliendo del programa...");
                }
                default-> {
                    System.out.println("Opción inválida. Intente nuevamente.");
                }
            }
        } while (opcion != 7);
    }
}

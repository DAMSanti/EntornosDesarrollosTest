package unidad6.ud06hoja05ej02;

/**
 *
 * @author rathm
 */
public class Ud06Hoja05Ej02 {

    public static void main(String[] args) {
        Agenda agenda = null;
        boolean salir = false;
        do {
            System.out.println("\tBIENVENIDO A LA AGENDA PERSONAL\n\n1. Crear Agenda\n2. Añadir contacto.\n3. Borrar contacto\n4. Mostrar todos los contactos\n5. Buscar contacto\n6. Modificar dni\n7. Salir de la aplicacion.\n\nIntroduzca una opcion: ");
            switch (Teclado.leerInt()) {
                case 1 -> {
                    agenda = Agenda.creaAgenda();
                }
                case 2 -> {
                    if (agenda != null) {
                        boolean valido = false;
                        System.out.println("Introduccion de un nuevo contacto");
                        String nombre = Teclado.leerString("Introduce el nombre del contacto: ", 3, 15, "^[A-Z][a-z]+( [A-Z][a-z]+)*$");
                        String apellidos = Teclado.leerString("Introduce los apellidos del contacto: ", 7, 30, "^[A-Z][a-z]+( [A-Z][a-z]+)*$");
                        String dni;
                        do {
                            dni = Teclado.leerString("Introduce el numero de DNI del contacto. (00000000A)", 9, 9, "^[0-9]{8}[A-Z]$");
                            valido = Teclado.validarDNI(dni);
                            if (!valido) {
                                System.out.println("El dni introducido no es correcto.");
                            }
                        } while (!valido);
                        if (agenda.añadirPersona(dni, nombre, apellidos)) {
                            System.out.println("Contacto añadido correctamente");
                        } else {
                            System.out.println("Ha habido un problema introduciendo el contacto.");
                        }
                    } else {
                        System.out.println("Debes crear una agenda antes de introducir contactos.");
                    }
                }
                case 3 -> {
                    if (agenda != null) {
                        String dni = Teclado.leerString("Introduce el DNI del contacto a borrar: ", 9, 9, "^[0-9]{8}[A-Z]$");
                        if (agenda.borrarPersona(dni)) {
                            System.out.println("Contacto borrado con exito.");
                        } else {
                            System.out.println("No se ha encontrado el contacto.");
                        }
                    } else {
                        System.out.println("Debes crear una agenda antes de introducir contactos.");
                    }
                }
                case 4 -> {
                    if (agenda != null) {
                        agenda.listarPersonas();
                    } else {
                        System.out.println("Debes crear una agenda antes de introducir contactos.");
                    }
                }
                case 5 -> {
                    String dni = Teclado.leerString("Introduce el DNI del contacto a buscar: ", 9, 9, "^[0-9]{8}[A-Z]$");
                    Persona p = agenda.buscarPersona(dni);
                    if (p != null) {
                        System.out.println(p);
                    } else {
                        System.out.println("No se ha encontrado el contacto.");
                    }
                }
                case 6 -> {
                    String dni = Teclado.leerString("Introduce el DNI del contacto a modificar: ", 9, 9, "^[0-9]{8}[A-Z]$");
                    String nuevoDni;
                    boolean valido = false;
                    do {
                        nuevoDni = Teclado.leerString("Introduce el nuevo DNI del contacto. (00000000A)", 9, 9, "^[0-9]{8}[A-Z]$");
                        valido = Teclado.validarDNI(nuevoDni);
                    } while (!valido);
                    if (agenda.modificardni(dni, nuevoDni)) {
                        System.out.println("DNI modificado con exito.");
                    } else {
                        System.out.println("No se ha encontrado el contacto.");
                    }
                }
                case 7-> {
                    salir = true;
                    System.out.println("Hasta Luego");
                }
            }
        } while (!salir);
    }
}

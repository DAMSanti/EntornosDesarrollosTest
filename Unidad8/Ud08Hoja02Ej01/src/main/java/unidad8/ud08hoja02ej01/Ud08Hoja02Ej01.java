package unidad8.ud08hoja02ej01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author rathm
 */

public class Ud08Hoja02Ej01 {

    public static void main(String[] args) {
        boolean salir = false ;
        PacienteDAO p1 = new PacienteDAO();
        VisitasDAO v1 = new VisitasDAO();
        do {
            System.out.println("CLINICA DENTAL DAM!");
            System.out.println("1.-Insertar paciente\n2.-Crear visita\n3.- Mostrar agenda\n4.-Consultar visitas\n5.-Salir");
            switch(Teclado.leerInt("Introduce una opcion: ")) {
                case 1-> {
                    boolean valido = false;
                    System.out.println("Introduccion de un nuevo paciente");
                    String dni;
                    do {
                        dni = Teclado.leerString("Introduce el numero de DNI del contacto. (00000000A)", 9, 9, "^[0-9]{8}[A-Z]$");
                        valido = Teclado.validarDNI(dni);
                        if (!valido) {
                            System.out.println("El dni introducido no es correcto.");
                        }
                    } while (!valido);
                    Paciente  aux = p1.buscar(dni);
                    if (aux == null) {
                        String nombre = Teclado.leerString("Introduce el nombre del paciente: ", 3, 15, "^[A-Z][a-z]+( [A-Z][a-z]+)*$");
                        String telefono = Teclado.leerString("Introduce el telefono del paciente: ", 8, 9, "^[0-9]*$");
                        Paciente pac = new Paciente(dni, nombre, telefono);
                        if (p1.crear(pac)) {
                            System.out.println("Paciente añadido satisfactoriamente");
                        } else { 
                            System.out.println("Se ha producido un error al introducir el paciente.");
                        }
                    } else {
                        System.out.println("Ya existe un paciente con ese DNI.");
                    }
                }
                case 2-> {
                    boolean valido = false;
                    Tratamiento tratamiento = null;
                    System.out.println("Introduccion de una nueva visita");
                    String dni;
                    do {
                        dni = Teclado.leerString("Introduce el numero de DNI del contacto. (00000000A)", 9, 9, "^[0-9]{8}[A-Z]$");
                        valido = Teclado.validarDNI(dni);
                        if (!valido) {
                            System.out.println("El dni introducido no es correcto.");
                        }
                    } while (!valido);
                    Paciente  aux = p1.buscar(dni);
                    if (aux == null) {
                        System.out.println("El usuario no existe, deberia introducirlo utilizando la funcion correspondiente de esta aplicacion.");
                    } else {
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
                        LocalDateTime fecha = Teclado.leerFechaHoraPosterior("Introduce la fecha de la visita (dd-MM-yyyy hh:mm) :", formatter);
                        switch (Teclado.leerInt("A que tratamiento se va a someter?\n1.- Implantología\n2.- Ortodoncia\n3.- Periodoncia\n4.- Estética\n5.- Extracciones", 1, 5)) {
                            case 1-> {
                                tratamiento = Tratamiento.IMPLANTOLOGIA;
                            }
                            case 2-> {
                                tratamiento = Tratamiento.ORTODONCIA;
                            }
                            case 3-> {
                                tratamiento = Tratamiento.PERIODONCIA;
                            }
                            case 4-> {
                                tratamiento = Tratamiento.ESTETICA;
                            }
                            case 5-> {
                                tratamiento = Tratamiento.EXTRACCIONES;
                            }
                        }
                        String comentario = Teclado.leerString("Si quiere introducir un comentario, hágalo a continuación: ");
                        Visita vis = new Visita(dni, fecha, tratamiento, comentario);
                        if (v1.crear(vis)) {
                            System.out.println("Visita añadida satisfactoriamente");
                        } else { 
                            System.out.println("Se ha producido un error al introducir la visita.");
                        }
                    }
                }
                case 3-> {
                    System.out.println("MOSTRAR AGENDA DE UN DIA");
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    LocalDate fechaTeclado =Teclado.leerFecha("Introduzca la fecha de la que quiere ver las citas", formatter);
                    ArrayList<Visita> visitas = v1.mostrarVisitas(fechaTeclado);
                    for (Visita visita : visitas) {
                        System.out.println(visita.toString());
                    }
                }
                case 4-> {
                    System.out.println("MOSTRAR VISITAS POR PACIENTE");
                    boolean valido = false;
                    String dni;
                    do {
                        dni = Teclado.leerString("Introduce el numero de DNI del contacto. (00000000A)", 9, 9, "^[0-9]{8}[A-Z]$");
                        valido = Teclado.validarDNI(dni);
                        if (!valido) {
                            System.out.println("El dni introducido no es correcto.");
                        }
                    } while (!valido);
                    LinkedList<Visita> visitas = v1.mostrarVisitasPaciente(dni);
                    for (Visita visita : visitas) {
                        System.out.println(visita.toString());
                    }
                }
                case 5-> {
                    salir = true;
                }
            }
        } while (!salir);
    }
}

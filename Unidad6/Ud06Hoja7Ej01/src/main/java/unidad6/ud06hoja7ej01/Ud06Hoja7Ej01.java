package unidad6.ud06hoja7ej01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author rathm
 */
public class Ud06Hoja7Ej01 {

    public static void main(String[] args) {
        EntidadBancaria BBVA = new EntidadBancaria();
        boolean salir = false;
        do {
            System.out.println("\tBIENVENIDO AL SISTEMA DE GESTION DEL BANCO\n\n1. Abrir una nueva cuenta\n2. Ver un listado de las cuentas disponibles.\n3. Obtener los datos de una cuenta concreta con toda su informacion\n4. Realizar un ingreso en una cuenta\n5. Retirar efectivo de una cuenta\n6. Consultar los clientes del banco de cierta edad\n7. Salir de la aplicacion.\n\nIntroduzca una opcion: ");
            switch (Teclado.leerInt()) {
                case 1-> {
                    boolean valido = false;
                    System.out.println("Introduccion de nueva cuenta");
                    String nombre = Teclado.leerString("Introduce el nombre del cliente: ", 3, 15, "^[A-Z][a-z]+( [A-Z][a-z]+)*$");
                    String apellidos = Teclado.leerString("Introduce los apellidos del cliente: ", 7, 30, "^[A-Z][a-z]+( [A-Z][a-z]+)*$");
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    LocalDate fechaNacimiento = Teclado.leerFechaAnterior("Introduce la fecha de nacimiento del cliente. (dd-mm-yyyy)", formatter);
                    double saldo = Teclado.leerDouble("Introduzca el saldo inicial de la cuenta: ", true);
                    String ccc;
                    do {
                        ccc = Teclado.leerString("Introduce el numero de CC del cliente. (XXXX-XXXX-XX-XXXXXXXXXX)", 23, 23, "^[0-9]{4}-[0-9]{4}-[0-9]{2}-[0-9]{10}$");
                        valido = Teclado.validarCuenta(ccc);
                    } while (!valido);
                    System.out.println("Que tipo de cuenta quieres hacer?\n\n1. Cuenta de Ahorro\n2. Cuenta Corriente de Empresa\n3. Cuenta Corriente Personal");
                    boolean opciones = false;
                    do {
                        switch (Teclado.leerInt()) {
                            case 1-> {
                                double tipoInteres = Teclado.leerDouble("Introduce el tipo de interes. (Entre " + CuentaAhorro.MIN_TIPO_INTERES + " y " + CuentaAhorro.MAX_TIPO_INTERES + ")", CuentaAhorro.MIN_TIPO_INTERES, CuentaAhorro.MAX_TIPO_INTERES, true);
                                CuentaAhorro cuentaA = new CuentaAhorro(nombre, apellidos, fechaNacimiento, saldo, ccc, tipoInteres);
                                System.out.println(BBVA.introducir(cuentaA) ? "Se ha introducido la cuenta correctamente" : "No hemos podido introducir la cuenta.");
                                opciones = true;
                            }
                            case 2-> {
                                double maximoDescubierto = Teclado.leerDouble("Introduzca el máximo descubierto posible. (MAX " + CuentaCorrienteEmpresa.MAX_DESCUBIERTO + ").", 0, CuentaCorrienteEmpresa.MAX_DESCUBIERTO, true);
                                CuentaCorrienteEmpresa cuentaB = new CuentaCorrienteEmpresa(nombre, apellidos, fechaNacimiento, saldo, ccc, maximoDescubierto);
                                System.out.println(BBVA.introducir(cuentaB) ? "Se ha introducido la cuenta correctamente" : "No hemos podido introducir la cuenta.");
                                opciones = true;
                            }
                            case 3-> {
                                double comisionMantenimiento = Teclado.leerDouble("Introduce la comision e mantenimiento. (Entre " + CuentaCorrientePersonal.MIN_COMISION_MANTENIMIENTO + " y " + CuentaCorrientePersonal.MAX_COMISION_MANTENIMIENTO + ")", CuentaCorrientePersonal.MIN_COMISION_MANTENIMIENTO, CuentaCorrientePersonal.MAX_COMISION_MANTENIMIENTO, true);
                                CuentaCorrientePersonal cuentaC = new CuentaCorrientePersonal(nombre, apellidos, fechaNacimiento, saldo, ccc, comisionMantenimiento);
                                System.out.println(BBVA.introducir(cuentaC) ? "Se ha introducido la cuenta correctamente" : "No hemos podido introducir la cuenta.");
                                opciones = true;
                            }
                            default -> {
                                System.out.println("No has seleccionado una opcion válida");
                            }
                        }                        
                    } while (!opciones);
                }
                case 2-> {
                    boolean exit = false;
                    do {
                        System.out.println("Que cuentas quieres listar?\n\n1- Cuentas de Ahorros\n2- Cuentas Corrientes\n3- Todas las cuentas\nElige una opcion:");
                        switch(Teclado.leerInt()) {
                            case 1-> {
                                for (HashMap.Entry<String, Object> entry : hashMap.entrySet()) {
                                System.out.println("Clave = " + entry.getKey() + ", Valor = " + entry.getValue());                               
                            }
                            case 2->;
                            case 3->;
                            default ->;
                        }
                    }while (!exit);
                }
                //case 3-> ;
                //case 4-> ;
                //case 5-> ;
                //case 6-> ;
                case 7-> salir = true ;
                default -> System.out.println("La opcion introducida no es correcta.");
            }
        } while(!salir);
    }
}

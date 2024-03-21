package unidad6.ud06hoja02ej02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String dni;

    public Persona() {
        Scanner teclado = new Scanner(System.in);
        boolean formatoNombreCorrecto = false;
        do {
            System.out.print("Ingrese el nombre: ");
            String nombreInput = teclado.nextLine();
            if (ValidaDatos.validarNombre(nombreInput)) {
                this.nombre = nombreInput;
                formatoNombreCorrecto = true;
            } else {
                System.out.println("Nombre introducido no válido, tiene que tener al menos 3 caracteres");
            }            
        } while (!formatoNombreCorrecto);
        boolean formatoFechaCorrecto = false;
        do {
            System.out.print("Ingrese la fecha de nacimiento (dd/mm/yyyy): ");
            String fechaNacimientoInput = teclado.nextLine();
            if (ValidaDatos.validarFecha(fechaNacimientoInput)) {
                this.fechaNacimiento = convertirFecha(fechaNacimientoInput);
                formatoFechaCorrecto = true;                
            }
        } while (!formatoFechaCorrecto);
        boolean formatoDniCorrecto = false;
        do {
            System.out.print("Ingrese el DNI: ");
            String dniInput = teclado.nextLine();
            if (ValidaDatos.validarDNI(dniInput)) {
                this.dni = dniInput;
                formatoDniCorrecto = true;
            } else {
                System.out.println("El DNI introducido no es valido, compruebelo.");
            }
        } while (!formatoDniCorrecto);
    }
   
    public LocalDate convertirFecha(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(fecha, formatter);
        return localDate;
    }  
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return (int) ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
    }

    @Override
    public String toString() {
        return String.format("Persona{ nombre='%s', fechaNacimiento='%s', dni='%s'}", nombre, fechaNacimiento, dni);
    }
}
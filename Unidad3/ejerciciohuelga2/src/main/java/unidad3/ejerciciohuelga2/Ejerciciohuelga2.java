package unidad3.ejerciciohuelga2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejerciciohuelga2 {

    public static void main(String[] args) {
        Estudiante alumno1 = new Estudiante("Link", (byte)(35), Ciclo.DAM, "Entornos");
        Estudiante alumno2 = new Estudiante("Adrian", (byte)(32), Ciclo.DAW, "Programacion");
        Estudiante alumno3 = new Estudiante("Saul", (byte)(20), Ciclo.DAM, "Bases de Datos");
        Estudiante alumno4 = new Estudiante("Hugo", (byte)(19), Ciclo.DAW, "Lenguaje de Marcas");
        Estudiante alumno5 = new Estudiante("Miguel", (byte)(19), Ciclo.DAW, "Sistemas Informaticos");
        Estudiante alumno6 = new Estudiante("Ethan", (byte)(28), Ciclo.DAM, "Formacion y Orientacion Laboral");
        
        byte opcion = Estudiante.introduceDatosByte("\tBase de datos de Alumnos\nBusca alumnos con las siguientes caracteristicas:\n\n1.-Es mayor de la edad introducida\n2.-Pertenece al modulo introducido\n3.-Pertenece al ciclo introducido\n\n");
        switch (opcion) {
            case 1 -> { byte edad = Estudiante.introduceDatosByte("¿Cual quieres que sea la edad de corte?\n");
                        System.out.println("Alumnos con mas de " + edad + " años.");
                        if (alumno1.esMayorDe(edad)) {
                            System.out.print(alumno1.nombre + " ");
                        }
                        if (alumno2.esMayorDe(edad)) {
                            System.out.print(alumno2.nombre + " ");
                        }
                        if (alumno3.esMayorDe(edad)) {
                            System.out.print(alumno3.nombre + " ");
                        }
                        if (alumno4.esMayorDe(edad)) {
                            System.out.print(alumno4.nombre + " ");
                        }
                        if (alumno5.esMayorDe(edad)) {
                            System.out.print(alumno5.nombre + " ");
                        }
                        if (alumno6.esMayorDe(edad)) {
                            System.out.print(alumno6.nombre + " ");
                        }
                        System.out.print("\n");
            }
            case 2 -> { String modulo = Estudiante.introduceDatosString("¿En que modulo quieres buscar estudiantes?\n");
                        System.out.println("Alumnos pertenecientes al modulo de " + modulo);
                        if (alumno1.esEstudianteModulo(modulo)) {
                            System.out.print(alumno1.nombre + " ");
                        }
                        if (alumno2.esEstudianteModulo(modulo)) {
                            System.out.print(alumno2.nombre + " ");
                        }
                        if (alumno3.esEstudianteModulo(modulo)) {
                            System.out.print(alumno3.nombre + " ");
                        }
                        if (alumno4.esEstudianteModulo(modulo)) {
                            System.out.print(alumno4.nombre + " ");
                        }
                        if (alumno5.esEstudianteModulo(modulo)) {
                            System.out.print(alumno5.nombre + " ");
                        }
                        if (alumno6.esEstudianteModulo(modulo)) {
                            System.out.print(alumno6.nombre + " ");
                        }
                        System.out.print("\n");
            }
            case 3 -> { Scanner teclado = new Scanner(System.in);
                        System.out.println("¿De que ciclo quieres buscar estudiantes? Opciones: DAM y DAW");
                        byte ciclo = teclado.nextByte();
                        System.out.println("Alumnos pertenecientes al ciclo de " + ciclo);
                        if (alumno1.getCiclo().equals(ciclo)) {
                            System.out.print(alumno1.nombre + " ");
                        }
                        if (alumno2.getCiclo().equals(ciclo)) {
                            System.out.print(alumno2.nombre + " ");
                        }
                        if (alumno3.getCiclo().equals(ciclo)) {
                            System.out.print(alumno3.nombre + " ");
                        }
                        if (alumno4.getCiclo().equals(ciclo)) {
                            System.out.print(alumno4.nombre + " ");
                        }
                        if (alumno5.getCiclo().equals(ciclo)) {
                            System.out.print(alumno5.nombre + " ");
                        }
                        if (alumno6.getCiclo().equals(ciclo)) {
                            System.out.print(alumno6.nombre + " ");
                        }
                        System.out.print("\n");
            }
        }
        
        
        //CREAR 6 OBJETOS ALUMNO;
        //con modulos (entornos, programacion, bases de datos, lenguaje de marcas, sistemas, fol);
        //menu de opciones donde tenemos las siguientes opciones:
        //introduce edad y devuelve la lista de los alumnos mayores a esa edad:
        //introduce un modulo y devuelve la lista de los alumnos de ese modulo:
        //introduce un ciclo y muestra los alumnos de ese ciclo:
    }
}

package unidad3.ejerciciohuelga2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Estudiante {
    public String nombre, modulo;
    public byte edad;
    public Ciclo ciclo;
    
    public Estudiante(String nombre, byte edad, Ciclo ciclo, String modulo) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciclo = ciclo;
        this.modulo = modulo;
    }
    
    public boolean esEstudianteModulo(String modulo) {
        if (this.modulo.equals(modulo)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean esMayorDe(byte edad) {
        if (this.edad > edad) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public Ciclo getCiclo(){
        return ciclo;
    }
    
    public static byte introduceDatosByte(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf(mensaje);
        return teclado.nextByte();
    }
    
    public static String introduceDatosString(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf(mensaje);
        return teclado.nextLine();
    }  
}

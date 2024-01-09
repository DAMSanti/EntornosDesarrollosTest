package fechas.fechas02;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Veterinario {
    private Mascota[] clientes;
    private static int mascotas;
    
    public Veterinario() {
        this.mascotas = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantas mascotas quieres introducir?");
        int n = teclado.nextInt();
        String nombre;
        int ano, mes, dia;
        this.clientes = new Mascota[n];
        for (int i = 0; i < n; i++) {
            System.out.print("[" + (i+1) + "/" + n + "] Nombre de la mascota: ");
            teclado = new Scanner(System.in);
            nombre = teclado.nextLine();
            System.out.print("Año de nacimiento de " + nombre + ": ");
            teclado = new Scanner(System.in);
            ano = teclado.nextInt();
            System.out.print("Mes de nacimiento de " + nombre + ": ");
            teclado = new Scanner(System.in);
            mes = teclado.nextInt();
            System.out.print("Dia de nacimiento de " + nombre + ": ");
            teclado = new Scanner(System.in);
            dia = teclado.nextInt();
            clientes[i] = new Mascota(nombre, ano, mes, dia);
            this.mascotas++;
        }
    }
    
    public void recibir() {
        String nombre;
        int ano, mes, dia;        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nombre de la mascota: ");
        teclado = new Scanner(System.in);
        nombre = teclado.nextLine();
        System.out.print("Año de nacimiento de " + nombre + ": ");
        teclado = new Scanner(System.in);
        ano = teclado.nextInt();
        System.out.print("Mes de nacimiento de " + nombre + ": ");
        teclado = new Scanner(System.in);
        mes = teclado.nextInt();
        System.out.print("Dia de nacimiento de " + nombre + ": ");
        teclado = new Scanner(System.in);
        dia = teclado.nextInt();
        
        
        Mascota[] aux = new Mascota[this.clientes.length];
        for (int i = 0; i < aux.length; i++) {
            aux[i]=this.clientes[i];
        }
        
        this.clientes = new Mascota[this.clientes.length+1];
        for (int i = 0; i < this.clientes.length; i++) {
            if (i<this.clientes.length-1) {
                this.clientes[i] = aux[i];
            } else {
                this.clientes[i] = new Mascota(nombre, ano, mes, dia);
                this.mascotas++;
            }
        } 
    }
    
    public String mostrar() {
        String datos = "";
        for (int i = 0; i < this.clientes.length; i++) {
            datos += this.clientes[i].toString() + "\n";
        }
        return datos;
    }
    
    public String mostrarMayores() {
        String datos = "";
        for (int i = 0; i < this.clientes.length; i++) {
            if (this.clientes[i].getEdad()>5) {
                datos += this.clientes[i].toString() + "\n";
            }
        }
        return datos;
    }
}




/*

2. - Crear una clase Mascota que tenga un nombre y una fecha de nacimiento (de tipo
LocalDate) como atributos y los siguientes métodos:
• Constructor que recibe como parámetro un nombre, un año, un mes y un día y
establece el valor del nombre y de la fecha de nacimiento.
• Método getEdad que devuelve el número de años de la mascota
• Método toString que devuelve información sobre la mascota
Crear también una clase Veterinario que tiene un array de mascotas a las que atiende.
Además, tendrá un contador de mascotas. Se pide:
• Un constructor que establece contador a 0 y cree un array con un número amplio de
mascotas.
• Un método añadir que recibe una mascota y la añada al array.
• Un método mostrar que devuelve una cadena con todos los datos sobre las mascotas
del veterinario.
• Método mostrarMayores que devuelve una cadena con los datos de las mascotas de
más de 5 años
Realiza la prueba del programa creando un veterinario y añadiendo varias mascotas. Llama a
los métodos mostrar y mostrarMayores y mostrad los resultados por pantalla.

*/
package fechas.fechas02;

/**
 *
 * @author Santi
 */
public class Fechas02 {

    public static void main(String[] args) {
        Veterinario v1 = new Veterinario();
        
        v1.recibir();
        
        System.out.println("\nClientes de la veterinaria\n");
        System.out.println(v1.mostrar());
        
        System.out.println("\nClientes de la veterinaria mayores de 5 años.\n");
        System.out.println(v1.mostrarMayores());
    }
}

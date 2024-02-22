package unidad05.ud05hoja05ej03;

import java.util.Arrays;

/**
 *
 * @author DAM104
 */
public class Agenda {
    private Contacto[] contactos;
    private int contContactos;
    
    public Agenda(int n) {
        this.contactos = new Contacto[n];
        this.contContactos = 0;
    }
    
    public void insertar(Contacto contacto) {
        if (contContactos < contactos.length) {
            contactos[contContactos++] = contacto;
            System.out.printf("El contacto %s ha sido insertado correctamente en la posicion %d\n", contacto.getNombre(), contContactos);
        } else {
            System.out.println("No se ha podido insertar el contacto porque la lista está llena.\n");
        }
    }
    
    public void buscar(String nombre) {
        for (int i = 0; i < contContactos; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Se ha encontrado a " + nombre + " en la posicion " + (i+1));
            }
        }
    }
    
    public void eliminar(String nombre) {
        for (int i = 0; i < contContactos; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                for (int j = i+1; j < contContactos; j++) {
                    contactos[j-1] = contactos[j];
                }
                System.out.printf("El contacto %s ha sido borrado correctamente.\n", contactos[i].getNombre());
                contContactos--;
                i--;
            } else {
                System.out.println("No se ha encontrado el contacto buscado.");
            }
        }
    }
    
    public String toString() {
        String output = "";
        for (int i = 0; i < contContactos; i++) {
            output += contactos[i].toString();
        }
        return output;
    }
    
    public void ordenar() {
        Arrays.sort(contactos, 0, contContactos);
    }

}

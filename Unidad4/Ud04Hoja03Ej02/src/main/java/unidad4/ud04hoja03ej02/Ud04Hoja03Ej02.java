package unidad4.ud04hoja03ej02;

/**
 *
 * @author Santi
 */
public class Ud04Hoja03Ej02 {

    public static void main(String[] args) {
        Curso c1 = new Curso(5);
        c1.mostrarNombres();
        c1.iniciales();
        c1.desplaza();
        c1.mostrarNombres();
        System.out.println (c1.verNombre(2) + "\n");    
        if (c1.esDAW()) {
            System.out.println("El curso revisado es DAW.");
        } else {
            System.out.println("El curso revisado NO es DAW.");
        }
    }
}

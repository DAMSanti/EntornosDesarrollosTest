package unidad4.ud04hoja03ej01;

/**
 *
 * @author Santi
 */
public class Ud04Hoja03Ej01 {

    public static void main(String[] args) {
        Triatlon participante1 = new Triatlon(4, "Santi", 5);
        Triatlon participante2 = new Triatlon();
        
        if (participante1.esSeleccionado()) {
            System.out.println("El participante de dorsal " + participante1.getDorsal() + " ha sido seleccionado\n");
        } else {
            System.out.println("El participante de dorsal " + participante1.getDorsal() + " NO ha sido seleccionado\n");
        }
        
        System.out.println(participante1.mostrar() + "\n");
        System.out.println(participante2.mostrar() + "\n");
        
    }
}

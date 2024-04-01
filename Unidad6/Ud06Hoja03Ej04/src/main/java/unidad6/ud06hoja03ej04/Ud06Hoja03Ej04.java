
package unidad6.ud06hoja03ej04;

/**
 *
 * @author Santi
 */
public class Ud06Hoja03Ej04 {

    public static void main(String[] args) {
        Cliente Santi = new Cliente("Santi", "666as666666");
        ClientInput Lista = new ClientInput();

        Lista.addClient(Santi);
        System.out.println(Santi.tiempoEspera());
        Lista.atenderCliente(Santi);
        System.out.println(Santi.tiempoEspera());
    }
}

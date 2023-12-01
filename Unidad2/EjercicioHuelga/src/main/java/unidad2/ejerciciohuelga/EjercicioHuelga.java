package unidad2.ejerciciohuelga;

/**
 *
 * @author Santi
 */

public class EjercicioHuelga {

    public static void main(String[] args) {
        SintonizadorFM radio = new SintonizadorFM(107);
        for (int i = 0; i <= 4; i++) {
            radio.subir();
        }
        System.out.println(radio.display());
        for (int i = 0; i <= 3; i++) {
            radio.bajar();
        }
        System.out.println(radio.display());
        SintonizadorFM radio2 = new SintonizadorFM(200);
        System.out.println(radio2.display());
        SintonizadorFM radio3 = new SintonizadorFM(radio2);
        System.out.println(radio3.display());
        radio3.subir();
        radio3.bajar();
        System.out.println(radio2.display());
    }
}

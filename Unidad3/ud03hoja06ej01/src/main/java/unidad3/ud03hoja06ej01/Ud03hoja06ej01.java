package unidad3.ud03hoja06ej01;

/**
 *
 * @author Santi
 */
public class Ud03hoja06ej01 {

    public static void main(String[] args) {
        Tarjeta t1 = new Tarjeta("Santiago Manuel Tamayo Arozamena", 1234567890987654L, 174256.24F);
        t1.desbloquea(1245);
        t1.desbloquea(t1.getPin());
        t1.desbloquea(t1.getPin());
        t1.pagar(155.12F, t1.getPin(), "Esta es la descripcion", true);
    }
}

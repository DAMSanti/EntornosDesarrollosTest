package unidad05.ud05hoja05ej01;

/**
 *
 * @author DAM104
 */
public class AutoAnfibio implements TransporteTerrestre, TransporteMaritimo {

    @Override
    public void andar() {
        System.out.println("Estoy Nadando!!");
    }

    @Override
    public void nadar() {
        System.out.println("Estoy Andando!!");
    }
    
}

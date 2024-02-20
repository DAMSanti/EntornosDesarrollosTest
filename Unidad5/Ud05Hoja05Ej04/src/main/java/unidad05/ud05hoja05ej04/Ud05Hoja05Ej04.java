package unidad05.ud05hoja05ej04;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja05Ej04 {

    public static void main(String[] args) {
        Instrumento i1 = new Instrumento();
        Flauta f1 = new Flauta();
        Piano p1 = new Piano();
        
        i1.tocarNota();
        f1.tocarNota();
        p1.tocarNota();
        
        Instrumento i2 = f1;
        i2.tocarNota();
        Flauta f2 = (Flauta) i2 ;
        f2.tocarNota();
    }
}

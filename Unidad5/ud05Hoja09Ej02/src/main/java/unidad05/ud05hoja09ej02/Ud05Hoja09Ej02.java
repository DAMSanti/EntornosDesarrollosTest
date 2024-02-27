package unidad05.ud05hoja09ej02;


/**
 *
 * @author DAM104
 */
public class Ud05Hoja09Ej02 {

    public static void main(String[] args) {
        Prueba p1 = null;
        
        try {
            p1.getAtributo();
        } catch (NullPointerException e) {
            System.out.println("El objeto es nulo, no se puede llamar a metodos.");
        }
        
    }
}


/*

2.- Define una clase Prueba con un atributo de tipo String y como único método, el get
correspondiente. Defina en el programa principal una referencia a un objeto e inicializa a null.
Trate de invocar un método a través de esta referencia. Ahora rodee el código con una
cláusula try-catch para probar la nueva excepción.

*/

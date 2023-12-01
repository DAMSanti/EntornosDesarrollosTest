package unidad2.ud2stringej05;

/**
 *
 * @author dam1
 */
public class Ud2Stringej05 {

    public static void main(String[] args) {
        String frase= "Es una buena idea estar esperando que espies, es eso.";
        System.out.println(sustituye(frase));
    }
    
    public static String sustituye(String frase){
        return frase.replace("es", "no por").replace("Es", "No por");
    }
}



package unidad3.ejmultiplo7;

/**
 *
 * @author dam1
 */
public class Ejmultiplo7 {

    public static void main(String[] args) {
        boolean salir = false ;
        int n, i = 1;
        while ((!salir) && (i<=5)) {
            n=(int)Math.floor(Math.random()*499+1);
            System.out.println(n);
            salir = (n%7==0);
            i++;
        }
    }
}

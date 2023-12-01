package unidad3.ud03hoja04ej03;

/**
 *
 * @author Santi
 */
public class Ud03hoja04ej03 {

    public static void main(String[] args) {
        //int ano = 2016;
        //while (ano<=2030) {
        for (int ano = 2016 ; ano<=2030 ; ano++) {
            int a = ano%19, b = ano%4, c = ano%7, d = (19*a+24)%30, e = (2*b+4*c+6*d+5)%7, n = (22+d+e);
            if (n > 31) {
                n -= 31;
                System.out.println("En el año " + ano + " el dia de Pascua es el " + n + " de Abril.");
            }
            else {
                System.out.println("En el año " + ano + " el dia de Pascua es el " + n + " de Marzo.");
            }
            //ano++;
        }
    }
}
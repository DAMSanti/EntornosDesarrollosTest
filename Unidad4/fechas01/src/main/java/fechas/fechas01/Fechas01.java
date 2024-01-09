package fechas.fechas01;

/**
 *
 * @author DAM104
 */
public class Fechas01 {

    public static void main(String[] args) {
        Letra[] letras = new Letra[5];
        
        System.out.println("INTRODUCE LOS DATOS DE " + letras.length + " LETRAS");
        for (int i = 0; i < letras.length; i++) {
            letras[i] = new Letra();
        }
        
        System.out.println("LISTA DE LETRAS VENCIDAS");
        for (int i = 0; i < letras.length; i++) {
            if (letras[i].vencida()) {
                letras[i].mostrar();
            } 
        }
        
        System.out.println("EXTENSION DE 15 DIAS EN LAS LETRAS VENCIDAS EN ENERO");
        for (int i = 0; i < letras.length; i++) {
            if (letras[i].vencida() && letras[i].devuelveMes()==1) {
                letras[i].demora(15);
                letras[i].mostrar();
            }
        }
        
        System.out.println("LISTA DE LETRAS NO VENCIDAS Y TIEMPO HASTA VENCIMIENTO");
        for (int i = 0; i < letras.length; i++) {
            if (!letras[i].vencida()) {
                System.out.println("Titular: " + letras[i].getTitular());
                System.out.printf("Quedan %d dias para que venza esta letra.\n", letras[i].diasFaltan());
            }
        }
        
        System.out.println("LISTA DE TODAS LAS LETRAS");
        for (int i = 0; i < letras.length; i++) {
            letras[i].mostrar();
        }
            
    }
}

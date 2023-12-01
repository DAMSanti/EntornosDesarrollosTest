package unidad2.ud2hoja06ej01;

/**
 *
 * @author dam1
 */
public class Ud2Hoja06ej01 {

    public static void main(String[] args) {
        Taller tasa = new Taller(4,12);
        System.out.println("Podemos Realizar " + tasa.getCambioCompletos() + " cambios completos.");
        System.out.println("Podemos Realizar " + tasa.getCambioParcial() + " cambios parciales.");
        System.out.println("Realizamos un cambio completo");
        tasa.cambioCompleto();
        System.out.println("Podemos Realizar " + tasa.getCambioCompletos() + " cambios completos.");
        System.out.println("Podemos Realizar " + tasa.getCambioParcial() + " cambios parciales.");
        System.out.println("Y ahora realizamos uno parcial");
        tasa.cambioParcial();
        System.out.println("Podemos Realizar " + tasa.getCambioCompletos() + " cambios completos.");
        System.out.println("Podemos Realizar " + tasa.getCambioParcial() + " cambios parciales.");
        System.out.println("Nos quedan " + tasa.getAceite() + " litros de aceite y " + tasa.getRuedas() + " ruedas.");
        System.out.println("Despues de las operaciones....");
        System.out.println(tasa.toString()); 
        Taller tasa2 = new Taller(tasa);
        System.out.println(tasa2.toString()); 
    }
}

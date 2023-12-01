package unidad2.ud2hoja05ej01;

/**
 *
 * @author dam1
 */
public class Ud2Hoja05ej01 {

    public static void main(String[] args) {
        Restaurante bar = new Restaurante(1,0.4);
        System.out.println("Numero de platos disponibles a la venta: " + bar.getNumPlatos());
        bar.sirvePlato();
        System.out.println("Quedan " + bar.getChorizo() + " Kg de chorizo");
        System.out.println("Quedan " + bar.getHuevos() + " Huevos");
        bar.sirvePlato();
        System.out.println("Quedan " + bar.getChorizo() + " Kg de chorizo");
        System.out.println("Quedan " + bar.getHuevos() + " Huevos");
        bar.sirvePlato();
        System.out.println("Quedan " + bar.getChorizo() + " Kg de chorizo");
        System.out.println("Quedan " + bar.getHuevos() + " Huevos");
        System.out.println("Numero de platos disponibles a la venta: " + bar.getNumPlatos());
        bar.addChorizos(0.8);
        bar.addHuevos(3);
        System.out.println("Numero de platos disponibles a la venta: " + bar.getNumPlatos());
        bar.sirvePlato();
        System.out.println("Quedan " + bar.getChorizo() + " Kg de chorizo");
        System.out.println("Quedan " + bar.getHuevos() + " Huevos");
    }
}

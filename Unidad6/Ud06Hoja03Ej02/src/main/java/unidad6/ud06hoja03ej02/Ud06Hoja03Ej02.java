package unidad6.ud06hoja03ej02;

/**
 *
 * @author Santi
 */
public class Ud06Hoja03Ej02 {

    public static void main(String[] args) {
        Taller taller = new Taller();

        FichaVehiculo coche1 = new FichaVehiculo("ABC123", "Ford Focus");
        FichaVehiculo coche2 = new FichaVehiculo("DEF456", "Toyota Corolla");
        FichaVehiculo coche3 = new FichaVehiculo("GHI789", "Honda Civic");

        System.out.println(taller.mostrarEstado());
        taller.insertarVehiculo(coche1);
        System.out.println(taller.mostrarEstado());
        taller.repararVehiculo("ABC123");
        taller.darSalidaVehiculo("ABC123");

        System.out.println(taller.mostrarEstado());
        taller.insertarVehiculo(coche2);
        taller.repararVehiculo("DJF456");
        System.out.println(taller.mostrarEstado());
        taller.darSalidaVehiculo("DJF456");

        System.out.println(taller.mostrarEstado());
        taller.insertarVehiculo(coche3);
        taller.repararVehiculo("GHI789");
        System.out.println(taller.mostrarEstado());
        taller.darSalidaVehiculo("GHI789");
        System.out.println(taller.mostrarEstado());
    }
}

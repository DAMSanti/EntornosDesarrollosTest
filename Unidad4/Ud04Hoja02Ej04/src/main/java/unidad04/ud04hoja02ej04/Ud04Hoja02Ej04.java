package unidad04.ud04hoja02ej04;

/**
 *
 * @author DAM104
 */
public class Ud04Hoja02Ej04 {

    public static void main(String[] args) {
        Alumno a1 = new Alumno("SantiagoTamayo");
        System.out.println("La nota mayor es " + a1.mayor());
        System.out.println("La nota menor es " + a1.menor());
        System.out.println(a1.mostrar());        
    }
}

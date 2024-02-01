package unidad05.ud05hoja02ej01;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja02Ej01 {

    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        Encargado e2 = new Encargado();
        System.out.printf("\nEl salario del empleado es %,.2f€", e1.getSalario());
        System.out.printf("\nEl salario del encargado es %,.2f€", e2.getSalario());
    }
}

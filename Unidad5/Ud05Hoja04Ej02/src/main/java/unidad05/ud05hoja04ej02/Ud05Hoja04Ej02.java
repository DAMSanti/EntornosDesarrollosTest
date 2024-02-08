package unidad05.ud05hoja04ej02;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja04Ej02 {

    public static void main(String[] args) {
        Empleado e1 = new Programador("Paco", "IT", 23, true, 185.15, 1170, "C++");
        Empleado e2 = new Programador("Fran", "IT", 23, true, 185.15, 1170, "C++");
        Empleado e3 = new Programador("Santi", "IT", 23, true, 185.15, 1170, "C++");
        Empleado e4 = new Programador("Lolo", "IT", 23, true, 185.15, 1170, "C++");
        Plantilla p1 = new Plantilla();
        
        p1.insertar(e1);
        p1.insertar(e2);
        p1.insertar(e3);
        p1.insertar(e4);
        p1.muestraPlantilla();
    }
}

package unidad05.ud05hoja04ej02;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja04Ej02 {

    public static void main(String[] args) {
        Empleado e1 = new Programador("Paco", "IT", 23, true, 185.15, 1170, "C++");
        Empleado e2 = new Programador("Fran", "IT", 55, true, 185.15, 1070, "Java");
        Empleado e3 = new Programador("Santi", "IT", 23, true, 185.15, 3170, "Java");
        Empleado e4 = new Programador("Lolo", "IT", 43, true, 185.15, 170, "Java");
        Plantilla p1 = new Plantilla();
        
        p1.insertar(e1);
        p1.insertar(e2);
        p1.insertar(e3);
        p1.insertar(e4);
        System.out.println("--- MUESTRA LA PLANTILLA ---\n");
        System.out.println(p1.muestraPlantilla());
        System.out.println("--- PROGRAMADOR CON MAS LPM ---\n");
        System.out.println(p1.maxLineas());
        System.out.println("--- PROGRAMADORES SENIOR ---\n");
        System.out.println(p1.showSenior());
        System.out.println("--- POST AUMENTO ---\n");
        p1.aumento();
        System.out.println(p1.muestraPlantilla());              
    }
}

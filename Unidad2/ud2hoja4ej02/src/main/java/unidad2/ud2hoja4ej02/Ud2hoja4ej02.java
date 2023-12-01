package unidad2.ud2hoja4ej02;

/**
 *
 * @author dam1
 */

public class Ud2hoja4ej02 {

    public static void main(String[] args) {
        Coche c1 = new Coche("1234RET", 20);
        c1.datos();
        Coche c2 = new Coche("4567KKK");
        c2.datos();
        c2.frena(10);
        c2.datos();
        c1.acelera(80);
        c1.datos();
        System.out.print("Las letras que tiene la matricula del coche "); 
        c1.datos(); 
        System.out.println("son " + c1.matricula());
    }
}

package unidad4.ud04hoja06ej01;

/**
 *
 * @author DAM104
 */
public class Ud04Hoja06Ej01 {

    public static void main(String[] args) {
        Almacen a1 = new Almacen(3);
        
        a1.llenar();
        
        System.out.println(a1.lowStock());
        
    }
}

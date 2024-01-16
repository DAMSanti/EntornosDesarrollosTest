package unidad04.ud04hoja07ej01;

/**
 *
 * @author Santi
 */
public class Ud04Hoja07Ej01 {

    public static void main(String[] args) {
        int[] tres = new int[3];
        Alumno a1 = new Alumno("Jose");
        
        System.out.println("La mayor nota es " + a1.mayor());
        System.out.println("La menor nota es " + a1.menor());
        
        System.out.println("La nota 3 esta en la posicion " + (a1.buscar(3)+1) + "º");
        
        tres = a1.tresMejores();
        System.out.println("Los valores de las tres mejores notas son: ");
        for (int i = 0; i < tres.length; i++) {
            if (i==0) {
                System.out.print(tres[i]);
            } else {
                System.out.print(" - " + tres[i]);
            }
            
        }
        
        System.out.println("\nPonemos los valores a 0");
        a1.ponerACero();
        System.out.println(a1.mayor());
    }
}

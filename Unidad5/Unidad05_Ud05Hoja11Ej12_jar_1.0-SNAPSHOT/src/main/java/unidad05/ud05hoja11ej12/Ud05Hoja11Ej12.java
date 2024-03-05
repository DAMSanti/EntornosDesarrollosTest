package unidad05.ud05hoja11ej12;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja11Ej12 {

    public static double acceso_por_indice (double[] v, int j) throws Exception{
        try{
            if((0<=j)&& (j<=v.length)){
                return v[j];
            } else {
                throw new Exception("El indice " + j + " no existe en el vector");
            }
        } catch (RuntimeException exc) {
            throw exc;
        }
    }
        
    public static void main(String[] args) {
        double[] v = new double [15];
        try {
            acceso_por_indice(v,16);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
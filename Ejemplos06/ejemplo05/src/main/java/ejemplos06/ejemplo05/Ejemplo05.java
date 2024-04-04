package ejemplos06.ejemplo05;

import java.util.TreeSet;

/**
 *
 * @author cic
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        TreeSet<Alumno> expedientes = new TreeSet<>();

        Alumno alum1 = new Alumno(1, "Pedro");
        Alumno alum2 = new Alumno(2, "Marta");
        Alumno alum3 = new Alumno(3, "Raquel");

        expedientes.add(alum3);
        expedientes.add(alum1);
        expedientes.add(alum2);

        // implementado comparable en Alumno y establecido por expediente
        System.out.println("====FIJAROS COMO SALEN ORDENADOS POR NUMERO DE EXPEDIENTE");
        for (Alumno expediente : expedientes) {
            System.out.println(expediente.toString());
        }

        //creo un nuevo alumno pero tiene un número de expediente que ya existe
        // implementado en comparable y hace que sea único, no permite duplicado por ese valor
        Alumno alum4 = new Alumno(3, "María");
        // añado el expediente
        if (expedientes.add(alum4)) {
            System.out.println("Insertado correctamente");
        } else {
            System.out.println("NO se ha podido insertar");
        }
    }
}

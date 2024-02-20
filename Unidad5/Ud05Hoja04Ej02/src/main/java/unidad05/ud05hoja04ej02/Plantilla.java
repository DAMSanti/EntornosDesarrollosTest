package unidad05.ud05hoja04ej02;

import java.util.Arrays;

/**
 *
 * @author DAM104
 */
public class Plantilla {
    Empleado[] trabajadores;
    int contEmpleados;
    
    public Plantilla() {
        trabajadores = new Empleado[100];
        contEmpleados = 0;
    }
    
    public void insertar(Empleado empleado) {
        if (contEmpleados < trabajadores.length) {
            trabajadores[contEmpleados++] = empleado;
        }
    }
    
    public String muestraPlantilla() {
        String info = "";
        for (int i = 0; i < contEmpleados; i++) {
            info += trabajadores[i].toString();
            //System.out.println(trabajadores[i].toString());
        }
        return info;
    }
    
    public Programador maxLineas() {
        Programador max = new Programador("", "", 0, false, 0, 0, "");
        for (int i = 0; i < contEmpleados; i++) {
            if (trabajadores[i] instanceof Programador) {
                Programador aux = (Programador) trabajadores[i];
                if (aux.getLineas() > max.getLineas()) {
                    max = aux;
                }
            }
        }
        return max;
    }
    
    public String showSenior() {
        String info = "";
        for (int i = 0; i < contEmpleados; i++) {
            if (trabajadores[i].devuelveCategoria() == Categoria.senior) {
                info += trabajadores[i].toString();
            }
        }
        return info;
    }
    
    public void aumento() {
        for (int i = 0; i < contEmpleados; i++) {
            if (trabajadores[i].devuelveCategoria() == Categoria.intermedio) {
                if (trabajadores[i] instanceof Programador) {
                    Programador aux = (Programador) trabajadores[i];
                    if (aux.getLenguajeDominante().contains("Java")) {
                        trabajadores[i].aumentaSalario(20);
                    }
                }                
            }
        }
    }
}


/*

Además, se debe crear una clase Plantilla, que contendrá un array de Empleados y un
contador.
Esta clase tendrá los siguientes métodos:
- Constructor que crea el array y establece el contador a 0.
- Método insertar que recibe un empleado y lo añade al array
- Método que nos devuelve una cadena con información de todos los empleados
- Método que nos devuelve el programador que más líneas de código escribe por
hora
- Método que devuelve una cadena con información de todos los empleados
“Senior”
- Método que aumente el sueldo un 20% a todos los programadores “Intermedios”
cuyo lenguaje dominante sea “Java”

Desde la clase Principal crear una plantilla, varios empleados y programadores y añadirlos a la
plantilla. Después probar todos los métodos de la clase Plantilla

*/
package unidad05.ud05hoja10ej01;

import java.util.Arrays;

/**
 *
 * @author DAM104
 */
public class Caballo implements PuedeMontarse{
    public final int capacidad;
    public int ocupacion;
    public Guerrero[] ocupantes;
    
    public Caballo(Guerrero[] lista) {
        boolean comprueba = true;
        for (int i = 0; i < lista.length && comprueba==true; i++) {
            if (!(lista[i] instanceof Griego)) {
               comprueba = false;
            }
        }
        if (comprueba == false) {
            this.capacidad = 100;
            this.ocupantes = new Guerrero[100];
            this.ocupacion = 0;
        } else {
            this.capacidad = lista.length;
            for (int i = 0; i < lista.length; i++) {
                this.ocupantes[i] = lista[i];
                ocupacion++;
            }
        }
    }
    
    public Caballo(Guerrero guerrero, int capacidad) {
        boolean comprueba = true;
        if (!(guerrero instanceof Griego)) {
            comprueba = false;
        }
        if (comprueba == false) {
            System.out.println("No se ha podido añadir el guerrero");
            this.capacidad = 100;
            this.ocupantes = new Guerrero[100];
            this.ocupacion = 0;
        } else {
            this.capacidad = capacidad;
            this.ocupantes[0] = guerrero;
            System.out.println("Guerrero añadido con exito");
            ocupacion++;
        }
    }
    
    public void ordenar() {
        Arrays.sort(ocupantes, 0, ocupacion);
    }
    
    public int buscar(String nombre) {
        int pos = -1;
        ordenar();
        boolean encontrado = false;
        for (int i = 0; i < ocupantes.length && !encontrado; i++) {
            if (ocupantes[i].getNombre().equalsIgnoreCase(nombre)) {
                pos = i;
                encontrado = true ;
            }
        }
        return pos;
    }

    @Override
    public int montar(Guerrero guerrero) {
        int aux = 0;
        if (ocupacion < ocupantes.length) {
            if (!(guerrero instanceof Griego)) {
                aux = -2;
            } else {
                ocupantes[ocupacion++] = guerrero;
                aux = ocupacion;
            }
        } else if (ocupacion == ocupantes.length) {
            aux = -1;
        }
        return aux;
    }

    @Override
    public void desmontar() {
        this.ocupacion = 0;
        for (int i = 0; i < ocupantes.length; i++) {
            ocupantes[i] = null;
        }
    }
}


/*

Este problema creará la clase para representar al Caballo de Troya.
a) Crear la clase Caballo que tendrá como atributos públicos:
• capacidad, de tipo int, representa el número de guerreros griegos que puede haber
dentro del caballo. No se podrá cambiar una vez le hemos dado valor.
• ocupacion, de tipo int, representa el número actual de griegos en el caballo.
• ocupantes, array de objetos de la clase Guerrero.
b) Crear dos constructores para la clase Caballo:
• el primero recibirá un array de Guerreros, deberá comprobar que todos los
ocupantes son Griegos, en caso contrario se creará un Caballo sin ocupantes con
capacidad 100 (en caso positivo, suponer que la capacidad es la del número de
Guerreros que se ha pasado como parámetro)
• el segundo recibirá un único Guerrero y la capacidad. También deberá comprobar
que el Guerrero es Griego, en caso contrario se creará un Caballo sin ocupantes.
c) Crear el método void ordenar() que ordene el array de ocupantes según su fuerza.
d) Crear un método int buscar (String nombre) que busque por su nombre un guerrero dentro
del array ocupantes ordenado según el método anterior y devuelva la posición en que está ó -1
si no está.
e) Definir la interfaz PuedeMontarse que especifica que se puede montar en los objetos de
tipo Caballo. Tendrá dos métodos:
• int montar (Guerrero g) que monta un Guerrero en el Caballo y devuelve el número
de ocupantes que hay actualmente ó -1 si el Caballo ya está lleno. Deberá comprobar
que sólo los griegos puedan montar en el Caballo (si se intenta montar un Troyano
devolverá -2).
• void desmontar () que desmonta todos los Guerreros del Caballo.
f) Realizar los cambios oportunos en la clase Caballo para que implemente la interfaz
PuedeMontarse.

*/

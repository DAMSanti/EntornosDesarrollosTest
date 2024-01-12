package unidad04.ud04hoja06ej03;

/**
 *
 * @author Santi
 */

public class Persona {
    private String nombre, telefono;
    
    public Persona(String nombre, String telefono) {
        this.nombre = nombre ;
        this.telefono = telefono ;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}









/*

3.- Diseñar una clase llamada Persona con los atributos privados nombre y teléfono, un
constructor que permite inicializar los atributos con los datos pasados como argumentos y
métodos que devuelven el nombre y el teléfono. Diseñar también una clase llamada Agenda
que tiene como miembros privados un array de personas y un contador de personas que vamos
metiendo en la agenda, un constructor que pone el contador a 0 y dimensiona el array al tamaño
que le pasamos como argumento, un método insertar que permite añadir una persona a la
agenda (controlar que no meta más personas que las que caben en la agenda), un método
mostrar que lista la información de la agenda, un método buscar que pasado un nombre como
argumento visualiza los datos de esa persona de la agenda y un método modificar que pasado
un nombre como argumento si lo encuentra muestra el teléfono actual y pide que introduzca
un nuevo teléfono modificando el dato en la agenda.
Crea en la clase principal un menú repetitivo con las siguientes opciones 1. Nuevo contacto, 2.
Mostrar la agenda, 3. Buscar contacto, pide el nombre de la persona a buscar y si la encuentra
muestra su información, 4. Ver el número de contactos de la agenda, 5. Modificar teléfono de
una agenda, pide el nombre de la persona a cambiar el teléfono y la encuentra se cambia el
teléfono, 6. Salir.
PD. Como sólo se busca por nombre es posible que tengamos más de una persona a mostrar o
a modificar.

*/

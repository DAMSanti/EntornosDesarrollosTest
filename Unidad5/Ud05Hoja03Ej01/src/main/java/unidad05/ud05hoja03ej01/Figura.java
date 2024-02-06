package unidad05.ud05hoja03ej01;

/**
 *
 * @author DAM104
 */
public abstract class Figura {
    protected float radio, altura;
    
    public Figura(float radio, float altura) {
        this.radio = radio;
        this.altura = altura;
    }
    
    public abstract float area();
    
    public abstract float volumen();
}


/*

a) Definir la clase Figura con dos atributos radio y altura y en la que se define un
constructor al que se le pasan los valores de los atributos por parámetro, los métodos get que
permiten obtener los valores de los parámetros y dos métodos abstractos área y volumen.

*/

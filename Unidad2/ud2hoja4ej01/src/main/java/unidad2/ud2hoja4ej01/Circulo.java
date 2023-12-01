package unidad2.ud2hoja4ej01;

//////////////////////////////////////////////////////////////////////////////////
/////////               Santiago Manuel Tamayo Arozamena                 /////////
/////////                            DAM 1                               /////////
/////////                        Programación                            /////////
/////////                       Clases de Java                           /////////
//////////////////////////////////////////////////////////////////////////////////

public class Circulo { // clase circulo
    
    private float radio; // variable interna de la clase circulo.
    
    public Circulo() { //constructor por defecto sin argumentos
        
    }
    
    public Circulo(float radio) { //constructor definiendo el radio
        this.radio=radio;
    }
    
    public float getRadio() { //Método para obtener el valor numerico del radio
        return radio;
    }
    
    public void setRadio(float radio) { //Metodo para modificar el radio
        this.radio = radio ;
    }
    
}

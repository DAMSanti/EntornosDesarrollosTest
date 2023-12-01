package unidad2.ud2hoja2;

//////////////////////////////////////////////////////////////////////////////////
/////////               Santiago Manuel Tamayo Arozamena                 /////////
/////////                            DAM 1                               /////////
/////////                        Programación                            /////////
/////////                       Clases de Java                           /////////
//////////////////////////////////////////////////////////////////////////////////

public class Circulo { // clase circulo
    
    private double radio; // variable interna de la clase circulo.
    
    public Circulo() { //constructor por defecto sin argumentos
        
    }
    
    public Circulo(double radio) { //constructor definiendo el radio
        this.radio=radio;
    }
    
    public double getRadio() { //Método para obtener el valor numerico del radio
        return radio;
    }
    
    public void setRadio(double radio) { //Metodo para modificar el radio
        this.radio = radio ;
    }
    
    public double area() { // Metodo para obtener el area
        return Math.PI*Math.pow(radio, 2); 
    }
    
    public double longitud() { // Metodo para obtener el perimetro
        return 2*Math.PI*radio;
    }
}

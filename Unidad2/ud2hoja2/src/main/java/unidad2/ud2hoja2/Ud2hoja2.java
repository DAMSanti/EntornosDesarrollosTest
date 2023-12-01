package unidad2.ud2hoja2;

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////
/////////               Santiago Manuel Tamayo Arozamena                 /////////
/////////                            DAM 1                               /////////
/////////                        Programación                            /////////
/////////                       Clases de Java                           /////////
//////////////////////////////////////////////////////////////////////////////////

public class Ud2hoja2 {

    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(10);
        //double radio ;
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Radio del circulo: ");
        //radio = teclado.nextDouble();
        
        //Circulo c3 = new Circulo(radio);
        Circulo c3 = new Circulo(teclado.nextDouble());
        
        c1.setRadio(5);
        
        System.out.println("El valor del radio de c1 es: " + c1.getRadio() );
        System.out.println("El valor del radio de c3 es: " + c3.getRadio() );
        System.out.println("El valor del area de c2 es: " + c2.area() );
        System.out.printf("El valor del area de c3 es %f y el perimetro es %f\n", c3.area(), c3.longitud() );
    }
}

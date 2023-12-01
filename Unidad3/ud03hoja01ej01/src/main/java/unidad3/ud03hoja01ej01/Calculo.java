package unidad3.ud03hoja01ej01;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Calculo {
    private static Scanner teclado;
    
    private static float InsertNum() {
        teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        float numero = teclado.nextFloat();
        return numero;       
    }

    public void entreNumeros() {
        float numero = Calculo.InsertNum();
        if ((numero < 1000) && (numero > 100)) {
            System.out.println("El numero es menor que 1000 y mayor que 100");
        }
        else {
            System.out.println("El numero NO es menor que 1000 ni mator que 100");
        }
    }
    
    public void signo() {
        float numero = Calculo.InsertNum();
        if (numero < 0) {
            System.out.println("El numero es negativo");
        }
        else if (numero == 0) {
            System.out.println("El numero es nulo");
        }
        else {
            System.out.println("El numero es positivo");
        }
    }
    
    public void esDivisible() {
        float numero = Calculo.InsertNum();
        if ((numero%2 == 0) && (numero%5 == 0)) {
            System.out.println("El numero es divisible por 2 y por 5");
        }
        else {
            System.out.println("El numero NO es divisible por 2 y por 5");
        }
    }
    
    public void esEntero() {
        float numero = Calculo.InsertNum();
        if (numero == (int) numero) {
            System.out.println("El numero es entero, por lo tanto no tiene parte fraccionaria");
        }
        else {
            System.out.println("El numero tiene parte fraccionaria");
        }
    }

    public void bisiesto() {
        float numero = Calculo.InsertNum();
        if ((numero%4 == 0) && ((numero%100 != 0) || (numero%400 == 0))) {
            System.out.println("El año es bisiesto");
        }
        else {
            System.out.println("El año NO es bisiesto");
        }
    }
    
    public void par() {
        float numero = Calculo.InsertNum();
        if (numero%2 == 0) {
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }
    }
    
    public void par2() {
        float numero = Calculo.InsertNum();
        if ((numero < 1) || (numero > 10)) {
            System.out.println("El numero introducido no es valido");
        }
        else if (numero%2 == 0) {
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }     
    }
    
    public void ordenar() {
        float numero = Calculo.InsertNum();
        float numero2 = Calculo.InsertNum();
        float numero3 = Calculo.InsertNum();
        String orden;
        if ((numero<numero2) && (numero<numero3)) {
            orden = numero+" ";
            if (numero2<numero3) {
                orden += numero2+" "+numero3;
            }
            else {
                orden += numero3+" "+numero2;
            }
        } 
        else if (numero2<numero3) {
            orden = numero2+" ";
            if (numero<numero3) {
                orden += numero+" "+numero3;
            }
            else {
                orden += numero3+" "+numero;
            }
        }
        else {
            orden = numero3+" ";
            if (numero<numero2) {
                orden += numero+" "+numero2;
            }
            else {
                orden += numero2+" "+numero;
            }
        }
        System.out.println("Los numeros ordenados son: " + orden );
    }
    
    public void divisor() {
        float numero = Calculo.InsertNum();
        float numero2 = Calculo.InsertNum();
        if (numero2%numero == 0 || numero%numero2 == 0) {
            System.out.println("El primer numero es divisor del segundo");
        }
        else {
            System.out.println("El primer numero NO es divisor del segundo");
        }
    }
}

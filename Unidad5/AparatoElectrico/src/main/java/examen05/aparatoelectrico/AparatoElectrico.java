package examen05.aparatoelectrico;

/**
 *
 * @author DAM104
 */
public class AparatoElectrico {
    private double consumo;
    private boolean estado;
    private static double consumoTotal = 0;
    
    public AparatoElectrico(double consumo) {
        this.consumo = consumo ;
        this.estado = false ;
    }
    
    public void encender() {
        if (this.estado == false ) {
            this.estado = true;
            consumoTotal += this.consumo;
        } else {
            this.estado = false;
            consumoTotal -= this.consumo;
        }
    }
    
    public static double consumo() {
        return consumoTotal;
    }
    
    public static void main(String[] args) {
        AparatoElectrico bombilla = new AparatoElectrico(150);
        AparatoElectrico plancha = new AparatoElectrico(2000);
        System.out.printf("\nEl consumo de la red es de %,.2f W/h", AparatoElectrico.consumo());
        bombilla.encender();
        plancha.encender();
        System.out.printf("\nEl consumo de la red es de %,.2f W/h", AparatoElectrico.consumo());;
        bombilla.encender();
        System.out.printf("\nEl consumo de la red es de %,.2f W/h", AparatoElectrico.consumo());
    }
}


/*

3.- Intenta escribir un programa para representar el consumo de energía de una instalación
eléctrica. Para ello, se hará una clase que representa los aparatos conectados en la instalación.
Cada aparato tiene un consumo eléctrico determinado. Al encender un aparato eléctrico, el
consumo de energía se incrementa en la potencia de dicho aparato. Al apagarlo, se
decrementa el consumo. Inicialmente, los aparatos están todos apagados. Además, se desea
consultar el consumo total de la instalación.
Crea la clase AparatoElectrico. Tendrá como atributos de clase consumoTotal como double. Se
necesita también un método de clase llamado consumo que devuelve el valor de
consumoTotal. Como atributos del objeto tendremos potencia como double y encendido
como boolean. Tendrá dos métodos: enciende, que incrementa la potencia al consumoTotal, y
apagado, que decrementa la potencia al consumoTotal
Dicho todo esto, haz un programa que declare dos aparatos eléctricos, una bombilla de 150
watios y una plancha de 2000 watios. El programa deberá imprimir el consumo total nada más
crear los objetos. Después, se enciende la bombilla y la plancha, y el programa imprime el
consumo total. Luego se apaga la bombilla, y se vuelve a imprimir el consumo total.

*/
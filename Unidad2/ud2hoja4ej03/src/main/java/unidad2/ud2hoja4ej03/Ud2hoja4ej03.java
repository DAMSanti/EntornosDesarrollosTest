/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package unidad2.ud2hoja4ej03;

/**
 *
 * @author dam1
 */
public class Ud2hoja4ej03 {

    public static void main(String[] args) {
        String mensaje;
        Monedero m1 = new Monedero(20);
        m1.ingresar(10.4f);
        System.out.println("Tienes " + m1.getSaldo() + "€.");
        
        mensaje = m1.retirar(50) ? "" : "No hay saldo suficiente";
        
        System.out.println(mensaje);      
        System.out.println("Tienes " + m1.getSaldo() + "€.");
        
        mensaje = m1.retirar(20) ? "" : "No hay saldo suficiente";
        
        System.out.println(mensaje);      
        System.out.println("Tienes " + m1.getSaldo() + "€.");
        
    }
}

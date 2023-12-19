/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package examen03.test;

/**
 *
 * @author DAM104
 */
public class Test {

    public static void main(String[] args) {
        int[] a = new int[6];
        int[] b = new int[]{3, 5, 6, 4, 2, 3};
        a=b;
        System.out.print("A:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);         
        }
        System.out.println("");
        System.out.print("B:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);         
        }
        System.out.println("\n");
        System.out.print("A:");
        a[0]=9;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println("");
        System.out.print("B:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);         
        }
        System.out.println("");
    }
}

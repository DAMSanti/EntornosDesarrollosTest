package examen04.ejercicio3;


//////////////////////////////////////////////////////////////////////////////////
///////// Santiago Manuel Tamayo Arozamena                               /////////
///////// DAM 1                                                          /////////
///////// Programación                                                   /////////
///////// Examen de Programacion                                         /////////
/////////////////////////////////////////////////////////////////////////////////


public class Ejercicio3 {

    public static void main(String[] args) {
        int[][] Estudiantes = new int[25][3];
        rellenarEdad(Estudiantes);
        rellenarTrabajo(Estudiantes);
        rellenarSueldo(Estudiantes);
        imprimirMatriz(Estudiantes);
        System.out.println("Hay un porcentaje de estudiantes de 25 años de " + porcentajeEdad(Estudiantes, 25) + "%");
        System.out.println("Hay un porcentaje de estudiantes de 19 años de " + porcentajeEdad(Estudiantes, 19) + "%");
        System.out.println("Hay un porcentaje de " + porcentajeEdadTrabajo(Estudiantes, 24, 1) + "% de estudiantes de 24 años que trabajan");
        System.out.println("Hay un porcentaje de " + porcentajeEdadTrabajo(Estudiantes, 24, 2) + "% de estudiantes de 24 años que trabajan");
        System.out.println("El sueldo medio de los estudiantes de 24 años es " + promedioSueldo(Estudiantes, 24, 1) + "€");
        System.out.println("El sueldo medio de los estudiantes de 19 años es " + promedioSueldo(Estudiantes, 19, 1) + "€");
    }
    
    public static void rellenarEdad(int[][] Estudiantes) {
        for (int i = 0; i < Estudiantes.length; i++) {
            Estudiantes[i][0] = (int) Math.floor(Math.random()*9+17);
        }
    }
    
    public static void rellenarTrabajo(int[][] Estudiantes) {
        for (int i = 0; i < Estudiantes.length; i++) {
            Estudiantes[i][1] = (int) Math.floor(Math.random()*2+1);
        }
    }
    
    public static void rellenarSueldo(int[][] Estudiantes) {
        for (int i = 0; i < Estudiantes.length; i++) {
            if (Estudiantes[i][1] == 2) {
                Estudiantes[i][2] = 0 ;
            } else {
                Estudiantes[i][2] = (int) Math.floor(Math.random()*1401+600);
            }
        }
    }
    
    public static void imprimirMatriz(int[][] Estudiantes) {
        System.out.print("[");
        for (int i = 0; i < Estudiantes.length; i++) {
            System.out.print("[");
            for (int j = 0; j < Estudiantes[i].length; j++) {
                System.out.print(Estudiantes[i][j] + "\t");
            }
            System.out.println("]");
        }
    }
    
    public static double porcentajeEdad(int[][] Estudiantes, int edad) {
        double cuantos = 0;
        for (int i = 0; i < Estudiantes.length; i++) {
            if (edad == Estudiantes[i][0]) {
                cuantos++;
            }
        }
        return (cuantos/Estudiantes.length)*100;
    }
    
    public static double porcentajeEdadTrabajo(int[][] Estudiantes, int edad, int trabaja) {
        double cuantos = 0;
        for (int i = 0; i < Estudiantes.length; i++) {
            if (edad == Estudiantes[i][0] && trabaja == Estudiantes[i][1]) {
                cuantos++;
            }
        }
        return (cuantos/Estudiantes.length)*100;
    }
    
    public static double promedioSueldo(int[][] Estudiantes, int edad, int trabaja) {
        double media = 0; 
        int cuantos = 0;
        for (int i = 0; i < Estudiantes.length; i++) {
            if (edad == Estudiantes[i][0] && trabaja == Estudiantes[i][1]) {
                media += Estudiantes[i][2];
                cuantos++;
            }
        }
        return (media/cuantos);
    }
}

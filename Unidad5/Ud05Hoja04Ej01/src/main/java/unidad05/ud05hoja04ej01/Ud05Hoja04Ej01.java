package unidad05.ud05hoja04ej01;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja04Ej01 {

    public static void main(String[] args) {
        Publicacion[] publis = new Publicacion[0];
        Scanner teclado = new Scanner(System.in);
        boolean salir = false, avanzadas = false;
        while (!salir) {
            while (!avanzadas && !salir) {
                System.out.println("REGISTRO DE PUBLICACIONES");
                System.out.println("1.- Agregar datos\n2.- Visualizar datos\n3.- Opciones especiales\n4.- Salir");
                int n = teclado.nextInt();
                switch(n) {
                    case 1-> {
                        boolean creado = false;
                        while (!creado) {
                            System.out.println("Que tipo de publicacion quieres añadir? (1 para discos, 2 para libros)");
                            n = teclado.nextInt();
                            if (n == 1) {
                                Publicacion[] aux = Arrays.copyOf(publis, publis.length+1);
                                publis = aux ;
                                publis[publis.length-1] = Publicacion.creaPublicacion(n);  
                                creado = true ;                     
                            } else if (n == 2) {
                                Publicacion[] aux = Arrays.copyOf(publis, publis.length+1);
                                publis = aux ;
                                publis[publis.length-1] = Publicacion.creaPublicacion(n);  
                                creado = true ;                           
                            } else {
                                System.out.println("La opcion introducida no es correcta");
                            }                            
                        }
                    }
                    case 2-> {
                        for (int i = 0; i < publis.length; i++) {
                            System.out.println(publis[i].toString());
                        }                
                    }
                    case 3-> {
                        avanzadas = true;
                    }
                    case 4-> {
                        salir = true;
                    }
                    default -> {
                        System.out.println("La opcion introducida no es correcta");
                    }
                }            
            }
            while (avanzadas && !salir) {
                System.out.println("OPCIONES EXTRA");
                System.out.println("1.- Mostrar disco mas largo\n2.- Mostrar libros de mas de 1000 paginas\n3.- Discos ultimos dos años\n4.- Volver");
                int n = teclado.nextInt();
                switch(n){
                    case 1->{
                        System.out.println(Disco.cortaNombre(Disco.discoMasLargo(publis)));
                    }
                    case 2->{
                        Libro.libroLargo(publis);
                    }
                    case 3->{
                        Disco.ultimosDosAnos(publis);
                    }
                    case 4->{
                        avanzadas = false;
                    }
                    default ->{
                        System.out.println("La opcion introducida no es correcta");
                    }
                }
            }
        }        
    }
}

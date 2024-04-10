package unidad6.ud06hoja06ej01;

import java.util.ArrayList;
import java.util.List;

public class GestorSeries {
    private List<Serie> series;

    public GestorSeries() {
        series = new ArrayList<>();
    }

    public Serie existeSerie(String nombre) {
        Serie ser = null;
        for (Serie serie : series) {
            if (serie.getNombre().equals(nombre)) {
                ser = serie;
            }
        }
        return ser;
    }

    public void crearSerie() {
        String nombre = Entrada.leerString("Introduce el nombre de la serie: ", 2, 30);
        String tematica = Entrada.leerString("Introduzca la temática (POLICIAL, COMEDIA, INFANTIL, AVENTURA): ", 7, 8, "^(POLICIAL|COMEDIA|INFANTIL|AVENTURA)$");
        String nacionalidad = Entrada.leerString("Introduce la nacionalidad de la serie: ", 4, 20, "^[a-zA-Z ]*$");
        boolean finalizada = Entrada.leerBoolean("La serie ha finalizado? (true/false)");
        int temporadas = Entrada.leerInt("Introduce el numero de temporadas", true);
        Serie existente = existeSerie(nombre);
        if (existente != null) {
            System.out.println("Ya existe una serie con el mismo nombre.");
        } else {
            Serie nuevaSerie = new Serie(nombre, Tematica.valueOf(tematica), nacionalidad, finalizada, temporadas);
            series.add(nuevaSerie);             
        }
    }
    
    public void eliminarSerie(String nombre) {
        Serie existente = existeSerie(nombre);
        if (existente != null) {
            series.remove(existente);
            System.out.println("La serie ha sido eliminada.");
        } else {
            System.out.println("No existe una serie con ese nombre.");
        }
    }

    public void verSeries() {
        System.out.println("Menú de visualización de series:");
        System.out.println("1. Ver todas las series");
        System.out.println("2. Ver series por temática");
        System.out.println("3. Ver series por nacionalidad");
        System.out.println("4. Salir");

        int opcion = Entrada.leerInt("Introduce una opcion: ", true);
        boolean salir = false;
        do {
            switch (opcion) {
                case 1 -> {
                    System.out.println("Todas las series:");
                    for (Serie serie : series) {
                        System.out.println(serie);
                    }
                    salir = true;
                }
                case 2-> {
                    String tematica = Entrada.leerString("Introduzca la temática (POLICIAL, COMEDIA, INFANTIL, AVENTURA): ", 7, 8, "^(POLICIAL|COMEDIA|INFANTIL|AVENTURA)$");
                    System.out.println("Series de temática " + tematica + ":");
                    for (Serie serie : series) {
                        if (serie.getTematica().equals(Tematica.valueOf(tematica))) {
                            System.out.println(serie);
                        }
                    }
                }
                case 3-> {
                    String nacionalidad = Entrada.leerString("Introduce la nacionalidad de la serie: ", 4, 20, "^[a-zA-Z ]*$");
                    System.out.println("Series de nacionalidad " + nacionalidad + ":");
                    for (Serie serie : series) {
                        if (serie.getNacionalidad().equals(nacionalidad)) {
                            System.out.println(serie);
                        }
                    }
                }
                case 4-> {
                    salir = true;
                    System.out.println("Saliendo del menú de visualización de series...");
                }
                default-> {
                    System.out.println("Opcion incorrecta");
                }
            }            
        }while (!salir);

    }

    public void crearCapitulo() {
        String nombreSerie = Entrada.leerString("Introduce el nombre de la serie: ", 2, 30);
        Serie serie = existeSerie(nombreSerie);
        boolean existe = false;
        if (serie == null) {
            System.out.println("No existe una serie con ese nombre.");
        } else {
            existe = true;
        }
        if (existe) {
            int temporada = Entrada.leerInt("Introduce la temporada", true);
            int capitulo = Entrada.leerInt("Introduce el capitulo", true);
            String descripcion = Entrada.leerString("Introduce la descripcion del capitulo: ", 4, 20, "^[a-zA-Z ]*$");

            Capitulo nuevoCapitulo = new Capitulo(temporada, capitulo, descripcion);
            serie.insertaCapitulo(serie.generaClaveCapitulo(nuevoCapitulo), nuevoCapitulo);
        }
    }

    public void eliminarCapitulo() {
        String nombreSerie = Entrada.leerString("Introduce el nombre de la serie: ", 2, 30);
        Serie serie = existeSerie(nombreSerie);
        boolean existe = false;
        if (serie == null) {
            System.out.println("No existe una serie con ese nombre.");
        } else {
            existe = true;
        }
        if (existe) {
            int temporada = Entrada.leerInt("Introduce la temporada", true);
            int capitulo = Entrada.leerInt("Introduce el capitulo", true);

            serie.eliminaCapitulo(Serie.generaClaveCapitulo(nombreSerie, temporada, capitulo));
            System.out.println("El capítulo ha sido eliminado."); 
        }
    }

    public void verCapitulos() {
        String nombreSerie = Entrada.leerString("Introduce el nombre de la serie: ", 2, 30);
        Serie serie = existeSerie(nombreSerie);
        boolean existe = false;
        if (serie == null) {
            System.out.println("No existe una serie con ese nombre.");
        } else {
            existe = true;
        }
        if (existe) {
            serie.visualizaCapitulos();
        }
    }

}

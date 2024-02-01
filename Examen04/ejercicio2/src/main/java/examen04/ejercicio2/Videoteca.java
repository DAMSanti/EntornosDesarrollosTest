package examen04.ejercicio2;


//////////////////////////////////////////////////////////////////////////////////
///////// Santiago Manuel Tamayo Arozamena                               /////////
///////// DAM 1                                                          /////////
///////// Programación                                                   /////////
///////// Examen de Programacion                                         /////////
/////////////////////////////////////////////////////////////////////////////////


public class Videoteca {
    private Pelicula[] pelis;
    private int peliscont;
    
    public Videoteca(int limite) {
        pelis = new Pelicula[limite];
    }
    
    public boolean agregarPelicula(Pelicula p1) {
        boolean condicion = false ;
        if (peliscont<pelis.length) {
            pelis[peliscont] = p1 ;
            peliscont++;
            condicion = true ;
            System.out.println("Pelicula " + peliscont + " agregada correctamente: " + p1.toString());
        } else {
            System.out.println("ERROR: No queda hueco en tu videoteca para agregar mas peliculas.");
        }
        return condicion;
    }
    
    public void eliminarPelicula(Pelicula p1) {
        boolean busqueda = false ;
        for (int i = 0; i < peliscont; i++) {
            if (pelis[i].getTitulo().equals(p1.getTitulo())) {
                for (int j = i+1; j < peliscont; j++) {
                    pelis[j-1] = pelis[j];
                }
                peliscont--;
                System.out.println("Se ha eliminado con exito la pelicula. " + p1.toString());
                busqueda = true;
            }
        }
        if ( busqueda == false ) {
            System.out.println("ERROR: No se ha encontrado la pelicula que se intenta eliminar. " + p1.getTitulo());
        }
    }
    
    public void consultarPelicula(String titulo) {
        boolean busqueda = false ;
        for (int i = 0; i < peliscont && !busqueda; i++) {
            if (pelis[i].getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("La pelicula buscada es " + pelis[i].toString());
                busqueda = true ;
            }
        }
        if ( busqueda == false ) {
            System.out.println("ERROR: No se ha encontrado la pelicula buscada. " + titulo);
        }
    }
    
    public void consultarDirector(String director) {
        String pelidire = "";
        for (int i = 0; i < peliscont; i++) {
            if (pelis[i].getDirector().equalsIgnoreCase(director)) {
                pelidire += pelis[i].getTitulo() + "\n";
            }
        }
        if (pelidire.length()>0) {
            System.out.println("Peliculas del director " + director);
            System.out.print(pelidire);
        } else {
            System.out.println("No se ha encontrado ninguna pelicula de " + director);
        }
        
    }
    
    public void consultarLanzamiento(int ano) {
        String salida = "";
        for (int i = 0; i < peliscont; i++) {
            if (pelis[i].getLanzamiento().getYear()==ano) {
                salida += "\n" + pelis[i].toString();
            }
        }
        if (salida.length()>0) {
            System.out.print("Peliculas lanzadas en el año " + ano );
            System.out.println(salida);
        }
    }
    
    public void mostrarVideoteca() {
        System.out.println("Lista de peliculas en la videoteca");
        for (int i = 0; i < peliscont; i++) {
            System.out.println(pelis[i].toString());
            
        }
    }
}

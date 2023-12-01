package unidad3.ud03hoja06ej02;


/**
 *
 * @author Santi
 */
public class Baraja {
    private Palos palo;
    private final int VALOR;
    
    public Baraja() {
        int n = (int) (Math.random()*4)+1;
        switch(n) {
            case 1->this.palo=Palos.Bastos;
            case 2->this.palo=Palos.Copas;
            case 3->this.palo=Palos.Espadas;
            case 4->this.palo=Palos.Oros;
        }
        this.VALOR=(int) (Math.random()*10)+1;
    }
    
    public String mostrar() {
        String carta="";
        System.out.println(carta);
        return String.format("♣♥ %d de %s ♠♦", VALOR, palo); 
    }
}
       
        
        
        
        
        
/*        
        
        for (int j=0;j<=8;j++) {
            if (j==0 || j==8) {
                for (int i=0;i<=15;i++) {
                    carta=carta.concat("_");
                }
                carta=carta.concat("\n");
            }
            for (int i=0; i<=15; i++) {
                if (j==0 && i==0) {
                    switch(palo) {
                        case Bastos->carta=carta.concat("|♦              |\n");
                        case Oros->carta=carta.concat("|♠             |\n");
                        case Espadas->carta=carta.concat("|♥             |\n");
                        case Copas->carta=carta.concat("|♣             |\n");
                    }
                } else if (j==7 && i==15) {
                    switch(palo) {
                        case Bastos->carta=carta.concat("|             ♦|️\n");
                        case Oros->carta=carta.concat("|             ♠|\n");
                        case Espadas->carta=carta.concat("|             ♥|\n");
                        case Copas->carta=carta.concat("|             ♣\n");
                    }
                } else if (i==0) {
                    carta=carta.concat("|");
                }else {
                    carta=carta.concat("X");
                }
            }
            carta=carta.concat("\n");
        }
        return carta;
*/        



/*

2. - Diseñar una clase que represente las cartas de una baraja española. Las cartas se encuentran
identificadas a través de su número (del 1 al 10) y su palo (oros, copas, espadas y bastos). La
clase tendrá los siguientes métodos:
• Un constructor sin parámetros que crea una carta con valores aleatorios (un no entre 1
y 10 para el número y otro no entre 1 y 4 para el palo). Utilizar el método random de la
clase Math).
• Un método llamado mostrar que devuelve una cadena mostrando la carta generada con
el formato, por ejemplo, 3 de copas.
• Los métodos selectores y modificadores que creas necesarios.
• Desde el método main() de la clase principal crear 2 objetos de tipo carta y decir cuál de
ellas es la ganadora (número más alto).

*/
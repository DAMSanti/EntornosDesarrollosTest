package unidad3.ud03hoja01ej02;

/**
 *
 * @author dam1
 */
public class Ticket {
    private double naranjas;
    
    public Ticket(double naranjas) {
        this.naranjas = naranjas;
    }
    
    public void imprimeTicket() {
        double preciokg, preciofinal;
        if (naranjas > 10) {
            preciokg = 1.2;
        }
        else {
            preciokg = 1.5;
        }
        preciofinal = preciokg * naranjas;
        //return String.format("\t\tTICKET\n\tFrutería Paqui\nKgs:\t\t\t%,.2f kg. \n€/Kgs:\t\t\t%,.2f €. \nPRECIO:\t\t\t%,.2f €\n\tGracias por su compra.", naranjas, preciokg, preciofinal);
        System.out.printf("\t\tTICKET\n\tFrutería Paqui\nKgs:\t\t\t%,.2f kg. \n€/Kgs:\t\t\t%,.2f €. \nPRECIO:\t\t\t%,.2f €\n\tGracias por su compra.", naranjas, preciokg, preciofinal);
    }
}

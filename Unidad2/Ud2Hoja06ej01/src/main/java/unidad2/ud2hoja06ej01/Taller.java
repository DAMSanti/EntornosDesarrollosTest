package unidad2.ud2hoja06ej01;

/**
 *
 * @author dam1
 */
public class Taller {
    private int aceite, ruedas;
    private static int cambiot, cambiop;

    
    public Taller ( int aceite, int ruedas) {
        this.aceite=aceite * 5;
        this.ruedas=ruedas;
    }
    
    public Taller ( Taller taller) {
        this.aceite=taller.aceite;
        this.ruedas=taller.ruedas;
    }
    
    public void addAceite ( int aceite ) {
        this.aceite += aceite * 5 ;
    }
    
    public void addRuedas ( int ruedas ) {
        this.ruedas += ruedas ;
    }
     
    public int getRuedas() {
        return this.ruedas;
    }
    
    public int getAceite() {
        return this.aceite / 5;
    }  
       
    public int getCambioCompletos() {
        return this.ruedas / 4 >this.aceite / 3 ? (int)(this.aceite / 3) : (int)(this.ruedas / 4);        
    }
    
    public int getCambioParcial() {
        return this.ruedas / 2 >this.aceite / 3 ? (int)(this.aceite / 3) : (int)(this.ruedas / 2);        
    }
    
    public void cambioCompleto() {
        this.ruedas = getCambioCompletos()>=1 ? this.ruedas - 4 : this.ruedas;
        this.aceite = getCambioCompletos()>=1 ? this.aceite - 3 : this.aceite;
        cambiot = getCambioCompletos()>=1 ? ++cambiot : cambiot;        
    }

    public void cambioParcial() {
        this.ruedas = getCambioParcial()>=1 ? this.ruedas - 2 : this.ruedas;
        this.aceite = getCambioParcial()>=1 ? this.aceite - 3 : this.aceite;
        cambiop = getCambioCompletos()>=1 ? ++cambiop : cambiop;         
    }

    public String toString() { 
        return String.format("TALLER\nEXISTENCIAS:\n\tRuedas: %d unidades.\n\tAceite: %d litros.\nINGRESOS: Total: %,.2f€",
                this.getRuedas(),this.getAceite(), (float) (cambiop * 135 + cambiot * 213.5));
    }
   
}

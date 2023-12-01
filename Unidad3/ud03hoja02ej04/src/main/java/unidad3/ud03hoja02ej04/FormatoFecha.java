package unidad3.ud03hoja02ej04;

/**
 *
 * @author dam1
 */
public class FormatoFecha {
    private int dia, diasemana, mes, año;

    public FormatoFecha(int dia, int diasemana, int mes, int año) {
        this.dia = dia ;
        this.diasemana = diasemana ;
        this.mes = mes ;
        this.año = año ;
    }
    
    private String obtenerDiaSemana() {
        String cadenadia ;
        switch (diasemana) {
            case 1 -> cadenadia = "Lunes";
            case 2 -> cadenadia = "Martes";
            case 3 -> cadenadia = "Miercoles";
            case 4 -> cadenadia = "Jueves";
            case 5 -> cadenadia = "Viernes";
            case 6 -> cadenadia = "Sabado";
            case 7 -> cadenadia = "Domingo";
            default -> cadenadia = "nofecha";
        }
        return cadenadia;
    }
    
    private String obtenerMes() {
        String cadenames ;
        switch (mes) {
            case 1 -> cadenames = "Enero";
            case 2 -> cadenames = "Febrero";
            case 3 -> cadenames = "Marzo";
            case 4 -> cadenames = "Abril";
            case 5 -> cadenames = "Mayo";
            case 6 -> cadenames = "Junio";
            case 7 -> cadenames = "Julio";
            case 8 -> cadenames = "Agosto";
            case 9 -> cadenames = "Septiembre";
            case 10 -> cadenames = "Octubre";
            case 11 -> cadenames = "Noviembre";
            case 12 -> cadenames = "Diciembre";
            default -> cadenames = "nofecha";
        }
        return cadenames;
    }
    
    private String validarFecha() {
        String validacion = "";
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia > 31) {
                validacion = "nofecha";
            }
        }
        else if (mes == 2) {
            if ((año%4 == 0) && ((año%100 != 0) || (año%400 == 0))) {
                if (dia > 29) {
                    validacion = "nofecha";
                }
            }
            else {
                if (dia > 28) {
                    validacion = "nofecha";
                }
            }
        }
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
            if (dia > 30) {
                validacion = "nofecha";
            }
        }
        else if ( mes > 12 || mes < 1 ) {
            validacion = "nofecha";
        }
        
        return validacion;
    }
    
    public String salidaFormatoFecha() {
        if ("nofecha".equals(obtenerDiaSemana())||"nofecha".equals(obtenerMes()) || "nofecha".equals(validarFecha())) {
            return String.format("Fecha no valida");
        }
        else {
            return String.format("%s, %d de %s de %d", obtenerDiaSemana(), dia, obtenerMes(), año);
        }  
    } 
}
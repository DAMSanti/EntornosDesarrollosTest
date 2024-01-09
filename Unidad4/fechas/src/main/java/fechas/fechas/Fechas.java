package fechas.fechas;

import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
import java.util.*;

/**
 *
 * @author DAM104
 */

public class Fechas {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime hour = LocalTime.of(6, 30);
        System.out.println(hour); // 06:30

        LocalTime localTimePlus = hour.plus(1, ChronoUnit.HOURS);
        System.out.println(localTimePlus); // 07:30
        
        boolean isBeforeHour = LocalTime.parse("08:30").isBefore(LocalTime.parse("10:20"));
        System.out.println(isBeforeHour); // true
        
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTimeOf = LocalDateTime.of(2022, Month.AUGUST, 20, 8, 30);
        System.out.println(localDateTimeOf); // 2022-08-20T08:30
        
        LocalDate fechaInicio = LocalDate.of(2022, 10, 10);
        LocalDate fechaFin = fechaInicio.plus(Period.ofDays(500));
        int diffDays = Period.between(fechaInicio, fechaFin).getDays();
        int diffMonths =Period.between(fechaInicio, fechaFin).getMonths();
        int diffYears =Period.between(fechaInicio, fechaFin).getYears();
        System.out.println("Años: "+diffYears+" Meses: "+diffMonths+" Dias: "+diffDays);
        long aux=ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        System.out.println("Dias entre dos fechas: "+aux);
        
        System.out.println(fechaInicio + "/" + fechaFin);
        System.out.println(diffDays);
        System.out.println(aux);
        
        LocalTime hora = LocalTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("'Son las' h 'y' mm");
        System.out.println(hora.format(f));
        
        LocalDateTime fechaConHora=LocalDateTime.now();
        DateTimeFormatter esDateFormatLargo= DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'a las' hh:mm:ss").withLocale(new Locale("es", "ES"));
        System.out.println("Formato español (largo, localizado): " + fechaConHora.format(esDateFormatLargo));
        
        fechaConHora=LocalDateTime.now();
        String idiomaLocal = System.getProperty("user.language");
        String paisLocal = System.getProperty("user.country");
        System.out.println("Formato actual del sistema (" + idiomaLocal + "-" + paisLocal + "): " + fechaConHora.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale(idiomaLocal, paisLocal))));
    }
}

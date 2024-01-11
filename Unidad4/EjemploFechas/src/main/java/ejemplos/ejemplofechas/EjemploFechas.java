/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejemplos.ejemplofechas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cic
 */
public class EjemploFechas {

    public static void main(String[] args) {
        //Instancio usando now() partiendo de la fecha y hora actual
        System.out.println("La fecha actual es: " + LocalDate.now());
        System.out.println("La hora actual es: " + LocalTime.now());
        System.out.println("La fecha y hora actuales son: " + LocalDateTime.now());
        System.out.println("El instante actual es: " + Instant.now());
        System.out.println("La fecha y hora actuales con zona horaria son: " + ZonedDateTime.now());
        System.out.println("");

        //Instancia usando of() y pasando parametros.
        LocalDate fechaReyes;
        fechaReyes = LocalDate.of(2023, 1, 6);
        System.out.println("La fecha de reyes es: " + fechaReyes.toString());

        LocalDateTime horaMia;
        horaMia = LocalDateTime.of(2023, Month.JANUARY, 9, 11, 20, 22);
        System.out.println("La fecha y hora que yo he marcado es :" + horaMia.toString());
        System.out.println("");

        //Partes de una fecha
        if (fechaReyes.getMonth() == Month.JANUARY) {
            System.out.println("Reyes es en el mes de enero");
        }

        //Uso de métodos get()
        LocalDate fechaMia;
        fechaMia = LocalDate.of(2022, 12, 23);

        System.out.println("El año de la fecha anterior es: " + fechaMia.getYear());
        System.out.println("El mes de la fecha anterior es: " + fechaMia.getMonth());
        System.out.println("El dia de la fecha anterior es: " + fechaMia.getDayOfMonth());
        System.out.println("");
        System.out.println("");

        //Uso de from podemos separar la fecha de la hora en el localDateTime
        LocalDateTime ahora;
        ahora = LocalDateTime.now();
        System.out.println("Antes de aplicar el from: " + ahora);
        // transformación en LocalDate con pérdida de la hora   
        LocalDate actual;
        actual = LocalDate.from(ahora);
        System.out.println("fron con  perdira de información: " + actual);
        System.out.println("");

        //Uso atXxx
        //Combino dos tipos diferentes. Uno LocalDate y otro LocalTime
        //Obtengo uno LocalDateTime
        LocalDate diaPartido;
        diaPartido = LocalDate.of(2023, 1, 10);

        LocalTime horaPartido;
        horaPartido = LocalTime.of(21, 00);

        LocalDateTime inicio;
        inicio = diaPartido.atTime(horaPartido);
        System.out.println("El inicio del partido son : " + inicio);
        System.out.println("");

        //Uso de Parse, convierte un String "16:35:03" en formato reloj
        LocalTime reloj;
        reloj = LocalTime.parse("16:35:03");
        System.out.println("reloj: " + reloj);
        System.out.println("");

        //Uso de parse con entrada por teclado
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la fecha (dd-mm-yyyy):");
        DateTimeFormatter formateo = DateTimeFormatter.ofPattern("dd-MM-yyyy");// el patron de los meses tiene que ir en mayusculas porque si no lo lee como minutos
        LocalDate fechaTeclado = LocalDate.parse(entrada.next(), formateo);
        System.out.println(fechaTeclado);
        System.out.println("");

        //Incremento y decremento de fechas y horas
        System.out.println("Hoy es: " + LocalDate.now() + " y dentro de 4 días: " + LocalDate.now().plusDays(4));
        System.out.println("Ahora son las: " + LocalTime.now() + " y dentro de 25 minutos serán las: " + LocalTime.now().plusMinutes(25));
        System.out.println("Ahora son las: " + LocalTime.now() + " y hace 5 minutos eran las: " + LocalTime.now().plusMinutes(-5));
        System.out.println("");

        //Calculo de tiempo entre fechas con between()
        LocalDate fecha = LocalDate.of(2000, Month.JANUARY, 23);
        long añosTrancurridos = ChronoUnit.YEARS.between(fecha, LocalDate.now());
        System.out.println("La edad de mi hijo es de: " + (int) añosTrancurridos + " años");
        System.out.println("");

        //Calculo con until
        LocalDate hoy = LocalDate.now();
        LocalDate finDeAnio = hoy.with(TemporalAdjusters.lastDayOfYear());
        Period hastaFinDeAnio = hoy.until(finDeAnio);
        int dias = hastaFinDeAnio.getDays();
        int meses = hastaFinDeAnio.getMonths();
        String mes = meses == 1 ? " mes " : " meses ";
        System.out.println("Faltan " + meses + mes + "y " + dias + " días hasta final de año.");

        //Cuanto queda hasta los reyes del 2023
        Period hastaReyes = LocalDate.now().until(fechaReyes);
        dias = hastaReyes.getDays();
        meses = hastaReyes.getMonths();
        mes = meses == 1 ? " mes " : " meses ";
        System.out.println("Hasta reyes del 2023 queda " + meses + mes + "y " + dias + " dias");
        System.out.println("");

        //Formateo de fecha
        hoy = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("hoy es: " + dtf.format(hoy));
        System.out.println("");

        // conseguir transformar las fechas a castellano
        //Pues utilizando el método withLocale() de la clase DateTimeFormatter, 
        //que toma como argumento un objeto de la clase java.util.Locale.
        LocalDateTime fechaConHora = LocalDateTime.now();
        DateTimeFormatter esDateFormatLargo = DateTimeFormatter
                .ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'a las' hh:mm:ss")
                .withLocale(new Locale("es", "ES"));
        System.out.println("Formato español (largo, localizado): " + fechaConHora.format(esDateFormatLargo));

        //como formatear la fecha del usuario de la aplicación
        String idiomaLocal = System.getProperty("user.language");
        String paisLocal = System.getProperty("user.country");
        System.out.println("Formato actual del sistema (" + idiomaLocal + "-" + paisLocal + "): "
                + fechaConHora.format(
                        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                                .withLocale(
                                        new Locale(idiomaLocal, paisLocal)
                                )
                )
        );

    }
}

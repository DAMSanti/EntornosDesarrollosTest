package utiliades.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rathm
 */

public class UtilidadesTest {

    @Test
    public void testLeerString() {
        // Test case 1: Reading a string from user input
        String expected = "Hello";
        String actual = Utilidades.leerString();
        assertEquals(expected, actual);

        // Test case 2: Reading a string with a custom message
        expected = "World";
        actual = Utilidades.leerString("Enter a string:");
        assertEquals(expected, actual);
    }

    @Test
    public void testLeerInt() {
        // Test case 1: Reading an integer from user input
        int expected = 10;
        int actual = Utilidades.leerInt();
        assertEquals(expected, actual);

        // Test case 2: Reading an integer with a custom message
        expected = 20;
        actual = Utilidades.leerInt("Enter an integer:");
        assertEquals(expected, actual);
    }

    @Test
    public void testLeerDouble() {
        // Test case 1: Reading a double from user input
        double expected = 3.14;
        double actual = Utilidades.leerDouble();
        assertEquals(expected, actual, 0.01);

        // Test case 2: Reading a double with a custom message
        expected = 2.5;
        actual = Utilidades.leerDouble("Enter a double:");
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testLeerChar() {
        // Test case 1: Reading a char from user input
        char expected = 'A';
        char actual = Utilidades.leerChar();
        assertEquals(expected, actual);

        // Test case 2: Reading a char with a custom message
        expected = 'B';
        actual = Utilidades.leerChar("Enter a char:");
        assertEquals(expected, actual);
    }

    @Test
    public void testLeerBoolean() {
        // Test case 1: Reading a boolean from user input
        boolean expected = true;
        boolean actual = Utilidades.leerBoolean();
        assertEquals(expected, actual);

        // Test case 2: Reading a boolean with a custom message
        expected = false;
        actual = Utilidades.leerBoolean("Enter a boolean:");
        assertEquals(expected, actual);
    }

    @Test
    public void testLeerFecha() {
        // Test case 1: Reading a date from user input
        LocalDate expected = LocalDate.of(2022, 1, 1);
        LocalDate actual = Utilidades.leerFecha();
        assertEquals(expected, actual);

        // Test case 2: Reading a date with a custom message
        expected = LocalDate.of(2022, 12, 31);
        actual = Utilidades.leerFecha("Enter a date:");
        assertEquals(expected, actual);
    }
}
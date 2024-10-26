package Semana9.Ejercicio1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    public void sumaTest() {
        int resultado = calculadora.suma(5, 5);
        assertEquals(10, resultado);
    }

    @Test
    public void restaTest() {
        int resultado = calculadora.resta(5, 5);
        assertEquals(0, resultado);
    }

    @Test
    public void multiplicacionTest() {
        int resultado = calculadora.multiplicacion(5, 5);
        boolean estado = resultado > 0;
        assertTrue(estado);
    }
}

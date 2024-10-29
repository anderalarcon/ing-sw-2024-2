package Semana9.Ejercicio3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class ValidadorTest {

    Validador validador;

    @Before 
    public void setUp() {
        validador = new Validador();
    }

    @Test
    public void correoTest() {
        boolean resultado = validador.validarCorreoElectronico("andersonachata@gmail.com");
        assertTrue(resultado);
    }

    @Test
    public void numeroTest() {
        boolean resultado = validador.validarNumeroTelefono("913872010");
        assertTrue(resultado);
    }

}


package Semana9.Ejercicio2;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ListaElementosTest {

    private ListaElementos lista;

    @Before
    public void setUp() {
        lista = new ListaElementos();
    }

    @Test
    public void agregarTest() {
        lista.agregarElemento("adidas");
        assertNotNull(lista);
    }

    @Test
    public void contieneTest() {
        lista.agregarElemento("adidas");
        boolean resultado = lista.contieneElemento("adidas");
        assertTrue(resultado);
    }

}
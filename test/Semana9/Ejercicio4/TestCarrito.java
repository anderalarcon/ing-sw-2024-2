package Semana9.Ejercicio4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCarrito {

    CarritoDeCompras carrito;

    @Before
    public void setUp() {
        carrito = new CarritoDeCompras();
    }

    @Test
    public void agregarTest() {
        Producto p = new Producto("Zapatilla", 700, 2);
        carrito.agregarProducto(p);
        boolean condition = carrito.contieneProducto("Zapatilla");
        assertTrue(condition);
    }

}

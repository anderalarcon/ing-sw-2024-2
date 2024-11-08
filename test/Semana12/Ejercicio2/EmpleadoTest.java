package Semana12.Ejercicio2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmpleadoTest {

    private Empleado gerente;
    private Empleado admin;
    private Empleado normalito;

    @Before
    public void setUp() {
        gerente = new Empleado("Carlos", "Gerente", 5000.0);
        admin = new Empleado("b", "Administrador", 6000.0);
        normalito = new Empleado("c", "Empleado", 4000.0);
    }

    @Test
    public void testCalcularSalario() {
        double salarioG = gerente.calcularSalarioConBonificacion();
        double salarioA = admin.calcularSalarioConBonificacion();
        double salarioR = normalito.calcularSalarioConBonificacion();

        assertEquals(6000.0, salarioG, 0.1);
        assertEquals(6600.0, salarioA, 0.1);
        assertEquals(4200.0, salarioR, 0.1);
    }

    @Test
    public void testPermisos() {
        boolean gPermiso = gerente.tienePermiso("ACCESO_LIMITADO");
        boolean aPermiso = admin.tienePermiso("ACCESO_TOTAL");
        boolean rPermiso = normalito.tienePermiso("ACCESO_TOTAL");

        assertTrue(gPermiso);
        assertTrue(aPermiso);
        assertFalse(rPermiso);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void salarioBaseInvalido(){
        new Empleado("Ander", "Empleado", 0);
    }

}

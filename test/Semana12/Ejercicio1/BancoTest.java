package Semana12.Ejercicio1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BancoTest {

    Banco banco;

    @Before
    public void setUp() {
        banco = new Banco(0);
    }

    @Test
    public void depositoTest() {
        banco.depositar(100);
        double saldo = banco.getSaldo();
        assertTrue(saldo > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void depositoTest2() {
        banco.depositar(-50.0);  // Debería lanzar IllegalArgumentException
    }

    @Test
    public void retiroTest() {
        banco.depositar(100);
        banco.retirar(50);
        double saldo = banco.getSaldo();
        System.out.println("Saldo"+saldo);
        assertEquals(50.0, saldo, 0.01);
    }
}

package ar.edu.untref.dyasc;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class FiboTest {

    @Test
    public void imprimirSecuenciaFiboTest() {
        Fibonacci miFibo = new Fibonacci();
        int [] secuencia = miFibo.secuenciaFibonacciDe(5);
        assertEquals(miFibo.imprimirSecuencia(secuencia, 'h', 'd'), "fibo<5>: 0 1 1 2 3");
    }


}
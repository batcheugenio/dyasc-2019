package ar.edu.untref.dyasc;

import org.junit.Assert;
import org.junit.Test;

public class ImpresoraTest {

    @Test
    public void obtenerSecuenciaPorImpresoraTest(){
        Fibonacci miFibo = new Fibonacci();
        miFibo.generarSecuenciaFibonacciDe(5);

        Impresora miImpresora = new Impresora(miFibo);
        Assert.assertEquals(miImpresora.imprimir(), "Imprimiendo Secuencia: [0, 1, 1, 2, 3]");
    }

    @Test
    public void obtenerCabeceraPorImpresoraTest(){
        Fibonacci miFibo = new Fibonacci();
        miFibo.generarSecuenciaFibonacciDe(5);

        Impresora miImpresora = new Impresora(miFibo);
        miImpresora.crearCabecera();

        Assert.assertEquals("fibo<5>", miImpresora.getCabecera());
    }
}

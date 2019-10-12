package ar.edu.untref.dyasc;

import org.junit.Assert;
import org.junit.Test;

public class ImpresoraTest {

    @Test
    public void obtenerCabeceraPorImpresoraTest(){
        Fibonacci miFibo = new Fibonacci();
        miFibo.generarSecuenciaFibonacciDe(5);
        Impresora miImpresora = new Impresora(miFibo);
        miImpresora.crearCabecera();

        Assert.assertEquals("fibo<5>:", miImpresora.getCabecera());
    }

    @Test
    public void armarYObtenerContenidoPorImpresoraTest(){
        Fibonacci miFibo = new Fibonacci();
        miFibo.generarSecuenciaFibonacciDe(5);
        Impresora miImpresora = new Impresora(miFibo, "vi", "s");
        miImpresora.crearCuerpo();

        Assert.assertEquals("7", miImpresora.getCuerpo());
    }

    @Test
    public void obtenerImpresionPorDefaultDeSecuenciaTest(){
        Fibonacci miFibo = new Fibonacci();
        miFibo.generarSecuenciaFibonacciDe(5);
        Impresora miImpresora = new Impresora(miFibo);

        Assert.assertEquals("fibo<5>: 0 1 1 2 3", miImpresora.imprimir());
    }

    @Test
    public void obtenerImpresionModoSumatoriaTest(){
        Fibonacci miFibo = new Fibonacci();
        miFibo.generarSecuenciaFibonacciDe(5);
        Impresora miImpresora = new Impresora(miFibo, "hd", "s");

        Assert.assertEquals("fibo<5>s: 7", miImpresora.imprimir());

    }

    @Test
    public void obtenerImpresionOpcionInversaTest(){
        Fibonacci miFibo = new Fibonacci();
        miFibo.generarSecuenciaFibonacciDe(5);
        Impresora miImpresora = new Impresora(miFibo, "hi", "l");

        Assert.assertEquals("fibo<5>: 3 2 1 1 0", miImpresora.imprimir());
    }

    @Test
    public void obtenerImpresionOpcionInversaYVerticalTest(){
        Fibonacci miFibo = new Fibonacci();
        miFibo.generarSecuenciaFibonacciDe(5);
        Impresora miImpresora = new Impresora(miFibo, "vi", "l");

        Assert.assertEquals("fibo<5>:\n3\n2\n1\n1\n0", miImpresora.imprimir());
    }
}

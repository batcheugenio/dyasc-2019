package ar.edu.untref.dyasc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class FiboTest {

    @Test
    public void generarSecuenciaFiboTest() {
        Fibonacci miFibo = new Fibonacci();
        miFibo.generarSecuenciaFibonacciDe(5);
        int[] miArrayTest = new int[] {0, 1, 1, 2, 3};

        Assert.assertArrayEquals(miFibo.getSecuencia(), miArrayTest);
    }

    @Test
    public void generarSecuenciaFiboYObtenerNumeroDeSecuenciaTest() {
        Fibonacci miFibo = new Fibonacci();
        miFibo.generarSecuenciaFibonacciDe(5);

        Assert.assertEquals(miFibo.getNumeroDeSecuencia(),3);
    }

    @Test
    public void generarSecuenciaFiboYObtenerSumatoriaTest() {
        Fibonacci miFibo = new Fibonacci();
        miFibo.generarSecuenciaFibonacciDe(5);

        Assert.assertEquals(miFibo.getSumatoria(),7);
    }



}

package ar.edu.untref.dyasc;

import gherkin.lexer.Fi;
import org.junit.Assert;
import org.junit.Test;

public class FuncionamientoTest {

    @Test
    public void funcionalidadSumatoriaTest(){
        Fibonacci miFibo = new Fibonacci();
        int sumatoria = miFibo.generarSumatoriaFibonacciDe(5);
        Assert.assertEquals(sumatoria, 7);
    }

    @Test
    public void funcionalidadListaTest(){
        Fibonacci miFibo = new Fibonacci();
        int [] lista = miFibo.generarSecuenciaFibonacciDe(5);
        int listaAProbar[] = {0, 1, 1, 2, 3};
        Assert.assertArrayEquals(lista, listaAProbar);
    }

}

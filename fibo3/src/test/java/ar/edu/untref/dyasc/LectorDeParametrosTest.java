package ar.edu.untref.dyasc;

import org.junit.Assert;
import org.junit.Test;

public class LectorDeParametrosTest {

    @Test
    public void leerParametrosTest() throws OpcionNoValidaException {
        LectorDeParametros miLector = new LectorDeParametros();
        String[] parametros = {"-o=hd", "5"};
        miLector.leerParametros(parametros);
        Assert.assertEquals(miLector.getOpcion(), "hd");
    }
}

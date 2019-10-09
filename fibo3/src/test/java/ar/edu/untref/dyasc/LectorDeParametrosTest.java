package ar.edu.untref.dyasc;

import org.junit.Assert;
import org.junit.Test;

public class LectorDeParametrosTest {

    @Test
    public void creaLectorConOpcionHorizontalYDerecho() throws OpcionNoValidaException {
        LectorDeParametros miLector = new LectorDeParametros();
        String[] parametros = {"-o=hd", "5"};
        miLector.leerParametros(parametros);
        Assert.assertEquals(miLector.getOpcion(), "hd");
    }

    @Test
    public void creaLectorConOpcionVerticalEInverso() throws OpcionNoValidaException {
        LectorDeParametros miLector = new LectorDeParametros();
        String[] parametros = {"-o=vi", "5"};
        miLector.leerParametros(parametros);
        Assert.assertEquals(miLector.getOpcion(), "vi");
    }
}

package ar.edu.untref.dyasc;

import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;
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

    @Test
    public void crearLectorConOpcionYArchivo() throws OpcionNoValidaException {
        LectorDeParametros miLector = new LectorDeParametros();
        String[] parametros = {"-o=vi", "-f=archivoDePrueba.txt"};

        miLector.leerParametros(parametros);
        Assert.assertEquals(miLector.getArchivo(), "archivoDePrueba.txt");
    }
}

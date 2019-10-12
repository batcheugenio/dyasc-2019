package ar.edu.untref.dyasc;

import org.junit.Assert;
import org.junit.Test;

public class ImpresoraTest {

    @Test
    public void crearImpresoraTest() {
        Impresora miImpresora = new Impresora();
        Assert.assertEquals(miImpresora.imprimir(), "Imprimiendo...");
    }

}

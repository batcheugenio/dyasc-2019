package ar.edu.untref.dyasc;

import java.util.Arrays;

public class Impresora {
    private int [] secuencia;

    Impresora(Fibonacci miFibo){
        setSecuencia(miFibo.getSecuencia());
    }

    public String imprimir() {
        return "Imprimiendo Secuencia: " + Arrays.toString(getSecuencia());
    }

    public int[] getSecuencia(){
        return this.secuencia;
    }
    public void setSecuencia(int[] secuencia){
        this.secuencia = secuencia;
    }
}

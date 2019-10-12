package ar.edu.untref.dyasc;

import java.util.Arrays;

public class Impresora {
    private String cabecera;
    private int [] secuencia;
    private Fibonacci fibonacci;

    Impresora(Fibonacci fibonacci){
        setSecuencia(fibonacci.getSecuencia());
        this.fibonacci = fibonacci;
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

    public void crearCabecera() {
        StringBuilder cabecera = new StringBuilder();
        cabecera.append("fibo<" + String.valueOf(this.fibonacci.getNumeroDeSecuencia()) + ">");
        this.setCabecera(cabecera.toString());
    }

    public void setCabecera(String cabecera){
        this.cabecera = cabecera;
    }

    public String getCabecera() {
        return this.cabecera;
    }
}

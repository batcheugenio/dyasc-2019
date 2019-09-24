package ar.edu.untref.dyasc;

public class Fibonacci {
	
    public int[] desarrollarSecuencia(int cantidadDeTerminos) {
        int[] secuencia = new int[cantidadDeTerminos];
        if (cantidadDeTerminos == 1) {
            secuencia[0] = 0;
        } else if (cantidadDeTerminos > 1) {
            secuencia[0] = 0;
            secuencia[1] = 1;
        }
        for (int i = 2; i < secuencia.length; i++) {
            secuencia[i] = secuencia[i - 1] + secuencia[i - 2];
        }
        return secuencia;
    }
    
    public String imprimirSecuencia(int[] serie) {
        String salida = "fibo<" + serie.length + ">:";
        for (int i = 0; i < serie.length; i++) {
            salida += " " + serie[i];
        }
        return salida;
    }
}



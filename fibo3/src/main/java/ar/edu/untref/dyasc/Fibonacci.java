package ar.edu.untref.dyasc;

public class Fibonacci {
	
	public int[] generarSecuenciaFibonacciDe(int n) {
	    int [] secuencia = new int[n];
	    
		if (n == 1) {
		    secuencia[0] = 0;
		}else if (n > 1){
		    secuencia[0] = 0;
		    secuencia [1] = 1;
		}
		for (int i = 2; i < secuencia.length; i++){
		    secuencia[i] = secuencia[i-1] + secuencia[i-2];
		}
		return secuencia;
	}
	
	public String imprimirSecuencia(int[] secuencia, char orientacion, char direccion){
	    String salida = "fibo<" + secuencia.length + ">:";
	    
	    if (direccion == 'd') {
	        for (int i = 0; i<secuencia.length; i++) {
	            salida = cambiarOrientacion(secuencia, i, orientacion, salida);
	        }
	    } else {
	        for(int i=secuencia.length-1; i>= 0; i--) {
	            salida = cambiarOrientacion(secuencia, i, orientacion, salida);
	        }
	    }
	    return salida;
	}
	
	public String cambiarOrientacion(int[] secuencia, int indice, char orientacion, String salida){
	    if(orientacion == 'h') {
	        salida += " " + secuencia[indice];
	    } else {
	        salida += "\n" + secuencia[indice];
	    }
	    return salida;
	}

	public int generarSumatoriaFibonacciDe(int n) {
		int [] secuencia = generarSecuenciaFibonacciDe(n);
		int sumatoria = 0;

		for(int i = 0; i < secuencia.length; i++){
			sumatoria += secuencia[i];
		}
		return sumatoria;
	}
}



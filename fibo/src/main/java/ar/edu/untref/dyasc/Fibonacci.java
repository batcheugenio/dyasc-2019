package ar.edu.untref.dyasc;

public class Fibonacci {
	
	public int secuenciaFibonacciDe(int n) {
		if (n <= 1) {
			return n;
		}else {
			return secuenciaFibonacciDe(n-1) + secuenciaFibonacciDe(n-2);
		}
	}
}



package ar.edu.untref.dyasc;

public class Program {
		
	
	public static void main(String args[]) {
		Fibonacci fibo = new Fibonacci();
		int cantidadDeTerminos = Integer.parseInt(args[0]);
		int secuencia[] = fibo.desarrollarSecuencia(cantidadDeTerminos);
		
		System.out.println(fibo.imprimirSecuencia(secuencia));
		
	}
}

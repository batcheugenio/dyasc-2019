package ar.edu.untref.dyasc;
import java.util.Scanner;

public class Program {
		
	
	public static void main(String args[]) {
		Fibonacci fibo = new Fibonacci();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		System.out.print("fibo<"+n+">: ");
		
		for(int i = 1; i<= n; i++) {
			System.out.print(fibo.secuenciaFibonacciDe(i) + " ");
		}
	}
}

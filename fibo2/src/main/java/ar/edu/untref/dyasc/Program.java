package ar.edu.untref.dyasc;

public class Program {
	public static void main(String[] args) {
	    int cantidadDeTerminos = 0;
	    char orientacion = ' ';
	    char direccion = ' ';
	    
	    if (args.length == 2) {
	        orientacion = args[0].charAt(3);
	        direccion = args[0].charAt(4);
	        
	        if(!((direccion == 'd' || direccion == 'i') && (orientacion == 'v' || orientacion == 'h'))) {
	            System.out.println("Opciones no validas.");
	            return;
	        }
	        cantidadDeTerminos = Integer.parseInt(args[1]);
	    } else {
	        cantidadDeTerminos = Integer.parseInt(args[0]);
	        orientacion = 'h';
	        direccion = 'd';
	    }
	    Fibonacci miFibo = new Fibonacci();
	    int [] secuencia = miFibo.secuenciaFibonacciDe(cantidadDeTerminos);
	    System.out.println(miFibo.imprimirSecuencia(secuencia, orientacion, direccion));
	}
}

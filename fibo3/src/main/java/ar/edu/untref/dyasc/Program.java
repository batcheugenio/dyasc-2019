package ar.edu.untref.dyasc;

import java.io.IOException;

public class Program {
	public static void main(String[] args) throws OpcionNoValidaException, IOException {
		LectorDeParametros miLector = new LectorDeParametros();
		miLector.leerParametros(args);
		Fibonacci miFibo = new Fibonacci();

		miFibo.generarSecuenciaFibonacciDe(miLector.getNumeroSucesion());

		Impresora miImpresora = new Impresora(miFibo, miLector.getOpcion(), miLector.getModo());

		if(miLector.getArchivo()!= ""){
			GestorDeArchivos miGestor = new GestorDeArchivos();
			miGestor.guardarSalidaEnArchivo(miImpresora.imprimir(), miLector.getArchivo(), miFibo.getNumeroDeSecuencia());
			System.out.println(miGestor.getSalidaDeArchivo());
		} else {
			System.out.println(miImpresora.imprimir());
		}

	}
}
package ar.edu.untref.dyasc;

import javafx.beans.binding.StringBinding;

import java.util.Arrays;

public class Impresora {
    private String cabecera;
    private int [] secuencia;
    private String cuerpo;
    private String salida;
    private String modo;
    private String opcion;
    private Fibonacci fibonacci;

    Impresora(Fibonacci fibonacci){
        setSecuencia(fibonacci.getSecuencia());
        this.fibonacci = fibonacci;
        this.modo = "l";
        this.opcion="hd";
    }

    Impresora(Fibonacci fibonacci, String opcion, String modo){
        this(fibonacci);
        this.opcion = opcion;
        this.modo = modo;
    }


    public String imprimir() {
        this.crearCabecera();
        this.crearCuerpo();
        return this.getCabecera() + this.getCuerpo();
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
        if(this.modo == "s"){
            cabecera.append("s");
        }
        cabecera.append(":");

        this.setCabecera(cabecera.toString());
    }

    public void setCabecera(String cabecera){
        this.cabecera = cabecera;
    }

    public String getCabecera() {
        return this.cabecera;
    }

    public void setCuerpo(String cuerpo){
        this.cuerpo = cuerpo;
    }

    public String getCuerpo(){
        return this.cuerpo;
    }

    public void crearCuerpo() {

        StringBuilder cuerpo = new StringBuilder();
        if(this.modo == "s"){
            cuerpo = this.imprimirSumatoria(cuerpo);
        } else {
            cuerpo = this.imprimirSecuencia(cuerpo);
        }
        this.setCuerpo(cuerpo.toString());
    }

    private StringBuilder imprimirSumatoria(StringBuilder cuerpo){
        if(this.modo == "s"){
            cuerpo.append(" "+Integer.toString(fibonacci.getSumatoria()));
        }
        return cuerpo;
    }

    private StringBuilder imprimirSecuencia(StringBuilder cuerpo) {
        if (this.opcion == "hi"){
            for(int i = secuencia.length -1; i>=0; i--) {
                cuerpo.append(" " + Integer.toString(secuencia[i]));
            }
        } else if (this.opcion == "vd"){
            for(int i=0; i<secuencia.length; i++){
                cuerpo.append("\n" + Integer.toString(secuencia[i]));
            }
        } else if(this.opcion == "vi"){
            for(int i=secuencia.length -1; i>=0; i--) {
                cuerpo.append("\n" + Integer.toString(secuencia[i]));
            }
        } else {
            for (int i=0; i<secuencia.length; i++){
                cuerpo.append(" " + Integer.toString(secuencia[i]));
            }
        }
        return cuerpo;
    }
}

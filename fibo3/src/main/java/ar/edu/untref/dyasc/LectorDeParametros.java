package ar.edu.untref.dyasc;

import java.util.*;
import java.util.regex.Pattern;
import ar.edu.untref.dyasc.OpcionNoValidaException;

public class LectorDeParametros{

    private String opcion = "";
    private String archivo  = "";
    private char modo = ' ';

    public void leerParametros(String[] args) throws OpcionNoValidaException{

        for(String parametro: args){
            if(parametro.startsWith("-")){
                String valorOpcion = parametro.split("=")[1];
                char charOpcion = parametro.charAt(1);

                if(charOpcion == 'o'){
                    this.evaluarOpcion(valorOpcion);
                } else if (charOpcion == 'f') {
                    this.evaluarArchivo(valorOpcion);
                } else if (charOpcion == 'm') {
                    this.evaluarModo(valorOpcion);
                }
            }
        }
    }

    private void evaluarModo(String valorOpcion) throws OpcionNoValidaException {
        setModo(valorOpcion.charAt(0));
    }

    private void evaluarArchivo(String valorOpcion) throws OpcionNoValidaException{
        setArchivo(valorOpcion);
    }

    private void evaluarOpcion(String valorOpcion) throws OpcionNoValidaException{
        String[] opcionesValidas = {"hd", "vd", "hi", "vi"};

        if(!Arrays.asList(opcionesValidas).contains(valorOpcion)) {
            throw new OpcionNoValidaException();
        }

        setOpcion(valorOpcion);
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public char getModo() {
        return modo;
    }

    public void setModo(char modo) {
        this.modo = modo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
}

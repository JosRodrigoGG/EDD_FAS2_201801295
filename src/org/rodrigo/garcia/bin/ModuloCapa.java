package org.rodrigo.garcia.bin;

/**
 *
 * @author RodrigoGarcia
 */
public class ModuloCapa {
    private int fila;
    private int columna;
    private String color;

    public ModuloCapa(int fila, int columna, String color) {
        this.fila = fila;
        this.columna = columna;
        this.color = color;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public String getColor() {
        return color;
    }
    
    
}

package org.rodrigo.garcia.bin;

import org.rodrigo.garcia.estructuras.lista.LSimple;

/**
 *
 * @author RodrigoGarcia
 */
public class Imagen {
    private int idImagen;
    private LSimple<Capa> capas;

    public Imagen(int idImagen) {
        this.idImagen = idImagen;
        capas = new LSimple<>();
    }

    public int getIdImagen() {
        return idImagen;
    }

    public LSimple<Capa> getCapas() {
        return capas;
    }
    
    public void agregarCapas(Capa dato) {
        capas.agregar(dato);
    }
}

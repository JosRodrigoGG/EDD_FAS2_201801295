package org.rodrigo.garcia.bin;

import org.rodrigo.garcia.estructuras.lista.LSimple;

/**
 *
 * @author RodrigoGarcia
 */
public class Album {
    private int idAlbum;
    private LSimple<Imagen> imagenes;

    public Album(int idAlbum) {
        this.idAlbum = idAlbum;
        imagenes = new LSimple<>();
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public LSimple<Imagen> getImagenes() {
        return imagenes;
    }
    
    public void agregarImagen(Imagen dato) {
        imagenes.agregar(dato);
    }
}

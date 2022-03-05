package org.rodrigo.garcia.estructuras.lista;

import org.rodrigo.garcia.estructuras.nodo.NSimple;

/**
 *
 * @author RodrigoGarcia
 */
public class LSimple<T> {
    private int contador;
    private NSimple<T> lista;

    public LSimple() {
        lista = null;
        contador = 0;
    }
    
    public void agregar(T dato) {
        if (lista != null) {
            NSimple<T> aux = lista;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(new NSimple<>(dato));
        } else {
            lista = new NSimple<>(dato);
        }
        contador++;
    }
}

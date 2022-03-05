package org.rodrigo.garcia.estructuras.nodo;

/**
 *
 * @author RodrigoGarcia
 */
public class NSimple<T> {
    private T dato;
    private NSimple<T> siguiente;

    public NSimple(T dato) {
        this.dato = dato;
        siguiente = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NSimple<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NSimple<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    
}

package org.rodrigo.garcia.bin;

import org.rodrigo.garcia.estructuras.lista.LSimple;

/**
 *
 * @author RodrigoGarcia
 */
public class Capa {
    private int idCapa;
    private LSimple<ModuloCapa> modulos;

    public Capa(int idCapa) {
        this.idCapa = idCapa;
        modulos = new LSimple<>();
    }

    public int getIdCapa() {
        return idCapa;
    }

    public LSimple<ModuloCapa> getModulos() {
        return modulos;
    }
    
    public void agregarModulo(ModuloCapa dato) {
        modulos.agregar(dato);
    }
}

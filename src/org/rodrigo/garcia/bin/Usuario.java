package org.rodrigo.garcia.bin;

/**
 *
 * @author RodrigoGarcia
 */
public class Usuario {
    private String nombre;
    private String contrasena;
    private long dpi;
    private int idCliente;

    public Usuario(String nombre, String contrasena, long dpi, int idCliente) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.dpi = dpi;
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public long getDpi() {
        return dpi;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }   
    
}

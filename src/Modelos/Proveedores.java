
package Modelos;

import java.io.Serializable;

public class Proveedores implements Serializable{
    
    private String nombre;
    private String telefono;
    private String movil;
    private String correo;
    private String nit;
    private String porcentaje;
    private String cantTra;
    private String servicio;

    public Proveedores() {
    }

    public Proveedores(String nombre, String telefono, String movil, String correo, String nit, String porcentaje, String cantTra, String servicio) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.movil = movil;
        this.correo = correo;
        this.nit = nit;
        this.porcentaje = porcentaje;
        this.cantTra = cantTra;
        this.servicio = servicio;
    }

    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the movil
     */
    public String getMovil() {
        return movil;
    }

    /**
     * @param movil the movil to set
     */
    public void setMovil(String movil) {
        this.movil = movil;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the porcentaje
     */
    public String getPorcentaje() {
        return porcentaje;
    }

    /**
     * @param porcentaje the porcentaje to set
     */
    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    /**
     * @return the cantTra
     */
    public String getCantTra() {
        return cantTra;
    }

    /**
     * @param cantTra the cantTra to set
     */
    public void setCantTra(String cantTra) {
        this.cantTra = cantTra;
    }

    /**
     * @return the servicio
     */
    public String getServicio() {
        return servicio;
    }

    /**
     * @param servicio the servicio to set
     */
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    
    public boolean empiezaPor(String inicio){
        
        if(inicio.isEmpty() || inicio.length()>nombre.length())
            return false;
        for (int i = 0; i < inicio.length(); i++) 
            if(inicio.charAt(i) != nombre.charAt(i))
               return false;
        return true;
        
    }
    
    
}


package Modelos;

import java.io.Serializable;

public class Asignacion implements Serializable{
    
    private Servicios servicio;
    private String proveedor;
    private String cantidad;
    private String porcentaje;

    public Asignacion() {
    }

    public Asignacion(Servicios servicio, String proveedor, String cantidad, String porcentaje) {
        this.servicio = servicio;
        this.proveedor = proveedor;
        this.cantidad = cantidad;
        this.porcentaje = porcentaje;
    }

    

    /**
     * @return the servicio
     */
    public Servicios getServicio() {
        return servicio;
    }

    /**
     * @param servicio the servicio to set
     */
    public void setServicio(Servicios servicio) {
        this.servicio = servicio;
    }

    /**
     * @return the proveedor
     */
    public String getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return the cantidad
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
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


    
    
}

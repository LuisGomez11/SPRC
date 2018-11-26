
package Controladores;

import Modelos.Asignacion;
import java.util.ArrayList;

public class ControlAsignacion {
    
    public static ArrayList <Asignacion> listaSerAsignados = new ArrayList<>();

    /**
     * @return the listaSerAsignados
     */
    public static ArrayList <Asignacion> getListaSerAsignados() {
        return listaSerAsignados;
    }

    /**
     * @param aListaSerAsignados the listaSerAsignados to set
     */
    public static void setListaSerAsignados(ArrayList <Asignacion> aListaSerAsignados) {
        listaSerAsignados = aListaSerAsignados;
    }
    
    public static void añadirServicioAsignado (Asignacion as){
        
        getListaSerAsignados().add(as);
        
    }
    
}

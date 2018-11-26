
package Main;

import Controladores.ControlArchivos;
import Vistas.Inicio;
import Vistas.MenuAnalista;
import Vistas.ServiciosEnEspera;
import Vistas.ServiciosRegistrados;

public class Main {

    public static void main(String[] args) {
        
        Controladores.ControlArchivos ca = new ControlArchivos();
        ca.leerArchivos();
        
//        Inicio inicio = new Inicio();
//        inicio.setVisible(true);

//        ServiciosRegistrados sr = new ServiciosRegistrados();
//        sr.setVisible(true);
        
//        MenuAnalista ma = new MenuAnalista();
//        ma.setVisible(true);

        ServiciosEnEspera se = new ServiciosEnEspera();
        se.setVisible(true);

    }
    
}

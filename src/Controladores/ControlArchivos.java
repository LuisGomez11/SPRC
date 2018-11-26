
package Controladores;

import Modelos.Asignacion;
import Modelos.Proveedores;
import Modelos.Servicios;
import Modelos.Usuarios;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlArchivos {
    
    public void guardarArchivos (){
        
        try {
            
            ObjectOutputStream oosp = new ObjectOutputStream(new FileOutputStream("Proveedores.ddr"));
            ObjectOutputStream oosa = new ObjectOutputStream(new FileOutputStream("Analistas.ddr"));
            ObjectOutputStream ooss = new ObjectOutputStream(new FileOutputStream("Seleccionadores.ddr"));
            ObjectOutputStream oossr = new ObjectOutputStream(new FileOutputStream("Servicios.ddr"));
            ObjectOutputStream oosst = new ObjectOutputStream(new FileOutputStream("Servicios Temp.ddr"));
            ObjectOutputStream oossa = new ObjectOutputStream(new FileOutputStream("Servicios asignados.ddr"));
            oosa.writeObject(ControlUsuario.getListaAnalistas());
            ooss.writeObject(ControlUsuario.getListaSeleccionadores());
            oosp.writeObject(ControlProveedor.getListaProveedores());
            oossr.writeObject(ControlServicio.getListaServicios());
            oosst.writeObject(ControlServicio.getServTemporal());
            oossa.writeObject(ControlAsignacion.getListaSerAsignados());
           
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void leerArchivos (){
       
        try {

            ObjectInputStream oisa = new ObjectInputStream(new FileInputStream("Analistas.ddr"));
            ObjectInputStream oiss = new ObjectInputStream(new FileInputStream("Seleccionadores.ddr"));
            ControlUsuario.listaAnalistas = (ArrayList<Usuarios>) oisa.readObject();
            ControlUsuario.listaSeleccionadores = (ArrayList<Usuarios>) oiss.readObject();   
        
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        try {
        
            ObjectInputStream oisp = new ObjectInputStream(new FileInputStream("Proveedores.ddr"));    
            ControlProveedor.listaProveedores = (ArrayList<Proveedores>) oisp.readObject();
            
        
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        try {

            ObjectInputStream oissr = new ObjectInputStream(new FileInputStream("Servicios.ddr"));
            ObjectInputStream oisst = new ObjectInputStream(new FileInputStream("Servicios Temp.ddr"));
            ObjectInputStream oissa = new ObjectInputStream(new FileInputStream("Servicios asignados.ddr"));
            ControlServicio.listaServicios = (ArrayList<Servicios>) oissr.readObject();
            ControlServicio.servTemporal = (ArrayList<Servicios>) oisst.readObject();
            ControlAsignacion.listaSerAsignados = (ArrayList<Asignacion>) oissa.readObject();
        
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}

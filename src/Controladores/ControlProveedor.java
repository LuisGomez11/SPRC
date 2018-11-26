
package Controladores;

import Alertas.Correcto;
import Alertas.ErrorCompletar;
import Modelos.Proveedores;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ControlProveedor {

    public static ArrayList<Proveedores> listaProveedores = new ArrayList<>();

    /**
     * @return the listaProveedores
     */
    public static ArrayList<Proveedores> getListaProveedores() {
        return listaProveedores;
    }

    /**
     * @param aListaProveedores the listaProveedores to set
     */
    public static void setListaProveedores(ArrayList<Proveedores> aListaProveedores) {
        listaProveedores = aListaProveedores;
    }
    
    public static void añadirProveedor(Proveedores p){
        
        getListaProveedores().add(p);
        
    }
    
    public void Registrar(JTextField nomb, JTextField telefo, JTextField movi, JTextField corre, JTextField NIT, JTextField porcenta, JTextField cantT, JTextField serv){
        
        try{
            
            String nombre = nomb.getText();
            String telefono = telefo.getText();
            String movil = movi.getText();
            String correo = corre.getText();
            String nit = NIT.getText();
            String porcentaje = porcenta.getText();
            String cantTra = cantT.getText();
            String servicio = serv.getText();
            
            boolean c = false;
            
            if(nombre.isEmpty()||telefono.isEmpty()||movil.isEmpty()||correo.isEmpty()||
                nit.isEmpty()||porcentaje.isEmpty()||cantTra.isEmpty()||servicio.isEmpty()){
                
                ErrorCompletar ec = new ErrorCompletar();
                ec.setVisible(true);
                
            } else {
                
                for (int i = 0; i < getListaProveedores().size(); i++) {
                    
                    if(getListaProveedores().get(i).getNombre().equals(nombre)){
                        
                        c = true;
                        
                    }
                    
                }
                
                if(c==true){
                    
                    JOptionPane.showMessageDialog(null, "Proveedor ya registrado", "Error!", 2);
                    
                } else {
                
                    Proveedores p = new Proveedores(nombre, telefono, movil, correo, nit, porcentaje, cantTra, servicio);

                    añadirProveedor(p);

                    Correcto co = new Correcto();
                    co.setVisible(true);

                    nomb.setText("");
                    telefo.setText("");
                    movi.setText("");
                    corre.setText("");
                    NIT.setText("");
                    porcenta.setText("");
                    cantT.setText("");
                    serv.setText("");
                
                }
                
            }
    
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e, "Error!", 0);
        }
        
    }
    
    
}

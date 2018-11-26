
package Controladores;

import Alertas.ErrorCompletar;
import Modelos.Servicios;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ControlServicio {
    
    public static ArrayList<Servicios> listaServicios = new ArrayList<>();
    public static ArrayList<Servicios> servTemporal = new ArrayList<>();

    /**
     * @return the listaServicios
     */
    public static ArrayList<Servicios> getListaServicios() {
        return listaServicios;
    }

    /**
     * @param aListaServicios the listaServicios to set
     */
    public static void setListaServicios(ArrayList<Servicios> aListaServicios) {
        listaServicios = aListaServicios;
    }
    
    
    
    public static void añadirServicio(Servicios s){
    
        getListaServicios().add(s);
        
    }
    
    
    /**
     * @return the servTemporal
     */
    public static ArrayList<Servicios> getServTemporal() {
        return servTemporal;
    }

    /**
     * @param aServTemporal the servTemporal to set
     */
    public static void setServTemporal(ArrayList<Servicios> aServTemporal) {
        servTemporal = aServTemporal;
    }
    
    public static void añadirServicioTem(Servicios s){
    
        getServTemporal().add(s);
        
    }
    
    public void registrarServicio(JComboBox cbTerminal, JComboBox cbMotonave, JTextField txtLloydEscala, JTextField txtUVU, JTextField txtReferencia, JComboBox cbMuelle,
    JComboBox cbGrua, JTextField txtFecha, JTextField txtHoraCita, JTextField txtHoraOperacion, JTextField txtFechaFinal, JTextField txtHoraFinal, JLabel porcentaje,
    JComboBox cbServicio, JPanel panelPorcPro, JPanel panelProveedores){
        
        try {
            
            if(cbTerminal.getSelectedIndex()==0||cbMotonave.getSelectedIndex()==0||txtLloydEscala.getText().isEmpty()||
                txtUVU.getText().isEmpty()||txtReferencia.getText().isEmpty()||cbMuelle.getSelectedIndex()==0||
                cbGrua.getSelectedIndex()==0||txtFecha.getText().isEmpty()||txtHoraCita.getText().isEmpty()||
                txtHoraOperacion.getText().isEmpty()){
                
                ErrorCompletar ec = new ErrorCompletar();
                ec.setVisible(true);
                
            }
            else{
                
                String terminal = cbTerminal.getSelectedItem().toString();
                String moto = cbMotonave.getSelectedItem().toString();
                String lloyd = txtLloydEscala.getText();
                String UVU = txtUVU.getText();
                String ref = txtReferencia.getText();
                String muelle = cbMuelle.getSelectedItem().toString();
                String grua = cbGrua.getSelectedItem().toString();
                String fechaI = txtFecha.getText();
                String horaI = txtHoraCita.getText();
                String fechaF = txtFechaFinal.getText();
                String horaF = txtHoraFinal.getText();
                String ho = txtHoraOperacion.getText();
                String ser = cbServicio.getSelectedItem().toString();

                Servicios s = new Servicios(terminal, moto,lloyd, UVU, ref, muelle, grua, fechaI, horaI, fechaF, horaF, ho,ser);

                ControlServicio.añadirServicio(s);
                ControlServicio.añadirServicioTem(s);

                
                
                //Advertencia de confirmacion proximamente
//
                int o = JOptionPane.YES_NO_OPTION;
                int r = JOptionPane.showConfirmDialog(null, "Desea encargar el servicio inmediatamente?", "Confirmacion", o);

                if(r==0){

                    panelPorcPro.setVisible(true);
                    panelProveedores.setVisible(true);
                    porcentaje.setText("100");


                } else {

                    cbGrua.setSelectedIndex(0);
                    cbMotonave.setSelectedIndex(0);
                    cbMuelle.setSelectedIndex(0);
                    txtReferencia.setText("");
                    txtFecha.setText("");
                    txtHoraCita.setText("");
                    txtHoraOperacion.setText("");
                    txtFechaFinal.setText("");
                    txtHoraFinal.setText("");
                    cbTerminal.setSelectedIndex(0);
                    cbServicio.setSelectedIndex(0);
                    txtUVU.setText("");
                    txtLloydEscala.setText("");


                    txtFecha.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    txtHoraCita.setBorder(BorderFactory.createLineBorder(Color.BLACK));

                    porcentaje.setText("0");
                
                }
                
            }
            
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e, "Error", 0);
        }
        
    }
     
    
}


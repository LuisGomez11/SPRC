
package Controladores;

import Modelos.Usuarios;
import Vistas.CorreoVista;
import Vistas.InfoUsuario;
import Vistas.Login;
import static Vistas.Login.Nombre;
import Vistas.MenuAnalista;
import Vistas.MenuSeleccionador;
import Vistas.Registrarse;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ControlUsuario {

    public static ArrayList <Usuarios> listaAnalistas = new ArrayList<>();
    public static ArrayList <Usuarios> listaSeleccionadores = new ArrayList<>();

    
    
    /**
     * @return the listaAnalistas
     */
    public static ArrayList <Usuarios> getListaAnalistas() {
        return listaAnalistas;
    }

    /**
     * @param aListaAnalistas the listaAnalistas to set
     */
    public static void setListaAnalistas(ArrayList <Usuarios> aListaAnalistas) {
        listaAnalistas = aListaAnalistas;
    }
    
    public static void añadirAnalista(Usuarios ana){
        
        getListaAnalistas().add(ana);
        
    }

    /**
     * @return the listaSeleccionadores
     */
    public static ArrayList <Usuarios> getListaSeleccionadores() {
        return listaSeleccionadores;
    }

    /**
     * @param aListaSeleccionadores the listaSeleccionadores to set
     */
    public static void setListaSeleccionadores(ArrayList <Usuarios> aListaSeleccionadores) {
        listaSeleccionadores = aListaSeleccionadores;
    }

    public static void añadirSeleccionador(Usuarios sele){
        
        getListaSeleccionadores().add(sele);
        
    }
    
    public void iniciarSecion(JTextField txtUsuario, JPasswordField txtContraseña, JLabel cargoUser, JLabel fecha, JLabel hora, JLabel labelAdvertencia, JPanel panel){
        
        
        
        String us = txtUsuario.getText();
        String contr = txtContraseña.getText();

        boolean user = false;
        boolean con = false;
        
        if(us.equals("Ingrese su usuario")||contr.equals("Ingrese su contraseña")){
            
            if(us.equals("Ingrese su usuario")){

                txtUsuario.setBackground(new Color(255,204,204));


            }if(contr.equals("Ingrese su contraseña")){

                txtContraseña.setBackground(new Color(255,204,204));

            }
            
        }else{
        
            if(cargoUser.getText().equals("ANALISTA")){
                
                for (int i = 0; i < ControlUsuario.getListaAnalistas().size(); i++) {

                if(ControlUsuario.getListaAnalistas().get(i).getUser().equals(us)){

                    Nombre = ControlUsuario.getListaAnalistas().get(i).getNombre()+" "
                            +ControlUsuario.getListaAnalistas().get(i).getApellido();

                    user = true;

                }

            }

            if(user==true){

                for (int i = 0; i < ControlUsuario.getListaAnalistas().size(); i++) {
                    if(ControlUsuario.getListaAnalistas().get(i).getUser().equals(us)&&
                        ControlUsuario.getListaAnalistas().get(i).getContraseña().equals(contr)){

                        Nombre = ControlUsuario.getListaAnalistas().get(i).getNombre()+" "
                           +ControlUsuario.getListaAnalistas().get(i).getApellido();
                        
                        MenuAnalista.Nombre = Nombre;

                        con=true;
                        
                        CorreoVista.Username = ControlUsuario.getListaAnalistas().get(i).getCorreo();
                        CorreoVista.contraseña = ControlUsuario.getListaAnalistas().get(i).getContraseña();
                        
                        
                        InfoUsuario.nombre = ControlUsuario.getListaAnalistas().get(i).getNombre();
                        InfoUsuario.apellido = ControlUsuario.getListaAnalistas().get(i).getApellido();
                        InfoUsuario.correo = ControlUsuario.getListaAnalistas().get(i).getCorreo();
                        InfoUsuario.usuario = ControlUsuario.getListaAnalistas().get(i).getUser();
                        InfoUsuario.fechaIngreso = fecha.getText();
                        InfoUsuario.horaIngreso = hora.getText();
                        
                    }
                }

                if(con==true){

                    MenuAnalista menu = new MenuAnalista();
                    menu.setVisible(true);
                    

                } else{
                    
                    panel.setVisible(true);
                    labelAdvertencia.setText("Contraseña incorrecta, intente nuevamente");
   
                }

            } else {
                
                panel.setVisible(true);
                labelAdvertencia.setText("Usuario no existente");
                
            }
                
            }
            
            ////////////////////////////////////////////////////////////////////////////
            
            if(cargoUser.getText().equals("SELECCIONADOR")){
                
                for (int i = 0; i < ControlUsuario.getListaSeleccionadores().size(); i++) {

                if(ControlUsuario.getListaSeleccionadores().get(i).getUser().equals(us)){

                    Nombre = ControlUsuario.getListaSeleccionadores().get(i).getNombre()+" "
                            +ControlUsuario.getListaSeleccionadores().get(i).getApellido();

                    user = true;

                }

            }

            if(user==true){

                for (int i = 0; i < ControlUsuario.getListaSeleccionadores().size(); i++) {
                    if(ControlUsuario.getListaSeleccionadores().get(i).getUser().equals(us)&&
                        ControlUsuario.getListaSeleccionadores().get(i).getContraseña().equals(contr)){

                        Nombre = ControlUsuario.getListaSeleccionadores().get(i).getNombre()+" "
                           +ControlUsuario.getListaSeleccionadores().get(i).getApellido();

                        
                        MenuSeleccionador.Nombre = Nombre;
                        
                        con=true;
                        
                        CorreoVista.Username = ControlUsuario.getListaSeleccionadores().get(i).getCorreo();
                        CorreoVista.contraseña = ControlUsuario.getListaSeleccionadores().get(i).getContraseña();
                        
                        
                        InfoUsuario.nombre = ControlUsuario.getListaSeleccionadores().get(i).getNombre();
                        InfoUsuario.apellido = ControlUsuario.getListaSeleccionadores().get(i).getApellido();
                        InfoUsuario.correo = ControlUsuario.getListaSeleccionadores().get(i).getCorreo();
                        InfoUsuario.usuario = ControlUsuario.getListaSeleccionadores().get(i).getUser();
                        InfoUsuario.fechaIngreso = fecha.getText();
                        InfoUsuario.horaIngreso = hora.getText();
                        
                    }
                }

                if(con==true){

                    MenuSeleccionador menu = new MenuSeleccionador();
                    menu.setVisible(true);
                    

                } else{
                    
                    panel.setVisible(true);
                    labelAdvertencia.setText("Contraseña incorrecta, intente nuevamente");
   
                }

            } else {
                
                panel.setVisible(true);
                labelAdvertencia.setText("Usuario no existente");
                
            }
                
            }
            
          
        }
        
    }
    
    public void registrarse(JTextField txtNombre, JTextField txtApellido, JTextField txtUsuario, JTextField txtCorreo, JPasswordField txtContraseña, JTextField txtTelefono, JPanel panelVerificacion, JLabel labelAdvertencia, JRadioButton jRadioButton1, JRadioButton jRadioButton2){
        
        boolean c = false;

        for (int i = 0; i < ControlUsuario.getListaAnalistas().size(); i++) {
            if(ControlUsuario.getListaAnalistas().get(i).getUser().equals(txtUsuario.getText())){
                c = true;
            }
        }
        for (int i = 0; i < ControlUsuario.getListaSeleccionadores().size(); i++) {
            if(ControlUsuario.getListaSeleccionadores().get(i).getUser().equals(txtUsuario.getText())){
                c = true;
            }
        }
        if(txtCorreo.getText().contains("@")){
            
        }else{
            
            if(jRadioButton1.isSelected()==false && jRadioButton2.isSelected()==false){
                
                JOptionPane.showMessageDialog(null,"No ha seleccionado ningun cargo","Error",0);
                
            } 
            else {
                
                if(txtNombre.getText().isEmpty()||txtApellido.getText().isEmpty()||
                    txtContraseña.getText().isEmpty()||txtTelefono.getText().isEmpty()||
                    txtUsuario.getText().isEmpty()||txtCorreo.getText().isEmpty()){

                    labelAdvertencia.setVisible(true);
                    labelAdvertencia.setForeground(new Color(255,0,0));
                    labelAdvertencia.setText("Rellene todos los campos por favor");

                    if(txtNombre.getText().isEmpty()){
                        txtNombre.setBackground(new Color(255,204,204));
                    }
                    if(txtApellido.getText().isEmpty()){
                        txtApellido.setBackground(new Color(255,204,204));
                    }
                    if(txtContraseña.getText().isEmpty()){
                        txtContraseña.setBackground(new Color(255,204,204));
                    }
                    if(txtTelefono.getText().isEmpty()){
                        txtTelefono.setBackground(new Color(255,204,204));
                    }
                    if(txtUsuario.getText().isEmpty()){
                        txtUsuario.setBackground(new Color(255,204,204));
                    }
                    if(txtCorreo.getText().isEmpty()){
                        txtCorreo.setBackground(new Color(255,204,204));
                    }

                }else if(c==true){

                    labelAdvertencia.setVisible(true);
                    labelAdvertencia.setForeground(new Color(255,0,0));
                    labelAdvertencia.setText("Usuario ya existente");
                    txtUsuario.setBackground(new Color(255,204,204));

                }else if(txtContraseña.getText().length()<7){

                    labelAdvertencia.setVisible(true);
                    labelAdvertencia.setForeground(new Color(255,0,0));
                    labelAdvertencia.setText("Contraseña muy corta");
                    txtContraseña.setBackground(new Color(255,204,204));

                }else{

                    panelVerificacion.setVisible(true);

                }
                
            }
            
        }
        
    }
    
    public void ConfirmarRegistro(ButtonGroup buttonGroup1, JTextField txtCodVerificacion, JTextField txtNombre, JTextField txtApellido, JTextField txtUsuario, JTextField txtCorreo, JPasswordField txtContraseña, JTextField txtTelefono, JPanel panelVerificacion, JLabel labelAdvertencia, JRadioButton jRadioButton1, JRadioButton jRadioButton2){
    
        if(txtCodVerificacion.getText().equals("PAPA-JOSH")){

                String cargo;
                
                if(jRadioButton1.isSelected()==true){
                    cargo="Analista";
                } else{
                    cargo="Seleccionador";
                }
 
                Usuarios u = new Usuarios(txtNombre.getText(),
                    txtApellido.getText(), txtUsuario.getText(),
                    txtCorreo.getText()+"@gmail.com",
                    txtContraseña.getText(), txtTelefono.getText(),
                    cargo);
                
                if(cargo.equals("Analista")){
                   ControlUsuario.añadirAnalista(u); 
                }
                if(cargo.equals("Seleccionador")){
                    ControlUsuario.añadirSeleccionador(u);
                }

                labelAdvertencia.setVisible(true);
                labelAdvertencia.setForeground(new Color(0,204,0));
                labelAdvertencia.setText("Registrado correctamente");
                
                txtApellido.setText("");
                txtNombre.setText("");
                txtContraseña.setText("");
                txtUsuario.setText("");
                txtTelefono.setText("");
                txtCorreo.setText("");
                buttonGroup1.clearSelection();

                panelVerificacion.setVisible(false);

            }else{

            }
        
    }
    
}

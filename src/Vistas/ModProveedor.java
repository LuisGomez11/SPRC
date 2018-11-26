
package Vistas;

import Alertas.Advertenciamodificar;
import Alertas.BuscarModificar;
import Alertas.ErrorCompletar;
import Controladores.ControlProveedor;
import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class ModProveedor extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    
    
    
    public ModProveedor() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        labelNombre = new javax.swing.JLabel();
        txtBuscador = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JButton();
        labelCorreo = new javax.swing.JLabel();
        labelNombre1 = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelApellido1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPorcentaje = new javax.swing.JTextField();
        txtMovil = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtNIT = new javax.swing.JTextField();
        txtServicio = new javax.swing.JTextField();
        labelApellido2 = new javax.swing.JLabel();
        labelApellido3 = new javax.swing.JLabel();
        labelApellido4 = new javax.swing.JLabel();
        labelApellido5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtCantTrabajadores = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SPRC.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 145, 242));
        jLabel5.setText("Modificar Proveedores");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, 60));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/002-login-1.png"))); // NOI18N
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 50, -1));

        labelNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(64, 145, 242));
        labelNombre.setText("NOMBRE:");
        jPanel1.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 30));

        txtBuscador.setForeground(new java.awt.Color(64, 145, 242));
        txtBuscador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscadorKeyTyped(evt);
            }
        });
        jPanel1.add(txtBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 200, 30));

        btnActualizar.setBackground(new java.awt.Color(64, 145, 242));
        btnActualizar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(null);
        btnActualizar.setBorderPainted(false);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, 120, 30));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 970, 20));

        btnBuscar.setBackground(new java.awt.Color(64, 145, 242));
        btnBuscar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 120, 30));

        labelCorreo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelCorreo.setForeground(new java.awt.Color(64, 145, 242));
        labelCorreo.setText("CORREO:");
        jPanel1.add(labelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, 30));

        labelNombre1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelNombre1.setForeground(new java.awt.Color(64, 145, 242));
        labelNombre1.setText("NOMBRE:");
        jPanel1.add(labelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, 30));

        labelApellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelApellido.setForeground(new java.awt.Color(64, 145, 242));
        labelApellido.setText("TELEFONO:");
        jPanel1.add(labelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, 30));

        labelApellido1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelApellido1.setForeground(new java.awt.Color(64, 145, 242));
        labelApellido1.setText("CANT. DE TRABAJADORES:");
        jPanel1.add(labelApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, -1, 30));

        txtNombre.setForeground(new java.awt.Color(64, 145, 242));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtNombre.setEnabled(false);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 200, 30));

        txtTelefono.setForeground(new java.awt.Color(64, 145, 242));
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtTelefono.setEnabled(false);
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 200, 30));

        txtPorcentaje.setForeground(new java.awt.Color(64, 145, 242));
        txtPorcentaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtPorcentaje.setEnabled(false);
        jPanel1.add(txtPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 200, 30));

        txtMovil.setForeground(new java.awt.Color(64, 145, 242));
        txtMovil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtMovil.setEnabled(false);
        jPanel1.add(txtMovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 200, 30));

        txtCorreo.setForeground(new java.awt.Color(64, 145, 242));
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtCorreo.setEnabled(false);
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 200, 30));

        txtNIT.setForeground(new java.awt.Color(64, 145, 242));
        txtNIT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtNIT.setEnabled(false);
        jPanel1.add(txtNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 200, 30));

        txtServicio.setForeground(new java.awt.Color(64, 145, 242));
        txtServicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtServicio.setEnabled(false);
        txtServicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtServicioKeyTyped(evt);
            }
        });
        jPanel1.add(txtServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 580, 30));

        labelApellido2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelApellido2.setForeground(new java.awt.Color(64, 145, 242));
        labelApellido2.setText("PORCENTAJE:");
        jPanel1.add(labelApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, 30));

        labelApellido3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelApellido3.setForeground(new java.awt.Color(64, 145, 242));
        labelApellido3.setText("MOVIL:");
        jPanel1.add(labelApellido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, 30));

        labelApellido4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelApellido4.setForeground(new java.awt.Color(64, 145, 242));
        labelApellido4.setText("NIT:");
        jPanel1.add(labelApellido4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, 30));

        labelApellido5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelApellido5.setForeground(new java.awt.Color(64, 145, 242));
        labelApellido5.setText("SERVICIO:");
        jPanel1.add(labelApellido5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, -1, 30));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 448, 780, 20));

        txtCantTrabajadores.setForeground(new java.awt.Color(64, 145, 242));
        txtCantTrabajadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtCantTrabajadores.setEnabled(false);
        jPanel1.add(txtCantTrabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, 90, 30));

        btnCancelar.setBackground(new java.awt.Color(64, 145, 242));
        btnCancelar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
        MenuSeleccionador ms = new MenuSeleccionador();
        ms.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnRegresarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void txtBuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad = (""+c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtBuscadorKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad = (""+c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        boolean c = false;
        
        if(txtBuscador.getText().isEmpty()){
            
            Advertenciamodificar am = new Advertenciamodificar();
            am.setVisible(true);
            
        } else {
            
            for (int i = 0; i < ControlProveedor.getListaProveedores().size(); i++) {
                
                String nombre = ControlProveedor.getListaProveedores().get(i).getNombre();

                String busqueda = txtBuscador.getText();
                
                if(busqueda.equals(nombre)){
                    
                    c = true;

                }
                
            }
            
            if(c == true){
                
                for (int i = 0; i < ControlProveedor.getListaProveedores().size(); i++) {
                
                String nombre = ControlProveedor.getListaProveedores().get(i).getNombre();
                String telefono = ControlProveedor.getListaProveedores().get(i).getTelefono();
                String movil = ControlProveedor.getListaProveedores().get(i).getMovil();
                String correo = ControlProveedor.getListaProveedores().get(i).getCorreo();
                String nit = ControlProveedor.getListaProveedores().get(i).getNit();
                String porcentaje = ControlProveedor.getListaProveedores().get(i).getPorcentaje();
                String cantTra = ControlProveedor.getListaProveedores().get(i).getCantTra();
                String servicio = ControlProveedor.getListaProveedores().get(i).getServicio();
                
                String busqueda = txtBuscador.getText();
                
                    if(busqueda.equals(nombre)){

                        txtNombre.setText(nombre);
                        txtTelefono.setText(telefono);
                        txtMovil.setText(movil);
                        txtCorreo.setText(correo);
                        txtNIT.setText(nit);
                        txtPorcentaje.setText(porcentaje);
                        txtCantTrabajadores.setText(cantTra);
                        txtServicio.setText(servicio);
                        
                        txtNombre.setEnabled(true);
                        txtTelefono.setEnabled(true);
                        txtMovil.setEnabled(true);
                        txtCorreo.setEnabled(true);
                        txtNIT.setEnabled(true);
                        txtPorcentaje.setEnabled(true);
                        txtCantTrabajadores.setEnabled(true);
                        txtServicio.setEnabled(true);

                        txtBuscador.setEnabled(false);
                        
                    }
                
                }
                
            } else {
                
                JOptionPane.showMessageDialog(null, "No se encontró el proveedor que desea modificar","Error",0);
                
            }
            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        String nombre = txtNombre.getText();
        String telefono = txtTelefono.getText();
        String movil = txtMovil.getText();
        String correo = txtCorreo.getText();
        String nit = txtNIT.getText();
        String porcentaje = txtPorcentaje.getText();
        String cantTra = txtCantTrabajadores.getText();
        String servicio = txtServicio.getText();
        
        if(txtNombre.getText().isEmpty()){
            
            BuscarModificar bm = new BuscarModificar();
            bm.setVisible(true);
            
        } else if (nombre.isEmpty()||telefono.isEmpty()||movil.isEmpty()||correo.isEmpty()||
                nit.isEmpty()||porcentaje.isEmpty()||cantTra.isEmpty()||servicio.isEmpty()){
            
            ErrorCompletar ec = new ErrorCompletar();
            ec.setVisible(true);
            
        } else {

            for (int i = 0; i < ControlProveedor.getListaProveedores().size(); i++) {

                String nombre1 = ControlProveedor.getListaProveedores().get(i).getNombre();

                if(txtBuscador.getText().equals(nombre1)){

                    ControlProveedor.getListaProveedores().get(i).setNombre(nombre);
                    ControlProveedor.getListaProveedores().get(i).setTelefono(telefono);
                    ControlProveedor.getListaProveedores().get(i).setMovil(movil);
                    ControlProveedor.getListaProveedores().get(i).setCorreo(correo);
                    ControlProveedor.getListaProveedores().get(i).setNit(nit);
                    ControlProveedor.getListaProveedores().get(i).setPorcentaje(porcentaje);
                    ControlProveedor.getListaProveedores().get(i).setCantTra(cantTra);
                    ControlProveedor.getListaProveedores().get(i).setServicio(servicio);

                    JOptionPane.showMessageDialog(null, "Proveedor modificado correctamente");

                    nuevo();
                    
                    txtNombre.setEnabled(false);
                    txtTelefono.setEnabled(false);
                    txtMovil.setEnabled(false);
                    txtCorreo.setEnabled(false);
                    txtNIT.setEnabled(false);
                    txtPorcentaje.setEnabled(false);
                    txtCantTrabajadores.setEnabled(false);
                    txtServicio.setEnabled(false);

                }

            }

        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtServicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtServicioKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad = (""+c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtServicioKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        txtNombre.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtMovil.setEnabled(false);
        txtCorreo.setEnabled(false);
        txtNIT.setEnabled(false);
        txtPorcentaje.setEnabled(false);
        txtCantTrabajadores.setEnabled(false);
        txtServicio.setEnabled(false);

        txtBuscador.setEnabled(true);

        nuevo();

    }//GEN-LAST:event_btnCancelarActionPerformed

    public void nuevo (){
        
        txtBuscador.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtMovil.setText("");
        txtCorreo.setText("");
        txtNIT.setText("");
        txtPorcentaje.setText("");
        txtCantTrabajadores.setText("");
        txtServicio.setText("");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelApellido1;
    private javax.swing.JLabel labelApellido2;
    private javax.swing.JLabel labelApellido3;
    private javax.swing.JLabel labelApellido4;
    private javax.swing.JLabel labelApellido5;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JTextField txtBuscador;
    private javax.swing.JTextField txtCantTrabajadores;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtMovil;
    private javax.swing.JTextField txtNIT;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPorcentaje;
    private javax.swing.JTextField txtServicio;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

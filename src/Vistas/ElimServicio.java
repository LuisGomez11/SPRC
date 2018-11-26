
package Vistas;

import Controladores.ControlAsignacion;
import Controladores.ControlServicio;
import Modelos.Asignacion;
import Modelos.Servicios;
import javax.swing.JOptionPane;

public class ElimServicio extends javax.swing.JFrame {
    
    public ElimServicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtBuscador = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/002-login-1.png"))); // NOI18N
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 50, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SPRC.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 145, 242));
        jLabel5.setText("Eliminar Servicio");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, 60));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(64, 145, 242));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("REFERENCIA DEL SERVICIO:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 190, 30));

        txtBuscador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBuscador.setForeground(new java.awt.Color(64, 145, 242));
        txtBuscador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        jPanel1.add(txtBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 350, 30));

        btnBuscar.setBackground(new java.awt.Color(64, 145, 242));
        btnBuscar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("ELIMINAR");
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        MenuAnalista se = new MenuAnalista();
        se.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        boolean c1 = false;
        boolean c3 = false;
        
        if (txtBuscador.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Ingrese la referencia del servicio que desea eliminar", "Error", 2);
            
        } else {
            
            for (Servicios servicio : ControlServicio.getListaServicios()) {
                
                String ref = servicio.getReferencia();
                
                if(txtBuscador.getText().equals(ref)){
                    
                    c1 = true;
                    
                }
                
            }

            for (Asignacion servicioAsi : ControlAsignacion.getListaSerAsignados()) {
                
                String ref = servicioAsi.getServicio().getReferencia();
                
                if(txtBuscador.getText().equals(ref)){
                    
                    c3 = true;
                    
                }
                
            }
            
            if(c1==true||c3==true){
                
                int o = JOptionPane.YES_NO_OPTION;
                int r = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar este servicio?", "Confirmacion", o);
                
                if(r==0){
                
                    int tam3 = ControlAsignacion.getListaSerAsignados().size();
                    for (int i = 0; i < tam3; i++) {
                        String ref = ControlAsignacion.getListaSerAsignados().get(i).getServicio().getReferencia();
                        if(txtBuscador.getText().equals(ref)){
                            ControlAsignacion.getListaSerAsignados().remove(i);       
                        }
                    }
                    int tam1 = ControlServicio.getListaServicios().size();
                    for (int i = 0; i < tam1; i++) {
                        String ref = ControlServicio.getListaServicios().get(i).getReferencia();
                        if(txtBuscador.getText().equals(ref)){
                            ControlServicio.getListaServicios().remove(i);
                        }
                    }

                    
                
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro ningun servicio con esa referencia","Error",0);
            }
            
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBuscador;
    // End of variables declaration//GEN-END:variables
}


package Vistas;

import Controladores.ControlProveedor;
import java.awt.Color;
import javax.swing.JTextField;


public class RegProveedor extends javax.swing.JFrame {

    ControlProveedor cp = new ControlProveedor();
    
    public RegProveedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        txtPorcentaje.setHorizontalAlignment(JTextField.CENTER);
        txtCantTrabajadores.setHorizontalAlignment(JTextField.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        labeCantTra = new javax.swing.JLabel();
        txtCantTrabajadores = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPorcentaje = new javax.swing.JTextField();
        txtMovil = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtNIT = new javax.swing.JTextField();
        txtServicio = new javax.swing.JTextField();
        labePorcentaje = new javax.swing.JLabel();
        labelMovil = new javax.swing.JLabel();
        labelNIT = new javax.swing.JLabel();
        labelServicio = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SPRC.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(64, 145, 242));
        jLabel6.setText("Proveedores");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, 60));

        labelCorreo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelCorreo.setForeground(new java.awt.Color(64, 145, 242));
        labelCorreo.setText("CORREO:");
        jPanel1.add(labelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, 30));

        labelNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(64, 145, 242));
        labelNombre.setText("NOMBRE:");
        jPanel1.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 30));

        labelTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTelefono.setForeground(new java.awt.Color(64, 145, 242));
        labelTelefono.setText("TELEFONO:");
        jPanel1.add(labelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, 30));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/002-login-1.png"))); // NOI18N
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 50, -1));

        labeCantTra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labeCantTra.setForeground(new java.awt.Color(64, 145, 242));
        labeCantTra.setText("TRABAJADORES:");
        jPanel1.add(labeCantTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, 30));

        txtCantTrabajadores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCantTrabajadores.setForeground(new java.awt.Color(64, 145, 242));
        txtCantTrabajadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtCantTrabajadores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantTrabajadoresKeyTyped(evt);
            }
        });
        jPanel1.add(txtCantTrabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 140, 30));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(64, 145, 242));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 200, 30));

        txtTelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(64, 145, 242));
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 200, 30));

        txtPorcentaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPorcentaje.setForeground(new java.awt.Color(64, 145, 242));
        txtPorcentaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtPorcentaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorcentajeKeyTyped(evt);
            }
        });
        jPanel1.add(txtPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 80, 30));

        txtMovil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMovil.setForeground(new java.awt.Color(64, 145, 242));
        txtMovil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtMovil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMovilKeyTyped(evt);
            }
        });
        jPanel1.add(txtMovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 200, 30));

        txtCorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(64, 145, 242));
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 200, 30));

        txtNIT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNIT.setForeground(new java.awt.Color(64, 145, 242));
        txtNIT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        jPanel1.add(txtNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 200, 30));

        txtServicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtServicio.setForeground(new java.awt.Color(64, 145, 242));
        txtServicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtServicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtServicioKeyTyped(evt);
            }
        });
        jPanel1.add(txtServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 160, 30));

        labePorcentaje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labePorcentaje.setForeground(new java.awt.Color(64, 145, 242));
        labePorcentaje.setText("PORCENTAJE:");
        jPanel1.add(labePorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, 30));

        labelMovil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelMovil.setForeground(new java.awt.Color(64, 145, 242));
        labelMovil.setText("MOVIL:");
        jPanel1.add(labelMovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, 30));

        labelNIT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelNIT.setForeground(new java.awt.Color(64, 145, 242));
        labelNIT.setText("NIT:");
        jPanel1.add(labelNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, 30));

        labelServicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelServicio.setForeground(new java.awt.Color(64, 145, 242));
        labelServicio.setText("SERVICIO:");
        jPanel1.add(labelServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, 30));

        btnCancelar.setBackground(new java.awt.Color(64, 145, 242));
        btnCancelar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnCancelarMouseMoved(evt);
            }
        });
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 130, 30));

        btnRegistrar.setBackground(new java.awt.Color(64, 145, 242));
        btnRegistrar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseMoved(evt);
            }
        });
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseExited(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 130, 30));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 520, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 145, 242));
        jLabel2.setText("%");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, -1, 30));

        jLabel7.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(64, 145, 242));
        jLabel7.setText("Registro de");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        MenuSeleccionador ms = new MenuSeleccionador();
        ms.setVisible(true);
        this.dispose();      
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        cp.Registrar(txtNombre, txtTelefono, txtMovil, txtCorreo, txtNIT, txtPorcentaje, txtCantTrabajadores, txtServicio);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRegistrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseMoved
        btnRegistrar.setBackground(new Color(142,193,255));
    }//GEN-LAST:event_btnRegistrarMouseMoved

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        btnRegistrar.setBackground(new Color(64,145,242));
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void btnCancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseMoved
        btnCancelar.setBackground(new Color(142,193,255));
    }//GEN-LAST:event_btnCancelarMouseMoved

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBackground(new Color(64,145,242));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        nuevo();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad = (""+c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtServicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtServicioKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad = (""+c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtServicioKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtMovilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMovilKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtMovilKeyTyped

    private void txtPorcentajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtPorcentajeKeyTyped

    private void txtCantTrabajadoresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantTrabajadoresKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtCantTrabajadoresKeyTyped


    public void nuevo (){
        
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labeCantTra;
    private javax.swing.JLabel labePorcentaje;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelMovil;
    private javax.swing.JLabel labelNIT;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelServicio;
    private javax.swing.JLabel labelTelefono;
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

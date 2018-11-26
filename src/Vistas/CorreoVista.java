
package Vistas;

import Controladores.ControlProveedor;
import java.awt.Color;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CorreoVista extends javax.swing.JFrame {

    public static String Username="";
    public static String contraseña="";
    String mensaje="";
    String To="";
    String asunto="";
    
    DefaultTableModel modelo =new DefaultTableModel();
    
    public void sendAll(){
        
        Properties pro = new Properties();
        pro.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        pro.put("mail.smtp.auth", "true");
        pro.put("mail.smtp.starttls.enable", "true");
        pro.put("mail.smtp.host", "smtp.gmail.com");
        pro.put("mail.smtp.port", "587");
        
        Session sesion = Session.getInstance(pro,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication(){
                        return new PasswordAuthentication(Username, contraseña);
                    }
        });
        
        try {
            
            Message message = new MimeMessage(sesion);
            message.setFrom(new InternetAddress(Username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(To));
            message.setSubject(asunto);
            message.setText(mensaje);
            
            Transport.send(message);
            
            JOptionPane.showMessageDialog(null, "Su mensaje ha sido enviado");
            
            
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    public CorreoVista() {
        initComponents();
        this.setLocationRelativeTo(null);
        cbProveedores.addItem("SELECCIONE...");
        for (int i = 0; i < ControlProveedor.getListaProveedores().size(); i++) {
            
            String nom = ControlProveedor.getListaProveedores().get(i).getNombre();
            
            cbProveedores.addItem(nom);
            
        }
        this.requestFocus(false);
        labelAdvertencia.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensaje = new javax.swing.JTextArea();
        txtAsunto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDestinatario = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        labelAdvertencia = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbProveedores = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/002-login-1.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setDefaultCapable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 50, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SPRC.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 145, 242));
        jLabel5.setText("Notificaciones");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, 40));

        jLabel6.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(64, 145, 242));
        jLabel6.setText("Area de");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMensaje.setColumns(20);
        txtMensaje.setRows(5);
        txtMensaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtMensaje.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMensajeFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(txtMensaje);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 400, 110));

        txtAsunto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtAsunto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAsuntoFocusGained(evt);
            }
        });
        jPanel2.add(txtAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 330, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 145, 242));
        jLabel1.setText("ASUNTO:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 145, 242));
        jLabel3.setText("DESTINO:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        txtDestinatario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        jPanel2.add(txtDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 330, 30));

        btnEnviar.setBackground(new java.awt.Color(255, 255, 255));
        btnEnviar.setFont(new java.awt.Font("Sitka Subheading", 1, 48)); // NOI18N
        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enviar-boton off.png"))); // NOI18N
        btnEnviar.setText("ENVIAR  ");
        btnEnviar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEnviar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEnviarMouseMoved(evt);
            }
        });
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnviarMouseExited(evt);
            }
        });
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 430, 50));

        labelAdvertencia.setText("Complete todos los campos!");
        jPanel2.add(labelAdvertencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 430, 320));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "BUSQUEDA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Vijaya", 0, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 145, 242));
        jLabel2.setText("PROVEEDORES:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 180, 30));

        cbProveedores.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbProveedores.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbProveedoresFocusGained(evt);
            }
        });
        cbProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProveedoresActionPerformed(evt);
            }
        });
        jPanel3.add(cbProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 170, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 200, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cbProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProveedoresActionPerformed
        try {
            
            
            
            int i = cbProveedores.getSelectedIndex();
            if(i==0){
                
                txtDestinatario.setText("");
                
            }else{
                
                for (int j = 0; j < ControlProveedor.getListaProveedores().size(); j++) {
                    
                    String nom = ControlProveedor.getListaProveedores().get(j).getNombre();

                    if(nom.equals(cbProveedores.getSelectedItem().toString())){
                        
                        txtDestinatario.setText(ControlProveedor.getListaProveedores().get(j).getCorreo());
                        
                    }
                    
                }
                
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cbProveedoresActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        mensaje = txtMensaje.getText();
        To = txtDestinatario.getText();
        asunto = txtAsunto.getText();
        
        if(To.isEmpty()){
            
            labelAdvertencia.setVisible(true);
            labelAdvertencia.setForeground(Color.RED);
            labelAdvertencia.setText("Seleccione un proveedor!");
            
        }else if(mensaje.isEmpty()||asunto.isEmpty()){
            
            labelAdvertencia.setVisible(true);
            labelAdvertencia.setForeground(Color.RED);
            labelAdvertencia.setText("Complete todos los campos!");
            
        }else{
        
            sendAll();
            
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnEnviarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseMoved
        btnEnviar.setForeground(Color.WHITE);
        btnEnviar.setBackground(new Color(64,145,242));
        btnEnviar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/enviar-boton on.png")));
    }//GEN-LAST:event_btnEnviarMouseMoved

    private void btnEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseExited
        btnEnviar.setForeground(Color.BLACK);
        btnEnviar.setBackground(Color.WHITE);
        btnEnviar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/enviar-boton off.png")));
    }//GEN-LAST:event_btnEnviarMouseExited

    private void txtAsuntoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAsuntoFocusGained
        labelAdvertencia.setVisible(false);
    }//GEN-LAST:event_txtAsuntoFocusGained

    private void txtMensajeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMensajeFocusGained
        labelAdvertencia.setVisible(false);
    }//GEN-LAST:event_txtMensajeFocusGained

    private void cbProveedoresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbProveedoresFocusGained

    }//GEN-LAST:event_cbProveedoresFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAdvertencia;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtDestinatario;
    private javax.swing.JTextArea txtMensaje;
    // End of variables declaration//GEN-END:variables
}

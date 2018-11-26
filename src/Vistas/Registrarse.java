
package Vistas;

import Controladores.ControlArchivos;
import Controladores.ControlUsuario;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Registrarse extends javax.swing.JFrame {

    String Username="luisgomez24g@gmail.com";
    String contraseña="20002906luis";
    String mensaje="";
    String To="";
    String asunto="";

    
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
            
            JOptionPane.showMessageDialog(null, "Se le a enviado un codigo de verificacion al correo:"+
                    "\n"+txtCorreo.getText()+gmail.getText());
            
            
            
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    ControlArchivos ca = new ControlArchivos();
    ControlUsuario cu = new ControlUsuario();
    
    public Registrarse() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.requestFocus(false);
        labelAdvertencia.setVisible(false);
        labelErrorCorreo.setVisible(false);
        panelVerificacion.setVisible(false);
        iconoCorrecto.setVisible(false);
        btnAceptar.setEnabled(false);
        
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtApellido = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        labelContraseña = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        labelTelefono = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        labelCorreo = new javax.swing.JLabel();
        labelErrorCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        gmail = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        panelVerificacion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        iconoCorrecto = new javax.swing.JLabel();
        txtCodVerificacion = new javax.swing.JTextField();
        labelAdvertencia = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SPRC.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATOS USUARIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtApellido.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoFocusLost(evt);
            }
        });
        txtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtApellidoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtApellidoMouseEntered(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel5.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 210, 30));

        labelNombre.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        labelNombre.setText("NOMBRE:");
        jPanel5.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 30));

        labelApellido.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        labelApellido.setText("APELLIDO:");
        jPanel5.add(labelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 30));

        txtUsuario.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel5.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 210, 30));

        labelContraseña.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        labelContraseña.setText("CONTRASEÑA:");
        jPanel5.add(labelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, 30));

        labelUsuario.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        labelUsuario.setText("USUARIO:");
        jPanel5.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, 30));

        txtContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusLost(evt);
            }
        });
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseClicked(evt);
            }
        });
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyPressed(evt);
            }
        });
        jPanel5.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 210, 30));

        labelTelefono.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        labelTelefono.setText("TELEFONO:");
        jPanel5.add(labelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));

        txtNombre.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel5.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 210, 30));

        labelCorreo.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        labelCorreo.setText("CORREO:");
        jPanel5.add(labelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, 30));

        labelErrorCorreo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel5.add(labelErrorCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        txtCorreo.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCorreoMouseClicked(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        jPanel5.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 120, 30));

        gmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gmail.setText("@gmail.com");
        jPanel5.add(gmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 80, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "CARGO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton1.setText("ANALISTA");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, -1));

        jRadioButton2.setText("SELECCIONADOR");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 260, 100));

        btnRegistrar.setBackground(new java.awt.Color(204, 204, 204));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/001-agregar-usuario.png"))); // NOI18N
        btnRegistrar.setText("  CONFIRMAR REGISTRO");
        btnRegistrar.setBorder(null);
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
        jPanel5.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 230, 40));

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/errorOFF.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
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
        jPanel5.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 230, 40));

        panelVerificacion.setBackground(new java.awt.Color(255, 255, 255));
        panelVerificacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        panelVerificacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("DIGITE CODIGO DE VERIFICACION");
        panelVerificacion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 30));

        btnAceptar.setBackground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        panelVerificacion.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 180, 30));

        iconoCorrecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marca-de-comprobacion-boton.png"))); // NOI18N
        panelVerificacion.add(iconoCorrecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 30, 30));

        txtCodVerificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCodVerificacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodVerificacionFocusGained(evt);
            }
        });
        txtCodVerificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodVerificacionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodVerificacionKeyTyped(evt);
            }
        });
        panelVerificacion.add(txtCodVerificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 190, 30));

        jPanel5.add(panelVerificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 710, 50));

        labelAdvertencia.setForeground(new java.awt.Color(0, 204, 0));
        jPanel5.add(labelAdvertencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 210, 20));

        txtTelefono.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTelefonoMouseClicked(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel5.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 210, 30));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setOpaque(true);
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 10, 250));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setOpaque(true);
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 10, 250));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 850, 360));

        jLabel5.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 145, 242));
        jLabel5.setText("Registrarse");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 870, 540));

        jPanel3.setBackground(new java.awt.Color(64, 145, 242));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/simbolo-de-quitar.png"))); // NOI18N
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, -1, 40));

        btnMinimizar.setFont(new java.awt.Font("Arial Narrow", 1, 48)); // NOI18N
        btnMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setText("-");
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        jPanel3.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 50, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 40));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-izquierda.png"))); // NOI18N
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 60, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Difuminado.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 990, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ca.guardarArchivos();
        Inicio in = new Inicio();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        cu.registrarse(txtNombre, txtApellido, txtUsuario, txtCorreo, txtContraseña, txtTelefono, panelVerificacion, labelAdvertencia, jRadioButton1, jRadioButton2);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        txtNombre.setBackground(Color.WHITE);
        labelAdvertencia.setVisible(false);
    }//GEN-LAST:event_txtNombreMouseClicked

    private void txtApellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMouseClicked
        txtApellido.setBackground(Color.WHITE);
        labelAdvertencia.setVisible(false);
    }//GEN-LAST:event_txtApellidoMouseClicked

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        txtUsuario.setBackground(Color.WHITE);
        labelAdvertencia.setVisible(false);
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseClicked
        txtContraseña.setBackground(Color.WHITE);
        labelAdvertencia.setVisible(false);
    }//GEN-LAST:event_txtContraseñaMouseClicked

    private void txtTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMouseClicked
        txtTelefono.setBackground(Color.WHITE);
        labelAdvertencia.setVisible(false);
    }//GEN-LAST:event_txtTelefonoMouseClicked

    private void btnRegistrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseMoved
        btnRegistrar.setForeground(Color.WHITE);
        btnRegistrar.setBackground(new Color(64,145,242));
    }//GEN-LAST:event_btnRegistrarMouseMoved

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        btnRegistrar.setForeground(Color.BLACK);
        btnRegistrar.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void txtApellidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMouseEntered

    }//GEN-LAST:event_txtApellidoMouseEntered

    private void txtApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusGained
        txtApellido.setBackground(Color.WHITE);
        labelAdvertencia.setVisible(false);
        txtApellido.setBorder(BorderFactory.createLineBorder(new Color(61,111,226)));
        labelApellido.setForeground(new Color(61,111,226));
    }//GEN-LAST:event_txtApellidoFocusGained

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        txtNombre.setBackground(Color.WHITE);
        txtNombre.setBorder(BorderFactory.createLineBorder(new Color(61,111,226)));
        labelNombre.setForeground(new Color(61,111,226));
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        txtUsuario.setBackground(Color.WHITE);
        labelAdvertencia.setVisible(false);
        txtUsuario.setBorder(BorderFactory.createLineBorder(new Color(61,111,226)));
        labelUsuario.setForeground(new Color(61,111,226));
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusGained
        txtContraseña.setBackground(Color.WHITE);
        labelAdvertencia.setVisible(false);
        txtContraseña.setBorder(BorderFactory.createLineBorder(new Color(61,111,226)));
        labelContraseña.setForeground(new Color(61,111,226));
    }//GEN-LAST:event_txtContraseñaFocusGained

    private void txtTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusGained
        txtTelefono.setBackground(Color.WHITE);
        labelAdvertencia.setVisible(false);
        txtTelefono.setBorder(BorderFactory.createLineBorder(new Color(61,111,226)));
        labelTelefono.setForeground(new Color(61,111,226));
    }//GEN-LAST:event_txtTelefonoFocusGained

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped

    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if ((c<'A' || c>'Z')&&(c<'a' || c>'z')&&(c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char c = evt.getKeyChar();
        if ((c<'A' || c>'Z')&&(c<'a' || c>'z')&&(c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        txtNombre.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
        labelNombre.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusLost
        txtApellido.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
        labelApellido.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtApellidoFocusLost

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            cu.registrarse(txtNombre, txtApellido, txtUsuario, txtCorreo, txtContraseña, txtTelefono, panelVerificacion, labelAdvertencia, jRadioButton1, jRadioButton2);
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            cu.registrarse(txtNombre, txtApellido, txtUsuario, txtCorreo, txtContraseña, txtTelefono, panelVerificacion, labelAdvertencia, jRadioButton1, jRadioButton2);
        }
    }//GEN-LAST:event_txtApellidoKeyPressed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            cu.registrarse(txtNombre, txtApellido, txtUsuario, txtCorreo, txtContraseña, txtTelefono, panelVerificacion, labelAdvertencia, jRadioButton1, jRadioButton2);
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            cu.registrarse(txtNombre, txtApellido, txtUsuario, txtCorreo, txtContraseña, txtTelefono, panelVerificacion, labelAdvertencia, jRadioButton1, jRadioButton2);
        }
    }//GEN-LAST:event_txtContraseñaKeyPressed

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            cu.registrarse(txtNombre, txtApellido, txtUsuario, txtCorreo, txtContraseña, txtTelefono, panelVerificacion, labelAdvertencia, jRadioButton1, jRadioButton2);
        }
    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        txtUsuario.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
        labelUsuario.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusLost
        txtContraseña.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
        labelContraseña.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtContraseñaFocusLost

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        txtTelefono.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
        labelTelefono.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        ca.guardarArchivos();
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusGained
        if(txtCorreo.getText().length()>0){
            
            labelAdvertencia.setVisible(false);
            txtCorreo.setBorder(BorderFactory.createLineBorder(new Color(61,111,226)));
            labelCorreo.setForeground(new Color(61,111,226));
            
        } else{
            
            txtCorreo.setBackground(Color.WHITE);
            labelAdvertencia.setVisible(false);
            txtCorreo.setBorder(BorderFactory.createLineBorder(new Color(61,111,226)));
            labelCorreo.setForeground(new Color(61,111,226));
        
        }
    }//GEN-LAST:event_txtCorreoFocusGained

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        txtCorreo.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
        labelCorreo.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtCorreoFocusLost

    private void txtCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMouseClicked

        labelAdvertencia.setVisible(false);
    }//GEN-LAST:event_txtCorreoMouseClicked

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            cu.registrarse(txtNombre, txtApellido, txtUsuario, txtCorreo, txtContraseña, txtTelefono, panelVerificacion, labelAdvertencia, jRadioButton1, jRadioButton2);
        }
    }//GEN-LAST:event_txtCorreoKeyPressed

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        
        if (txtCorreo.getText().contains("@")){
            
            txtCorreo.setBackground(new Color(255,204,204));
            labelErrorCorreo.setVisible(true);
            labelErrorCorreo.setForeground(Color.RED);
            labelErrorCorreo.setText("No puede contener '@'");
            
        } else{
            
            txtCorreo.setBackground(Color.WHITE);
            labelErrorCorreo.setVisible(false);
            
        }
        
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void txtCodVerificacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodVerificacionFocusGained
        
    }//GEN-LAST:event_txtCodVerificacionFocusGained

    private void txtCodVerificacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodVerificacionKeyReleased
        
         try {
            
            if(txtCodVerificacion.getText().equals("PAPA-JOSH")){
            
                iconoCorrecto.setVisible(true);
                txtCodVerificacion.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                btnAceptar.setEnabled(true);
            
            }else{
                  
                iconoCorrecto.setVisible(false);
                txtCodVerificacion.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                btnAceptar.setEnabled(false);
                
            }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_txtCodVerificacionKeyReleased

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        cu.ConfirmarRegistro(buttonGroup1, txtCodVerificacion, txtNombre, txtApellido, txtUsuario, txtCorreo, txtContraseña, txtTelefono, panelVerificacion, labelAdvertencia, jRadioButton1, jRadioButton2);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtCodVerificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodVerificacionKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad = (""+c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtCodVerificacionKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseMoved
        btnCancelar.setForeground(Color.WHITE);
        btnCancelar.setBackground(new Color(64,145,242));
        btnCancelar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/errorON.png")));
    }//GEN-LAST:event_btnCancelarMouseMoved

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setForeground(Color.BLACK);
        btnCancelar.setBackground(new Color(204,204,204));
        btnCancelar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/errorOFF.png")));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    public void limpiar(){
        
        txtApellido.setText("");
        txtNombre.setText("");
        txtContraseña.setText("");
        txtUsuario.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        buttonGroup1.clearSelection();
        
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel gmail;
    private javax.swing.JLabel iconoCorrecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel labelAdvertencia;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelErrorCorreo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelVerificacion;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodVerificacion;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}


package Vistas;

import Controladores.ControlArchivos;
import Controladores.ControlUsuario;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.Timer;

public class Login extends javax.swing.JFrame {

    public static String Nombre="";
    
    char cont;
    
    ControlArchivos ca = new ControlArchivos();

    ControlUsuario cu = new ControlUsuario();
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        
//        txtUsuario.requestFocus();
        
        cont = txtContraseña.getEchoChar();
        txtContraseña.setEchoChar ((char) 0); 
        txtContraseña.setForeground(Color.GRAY);
        txtContraseña.setText("Ingrese su contraseña"); 
        txtUsuario.setForeground(Color.GRAY);
        txtUsuario.setText("Ingrese su usuario");
        
        jPanel2.setVisible(false);

        labelCargo.setText(Nombre);
        
        //FECHA DEL SISTEMA
        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd MMMMM YYYY");
        labelFecha.setText(formato.format(sistFecha));

        //HORA DEL SISTEMA
        Timer tiempo = new Timer(100, new Login.horas());
        tiempo.start();
        
        panelLogin.setBackground(new Color(255,255,255, 200));
    }
    
    class horas implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Date sistHora = new Date();
            String pmAm = "hh:mm:ss a";
            SimpleDateFormat format = new SimpleDateFormat(pmAm);
            Calendar hoy = Calendar.getInstance();
            labelHora.setText(String.format(format.format(sistHora), hoy));

        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        btnAcceder = new javax.swing.JButton();
        labelCargo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelAdvertencia = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        labelFecha = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/001-silueta-de-usuario.png"))); // NOI18N
        panelLogin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/002-bloquear.png"))); // NOI18N
        panelLogin.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 40));

        txtUsuario.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        panelLogin.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 260, 40));

        txtContraseña.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusLost(evt);
            }
        });
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyReleased(evt);
            }
        });
        panelLogin.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 260, 40));

        btnAcceder.setBackground(new java.awt.Color(64, 145, 242));
        btnAcceder.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        btnAcceder.setForeground(new java.awt.Color(255, 255, 255));
        btnAcceder.setText("ACCEDER");
        btnAcceder.setBorder(null);
        btnAcceder.setBorderPainted(false);
        btnAcceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcceder.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAccederMouseMoved(evt);
            }
        });
        btnAcceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAccederMouseExited(evt);
            }
        });
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });
        panelLogin.add(btnAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 110, 30));

        labelCargo.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        labelCargo.setForeground(new java.awt.Color(64, 145, 242));
        labelCargo.setText("ANALISTA");
        panelLogin.add(labelCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(64, 145, 242));
        jLabel7.setText("LOGIN");
        panelLogin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jPanel1.add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 400, 450));

        btnVolver.setBackground(new java.awt.Color(204, 204, 204));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-izquierda.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnVolverMouseMoved(evt);
            }
        });
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 50, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAdvertencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAdvertencia.setForeground(new java.awt.Color(255, 0, 0));
        labelAdvertencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(labelAdvertencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, 400, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Difuminado.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1040, -1));

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
        jPanel3.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, -1, 40));

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
        jPanel3.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 50, 40));

        labelFecha.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(255, 255, 255));
        labelFecha.setText("Fecha");
        jPanel3.add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 20));

        labelHora.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        labelHora.setForeground(new java.awt.Color(255, 255, 255));
        labelHora.setText("Hora");
        jPanel3.add(labelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 170, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        
       ca.guardarArchivos();
       System.exit(0);
       
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Inicio in = new Inicio();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            this.requestFocus(false);
            cu.iniciarSecion(txtUsuario, txtContraseña, labelCargo, labelFecha, labelHora, labelAdvertencia, jPanel2);
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            this.requestFocus(false);
            cu.iniciarSecion(txtUsuario, txtContraseña, labelCargo, labelFecha, labelHora, labelAdvertencia, jPanel2);
        }
    }//GEN-LAST:event_txtContraseñaKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        txtUsuario.setBorder(BorderFactory.createLineBorder(new Color(61,111,226)));
        txtUsuario.setBackground(Color.WHITE);
        if(txtUsuario.getText().equals("Ingrese su usuario")){
            txtUsuario.setText(null);
        }
        txtUsuario.setForeground(Color.BLACK);
        jPanel2.setVisible(false);
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusGained
        txtContraseña.setBorder(BorderFactory.createLineBorder(new Color(61,111,226)));
        txtContraseña.setBackground(Color.WHITE);
        if(txtContraseña.getText().equals("Ingrese su contraseña")){
        txtContraseña.setText("");
        txtContraseña.setEchoChar(cont);
        }
        txtContraseña.setForeground(Color.BLACK);
        jPanel2.setVisible(false);
    }//GEN-LAST:event_txtContraseñaFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        txtUsuario.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
        if(txtUsuario.getText().isEmpty()){
            
            txtUsuario.setForeground(Color.GRAY);
            txtUsuario.setText("Ingrese su usuario");
            
        } else{
            txtUsuario.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusLost
        txtContraseña.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
        if(txtContraseña.getText().isEmpty()){
            txtContraseña.setEchoChar ((char) 0); 
            txtContraseña.setText("Ingrese su contraseña");
            txtContraseña.setForeground(Color.GRAY);
            
        } else{
            txtContraseña.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtContraseñaFocusLost

    private void btnVolverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseMoved

    }//GEN-LAST:event_btnVolverMouseMoved

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited

    }//GEN-LAST:event_btnVolverMouseExited

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
       cu.iniciarSecion(txtUsuario, txtContraseña, labelCargo, labelFecha, labelHora, labelAdvertencia, jPanel2);
    }//GEN-LAST:event_btnAccederActionPerformed

    private void btnAccederMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccederMouseMoved
        btnAcceder.setBackground(new Color(142,193,255));
    }//GEN-LAST:event_btnAccederMouseMoved

    private void btnAccederMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccederMouseExited
        btnAcceder.setBackground(new Color(64,145,242));
    }//GEN-LAST:event_btnAccederMouseExited

    private void txtContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyReleased

    }//GEN-LAST:event_txtContraseñaKeyReleased

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelAdvertencia;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelHora;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

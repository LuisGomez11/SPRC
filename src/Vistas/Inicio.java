
package Vistas;

import Controladores.ControlArchivos;
import java.awt.Color;

public class Inicio extends javax.swing.JFrame {

    ControlArchivos ca = new ControlArchivos();
    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel2.setBackground(new Color(64,145,242, 200));

        
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnAnalista = new javax.swing.JButton();
        btnSeleccionador = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1, 1));
        jPanel1.setPreferredSize(new java.awt.Dimension(1091, 630));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(64, 145, 242));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SOCIEDAD PORTUARIA REGIONAL DE CARTAGENA");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 930, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1090, 110));

        btnAnalista.setBackground(new java.awt.Color(255, 255, 255));
        btnAnalista.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnAnalista.setForeground(new java.awt.Color(25, 105, 245));
        btnAnalista.setText("ANALISTA");
        btnAnalista.setBorder(null);
        btnAnalista.setBorderPainted(false);
        btnAnalista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnalista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnalista.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAnalista.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAnalistaMouseMoved(evt);
            }
        });
        btnAnalista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAnalistaMouseExited(evt);
            }
        });
        btnAnalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalistaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnalista, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 350, 50));

        btnSeleccionador.setBackground(new java.awt.Color(255, 255, 255));
        btnSeleccionador.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnSeleccionador.setForeground(new java.awt.Color(25, 105, 245));
        btnSeleccionador.setText("SELECCIONADOR");
        btnSeleccionador.setBorder(null);
        btnSeleccionador.setBorderPainted(false);
        btnSeleccionador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeleccionador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeleccionador.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSeleccionador.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnSeleccionadorMouseMoved(evt);
            }
        });
        btnSeleccionador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSeleccionadorMouseExited(evt);
            }
        });
        btnSeleccionador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionadorActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionador, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 350, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/001-empresario.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/002-soporte-de-compras-en-linea.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        btnRegistrarse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("REGISTRARSE");
        btnRegistrarse.setBorderPainted(false);
        btnRegistrarse.setContentAreaFilled(false);
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 580, 120, 40));

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("CERRAR");
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 100, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 145, 242));
        jLabel5.setText("INICIO");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, -1, -1, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 240, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Difuminado.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        ca.guardarArchivos();
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        Registrarse reg = new Registrarse();
        reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnSeleccionadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionadorActionPerformed
        Login.Nombre = "SELECCIONADOR";
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSeleccionadorActionPerformed

    private void btnSeleccionadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeleccionadorMouseExited
        btnSeleccionador.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnSeleccionadorMouseExited

    private void btnSeleccionadorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeleccionadorMouseMoved
        btnSeleccionador.setBackground(new Color(210,235,252));
    }//GEN-LAST:event_btnSeleccionadorMouseMoved

    private void btnAnalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalistaActionPerformed

        Login.Nombre = "ANALISTA";
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAnalistaActionPerformed

    private void btnAnalistaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnalistaMouseExited
        btnAnalista.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnAnalistaMouseExited

    private void btnAnalistaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnalistaMouseMoved
        btnAnalista.setBackground(new Color(210,235,252));
    }//GEN-LAST:event_btnAnalistaMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalista;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnSeleccionador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}


package Vistas;

import Controladores.ControlArchivos;
import javax.swing.JOptionPane;


public class MenuAnalista extends javax.swing.JFrame {

    
    public static String Nombre;
    
    ControlArchivos ca = new ControlArchivos();
    
    
    public MenuAnalista() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        labelNomUsuario.setText(Nombre);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem13 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelNomUsuario = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        btnEliminar2 = new javax.swing.JButton();
        btnEliminar3 = new javax.swing.JButton();
        btnEliminar4 = new javax.swing.JButton();
        btnEliminar5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenuItem13.setText("jMenuItem13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(44, 136, 245));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empresario Menu.png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -1, -1, 140));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 140));

        jPanel3.setBackground(new java.awt.Color(64, 145, 242));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(64, 145, 242));
        jButton1.setText("SALIR");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 80, 30));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MENU ANALISTA");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 70));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 930, 70));

        jPanel2.setBackground(new java.awt.Color(64, 145, 242));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Menu del Analista");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 40));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bienvenido al");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 40));

        labelNomUsuario.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        labelNomUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelNomUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        labelNomUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelNomUsuarioMouseClicked(evt);
            }
        });
        jPanel2.add(labelNomUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 240, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 240, 430));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(44, 136, 245));
        btnEliminar.setText("SERVICIOS EN ESPERA");
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 250, 130));

        btnEliminar1.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar1.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        btnEliminar1.setForeground(new java.awt.Color(44, 136, 245));
        btnEliminar1.setText("INFORMES MENSUALES");
        btnEliminar1.setBorder(null);
        btnEliminar1.setBorderPainted(false);
        btnEliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 250, 130));

        btnEliminar2.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar2.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        btnEliminar2.setForeground(new java.awt.Color(44, 136, 245));
        btnEliminar2.setText("GENERAR SERVICIO");
        btnEliminar2.setBorder(null);
        btnEliminar2.setBorderPainted(false);
        btnEliminar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 250, 130));

        btnEliminar3.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar3.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        btnEliminar3.setForeground(new java.awt.Color(44, 136, 245));
        btnEliminar3.setText("ELIMINAR SERVICIO");
        btnEliminar3.setBorder(null);
        btnEliminar3.setBorderPainted(false);
        btnEliminar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 250, 130));

        btnEliminar4.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar4.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        btnEliminar4.setForeground(new java.awt.Color(44, 136, 245));
        btnEliminar4.setText("SERVICIOS REGISTRADOS");
        btnEliminar4.setBorder(null);
        btnEliminar4.setBorderPainted(false);
        btnEliminar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 250, 130));

        btnEliminar5.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar5.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        btnEliminar5.setForeground(new java.awt.Color(44, 136, 245));
        btnEliminar5.setText("MODIFICAR SERVICIO");
        btnEliminar5.setBorder(null);
        btnEliminar5.setBorderPainted(false);
        btnEliminar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 250, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Difuminado.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 630));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ca.guardarArchivos();
        Inicio in = new Inicio();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar2ActionPerformed
        RegServicio rs = new RegServicio();
        rs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEliminar2ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ServiciosEnEspera se = new ServiciosEnEspera();
        se.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar5ActionPerformed
        ModServicio ms = new ModServicio();
        ms.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEliminar5ActionPerformed

    private void btnEliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar3ActionPerformed
        ElimServicio es = new ElimServicio();
        es.setVisible(true);
        this.dispose();

//        JOptionPane.showMessageDialog(null, "Todavia estoy explotado aqui-", "Error", 2);
    }//GEN-LAST:event_btnEliminar3ActionPerformed

    private void btnEliminar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar4ActionPerformed
        ServiciosRegistrados sr = new ServiciosRegistrados();
        sr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEliminar4ActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        InformesMensuales im = new InformesMensuales();
        im.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void labelNomUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNomUsuarioMouseClicked
        InfoUsuario iu = new InfoUsuario();
        iu.setVisible(true);
    }//GEN-LAST:event_labelNomUsuarioMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnEliminar2;
    private javax.swing.JButton btnEliminar3;
    private javax.swing.JButton btnEliminar4;
    private javax.swing.JButton btnEliminar5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelNomUsuario;
    // End of variables declaration//GEN-END:variables
}

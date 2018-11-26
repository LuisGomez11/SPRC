
package Vistas;

import Controladores.ControlServicio;
import Modelos.Servicios;
import Tablas.EstiloTablaHeader;
import Tablas.EstiloTablaRenderer;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ServiciosEnEspera extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    
    public ServiciosEnEspera() {
        initComponents();
        this.setLocationRelativeTo(null);
        listarServicios();
        
        this.tabla.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.tabla.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        
        TableColumnModel columnModel = tabla.getColumnModel();
        
        columnModel.getColumn(0).setPreferredWidth(80);
        columnModel.getColumn(1).setPreferredWidth(170);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(70);
        columnModel.getColumn(4).setPreferredWidth(70);
        columnModel.getColumn(5).setPreferredWidth(110);
        columnModel.getColumn(6).setPreferredWidth(110);
        columnModel.getColumn(7).setPreferredWidth(100);
        columnModel.getColumn(8).setPreferredWidth(100);
        columnModel.getColumn(9).setPreferredWidth(60);
        columnModel.getColumn(10).setPreferredWidth(120);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelo.addColumn("TERMINAL");
        modelo.addColumn("MOTONAVE");
        modelo.addColumn("REFERENCIA");
        modelo.addColumn("MUELLE");
        modelo.addColumn("GRUA");
        modelo.addColumn("FECHA CITACION");
        modelo.addColumn("HORA CITACION");
        modelo.addColumn("FECHA FINAL");
        modelo.addColumn("HORA FINAL");
        modelo.addColumn("HRS. OP.");
        modelo.addColumn("SERVICIO");
        tabla = new JTable(){

            public boolean isCellEditable(int rowIndex, int colIndex) {

                return false; //Las celdas no son editables.

            }
        };
        btnAsignar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtConsultar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SPRC.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 50, 40));

        jLabel6.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(64, 145, 242));
        jLabel6.setText("Servicios");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, 40));

        jLabel5.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 145, 242));
        jLabel5.setText("en Espera");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, 60));

        tabla.setModel(modelo);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 1030, 250));

        btnAsignar.setBackground(new java.awt.Color(255, 255, 255));
        btnAsignar.setText("ABARCAR SERVICIO");
        btnAsignar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsignar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAsignarMouseMoved(evt);
            }
        });
        btnAsignar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAsignarMouseExited(evt);
            }
        });
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 500, 210, 40));

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR SELECCION");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseMoved(evt);
            }
        });
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 210, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 145, 242));
        jLabel2.setText("CONSULTAR:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 30));

        txtConsultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultarKeyTyped(evt);
            }
        });
        jPanel1.add(txtConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1066, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        MenuAnalista m = new MenuAnalista();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        try {
            
            int fs = tabla.getSelectedRow();
            
            if(fs>=0){
            
                AbarcarrServicio.ref=ControlServicio.getListaServicios().get(fs).getReferencia();
            
            } else {
                
                AbarcarrServicio.ref ="";
                
            }
            AbarcarrServicio as = new AbarcarrServicio();
            as.setVisible(true);
            this.dispose();

        } catch (HeadlessException e) {
        }
    }//GEN-LAST:event_btnAsignarActionPerformed

    private void btnAsignarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignarMouseMoved
        btnAsignar.setForeground(Color.WHITE);
        btnAsignar.setBackground(new Color(64,145,242));
    }//GEN-LAST:event_btnAsignarMouseMoved

    private void btnAsignarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignarMouseExited
        btnAsignar.setForeground(Color.BLACK);
        btnAsignar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnAsignarMouseExited

    private void btnLimpiarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseMoved
        btnLimpiar.setForeground(Color.WHITE);
        btnLimpiar.setBackground(new Color(64,145,242));
    }//GEN-LAST:event_btnLimpiarMouseMoved

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setForeground(Color.BLACK);
        btnLimpiar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        tabla.clearSelection();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtConsultarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarKeyReleased

        modelo.setNumRows(0);

        String datos[] = new String[11];

        for (Servicios servicio : ControlServicio.getListaServicios()) {

            if (servicio.empiezaPor(txtConsultar.getText())||servicio.empiezaPor2(txtConsultar.getText())){

                datos[0] = servicio.getTerminal();
                datos[1] = servicio.getMotonave();
                datos[2] = servicio.getLloydEscala()+"//"+servicio.getUVI()+"-"+servicio.getReferencia();
                datos[3] = servicio.getMuelle();
                datos[4] = servicio.getGrua();
                datos[5] = servicio.getFechacitacion();
                datos[6] = servicio.getHoracitacion();
                datos[7] = servicio.getFechafinal();
                datos[8] = servicio.getHorafinal();
                datos[9] = servicio.getHorasOperacion();
                datos[10] = servicio.getServicio();

                modelo.addRow(datos);

            }

        }

        if (txtConsultar.getText().isEmpty()){

            for (Servicios servicio : ControlServicio.getListaServicios()) {
        
            datos[0] = servicio.getTerminal();
            datos[1] = servicio.getMotonave();
            datos[2] = servicio.getLloydEscala()+"//"+servicio.getUVI()+"-"+servicio.getReferencia();
            datos[3] = servicio.getMuelle();
            datos[4] = servicio.getGrua();
            datos[5] = servicio.getFechacitacion();
            datos[6] = servicio.getHoracitacion();
            datos[7] = servicio.getFechafinal();
            datos[8] = servicio.getHorafinal();
            datos[9] = servicio.getHorasOperacion();
            datos[10] = servicio.getServicio();
            
            modelo.addRow(datos);
            
        }

        }

    }//GEN-LAST:event_txtConsultarKeyReleased

    private void txtConsultarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad = (""+c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtConsultarKeyTyped

    public final void listarServicios(){
        
        modelo.setNumRows(0);
        
        String datos[] = new String[11];
        
        for (Servicios servicio : ControlServicio.getListaServicios()) {
        
            datos[0] = servicio.getTerminal();
            datos[1] = servicio.getMotonave();
            datos[2] = servicio.getLloydEscala()+"//"+servicio.getUVI()+"-"+servicio.getReferencia();
            datos[3] = servicio.getMuelle();
            datos[4] = servicio.getGrua();
            datos[5] = servicio.getFechacitacion();
            datos[6] = servicio.getHoracitacion();
            datos[7] = servicio.getFechafinal();
            datos[8] = servicio.getHorafinal();
            datos[9] = servicio.getHorasOperacion();
            datos[10] = servicio.getServicio();
            
            modelo.addRow(datos);
            
        }
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtConsultar;
    // End of variables declaration//GEN-END:variables
}

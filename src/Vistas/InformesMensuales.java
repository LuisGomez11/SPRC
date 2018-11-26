
package Vistas;

import Controladores.ControlAsignacion;
import Modelos.Asignacion;
import Tablas.EstiloTablaHeader;
import Tablas.EstiloTablaRenderer;
import javax.swing.table.DefaultTableModel;

public class InformesMensuales extends javax.swing.JFrame {

    DefaultTableModel modeloEnero = new DefaultTableModel();
    DefaultTableModel modeloFebre = new DefaultTableModel();
    DefaultTableModel modeloMarzo = new DefaultTableModel();
    DefaultTableModel modeloAbril = new DefaultTableModel();
    DefaultTableModel modeloMayo = new DefaultTableModel();
    DefaultTableModel modeloJunio = new DefaultTableModel();
    DefaultTableModel modeloJulio = new DefaultTableModel();
    DefaultTableModel modeloAgosto = new DefaultTableModel();
    DefaultTableModel modeloSept = new DefaultTableModel();
    DefaultTableModel modeloOct = new DefaultTableModel();
    DefaultTableModel modeloNov = new DefaultTableModel();
    DefaultTableModel modeloDic = new DefaultTableModel();
    
    public InformesMensuales() {
        initComponents();
        this.setLocationRelativeTo(null);
        listarOctubre();
        
        this.jTable1.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.jTable1.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        this.jTable2.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.jTable2.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        this.jTable3.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.jTable3.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        this.jTable4.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.jTable4.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        this.jTable5.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.jTable5.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        this.jTable6.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.jTable6.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        this.jTable7.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.jTable7.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        this.jTable8.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.jTable8.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        this.jTable9.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.jTable9.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        this.jTable10.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.jTable10.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        this.jTable11.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.jTable11.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        this.jTable12.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.jTable12.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        modeloEnero.addColumn("TERMINAL");
        modeloEnero.addColumn("MOTONAVE");
        modeloEnero.addColumn("REFERENCIA");
        modeloEnero.addColumn("MUELLE");
        modeloEnero.addColumn("GRUA");
        modeloEnero.addColumn("F.CITACION");
        modeloEnero.addColumn("H.CITACION");
        modeloEnero.addColumn("F.FINAL");
        modeloEnero.addColumn("H.FINAL");
        modeloEnero.addColumn("H.O.");
        modeloEnero.addColumn("SERVICIO");
        modeloEnero.addColumn("PROVEEDOR");
        modeloEnero.addColumn("CANT.");
        modeloEnero.addColumn("PORCENTAJE");
        modeloEnero.addColumn("HRS.TOT.");
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        modeloFebre.addColumn("TERMINAL");
        modeloFebre.addColumn("MOTONAVE");
        modeloFebre.addColumn("REFERENCIA");
        modeloFebre.addColumn("MUELLE");
        modeloFebre.addColumn("GRUA");
        modeloFebre.addColumn("F.CITACION");
        modeloFebre.addColumn("H.CITACION");
        modeloFebre.addColumn("F.FINAL");
        modeloFebre.addColumn("H.FINAL");
        modeloFebre.addColumn("H.O.");
        modeloFebre.addColumn("SERVICIO");
        modeloFebre.addColumn("PROVEEDOR");
        modeloFebre.addColumn("CANT.");
        modeloFebre.addColumn("PORCENTAJE");
        modeloFebre.addColumn("HRS.TOT.");
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        modeloMarzo.addColumn("TERMINAL");
        modeloMarzo.addColumn("MOTONAVE");
        modeloMarzo.addColumn("REFERENCIA");
        modeloMarzo.addColumn("MUELLE");
        modeloMarzo.addColumn("GRUA");
        modeloMarzo.addColumn("F.CITACION");
        modeloMarzo.addColumn("H.CITACION");
        modeloMarzo.addColumn("F.FINAL");
        modeloMarzo.addColumn("H.FINAL");
        modeloMarzo.addColumn("H.O.");
        modeloMarzo.addColumn("SERVICIO");
        modeloMarzo.addColumn("PROVEEDOR");
        modeloMarzo.addColumn("CANT.");
        modeloMarzo.addColumn("PORCENTAJE");
        modeloMarzo.addColumn("HRS.TOT.");
        jTable3 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        modeloAbril.addColumn("TERMINAL");
        modeloAbril.addColumn("MOTONAVE");
        modeloAbril.addColumn("REFERENCIA");
        modeloAbril.addColumn("MUELLE");
        modeloAbril.addColumn("GRUA");
        modeloAbril.addColumn("F.CITACION");
        modeloAbril.addColumn("H.CITACION");
        modeloAbril.addColumn("F.FINAL");
        modeloAbril.addColumn("H.FINAL");
        modeloAbril.addColumn("H.O.");
        modeloAbril.addColumn("SERVICIO");
        modeloAbril.addColumn("PROVEEDOR");
        modeloAbril.addColumn("CANT.");
        modeloAbril.addColumn("PORCENTAJE");
        modeloAbril.addColumn("HRS.TOT.");
        jTable4 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        modeloMayo.addColumn("TERMINAL");
        modeloMayo.addColumn("MOTONAVE");
        modeloMayo.addColumn("REFERENCIA");
        modeloMayo.addColumn("MUELLE");
        modeloMayo.addColumn("GRUA");
        modeloMayo.addColumn("F.CITACION");
        modeloMayo.addColumn("H.CITACION");
        modeloMayo.addColumn("F.FINAL");
        modeloMayo.addColumn("H.FINAL");
        modeloMayo.addColumn("H.O.");
        modeloMayo.addColumn("SERVICIO");
        modeloMayo.addColumn("PROVEEDOR");
        modeloMayo.addColumn("CANT.");
        modeloMayo.addColumn("PORCENTAJE");
        modeloMayo.addColumn("HRS.TOT.");
        jTable5 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        modeloJunio.addColumn("TERMINAL");
        modeloJunio.addColumn("MOTONAVE");
        modeloJunio.addColumn("REFERENCIA");
        modeloJunio.addColumn("MUELLE");
        modeloJunio.addColumn("GRUA");
        modeloJunio.addColumn("F.CITACION");
        modeloJunio.addColumn("H.CITACION");
        modeloJunio.addColumn("F.FINAL");
        modeloJunio.addColumn("H.FINAL");
        modeloJunio.addColumn("H.O.");
        modeloJunio.addColumn("SERVICIO");
        modeloJunio.addColumn("PROVEEDOR");
        modeloJunio.addColumn("CANT.");
        modeloJunio.addColumn("PORCENTAJE");
        modeloJunio.addColumn("HRS.TOT.");
        jTable6 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        modeloJulio.addColumn("TERMINAL");
        modeloJulio.addColumn("MOTONAVE");
        modeloJulio.addColumn("REFERENCIA");
        modeloJulio.addColumn("MUELLE");
        modeloJulio.addColumn("GRUA");
        modeloJulio.addColumn("F.CITACION");
        modeloJulio.addColumn("H.CITACION");
        modeloJulio.addColumn("F.FINAL");
        modeloJulio.addColumn("H.FINAL");
        modeloJulio.addColumn("H.O.");
        modeloJulio.addColumn("SERVICIO");
        modeloJulio.addColumn("PROVEEDOR");
        modeloJulio.addColumn("CANT.");
        modeloJulio.addColumn("PORCENTAJE");
        modeloJulio.addColumn("HRS.TOT.");
        jTable7 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        modeloAgosto.addColumn("TERMINAL");
        modeloAgosto.addColumn("MOTONAVE");
        modeloAgosto.addColumn("REFERENCIA");
        modeloAgosto.addColumn("MUELLE");
        modeloAgosto.addColumn("GRUA");
        modeloAgosto.addColumn("F.CITACION");
        modeloAgosto.addColumn("H.CITACION");
        modeloAgosto.addColumn("F.FINAL");
        modeloAgosto.addColumn("H.FINAL");
        modeloAgosto.addColumn("H.O.");
        modeloAgosto.addColumn("SERVICIO");
        modeloAgosto.addColumn("PROVEEDOR");
        modeloAgosto.addColumn("CANT.");
        modeloAgosto.addColumn("PORCENTAJE");
        modeloAgosto.addColumn("HRS.TOT.");
        jTable8 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        modeloSept.addColumn("TERMINAL");
        modeloSept.addColumn("MOTONAVE");
        modeloSept.addColumn("REFERENCIA");
        modeloSept.addColumn("MUELLE");
        modeloSept.addColumn("GRUA");
        modeloSept.addColumn("F.CITACION");
        modeloSept.addColumn("H.CITACION");
        modeloSept.addColumn("F.FINAL");
        modeloSept.addColumn("H.FINAL");
        modeloSept.addColumn("H.O.");
        modeloSept.addColumn("SERVICIO");
        modeloSept.addColumn("PROVEEDOR");
        modeloSept.addColumn("CANT.");
        modeloSept.addColumn("PORCENTAJE");
        modeloSept.addColumn("HRS.TOT.");
        jTable9 = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        modeloOct.addColumn("TERMINAL");
        modeloOct.addColumn("MOTONAVE");
        modeloOct.addColumn("REFERENCIA");
        modeloOct.addColumn("MUELLE");
        modeloOct.addColumn("GRUA");
        modeloOct.addColumn("F.CITACION");
        modeloOct.addColumn("H.CITACION");
        modeloOct.addColumn("F.FINAL");
        modeloOct.addColumn("H.FINAL");
        modeloOct.addColumn("H.O.");
        modeloOct.addColumn("SERVICIO");
        modeloOct.addColumn("PROVEEDOR");
        modeloOct.addColumn("CANT.");
        modeloOct.addColumn("PORCENTAJE");
        modeloOct.addColumn("HRS.TOT.");
        jTable10 = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        modeloNov.addColumn("TERMINAL");
        modeloNov.addColumn("MOTONAVE");
        modeloNov.addColumn("REFERENCIA");
        modeloNov.addColumn("MUELLE");
        modeloNov.addColumn("GRUA");
        modeloNov.addColumn("F.CITACION");
        modeloNov.addColumn("H.CITACION");
        modeloNov.addColumn("F.FINAL");
        modeloNov.addColumn("H.FINAL");
        modeloNov.addColumn("H.O.");
        modeloNov.addColumn("SERVICIO");
        modeloNov.addColumn("PROVEEDOR");
        modeloNov.addColumn("CANT.");
        modeloNov.addColumn("PORCENTAJE");
        modeloNov.addColumn("HRS.TOT.");
        jTable11 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        modeloDic.addColumn("TERMINAL");
        modeloDic.addColumn("MOTONAVE");
        modeloDic.addColumn("REFERENCIA");
        modeloDic.addColumn("MUELLE");
        modeloDic.addColumn("GRUA");
        modeloDic.addColumn("F.CITACION");
        modeloDic.addColumn("H.CITACION");
        modeloDic.addColumn("F.FINAL");
        modeloDic.addColumn("H.FINAL");
        modeloDic.addColumn("H.O.");
        modeloDic.addColumn("SERVICIO");
        modeloDic.addColumn("PROVEEDOR");
        modeloDic.addColumn("CANT.");
        modeloDic.addColumn("PORCENTAJE");
        modeloDic.addColumn("HRS.TOT.");
        jTable12 = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SPRC.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(64, 145, 242));
        jLabel6.setText("Informes Mensuales");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, 60));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(modeloEnero);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, 1240, 370));

        jTabbedPane1.addTab("Enero", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(modeloFebre);
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, 1240, 370));

        jTabbedPane1.addTab("Febrero", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(modeloMarzo);
        jScrollPane3.setViewportView(jTable3);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, 1240, 370));

        jTabbedPane1.addTab("Marzo", jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setModel(modeloAbril);
        jScrollPane4.setViewportView(jTable4);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, 1240, 370));

        jTabbedPane1.addTab("Abril", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable5.setModel(modeloMayo);
        jScrollPane5.setViewportView(jTable5);

        jPanel7.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, 1240, 370));

        jTabbedPane1.addTab("Mayo", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable6.setModel(modeloJunio);
        jScrollPane6.setViewportView(jTable6);

        jPanel8.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, 1240, 370));

        jTabbedPane1.addTab("Junio", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable7.setModel(modeloJulio);
        jScrollPane7.setViewportView(jTable7);

        jPanel9.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, 1240, 370));

        jTabbedPane1.addTab("Julio", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable8.setModel(modeloAgosto);
        jScrollPane8.setViewportView(jTable8);

        jPanel10.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, 1240, 370));

        jTabbedPane1.addTab("Agosto", jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable9.setModel(modeloSept);
        jScrollPane9.setViewportView(jTable9);

        jPanel11.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, 1240, 370));

        jTabbedPane1.addTab("Septiembre", jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable10.setModel(modeloOct);
        jScrollPane10.setViewportView(jTable10);

        jPanel12.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, 1240, 370));

        jTabbedPane1.addTab("Octubre", jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable11.setModel(modeloNov);
        jScrollPane11.setViewportView(jTable11);

        jPanel13.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, 1240, 370));

        jTabbedPane1.addTab("Noviembre", jPanel13);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable12.setModel(modeloDic);
        jScrollPane12.setViewportView(jTable12);

        jPanel5.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, 1240, 370));

        jTabbedPane1.addTab("Diciembre", jPanel5);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 1270, 430));

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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1302, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        MenuAnalista m = new MenuAnalista();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    public final void listarOctubre(){
        
        modeloOct.setNumRows(0);
        
        String datos[] = new String[15];
        
        for (Asignacion servicio : ControlAsignacion.getListaSerAsignados()) {

            datos[0] = servicio.getServicio().getTerminal();
            datos[1] = servicio.getServicio().getMotonave();
            datos[2] = servicio.getServicio().getLloydEscala()+"//"+servicio.getServicio().getUVI()+"-"+servicio.getServicio().getReferencia();
            datos[3] = servicio.getServicio().getMuelle();
            datos[4] = servicio.getServicio().getGrua();
            datos[5] = servicio.getServicio().getFechacitacion();
            datos[6] = servicio.getServicio().getHoracitacion();
            datos[7] = servicio.getServicio().getFechafinal();
            datos[8] = servicio.getServicio().getHorafinal();
            datos[9] = servicio.getServicio().getHorasOperacion();
            datos[10] = servicio.getServicio().getServicio();
            datos[11] =servicio.getProveedor();
            datos[12] =servicio.getCantidad(); 
            datos[13] =servicio.getPorcentaje();
            datos[14] =Integer.parseInt(servicio.getServicio().getHorasOperacion())*Integer.parseInt(servicio.getCantidad())+""; 
            
            String fecha = servicio.getServicio().getFechacitacion();
            String[] partes = fecha.split("/");
            String dia = partes[0]; 
            String mes = partes[1]; 
            String año = partes[2]; 
            
            switch (mes) {
                case "01":
                    modeloEnero.addRow(datos);
                    break;
                case "02":
                    modeloFebre.addRow(datos);
                    break;
                case "03":
                    modeloMarzo.addRow(datos);
                    break;
                case "04":
                    modeloAbril.addRow(datos);
                    break;
                case "05":
                    modeloMayo.addRow(datos);
                    break;
                case "06":
                    modeloJunio.addRow(datos);
                    break;
                case "07":
                    modeloJulio.addRow(datos);
                    break;
                case "08":
                    modeloAgosto.addRow(datos);
                    break;
                case "09":
                    modeloSept.addRow(datos);
                    break;
                case "10":
                    modeloOct.addRow(datos);
                    break;
                case "11":
                    modeloNov.addRow(datos);
                    break;
                case "12":
                    modeloDic.addRow(datos);
                    break;
                default:
                    break;
            }
            
            
            
            
        }
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    // End of variables declaration//GEN-END:variables
}

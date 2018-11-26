
package Vistas;

import Controladores.ControlAsignacion;
import Modelos.Asignacion;
import Tablas.EstiloTablaHeader;
import Tablas.EstiloTablaRenderer;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ServiciosRegistrados extends javax.swing.JFrame {
    
    DefaultTableModel modeloConductores = new DefaultTableModel();
    DefaultTableModel modeloEstibaMar = new DefaultTableModel();
    
    
    public ServiciosRegistrados() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.tablaConductores.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.tablaConductores.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        this.tablaEstibaMar.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.tablaEstibaMar.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        listarServiciosEM();
        listarServiciosC();
        
        TableColumnModel columnModel = tablaConductores.getColumnModel();
        
        columnModel.getColumn(0).setPreferredWidth(90);
        columnModel.getColumn(1).setPreferredWidth(190);
        columnModel.getColumn(2).setPreferredWidth(120);
        columnModel.getColumn(3).setPreferredWidth(80);
        columnModel.getColumn(4).setPreferredWidth(80);
        columnModel.getColumn(5).setPreferredWidth(100);
        columnModel.getColumn(6).setPreferredWidth(100);
        columnModel.getColumn(7).setPreferredWidth(100);
        columnModel.getColumn(8).setPreferredWidth(100);
        columnModel.getColumn(9).setPreferredWidth(60);
        columnModel.getColumn(10).setPreferredWidth(120);
        columnModel.getColumn(11).setPreferredWidth(100);
        columnModel.getColumn(12).setPreferredWidth(75);
        columnModel.getColumn(13).setPreferredWidth(105);
        columnModel.getColumn(14).setPreferredWidth(80);
        
        TableColumnModel columnModel1 = tablaEstibaMar.getColumnModel();
        
        columnModel1.getColumn(0).setPreferredWidth(90);
        columnModel1.getColumn(1).setPreferredWidth(190);
        columnModel1.getColumn(2).setPreferredWidth(120);
        columnModel1.getColumn(3).setPreferredWidth(80);
        columnModel1.getColumn(4).setPreferredWidth(80);
        columnModel1.getColumn(5).setPreferredWidth(100);
        columnModel1.getColumn(6).setPreferredWidth(100);
        columnModel1.getColumn(7).setPreferredWidth(100);
        columnModel1.getColumn(8).setPreferredWidth(100);
        columnModel1.getColumn(9).setPreferredWidth(60);
        columnModel1.getColumn(10).setPreferredWidth(120);
        columnModel1.getColumn(11).setPreferredWidth(100);
        columnModel1.getColumn(12).setPreferredWidth(75);
        columnModel1.getColumn(13).setPreferredWidth(105);
        columnModel1.getColumn(14).setPreferredWidth(80);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        modeloEstibaMar.addColumn("TERMINAL");
        modeloEstibaMar.addColumn("MOTONAVE");
        modeloEstibaMar.addColumn("REFERENCIA");
        modeloEstibaMar.addColumn("MUELLE");
        modeloEstibaMar.addColumn("GRUA");
        modeloEstibaMar.addColumn("F.CITACION");
        modeloEstibaMar.addColumn("H.CITACION");
        modeloEstibaMar.addColumn("F.FINAL");
        modeloEstibaMar.addColumn("H.FINAL");
        modeloEstibaMar.addColumn("H.O.");
        modeloEstibaMar.addColumn("SERVICIO");
        modeloEstibaMar.addColumn("PROVEEDOR");
        modeloEstibaMar.addColumn("CANT.");
        modeloEstibaMar.addColumn("PORCENTAJE");
        modeloEstibaMar.addColumn("HRS.TOT.");
        tablaEstibaMar = new JTable(){

            public boolean isCellEditable(int rowIndex, int colIndex) {

                return false; //Las celdas no son editables.

            }
        };
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        modeloConductores.addColumn("TERMINAL");
        modeloConductores.addColumn("MOTONAVE");
        modeloConductores.addColumn("REFERENCIA");
        modeloConductores.addColumn("MUELLE");
        modeloConductores.addColumn("GRUA");
        modeloConductores.addColumn("F.CITACION");
        modeloConductores.addColumn("H.CITACION");
        modeloConductores.addColumn("F.FINAL");
        modeloConductores.addColumn("H.FINAL");
        modeloConductores.addColumn("H.O.");
        modeloConductores.addColumn("SERVICIO");
        modeloConductores.addColumn("PROVEEDOR");
        modeloConductores.addColumn("CANT.");
        modeloConductores.addColumn("PORCENTAJE");
        modeloConductores.addColumn("HRS.TOT.");
        tablaConductores = new JTable(){

            public boolean isCellEditable(int rowIndex, int colIndex) {

                return false; //Las celdas no son editables.

            }
        };

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

        jLabel6.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(64, 145, 242));
        jLabel6.setText("Simulacion de Servicios");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, 60));

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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, 50, 40));

        jTabbedPane1.setBackground(new java.awt.Color(220, 251, 255));
        jTabbedPane1.setForeground(new java.awt.Color(64, 145, 242));
        jTabbedPane1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaEstibaMar.setModel(modeloEstibaMar);
        tablaEstibaMar.setEnabled(false);
        tablaEstibaMar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tablaEstibaMar);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1310, 430));

        jTabbedPane1.addTab("SIMULADOR ESTIBA MARITIMA", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaConductores.setModel(modeloConductores);
        tablaConductores.setEnabled(false);
        tablaConductores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaConductores);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1310, 430));

        jTabbedPane1.addTab("SIMULADOR CONDUCTORES", jPanel2);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 1330, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1349, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        MenuAnalista m = new MenuAnalista();
        m.setVisible(true);
        this.dispose();

        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    public final void listarServiciosEM(){
        
        modeloEstibaMar.setNumRows(0);
        
        String datos[] = new String[15];
        
        for (Asignacion servicio : ControlAsignacion.getListaSerAsignados()) {
        
            if(servicio.getServicio().getServicio().equals("ESTIBA MARITIMA")||
                servicio.getServicio().getServicio().equals("APOYO REEFER")||
                servicio.getServicio().getServicio().equals("CAPATAZ")){
            
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
                datos[11] = servicio.getProveedor();
                datos[12] = servicio.getCantidad(); 
                datos[13] = servicio.getPorcentaje() +"%"; 
                datos[14] = ""+(Integer.parseInt(servicio.getCantidad()) * Integer.parseInt(servicio.getServicio().getHorasOperacion()));

                modeloEstibaMar.addRow(datos);
            
            }
            
        }
        
        
    }

    public final void listarServiciosC(){
        
        modeloConductores.setNumRows(0);
        
        String datos[] = new String[15];
        
        for (Asignacion servicio : ControlAsignacion.getListaSerAsignados()) {
        
            if(servicio.getServicio().getServicio().equals("CONDUCTOR")||
                servicio.getServicio().getServicio().equals("OPERADOR RD")){
            
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
                datos[11] = servicio.getProveedor();
                datos[12] = servicio.getCantidad(); 
                datos[13] = servicio.getPorcentaje() +"%"; 
                datos[14] = ""+(Integer.parseInt(servicio.getCantidad()) * Integer.parseInt(servicio.getServicio().getHorasOperacion()));

                modeloConductores.addRow(datos);
            
            }
            
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaConductores;
    private javax.swing.JTable tablaEstibaMar;
    // End of variables declaration//GEN-END:variables
}

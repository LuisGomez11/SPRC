
package Vistas;

import Controladores.ControlProveedor;
import Modelos.Proveedores;
import Tablas.EstiloTablaHeader;
import Tablas.EstiloTablaRenderer;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ConProveedor extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    
    public ConProveedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        listarProveedores();
        
        this.tablaProveedores.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.tablaProveedores.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        
        TableColumnModel columnModel = tablaProveedores.getColumnModel();
        
        columnModel.getColumn(0).setPreferredWidth(80);
        columnModel.getColumn(1).setPreferredWidth(60);
        columnModel.getColumn(2).setPreferredWidth(80);
        columnModel.getColumn(3).setPreferredWidth(140);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(90);
        columnModel.getColumn(6).setPreferredWidth(130);
        columnModel.getColumn(7).setPreferredWidth(90);
        
//        int nc = tablaProveedores.getColumnCount();
//        
//        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
//        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
//        
//        for (int i = 0; i < nc; i++) {
//            tablaProveedores.getColumnModel().getColumn(i).setCellRenderer(modelocentrar);
//        }
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelo.addColumn("Nombre");
        modelo.addColumn("Telefono");
        modelo.addColumn("Movil");
        modelo.addColumn("Correo");
        modelo.addColumn("NIT");
        modelo.addColumn("Porcentaje");
        modelo.addColumn("Cant.Tra.Disp.");
        modelo.addColumn("Servicio");
        tablaProveedores = new JTable(){

            public boolean isCellEditable(int rowIndex, int colIndex) {

                return false; //Las celdas no son editables.

            }
        };
        jLabel2 = new javax.swing.JLabel();
        txtConsultar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SPRC.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 145, 242));
        jLabel5.setText("Lista de Proveedores");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, 60));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/002-login-1.png"))); // NOI18N
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 50, -1));

        tablaProveedores.setModel(modelo);
        tablaProveedores.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaProveedores);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 1000, 330));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 145, 242));
        jLabel2.setText("CONSULTAR:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 30));

        txtConsultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultarKeyReleased(evt);
            }
        });
        jPanel1.add(txtConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        MenuSeleccionador ms = new MenuSeleccionador();
        ms.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtConsultarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarKeyReleased
        
        modelo.setNumRows(0);
        
        String datos[] = new String[8];
        
        for (Proveedores proveedor : ControlProveedor.getListaProveedores()) {
            
            if (proveedor.empiezaPor(txtConsultar.getText())){
            
                datos[0] = proveedor.getNombre();
                datos[1] = proveedor.getTelefono();
                datos[2] = proveedor.getMovil();
                datos[3] = proveedor.getCorreo();
                datos[4] = proveedor.getNit();
                datos[5] = proveedor.getPorcentaje();
                datos[6] = proveedor.getCantTra();
                datos[7] = proveedor.getServicio();

                modelo.addRow(datos);
            
            }
            
        }
        
        if (txtConsultar.getText().isEmpty()){
            
            for (Proveedores proveedor : ControlProveedor.getListaProveedores()) {
                
                datos[0] = proveedor.getNombre();
                datos[1] = proveedor.getTelefono();
                datos[2] = proveedor.getMovil();
                datos[3] = proveedor.getCorreo();
                datos[4] = proveedor.getNit();
                datos[5] = proveedor.getPorcentaje();
                datos[6] = proveedor.getCantTra();
                datos[7] = proveedor.getServicio();

                modelo.addRow(datos);
                
            }
            
        }
        
    }//GEN-LAST:event_txtConsultarKeyReleased

    public final void listarProveedores(){
        
        modelo.setNumRows(0);
        
        String datos[] = new String[8];
        
        for (Proveedores proveedor : ControlProveedor.getListaProveedores()) {
            
            datos[0] = proveedor.getNombre();
            datos[1] = proveedor.getTelefono();
            datos[2] = proveedor.getMovil();
            datos[3] = proveedor.getCorreo();
            datos[4] = proveedor.getNit();
            datos[5] = proveedor.getPorcentaje();
            datos[6] = proveedor.getCantTra();
            datos[7] = proveedor.getServicio();
            
            modelo.addRow(datos);
            
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProveedores;
    private javax.swing.JTextField txtConsultar;
    // End of variables declaration//GEN-END:variables
}

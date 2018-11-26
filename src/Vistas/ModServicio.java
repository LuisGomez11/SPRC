
package Vistas;

import Alertas.AdvertenciaModServicio;
import Alertas.BuscarServicioMod;
import Alertas.ErrorCompletar;
import Controladores.ControlServicio;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ModServicio extends javax.swing.JFrame {
    
    public ModServicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        txtHoraOperacion.setHorizontalAlignment(JTextField.CENTER);
        txtReferencia.setHorizontalAlignment(JTextField.CENTER);
        txtUVU.setHorizontalAlignment(JTextField.CENTER);
        txtLloydEscala.setHorizontalAlignment(JTextField.CENTER);
        txtFecha.setHorizontalAlignment(JTextField.CENTER);
        txtHoraCita.setHorizontalAlignment(JTextField.CENTER);
        txtFechaFinal.setHorizontalAlignment(JTextField.CENTER);
        txtHoraFinal.setHorizontalAlignment(JTextField.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscador = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbMotonave = new javax.swing.JComboBox<>();
        txtReferencia = new javax.swing.JTextField();
        cbMuelle = new javax.swing.JComboBox<>();
        cbGrua = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        labelAdvHora = new javax.swing.JLabel();
        labelAdvFecha = new javax.swing.JLabel();
        cbTerminal = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txtLloydEscala = new javax.swing.JTextField();
        txtUVU = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtHoraOperacion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        labelLimite = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtFechaFinal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHoraFinal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbServicio = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtHoraCita = new javax.swing.JTextField();
        labelAdvHora1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242), 5));
        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(941, 616));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SPRC.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        txtBuscador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtBuscador.setForeground(new java.awt.Color(64, 145, 242));
        txtBuscador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        jPanel1.add(txtBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 220, 30));

        btnBuscar.setBackground(new java.awt.Color(64, 145, 242));
        btnBuscar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 120, 30));

        btnActualizar.setBackground(new java.awt.Color(64, 145, 242));
        btnActualizar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(null);
        btnActualizar.setBorderPainted(false);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 120, 30));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 910, 20));

        jLabel5.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 145, 242));
        jLabel5.setText("Modificar Servicio");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, 60));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(64, 145, 242));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("REFERENCIA DEL SERVICIO:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 190, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 145, 242));
        jLabel3.setText("MOTONAVE/FRENTE DE SERVICIO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(64, 145, 242));
        jLabel7.setText("MUELLE:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(64, 145, 242));
        jLabel8.setText("GRUA:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        cbMotonave.setBackground(new java.awt.Color(64, 145, 242));
        cbMotonave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbMotonave.setForeground(new java.awt.Color(255, 255, 255));
        cbMotonave.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE...", "BARCAZA NFSI", "JENNIFER SCHEPERS", "SAN CLEMENTE", "STELLAR WALVIS BAY", "TERRESTRE", "X PRESS IRAZU ", "STELLAR WILLEMSTADT", "BARCAZA INTERCOASTAL", "MARGUERITE ACE", " " }));
        cbMotonave.setEnabled(false);
        jPanel1.add(cbMotonave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 220, 30));

        txtReferencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtReferencia.setForeground(new java.awt.Color(64, 145, 242));
        txtReferencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtReferencia.setEnabled(false);
        jPanel1.add(txtReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 60, 30));

        cbMuelle.setBackground(new java.awt.Color(64, 145, 242));
        cbMuelle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbMuelle.setForeground(new java.awt.Color(255, 255, 255));
        cbMuelle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE...", "S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "M1", "M2", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "RORO" }));
        cbMuelle.setEnabled(false);
        jPanel1.add(cbMuelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 220, 30));

        cbGrua.setBackground(new java.awt.Color(64, 145, 242));
        cbGrua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbGrua.setForeground(new java.awt.Color(255, 255, 255));
        cbGrua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE...", "G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8", "G9" }));
        cbGrua.setEnabled(false);
        jPanel1.add(cbGrua, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 220, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(64, 145, 242));
        jLabel9.setText("FECHA DE CITACION:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 140, -1));

        txtFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(64, 145, 242));
        txtFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtFecha.setEnabled(false);
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFechaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 220, 30));

        labelAdvHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(labelAdvHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 150, 20));

        labelAdvFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(labelAdvFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 150, 20));

        cbTerminal.setBackground(new java.awt.Color(64, 145, 242));
        cbTerminal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbTerminal.setForeground(new java.awt.Color(255, 255, 255));
        cbTerminal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE...", "SPRC", "CTC" }));
        cbTerminal.setEnabled(false);
        jPanel1.add(cbTerminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 220, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(64, 145, 242));
        jLabel20.setText("LLOYD ESCALA - UVU - REFERENCIA");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        txtLloydEscala.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtLloydEscala.setForeground(new java.awt.Color(64, 145, 242));
        txtLloydEscala.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtLloydEscala.setEnabled(false);
        jPanel1.add(txtLloydEscala, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 90, 30));

        txtUVU.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtUVU.setForeground(new java.awt.Color(64, 145, 242));
        txtUVU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtUVU.setEnabled(false);
        jPanel1.add(txtUVU, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 50, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(64, 145, 242));
        jLabel22.setText("TERMINAL:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 90, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(64, 145, 242));
        jLabel11.setText("HORAS EN OPERACION:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, -1, -1));

        txtHoraOperacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtHoraOperacion.setForeground(new java.awt.Color(64, 145, 242));
        txtHoraOperacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtHoraOperacion.setEnabled(false);
        txtHoraOperacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoraOperacionFocusGained(evt);
            }
        });
        txtHoraOperacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHoraOperacionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoraOperacionKeyTyped(evt);
            }
        });
        jPanel1.add(txtHoraOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 50, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(64, 145, 242));
        jLabel13.setText("HORA(S)");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 90, 30));
        jPanel1.add(labelLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, 200, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(64, 145, 242));
        jLabel12.setText("FECHA FINAL:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, -1, -1));

        txtFechaFinal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFechaFinal.setForeground(new java.awt.Color(64, 145, 242));
        txtFechaFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtFechaFinal.setEnabled(false);
        jPanel1.add(txtFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 220, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 145, 242));
        jLabel2.setText("HORA FINAL:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, -1, -1));

        txtHoraFinal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtHoraFinal.setForeground(new java.awt.Color(64, 145, 242));
        txtHoraFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtHoraFinal.setEnabled(false);
        jPanel1.add(txtHoraFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 220, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 145, 242));
        jLabel4.setText("SERVICIO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 90, -1));

        cbServicio.setBackground(new java.awt.Color(64, 145, 242));
        cbServicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbServicio.setForeground(new java.awt.Color(255, 255, 255));
        cbServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE...", "CONDUCTOR", "OPERADOR RD", "ESTIVA MARITIMA", "APOYO REEFER" }));
        cbServicio.setEnabled(false);
        jPanel1.add(cbServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 220, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(64, 145, 242));
        jLabel10.setText("HORA DE CITACION:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 140, -1));

        txtHoraCita.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtHoraCita.setForeground(new java.awt.Color(64, 145, 242));
        txtHoraCita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtHoraCita.setEnabled(false);
        txtHoraCita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHoraCitaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoraCitaKeyTyped(evt);
            }
        });
        jPanel1.add(txtHoraCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 220, 30));
        jPanel1.add(labelAdvHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 130, 20));

        btnCancelar.setBackground(new java.awt.Color(64, 145, 242));
        btnCancelar.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 120, 30));

        btnSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/002-login-1.png"))); // NOI18N
        btnSalir1.setBorderPainted(false);
        btnSalir1.setContentAreaFilled(false);
        btnSalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir1.setDefaultCapable(false);
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        boolean c = false;
        
        if(txtBuscador.getText().isEmpty()){
            
            AdvertenciaModServicio ams = new AdvertenciaModServicio();
            ams.setVisible(true);
            
        } else {
            
            for (int i = 0; i < ControlServicio.getServTemporal().size(); i++) {
                
                String referencia = ControlServicio.getServTemporal().get(i).getReferencia();

                String busqueda = txtBuscador.getText();
                
                if(busqueda.equals(referencia)){
                    
                    c = true;

                }
                
            }
            
            if(c == true){
                
                for (int i = 0; i < ControlServicio.getServTemporal().size(); i++) {
                
                    String terminal = ControlServicio.getServTemporal().get(i).getTerminal();
                    String moto = ControlServicio.getServTemporal().get(i).getMotonave();
                    String lloyd = ControlServicio.getServTemporal().get(i).getLloydEscala();
                    String UVU = ControlServicio.getServTemporal().get(i).getUVI();
                    String ref = ControlServicio.getServTemporal().get(i).getReferencia();
                    String muelle = ControlServicio.getServTemporal().get(i).getMuelle();
                    String grua = ControlServicio.getServTemporal().get(i).getGrua();
                    String fechaI = ControlServicio.getServTemporal().get(i).getFechacitacion();
                    String horaI = ControlServicio.getServTemporal().get(i).getHoracitacion();
                    String fechaF = ControlServicio.getServTemporal().get(i).getFechafinal();
                    String horaF = ControlServicio.getServTemporal().get(i).getHorafinal();
                    String ho = ControlServicio.getServTemporal().get(i).getHorasOperacion();
                    String ser = ControlServicio.getServTemporal().get(i).getServicio();
                
                    String busqueda = txtBuscador.getText();
                
                    if(busqueda.equals(ref)){

                        cbTerminal.setSelectedItem(terminal);
                        cbMotonave.setSelectedItem(moto);
                        txtLloydEscala.setText(lloyd);
                        txtUVU.setText(UVU);
                        txtReferencia.setText(ref);
                        cbMuelle.setSelectedItem(muelle);
                        cbGrua.setSelectedItem(grua);
                        txtFecha.setText(fechaI);
                        txtHoraCita.setText(horaI);
                        txtFechaFinal.setText(fechaF);
                        txtHoraFinal.setText(horaF);
                        txtHoraOperacion.setText(ho);
                        cbServicio.setSelectedItem(ser);
                        
                        cbTerminal.setEnabled(true);
                        cbMotonave.setEnabled(true);
                        txtLloydEscala.setEnabled(true);
                        txtUVU.setEnabled(true);
                        txtReferencia.setEnabled(true);
                        cbMuelle.setEnabled(true);
                        cbGrua.setEnabled(true);
                        txtFecha.setEnabled(true);
                        txtHoraCita.setEnabled(true);
                        txtFechaFinal.setEnabled(true);
                        txtHoraFinal.setEnabled(true);
                        txtHoraOperacion.setEnabled(true);
                        cbServicio.setEnabled(true);

                        txtBuscador.setEnabled(false);
                        
                    }
                
                }
                
            } else {
                
                JOptionPane.showMessageDialog(null, "No se encontró el servicio que desea modificar, intentelo nuevamente","Error",0);
                
            }
            
            
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        try {
            
            String terminal = cbTerminal.getSelectedItem().toString();
            String moto = cbMotonave.getSelectedItem().toString();
            String lloyd = txtLloydEscala.getText();
            String UVU = txtUVU.getText();
            String ref = txtReferencia.getText();
            String muelle = cbMuelle.getSelectedItem().toString();
            String grua = cbGrua.getSelectedItem().toString();
            String fechaI = txtFecha.getText();
            String horaI = txtHoraCita.getText();
            String fechaF = txtFechaFinal.getText();
            String horaF = txtHoraFinal.getText();
            String ho = txtHoraOperacion.getText();
            String ser = cbServicio.getSelectedItem().toString();
            
            if(txtUVU.getText().isEmpty()){
            
                BuscarServicioMod bsm = new BuscarServicioMod();
                bsm.setVisible(true);
            
            } else if(cbTerminal.getSelectedIndex()==0||cbMotonave.getSelectedIndex()==0||lloyd.isEmpty()||
                    UVU.isEmpty()||ref.isEmpty()||cbMuelle.getSelectedIndex()==0||cbGrua.getSelectedIndex()==0||
                    fechaI.isEmpty()||horaI.isEmpty()||fechaF.isEmpty()||horaF.isEmpty()||ho.isEmpty()||
                    cbServicio.getSelectedIndex()==0){
                
                ErrorCompletar ec = new ErrorCompletar();
                ec.setVisible(true);
                
            } else {
                
                for (int i = 0; i < ControlServicio.getServTemporal().size(); i++) {
                    
                    String refBus = ControlServicio.getServTemporal().get(i).getReferencia();
                 
                    if(txtBuscador.getText().equals(refBus)){
                        
                        ControlServicio.getServTemporal().get(i).setTerminal(terminal);
                        ControlServicio.getServTemporal().get(i).setMotonave(moto);
                        ControlServicio.getServTemporal().get(i).setLloydEscala(lloyd);
                        ControlServicio.getServTemporal().get(i).setUVI(UVU);
                        ControlServicio.getServTemporal().get(i).setReferencia(ref);
                        ControlServicio.getServTemporal().get(i).setFechacitacion(fechaI);
                        ControlServicio.getServTemporal().get(i).setHoracitacion(horaI);
                        ControlServicio.getServTemporal().get(i).setMuelle(muelle);
                        ControlServicio.getServTemporal().get(i).setGrua(grua);
                        ControlServicio.getServTemporal().get(i).setFechafinal(fechaF);
                        ControlServicio.getServTemporal().get(i).setHorafinal(horaF);
                        ControlServicio.getServTemporal().get(i).setHorasOperacion(ho);
                        ControlServicio.getServTemporal().get(i).setServicio(ser);
                        
                        JOptionPane.showMessageDialog(null, "Servicio modificado correctamente");
                        
                        nuevo();
                        
                        cbTerminal.setEnabled(false);
                        cbMotonave.setEnabled(false);
                        txtLloydEscala.setEnabled(false);
                        txtUVU.setEnabled(false);
                        txtReferencia.setEnabled(false);
                        cbMuelle.setEnabled(false);
                        cbGrua.setEnabled(false);
                        txtFecha.setEnabled(false);
                        txtHoraCita.setEnabled(false);
                        txtFechaFinal.setEnabled(false);
                        txtHoraFinal.setEnabled(false);
                        txtHoraOperacion.setEnabled(false);
                        cbServicio.setEnabled(false);
                        
                        txtBuscador.setEnabled(true);
                        
                    }
                    
                }
                
            }
            
        } catch (Exception e) {
        }
        
            
        

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtFechaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyReleased

        if(txtFecha.getText().length()==2||txtFecha.getText().length()==5){
            txtFecha.setText(txtFecha.getText()+"/");
        }

        if(txtFecha.getText().length()==10){

            txtFecha.setBorder(BorderFactory.createLineBorder(new Color(0, 200, 0)));

        } else{

            txtFecha.setBorder(BorderFactory.createLineBorder(new Color(64,145,242)));

        }

        if(txtFecha.getText().length()>0){
            labelAdvFecha.setVisible(false);
        }

    }//GEN-LAST:event_txtFechaKeyReleased

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtFechaKeyTyped

    private void txtHoraOperacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraOperacionFocusGained

        if(txtFecha.getText().isEmpty()||txtHoraCita.getText().isEmpty()){

            if(txtFecha.getText().isEmpty()){

                txtFecha.requestFocus();
                labelAdvFecha.setVisible(true);
                labelAdvFecha.setText("Complete este campo!");

            }else{

                txtHoraCita.requestFocus();
                labelAdvHora.setVisible(true);
                labelAdvHora.setText("Complete este campo!");

            }

        } else{

            labelAdvFecha.setVisible(false);
            labelAdvHora.setVisible(false);
            txtHoraOperacion.requestFocus();

        }
    }//GEN-LAST:event_txtHoraOperacionFocusGained

    private void txtHoraOperacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraOperacionKeyReleased
        if(txtFecha.getText().isEmpty()||txtHoraCita.getText().isEmpty()){

        }else{

            if(txtHoraOperacion.getText().isEmpty()){

                txtFechaFinal.setText("");
                txtHoraFinal.setText("");

            }else{

                String fechacita = txtFecha.getText();
                String[] partsf = fechacita.split("/");
                String dia = partsf[0];
                String mes = partsf[1];
                String año = partsf[2];

                String horaCita = txtHoraCita.getText();
                String[] partsh = horaCita.split(":");
                String hora = partsh[0];
                String minuto = partsh[1];

                int h = Integer.parseInt(hora);
                int ho = Integer.parseInt(txtHoraOperacion.getText());
                int ht = h+ho;

                if(ho>18){

                    txtHoraOperacion.setBorder(BorderFactory.createLineBorder(Color.RED));
                    labelLimite.setVisible(true);
                    labelLimite.setForeground(Color.RED);
                    labelLimite.setText("Limite de 18 horas!");
                    txtFechaFinal.setText("");
                    txtHoraFinal.setText("");

                }else{

                    txtHoraOperacion.setBorder(BorderFactory.createLineBorder(new Color(64,145,242)));
                    labelLimite.setVisible(false);

                    if(ht>=24){

                        int d = Integer.parseInt(dia)+1;
                        ho = ((24-h)-ho);
                        int hf = ho*(-1);

                        if(hf<10){

                            txtFechaFinal.setText(d+"/"+mes+"/"+año);
                            txtHoraFinal.setText("0"+hf+":"+minuto);

                        }else{

                            txtFechaFinal.setText(d+"/"+mes+"/"+año);
                            txtHoraFinal.setText(hf+":"+minuto);

                        }

                    }else{

                        if(ht<10){

                            txtFechaFinal.setText(dia+"/"+mes+"/"+año);
                            txtHoraFinal.setText("0"+ht+":"+minuto);

                        } else{

                            txtFechaFinal.setText(dia+"/"+mes+"/"+año);
                            txtHoraFinal.setText(ht+":"+minuto);

                        }

                    }

                }
            }

        }
    }//GEN-LAST:event_txtHoraOperacionKeyReleased

    private void txtHoraOperacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraOperacionKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtHoraOperacionKeyTyped

    private void txtHoraCitaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraCitaKeyReleased

        if(txtHoraCita.getText().length()==2){
            txtHoraCita.setText(txtHoraCita.getText()+":");
        }

        if(txtHoraCita.getText().length()==5){

            txtHoraCita.setBorder(BorderFactory.createLineBorder(new Color(0, 200, 0)));

        } else{

            txtHoraCita.setBorder(BorderFactory.createLineBorder(new Color(64,145,242)));

        }

        if(txtHoraCita.getText().length()>0){
            labelAdvHora.setVisible(false);
        }

    }//GEN-LAST:event_txtHoraCitaKeyReleased

    private void txtHoraCitaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraCitaKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtHoraCitaKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        cbTerminal.setEnabled(false);
        cbMotonave.setEnabled(false);
        txtLloydEscala.setEnabled(false);
        txtUVU.setEnabled(false);
        txtReferencia.setEnabled(false);
        cbMuelle.setEnabled(false);
        cbGrua.setEnabled(false);
        txtFecha.setEnabled(false);
        txtHoraCita.setEnabled(false);
        txtFechaFinal.setEnabled(false);
        txtHoraFinal.setEnabled(false);
        txtHoraOperacion.setEnabled(false);
        cbServicio.setEnabled(false);
        
        txtBuscador.setEnabled(true);
        
        nuevo();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        MenuAnalista ma = new MenuAnalista();
        ma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalir1ActionPerformed

    public void nuevo(){
        
        cbGrua.setSelectedIndex(0);
        cbMotonave.setSelectedIndex(0);
        cbMuelle.setSelectedIndex(0);
        cbServicio.setSelectedIndex(0);
        cbTerminal.setSelectedIndex(0);
        txtUVU.setText("");
        txtLloydEscala.setText("");
        txtReferencia.setText("");
        txtFecha.setText("");
        txtHoraCita.setText("");
        txtHoraOperacion.setText("");
        txtFechaFinal.setText("");
        txtHoraFinal.setText("");
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JComboBox<String> cbGrua;
    private javax.swing.JComboBox<String> cbMotonave;
    private javax.swing.JComboBox<String> cbMuelle;
    private javax.swing.JComboBox<String> cbServicio;
    private javax.swing.JComboBox<String> cbTerminal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelAdvFecha;
    private javax.swing.JLabel labelAdvHora;
    private javax.swing.JLabel labelAdvHora1;
    private javax.swing.JLabel labelLimite;
    private javax.swing.JTextField txtBuscador;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaFinal;
    private javax.swing.JTextField txtHoraCita;
    private javax.swing.JTextField txtHoraFinal;
    private javax.swing.JTextField txtHoraOperacion;
    private javax.swing.JTextField txtLloydEscala;
    private javax.swing.JTextField txtReferencia;
    private javax.swing.JTextField txtUVU;
    // End of variables declaration//GEN-END:variables
}


package Vistas;

import Alertas.ErrorCompletar;
import Atxy2k.CustomTextField.RestrictedTextField;
import Controladores.ControlAsignacion;
import Controladores.ControlProveedor;
import Controladores.ControlServicio;
import Modelos.Asignacion;
import Modelos.Proveedores;
import java.awt.Color;
import java.awt.HeadlessException;
import java.text.DateFormat;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RegServicio extends javax.swing.JFrame {

    ControlServicio cs = new ControlServicio();
    
    DateFormat df = DateFormat.getDateInstance();
    
    public RegServicio() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        txtCantidad.setHorizontalAlignment(JTextField.CENTER);
        txtHoraOperacion.setHorizontalAlignment(JTextField.CENTER);
        txtPorcentaje.setHorizontalAlignment(JTextField.CENTER);
        txtReferencia.setHorizontalAlignment(JTextField.CENTER);
        txtUVU.setHorizontalAlignment(JTextField.CENTER);
        txtLloydEscala.setHorizontalAlignment(JTextField.CENTER);
        txtFecha.setHorizontalAlignment(JTextField.CENTER);
        txtHoraCita.setHorizontalAlignment(JTextField.CENTER);
        txtFechaFinal.setHorizontalAlignment(JTextField.CENTER);
        txtHoraFinal.setHorizontalAlignment(JTextField.CENTER);
        
        porcentaje.setText("0");
        
        labelLimite.setVisible(false);
        labelAdvFecha.setVisible(false);
        labelAdvHora.setVisible(false);
        
        panelPorcServicio.setVisible(false);
        panelProveedores.setVisible(false);
        
        RestrictedTextField restricted = new RestrictedTextField(txtFecha);
        restricted.setLimit(10);
        restricted.restore();
        
        RestrictedTextField restricted1 = new RestrictedTextField(txtHoraCita);
        restricted1.setLimit(5);
        restricted1.restore();
        
        RestrictedTextField restricted2 = new RestrictedTextField(txtHoraOperacion);
        restricted2.setLimit(2);
        restricted2.restore();
        
        RestrictedTextField restricted3 = new RestrictedTextField(txtPorcentaje);
        restricted3.setLimit(3);
        restricted3.restore();
        
        RestrictedTextField restricted4 = new RestrictedTextField(txtLloydEscala);
        restricted4.setLimit(4);
        restricted4.restore();
        
        RestrictedTextField restricted5 = new RestrictedTextField(txtUVU);
        restricted5.setLimit(4);
        restricted5.restore();
        
        RestrictedTextField restricted6 = new RestrictedTextField(txtReferencia);
        restricted6.setLimit(4);
        restricted6.restore();
        
        cbProveedor.addItem("SELECCIONE...");
        
        for (Proveedores proveedor : ControlProveedor.getListaProveedores()) {
            
            cbProveedor.addItem(proveedor.getNombre());
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegServicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbMotonave = new javax.swing.JComboBox<>();
        txtReferencia = new javax.swing.JTextField();
        cbMuelle = new javax.swing.JComboBox<>();
        cbGrua = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtHoraCita = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtHoraOperacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtHoraFinal = new javax.swing.JTextField();
        txtFechaFinal = new javax.swing.JTextField();
        panelProveedores = new javax.swing.JPanel();
        cbProveedor = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtPorcentaje = new javax.swing.JTextField();
        btnEncargar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        labelLimite = new javax.swing.JLabel();
        panelPorcServicio = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        porcentaje = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        labelAdvHora = new javax.swing.JLabel();
        labelAdvFecha = new javax.swing.JLabel();
        cbTerminal = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txtLloydEscala = new javax.swing.JTextField();
        txtUVU = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cbServicio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelRegServicio.setBackground(new java.awt.Color(255, 255, 255));
        panelRegServicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242), 5));
        panelRegServicio.setAutoscrolls(true);
        panelRegServicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SPRC.png"))); // NOI18N
        panelRegServicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(64, 145, 242));
        jLabel6.setText("Registrar");
        panelRegServicio.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, 60));

        jLabel5.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 145, 242));
        jLabel5.setText("Servicio");
        panelRegServicio.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 145, 242));
        jLabel2.setText("HORA FINAL:");
        panelRegServicio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 145, 242));
        jLabel3.setText("MOTONAVE/FRENTE DE SERVICIO:");
        panelRegServicio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 145, 242));
        jLabel4.setText("SERVICIO:");
        panelRegServicio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(64, 145, 242));
        jLabel7.setText("MUELLE:");
        panelRegServicio.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(64, 145, 242));
        jLabel8.setText("GRUA:");
        panelRegServicio.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        cbMotonave.setBackground(new java.awt.Color(64, 145, 242));
        cbMotonave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbMotonave.setForeground(new java.awt.Color(255, 255, 255));
        cbMotonave.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE...", "BARCAZA NFSI", "JENNIFER SCHEPERS", "SAN CLEMENTE", "STELLAR WALVIS BAY", "TERRESTRE", "X PRESS IRAZU ", "STELLAR WILLEMSTADT", "BARCAZA INTERCOASTAL", "MARGUERITE ACE" }));
        panelRegServicio.add(cbMotonave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 220, 30));

        txtReferencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtReferencia.setForeground(new java.awt.Color(64, 145, 242));
        txtReferencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        panelRegServicio.add(txtReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 60, 30));

        cbMuelle.setBackground(new java.awt.Color(64, 145, 242));
        cbMuelle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbMuelle.setForeground(new java.awt.Color(255, 255, 255));
        cbMuelle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE...", "S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "M1", "M2", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "RORO" }));
        panelRegServicio.add(cbMuelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 220, 30));

        cbGrua.setBackground(new java.awt.Color(64, 145, 242));
        cbGrua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbGrua.setForeground(new java.awt.Color(255, 255, 255));
        cbGrua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE...", "G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8", "G9" }));
        panelRegServicio.add(cbGrua, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 220, 30));

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
        panelRegServicio.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 50, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(64, 145, 242));
        jLabel9.setText("FECHA DE CITACION:");
        panelRegServicio.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 140, -1));

        txtHoraCita.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtHoraCita.setForeground(new java.awt.Color(64, 145, 242));
        txtHoraCita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtHoraCita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHoraCitaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoraCitaKeyTyped(evt);
            }
        });
        panelRegServicio.add(txtHoraCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 220, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(64, 145, 242));
        jLabel10.setText("HORA DE CITACION:");
        panelRegServicio.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 140, -1));

        txtHoraOperacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtHoraOperacion.setForeground(new java.awt.Color(64, 145, 242));
        txtHoraOperacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
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
        panelRegServicio.add(txtHoraOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 50, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(64, 145, 242));
        jLabel11.setText("HORAS EN OPERACION:");
        panelRegServicio.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(64, 145, 242));
        jLabel12.setText("FECHA FINAL:");
        panelRegServicio.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        txtHoraFinal.setEditable(false);
        txtHoraFinal.setBackground(new java.awt.Color(255, 255, 255));
        txtHoraFinal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtHoraFinal.setForeground(new java.awt.Color(64, 145, 242));
        txtHoraFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        panelRegServicio.add(txtHoraFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 220, 30));

        txtFechaFinal.setEditable(false);
        txtFechaFinal.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaFinal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFechaFinal.setForeground(new java.awt.Color(64, 145, 242));
        txtFechaFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        panelRegServicio.add(txtFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 220, 30));

        panelProveedores.setBackground(new java.awt.Color(255, 255, 255));
        panelProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "PROVEEDORES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        panelProveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbProveedor.setBackground(new java.awt.Color(64, 145, 242));
        cbProveedor.setForeground(new java.awt.Color(255, 255, 255));
        panelProveedores.add(cbProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 260, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(64, 145, 242));
        jLabel14.setText("COMPAÑIA PROVEEDORA:");
        panelProveedores.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtCantidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(64, 145, 242));
        txtCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        panelProveedores.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(64, 145, 242));
        jLabel15.setText("PORCENTAJE PEDIDO:");
        panelProveedores.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(64, 145, 242));
        jLabel16.setText("PROVEEDOR(ES)");
        panelProveedores.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 90, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(64, 145, 242));
        jLabel18.setText("CANTIDAD DE PERSONAL:");
        panelProveedores.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtPorcentaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPorcentaje.setForeground(new java.awt.Color(64, 145, 242));
        txtPorcentaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPorcentajeActionPerformed(evt);
            }
        });
        txtPorcentaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPorcentajeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorcentajeKeyTyped(evt);
            }
        });
        panelProveedores.add(txtPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 30));

        btnEncargar.setBackground(new java.awt.Color(255, 255, 255));
        btnEncargar.setText("ENCARGAR");
        btnEncargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncargar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEncargarMouseMoved(evt);
            }
        });
        btnEncargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEncargarMouseExited(evt);
            }
        });
        btnEncargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncargarActionPerformed(evt);
            }
        });
        panelProveedores.add(btnEncargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 260, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(64, 145, 242));
        jLabel21.setText("%");
        panelProveedores.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        panelRegServicio.add(panelProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 300, 390));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(64, 145, 242));
        jLabel13.setText("HORA(S)");
        panelRegServicio.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 90, 30));

        txtFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(64, 145, 242));
        txtFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFechaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });
        panelRegServicio.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 220, 30));
        panelRegServicio.add(labelLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 200, 20));

        panelPorcServicio.setBackground(new java.awt.Color(255, 255, 255));
        panelPorcServicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPorcServicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("PORCENTAJE RESTANTE DEL SERVICIO");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 340, 40));

        panelPorcServicio.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 40));

        porcentaje.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        porcentaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        porcentaje.setText("0");
        panelPorcServicio.add(porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 50, 40));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setText("%");
        panelPorcServicio.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, 40));

        panelRegServicio.add(panelPorcServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, 660, 40));

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR SERVICIO");
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
        panelRegServicio.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 220, 40));
        panelRegServicio.add(labelAdvHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 660, 130, 20));
        panelRegServicio.add(labelAdvFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, 130, 20));

        cbTerminal.setBackground(new java.awt.Color(64, 145, 242));
        cbTerminal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbTerminal.setForeground(new java.awt.Color(255, 255, 255));
        cbTerminal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE...", "SPRC", "CTC" }));
        panelRegServicio.add(cbTerminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 220, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(64, 145, 242));
        jLabel20.setText("LLOYD ESCALA - UVU - REFERENCIA");
        panelRegServicio.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        txtLloydEscala.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtLloydEscala.setForeground(new java.awt.Color(64, 145, 242));
        txtLloydEscala.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        panelRegServicio.add(txtLloydEscala, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 90, 30));

        txtUVU.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtUVU.setForeground(new java.awt.Color(64, 145, 242));
        txtUVU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 145, 242)));
        panelRegServicio.add(txtUVU, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 50, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(64, 145, 242));
        jLabel22.setText("TERMINAL:");
        panelRegServicio.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 90, -1));

        cbServicio.setBackground(new java.awt.Color(64, 145, 242));
        cbServicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbServicio.setForeground(new java.awt.Color(255, 255, 255));
        cbServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE...", "CONDUCTOR", "OPERADOR RD", "ESTIBA MARITIMA", "APOYO REEFER", "CAPATAZ" }));
        panelRegServicio.add(cbServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegServicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelRegServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        if(porcentaje.getText().equals("0")){
            MenuAnalista ma = new MenuAnalista();
            ma.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Termine de abarcar el servicio por completo por favor", "Error", 2);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

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

    private void btnEncargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncargarActionPerformed
        
        try {
            
            if(cbProveedor.getSelectedIndex()==0||txtCantidad.getText().isEmpty()||txtPorcentaje.getText().isEmpty()){
                
                ErrorCompletar ec = new ErrorCompletar();
                ec.setVisible(true);
                
            } else {
                
                String prov = cbProveedor.getSelectedItem().toString();
                String can = txtCantidad.getText();
                String por = txtPorcentaje.getText();
                
                int index = ControlServicio.getListaServicios().size() - 1;
                
                int indexPro = cbProveedor.getSelectedIndex() - 1;
                
                int cantidadTra = Integer.parseInt(ControlProveedor.getListaProveedores().get(indexPro).getCantTra());
            
                int cantNece = Integer.parseInt(txtCantidad.getText());
                
                int proRes = cantidadTra-cantNece;
                
                if (Integer.parseInt(porcentaje.getText())<Integer.parseInt(por)){
                    
                    JOptionPane.showMessageDialog(null, "Solo queda el "+porcentaje.getText()+" % del servicio para abarcar completamente", "Error!", 0);
                    
                } else {
                
                
                boolean c = false;
                
                
                for (Asignacion serAsi : ControlAsignacion.getListaSerAsignados()) {

                    if (serAsi.getServicio().getReferencia().equals(txtReferencia.getText()) && serAsi.getProveedor().equals(prov)){

                        c= true;

                    }

                }
                
                
                
                if (c ==true){
                    ControlAsignacion.getListaSerAsignados().stream().map((serAsi) -> {
                        serAsi.setPorcentaje(Integer.parseInt(serAsi.getPorcentaje()) + Integer.parseInt(por)+"");
                        return serAsi;
                    }).forEachOrdered((serAsi) -> {
                        serAsi.setCantidad(Integer.parseInt(serAsi.getCantidad()) + Integer.parseInt(can)+"");
                    });
                } else {
                    
                    Asignacion as = new Asignacion(ControlServicio.getListaServicios().get(index), prov, can, por);
                    
                    ControlAsignacion.añadirServicioAsignado(as);
                    
                }
                
                ControlProveedor.getListaProveedores().get(indexPro).setCantTra(String.valueOf(proRes));
                
                int p = Integer.parseInt(txtPorcentaje.getText());
                int pt = Integer.parseInt(porcentaje.getText());

                int r = pt-p;
                
                porcentaje.setText(String.valueOf(r));
                
                if(r==0){
                    
                    JOptionPane.showMessageDialog(null, "Servicio abarcado completamente");
                    
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


                    txtFecha.setBorder(BorderFactory.createLineBorder(new Color(64,145,242)));
                    txtHoraCita.setBorder(BorderFactory.createLineBorder(new Color(64,145,242)));

                    porcentaje.setText("0");

                    txtCantidad.setText("");
                    txtPorcentaje.setText("");
                    cbProveedor.setSelectedIndex(0);
                    
                    panelPorcServicio.setVisible(false);
                    panelProveedores.setVisible(false);
                    
                    ControlServicio.getListaServicios().remove(index);
                    
                }
                
                
                nuevoProveedor();
                
            }
            }
            
        } catch (HeadlessException | NumberFormatException e) {
        }
       
    }//GEN-LAST:event_btnEncargarActionPerformed

    private void txtHoraOperacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraOperacionKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtHoraOperacionKeyTyped

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        cs.registrarServicio(cbTerminal, cbMotonave, txtLloydEscala, txtUVU, txtReferencia, cbMuelle, cbGrua, txtFecha, txtHoraCita, txtHoraOperacion, txtFechaFinal, txtHoraFinal, porcentaje, cbServicio, panelPorcServicio, panelProveedores);  
    }//GEN-LAST:event_btnRegistrarActionPerformed

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

    private void btnRegistrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseMoved
        btnRegistrar.setForeground(Color.WHITE);
        btnRegistrar.setBackground(new Color(64,145,242));
    }//GEN-LAST:event_btnRegistrarMouseMoved

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        btnRegistrar.setForeground(Color.BLACK);
        btnRegistrar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void btnEncargarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncargarMouseMoved
        btnEncargar.setForeground(Color.WHITE);
        btnEncargar.setBackground(new Color(64,145,242));
    }//GEN-LAST:event_btnEncargarMouseMoved

    private void btnEncargarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncargarMouseExited
        btnEncargar.setForeground(Color.BLACK);
        btnEncargar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnEncargarMouseExited

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

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtFechaKeyTyped

    private void txtHoraCitaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraCitaKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtHoraCitaKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPorcentajeActionPerformed
        
    }//GEN-LAST:event_txtPorcentajeActionPerformed

    private void txtPorcentajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtPorcentajeKeyTyped

    private void txtPorcentajeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeKeyReleased
        
        if(txtPorcentaje.getText().isEmpty()){
            
        }else{
        
            int p = Integer.parseInt(porcentaje.getText());
            int o = Integer.parseInt(txtPorcentaje.getText());

            if(o>p){

                txtPorcentaje.setBorder(BorderFactory.createLineBorder(Color.RED));

            } else{

                txtPorcentaje.setBorder(BorderFactory.createLineBorder(new Color(64,145,242)));

            }
        }
        
    }//GEN-LAST:event_txtPorcentajeKeyReleased

    private void txtCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyReleased
        if(cbProveedor.getSelectedIndex()==0){
        } else if(txtCantidad.getText().isEmpty()){
        } else {
            
            int index = cbProveedor.getSelectedIndex() - 1;
            
            int cantidadTra = Integer.parseInt(ControlProveedor.getListaProveedores().get(index).getCantTra());
            
            int cantNece = Integer.parseInt(txtCantidad.getText());
            
            if(cantNece>cantidadTra){
                
                txtCantidad.setBorder(BorderFactory.createLineBorder(Color.RED));
                
            } else {
                
                txtCantidad.setBorder(BorderFactory.createLineBorder(new Color(64,145,242)));
                
            }
            
        }
    }//GEN-LAST:event_txtCantidadKeyReleased

    
    public void nuevoProveedor(){
        
        txtCantidad.setText("");
        txtPorcentaje.setText("");
        cbProveedor.setSelectedIndex(0);
    }
    
    public void nuevoSercicio(){
        
        cbGrua.setSelectedIndex(0);
        cbMotonave.setSelectedIndex(0);
        cbMuelle.setSelectedIndex(0);
        txtReferencia.setText("");
        txtFecha.setText("");
        txtHoraCita.setText("");
        txtHoraOperacion.setText("");
        txtFechaFinal.setText("");
        txtHoraFinal.setText("");
        
        
        txtFecha.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txtHoraCita.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        porcentaje.setText("100");
        
    }
    
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEncargar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbGrua;
    private javax.swing.JComboBox<String> cbMotonave;
    private javax.swing.JComboBox<String> cbMuelle;
    private javax.swing.JComboBox<String> cbProveedor;
    private javax.swing.JComboBox<String> cbServicio;
    private javax.swing.JComboBox<String> cbTerminal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelAdvFecha;
    private javax.swing.JLabel labelAdvHora;
    private javax.swing.JLabel labelLimite;
    private javax.swing.JPanel panelPorcServicio;
    private javax.swing.JPanel panelProveedores;
    private javax.swing.JPanel panelRegServicio;
    private javax.swing.JLabel porcentaje;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaFinal;
    private javax.swing.JTextField txtHoraCita;
    private javax.swing.JTextField txtHoraFinal;
    private javax.swing.JTextField txtHoraOperacion;
    private javax.swing.JTextField txtLloydEscala;
    private javax.swing.JTextField txtPorcentaje;
    private javax.swing.JTextField txtReferencia;
    private javax.swing.JTextField txtUVU;
    // End of variables declaration//GEN-END:variables
}

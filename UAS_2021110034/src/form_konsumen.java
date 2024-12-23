import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import koneksi.connect;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;



public class form_konsumen extends javax.swing.JFrame {

    
    
    Color panedefault;
    Color paneClick;
    
    public form_konsumen() {
        initComponents();
        datatable(); 
        setTitle("CAHAYA PERMATA OPTICAL");
        
        panedefault = new Color(255,255,255);
        paneClick = new Color(0,0,51);
        pane1.setBackground(paneClick);
        pane2.setBackground(panedefault);
        pane3.setBackground(panedefault);
        pane4.setBackground(panedefault);
        pane5.setBackground(panedefault);
        pane6.setBackground(panedefault);

    }
    
    public void datatable(){    
        DefaultTableModel tbl=new DefaultTableModel();
        tbl.addColumn("ID Konsumen");
        tbl.addColumn("Nama Konsumen");
        tbl.addColumn("Alamat");
        tbl.addColumn("Jenis Kelamin");
        tbl.addColumn("Umur");
        tbl.addColumn("No.HP");        
        tabelkonsumen.setModel(tbl);
        
        try{
            Statement statement=(Statement)connect.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("select * from konsumen");
            while(res.next())
            {
                tbl.addRow(new Object[]{
                    res.getString("ID_Konsumen"),
                    res.getString("Nama_konsumen"),
                    res.getString("Alamat"),
                    res.getString("Jenis_kelamin"),
                    res.getInt("Umur"),
                    res.getString("No_hp")   
                });
                tabelkonsumen.setModel(tbl);
            }} 
        catch (Exception e){
                JOptionPane.showMessageDialog(rootPane, "salah");
    }
}

    public void kosong(){
        
        txtidkonsumen.setText("");
        txtnamakonsumen.setText("");
        txtalamat.setText("");        
        txtumur.setText("");
        txtnohp.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbjeniskelamin = new javax.swing.JComboBox<>();
        txtidkonsumen = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        txtnamakonsumen = new javax.swing.JTextField();
        txtumur = new javax.swing.JTextField();
        txtnohp = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelkonsumen = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        paneldashboard = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        paneltransaksi = new javax.swing.JPanel();
        pane4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        panelkacamata = new javax.swing.JPanel();
        pane3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        panelresep = new javax.swing.JPanel();
        pane2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        panelkonsumen = new javax.swing.JPanel();
        pane1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        panelreport = new javax.swing.JPanel();
        pane5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        panelpetugas = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        pane6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnnext = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnnew = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(990, 570));
        setPreferredSize(new java.awt.Dimension(990, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(615, 325));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("ID Konsumen");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Nama Konsumen");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Alamat");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Jenis Kelamin");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Umur");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("No. HP");

        cmbjeniskelamin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbjeniskelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih -", "Laki-Laki", "Perempuan" }));

        txtidkonsumen.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtalamat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtnamakonsumen.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtumur.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtnohp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btncari.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtidkonsumen, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncari, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnamakonsumen, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbjeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtumur, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnohp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtidkonsumen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btncari, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnamakonsumen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtumur, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnohp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbjeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 600, 320));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabelkonsumen.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tabelkonsumen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelkonsumen.setRowHeight(18);
        tabelkonsumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelkonsumenMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelkonsumen);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 770, -1));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        paneldashboard.setBackground(new java.awt.Color(255, 255, 255));
        paneldashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paneldashboardMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paneldashboardMousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel17.setText("DASHBOARD");

        javax.swing.GroupLayout paneldashboardLayout = new javax.swing.GroupLayout(paneldashboard);
        paneldashboard.setLayout(paneldashboardLayout);
        paneldashboardLayout.setHorizontalGroup(
            paneldashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldashboardLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel17)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        paneldashboardLayout.setVerticalGroup(
            paneldashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldashboardLayout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paneltransaksi.setBackground(new java.awt.Color(255, 255, 255));
        paneltransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paneltransaksiMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paneltransaksiMousePressed(evt);
            }
        });

        pane4.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout pane4Layout = new javax.swing.GroupLayout(pane4);
        pane4.setLayout(pane4Layout);
        pane4Layout.setHorizontalGroup(
            pane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        pane4Layout.setVerticalGroup(
            pane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel18.setText("Transaksi");

        javax.swing.GroupLayout paneltransaksiLayout = new javax.swing.GroupLayout(paneltransaksi);
        paneltransaksi.setLayout(paneltransaksiLayout);
        paneltransaksiLayout.setHorizontalGroup(
            paneltransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltransaksiLayout.createSequentialGroup()
                .addComponent(pane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        paneltransaksiLayout.setVerticalGroup(
            paneltransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltransaksiLayout.createSequentialGroup()
                .addGroup(paneltransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelkacamata.setBackground(new java.awt.Color(255, 255, 255));
        panelkacamata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelkacamataMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelkacamataMousePressed(evt);
            }
        });

        pane3.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout pane3Layout = new javax.swing.GroupLayout(pane3);
        pane3.setLayout(pane3Layout);
        pane3Layout.setHorizontalGroup(
            pane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        pane3Layout.setVerticalGroup(
            pane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel19.setText("Data Kacamata");

        javax.swing.GroupLayout panelkacamataLayout = new javax.swing.GroupLayout(panelkacamata);
        panelkacamata.setLayout(panelkacamataLayout);
        panelkacamataLayout.setHorizontalGroup(
            panelkacamataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelkacamataLayout.createSequentialGroup()
                .addComponent(pane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelkacamataLayout.setVerticalGroup(
            panelkacamataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelkacamataLayout.createSequentialGroup()
                .addGroup(panelkacamataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelresep.setBackground(new java.awt.Color(255, 255, 255));
        panelresep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelresepMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelresepMousePressed(evt);
            }
        });

        pane2.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout pane2Layout = new javax.swing.GroupLayout(pane2);
        pane2.setLayout(pane2Layout);
        pane2Layout.setHorizontalGroup(
            pane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        pane2Layout.setVerticalGroup(
            pane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setText("Data Resep");

        javax.swing.GroupLayout panelresepLayout = new javax.swing.GroupLayout(panelresep);
        panelresep.setLayout(panelresepLayout);
        panelresepLayout.setHorizontalGroup(
            panelresepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelresepLayout.createSequentialGroup()
                .addComponent(pane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelresepLayout.setVerticalGroup(
            panelresepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelresepLayout.createSequentialGroup()
                .addGroup(panelresepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelkonsumen.setBackground(new java.awt.Color(255, 255, 255));
        panelkonsumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelkonsumenMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelkonsumenMousePressed(evt);
            }
        });

        pane1.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout pane1Layout = new javax.swing.GroupLayout(pane1);
        pane1.setLayout(pane1Layout);
        pane1Layout.setHorizontalGroup(
            pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        pane1Layout.setVerticalGroup(
            pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel20.setText("Data Konsumen");

        javax.swing.GroupLayout panelkonsumenLayout = new javax.swing.GroupLayout(panelkonsumen);
        panelkonsumen.setLayout(panelkonsumenLayout);
        panelkonsumenLayout.setHorizontalGroup(
            panelkonsumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelkonsumenLayout.createSequentialGroup()
                .addComponent(pane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        panelkonsumenLayout.setVerticalGroup(
            panelkonsumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelkonsumenLayout.createSequentialGroup()
                .addGroup(panelkonsumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelreport.setBackground(new java.awt.Color(255, 255, 255));
        panelreport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelreportMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelreportMousePressed(evt);
            }
        });

        pane5.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout pane5Layout = new javax.swing.GroupLayout(pane5);
        pane5.setLayout(pane5Layout);
        pane5Layout.setHorizontalGroup(
            pane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        pane5Layout.setVerticalGroup(
            pane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel21.setText("Report");

        javax.swing.GroupLayout panelreportLayout = new javax.swing.GroupLayout(panelreport);
        panelreport.setLayout(panelreportLayout);
        panelreportLayout.setHorizontalGroup(
            panelreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelreportLayout.createSequentialGroup()
                .addComponent(pane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelreportLayout.setVerticalGroup(
            panelreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelreportLayout.createSequentialGroup()
                .addGroup(panelreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        panelpetugas.setBackground(new java.awt.Color(255, 255, 255));
        panelpetugas.setPreferredSize(new java.awt.Dimension(101, 34));
        panelpetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelpetugasMouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel27.setText("Data Petugas");

        pane6.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout pane6Layout = new javax.swing.GroupLayout(pane6);
        pane6.setLayout(pane6Layout);
        pane6Layout.setHorizontalGroup(
            pane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        pane6Layout.setVerticalGroup(
            pane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelpetugasLayout = new javax.swing.GroupLayout(panelpetugas);
        panelpetugas.setLayout(panelpetugasLayout);
        panelpetugasLayout.setHorizontalGroup(
            panelpetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpetugasLayout.createSequentialGroup()
                .addComponent(pane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelpetugasLayout.setVerticalGroup(
            panelpetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pane6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelresep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelkonsumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paneldashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelkacamata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelreport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paneltransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelpetugas, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(paneldashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelkonsumen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelresep, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelkacamata, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paneltransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(panelreport, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelpetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 180, 430));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnnext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnnext.setText("Next");
        btnnext.setPreferredSize(new java.awt.Dimension(63, 30));
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btndelete.setText("Delete");
        btndelete.setPreferredSize(new java.awt.Dimension(63, 30));
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnedit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnedit.setText("Edit");
        btnedit.setPreferredSize(new java.awt.Dimension(63, 30));
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnsave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnsave.setText("Save");
        btnsave.setPreferredSize(new java.awt.Dimension(63, 30));
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnnew.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnnew.setText("New");
        btnnew.setPreferredSize(new java.awt.Dimension(63, 30));
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnnew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, 130, 300));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Konsumen");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(577, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 770, 40));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/100x86.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 100));

        setSize(new java.awt.Dimension(990, 566));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelkonsumenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelkonsumenMouseClicked
        int baris = tabelkonsumen.rowAtPoint(evt.getPoint());

        String ID_Konsumen =tabelkonsumen.getValueAt(baris, 0).toString();
        txtidkonsumen.setText(ID_Konsumen);

        String Nama_konsumen =tabelkonsumen.getValueAt(baris, 1).toString();
        txtnamakonsumen.setText(Nama_konsumen);

        String Alamat =tabelkonsumen.getValueAt(baris, 2).toString();
        txtalamat.setText(Alamat);

        String Jenis_kelamin = tabelkonsumen.getValueAt(baris, 3).toString();
        cmbjeniskelamin.setSelectedItem(Jenis_kelamin);

        String Umur =tabelkonsumen.getValueAt(baris, 4).toString();
        txtumur.setText(Umur);

        String No_hp =tabelkonsumen.getValueAt(baris, 5).toString();
        txtnohp.setText(No_hp);
    }//GEN-LAST:event_tabelkonsumenMouseClicked

    private void paneldashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneldashboardMouseClicked
        new dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_paneldashboardMouseClicked

    private void paneldashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneldashboardMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_paneldashboardMousePressed

    private void paneltransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneltransaksiMouseClicked
        new form_transaksi().setVisible(true);
        dispose();
    }//GEN-LAST:event_paneltransaksiMouseClicked

    private void paneltransaksiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneltransaksiMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_paneltransaksiMousePressed

    private void panelkacamataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelkacamataMouseClicked
        new form_kacamata().setVisible(true);
        dispose();
    }//GEN-LAST:event_panelkacamataMouseClicked

    private void panelkacamataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelkacamataMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelkacamataMousePressed

    private void panelresepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelresepMouseClicked
        new form_resep().setVisible(true);
        dispose();
    }//GEN-LAST:event_panelresepMouseClicked

    private void panelresepMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelresepMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelresepMousePressed

    private void panelkonsumenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelkonsumenMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelkonsumenMouseClicked

    private void panelkonsumenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelkonsumenMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelkonsumenMousePressed

    private void panelreportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelreportMouseClicked
        Connection conn = null;
        try {    
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex){
            Logger.getLogger(form_transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cahaya_permata_optical", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(form_transaksi.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        String file = "F:\\NetBeansProjects\\SI_CAPER\\src\\report\\report1.jrxml";
        JasperReport jr;
        try {
            jr = JasperCompileManager.compileReport(file);           
            JasperPrint jp = JasperFillManager.fillReport(jr,null, conn);
            JasperViewer.viewReport(jp);
        } catch (JRException ex) {
            Logger.getLogger(form_transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
                            
    }//GEN-LAST:event_panelreportMouseClicked

    private void panelreportMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelreportMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelreportMousePressed

    private void panelpetugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelpetugasMouseClicked
        new form_petugas().setVisible(true);
        dispose();
    }//GEN-LAST:event_panelpetugasMouseClicked

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        new form_resep().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        String id_konsumen = txtidkonsumen.getText();

        try {
            Statement statement = (Statement)connect.GetConnection() .createStatement();
            statement.executeUpdate("DELETE from konsumen where ID_Konsumen=('" +id_konsumen+ "');");
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            txtidkonsumen.setText("");
            txtnamakonsumen.setText("");
            txtalamat.setText("");
            txtumur.setText("");
            String Jenis_kelamin = null;
            txtnohp.setText("");
            txtidkonsumen.requestFocus();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
        datatable();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        try {
            String sql ="UPDATE Konsumen SET ID_Konsumen = '"+txtidkonsumen.getText()+"', "
            + "Nama_konsumen = '"+txtnamakonsumen.getText()+"', Alamat = '"+txtalamat.getText()+"', "
            + "Jenis_kelamin = '"+cmbjeniskelamin.getSelectedItem()+"', Umur = '"+txtumur.getText()+"', "
            + "No_hp = '"+txtnohp.getText()+"' WHERE ID_Konsumen = '"+txtidkonsumen.getText()+"'";
            java.sql.Connection conn=(Connection)connect.GetConnection();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        datatable();
    }//GEN-LAST:event_btneditActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        String ID_Konsumen = txtidkonsumen.getText();
        String Nama_konsumen = txtnamakonsumen.getText();
        String Alamat = txtalamat.getText();
        Object Jenis_kelamin = cmbjeniskelamin.getSelectedItem();
        String Umur = txtumur.getText();
        String No_hp = txtnohp.getText();

        try{
            if (txtidkonsumen.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "ID tidak boleh kosong");
            } else {
                Statement statement = (Statement)connect.GetConnection().createStatement();
                statement.executeUpdate("insert into konsumen VALUES ('" +ID_Konsumen+ "', '"
                    +Nama_konsumen+ "', '" +Alamat+ "', '" +Jenis_kelamin+"','" +Umur+ "', '"+No_hp+"');");
                statement.close();
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
        }
        datatable();
        kosong();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        kosong();
        datatable();
    }//GEN-LAST:event_btnnewActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        try {
            Statement statement = (Statement)connect.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from konsumen where + "
                + "ID_Konsumen='" + txtidkonsumen.getText() + "'");
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("ID Konsumen");
            tbl.addColumn("Nama Konsumen");
            tbl.addColumn("Alamat");
            tbl.addColumn("Jenis Kelamin");
            tbl.addColumn("Umur");
            tbl.addColumn("NO.HP");

            tabelkonsumen.setModel(tbl);
            while (res.next()){
                tbl.addRow(new Object[] {
                    res.getString("ID_Konsumen"),
                    res.getString("Nama_konsumen"),
                    res.getString("Alamat"),
                    res.getString("Jenis_kelamin"),
                    res.getString("Umur"),
                    res.getString("No_hp")
                });
                tabelkonsumen.setModel(tbl);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "salah");
        }
    }//GEN-LAST:event_btncariActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form_konsumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_konsumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_konsumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_konsumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_konsumen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnsave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbjeniskelamin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel pane1;
    private javax.swing.JPanel pane2;
    private javax.swing.JPanel pane3;
    private javax.swing.JPanel pane4;
    private javax.swing.JPanel pane5;
    private javax.swing.JPanel pane6;
    private javax.swing.JPanel paneldashboard;
    private javax.swing.JPanel panelkacamata;
    private javax.swing.JPanel panelkonsumen;
    private javax.swing.JPanel panelpetugas;
    private javax.swing.JPanel panelreport;
    private javax.swing.JPanel panelresep;
    private javax.swing.JPanel paneltransaksi;
    private javax.swing.JTable tabelkonsumen;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtidkonsumen;
    private javax.swing.JTextField txtnamakonsumen;
    private javax.swing.JTextField txtnohp;
    private javax.swing.JTextField txtumur;
    // End of variables declaration//GEN-END:variables
}

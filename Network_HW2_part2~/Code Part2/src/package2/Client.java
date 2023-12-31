package package2;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.ListModel;


public class Client extends javax.swing.JFrame {

    DatagramSocket soketData;
    String userName;
    String localIp;
    int localPort;
    String remotIp;
    int remotPort;
    InetAddress remot_IPAddress;
    byte[] sendBuffer;
    DatagramPacket sendPacket;
    byte[] reveiveBuffer;
    DatagramPacket receivePacket;
    boolean con = false;
    boolean loggedIn = false;

    public Client() {
        initComponents();
        textPaneArea.setEditable(false);
        Remot_IP.setEditable(false);
        Remot_Port.setEditable(false);
        myFrame.setForeground(Color.getHSBColor(66, 132, 144));
        myFrame.setText("Enter text here");
        userName = "";
        localIp = "";
        localPort = 0;
        remotIp = "";
        remotPort = 0;
        reveiveBuffer = new byte[50];
        receivePacket = new DatagramPacket(reveiveBuffer, reveiveBuffer.length);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        myFrame = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        serIp = new javax.swing.JTextField();
        setPort = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Local_IP = new javax.swing.JTextField();
        Local_Port = new javax.swing.JTextField();
        Remot_IP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Remot_Port = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        online_user = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        Send = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        textPaneArea = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        SendToAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Username :");

        username.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        username.setToolTipText("");
        username.setPreferredSize(new java.awt.Dimension(7, 28));

        login.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 0, 51));
        login.setText("Login");
        login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(204, 204, 204)));
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("Logout");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(204, 204, 204)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        myFrame.setColumns(20);
        myFrame.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        myFrame.setLineWrap(true);
        myFrame.setRows(5);
        myFrame.setWrapStyleWord(true);
        myFrame.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inAreaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inAreaFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(myFrame);

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TCP Server Port :");

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Avilable Interfaces");

        serIp.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        serIp.setToolTipText("");
        serIp.setPreferredSize(new java.awt.Dimension(7, 28));
        serIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serIpActionPerformed(evt);
            }
        });

        setPort.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        setPort.setToolTipText("");
        setPort.setPreferredSize(new java.awt.Dimension(7, 28));
        setPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serPortActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TCP Server IP :");

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loopback Pseudo-Interface 1: 137.0.0.1", "Wi-Fi :192.168.1.112", "Ethernet: 169.254.49.56" }));

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Local Port :");

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Local IP :");

        Local_IP.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        Local_IP.setToolTipText("");
        Local_IP.setPreferredSize(new java.awt.Dimension(7, 28));
        Local_IP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Local_IPActionPerformed(evt);
            }
        });

        Local_Port.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        Local_Port.setToolTipText("");
        Local_Port.setPreferredSize(new java.awt.Dimension(7, 28));
        Local_Port.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Local_PortActionPerformed(evt);
            }
        });

        Remot_IP.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        Remot_IP.setToolTipText("");
        Remot_IP.setPreferredSize(new java.awt.Dimension(7, 28));
        Remot_IP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remot_IPActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Remote IP :");

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Remote Port :");

        Remot_Port.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        Remot_Port.setToolTipText("");
        Remot_Port.setPreferredSize(new java.awt.Dimension(7, 28));
        Remot_Port.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remot_PortActionPerformed(evt);
            }
        });

        online_user.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                online_userValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(online_user);

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Online Users");
        jLabel9.setForeground(new java.awt.Color(0, 0, 128));

        Send.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        Send.setForeground(new java.awt.Color(0, 153, 153));
        Send.setText("Send");
        Send.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(204, 204, 204)));
        Send.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Status :");

        status.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        status.setToolTipText("");
        status.setPreferredSize(new java.awt.Dimension(7, 28));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textPaneArea.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        textPaneArea.setFocusCycleRoot(false);
        jScrollPane4.setViewportView(textPaneArea);

        jLabel11.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Password :");

        SendToAll.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        SendToAll.setForeground(new java.awt.Color(0, 153, 153));
        SendToAll.setText("Send to all");
        SendToAll.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 126, 255)));
        SendToAll.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SendToAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendToAllActionPerformed(evt);
            }
        });
        

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setBackground(new java.awt.Color(93, 173, 226));

        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(password)
                                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(serIp, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(setPort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Send, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(Local_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Local_Port, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Remot_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Remot_Port, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SendToAll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(76, 76, 76)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Send, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SendToAll, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                    .addComponent(password))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(serIp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setPort, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Local_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Local_Port, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Remot_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Remot_Port, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    DefaultListModel dlm;
    DataInputStream dataFromServer;
    DataInputStream DataInputStream;
    DataOutputStream dataToServer;
    Socket serverSocket;
    Read r;
    Receive channel;
    boolean t = false;
    boolean j = false;
    
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        if (username.getText().equals("") || password.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "You should enter user name and password");
        }else if (serIp.getText().equals("") || Local_IP.getText().equals("") || Local_Port.getText().equals("")
                || setPort.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You should enter TCP IP, TCP Port, Local IP and Local Port");
        }else if (!loggedIn) {
            
            String passText = new String(password.getPassword());
            boolean CheckLogin = false;
            try {
                CheckLogin = CheckLogin(passText, username.getText());
            } catch (Exception ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (CheckLogin) {
                ///////////////////////////////////////////////////////////////////////////////
                userName = username.getText().trim();
                String TcpIP = serIp.getText();
                int TcpPort = Integer.valueOf(setPort.getText().trim());
                String localIP = Local_IP.getText();
                localPort = Integer.valueOf(Local_Port.getText().trim());
                con = true;
                localIp = Local_IP.getText();
                localPort = Integer.parseInt(Local_Port.getText());
                
                try {
                    soketData = new DatagramSocket(localPort);
                } catch (SocketException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
                    serverSocket = new Socket(InetAddress.getByName(TcpIP), TcpPort, InetAddress.getByName(localIP), localPort);
                    dataFromServer = new DataInputStream(serverSocket.getInputStream());
                    dataToServer = new DataOutputStream(serverSocket.getOutputStream());
                    dataToServer.writeUTF(userName);
                    String s;
                    DataInputStream = new DataInputStream(serverSocket.getInputStream());
                    s = DataInputStream.readUTF();
                    
                    if (s.equals("founded")) {
                    JOptionPane.showMessageDialog(null, "You are already logged in!\n", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }else if (s.equals("accept")) {
                        dlm = new DefaultListModel();
                        online_user.setModel(dlm);
                        r = new Read(userName);
                        r.start();
                    }

                    j = true;
                    channel = new Receive(this);
                    channel.start();
                    t = true;
                    JOptionPane.showMessageDialog(null, "You are logged in successfully");
                    loggedIn = true;

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "local is  already used");
                }
                ///////////////////////////////////////////////////////////////////////////////
              
            }else {
                JOptionPane.showMessageDialog(null, "invalid login information, either user name or password");
            }
            
        }else {
            JOptionPane.showMessageDialog(null, "You are already logged in");
        }
    }//GEN-LAST:event_loginActionPerformed


    class Read extends Thread {

        String userName;

        public Read(String userName) {
            this.userName = userName;

        }

        public void run() {
            while (j) {
                try {
                    String inputData = dataFromServer.readUTF();
                    if (inputData.equals("logout")) {
                        break;
                    }
                    if (inputData.contains("add to list")) {
                        inputData = inputData.substring(11);
                        dlm.clear();
                        StringTokenizer st = new StringTokenizer(inputData, "&?");
                        while (st.hasMoreTokens()) {
                            String line = st.nextToken();
                            String[] tokens = line.split(",");
                            if (!tokens[0].equals(userName)) {
                                String element = new String(tokens[0] + "," + tokens[2] + "," + tokens[1]);
                                dlm.addElement(element);
                            }
                        }
                    }
                } catch (IOException ex) {

                }

            }
        }
    }

    private void serIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serIpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serIpActionPerformed

    private void serPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serPortActionPerformed

    private void Local_IPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Local_IPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Local_IPActionPerformed

    private void Local_PortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Local_PortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Local_PortActionPerformed

    private void Remot_IPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remot_IPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Remot_IPActionPerformed

    private void Remot_PortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remot_PortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Remot_PortActionPerformed

    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed
        // TODO add your handling code here:
        try {
            if (!con) {
                JOptionPane.showMessageDialog(null, "You can't send, pleace Login first");
            } else if (Remot_IP.getText().equals("") || Remot_Port.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "You should select a user from the online user list");
            } else if (myFrame.getText().equals("") || myFrame.getText().equals("enter text here")) {
                JOptionPane.showMessageDialog(null, "Your message is Empty");
            } else {
                userName = username.getText();
                remotIp = Remot_IP.getText();
                remotPort = Integer.parseInt(Remot_Port.getText());
                remot_IPAddress = InetAddress.getByName(remotIp);
                String msg = myFrame.getText();
                myFrame.setText("");
                StyledDocument doc = textPaneArea.getStyledDocument();
                Style style = textPaneArea.addStyle("", null);
                StyleConstants.setForeground(style, Color.RED);
                StyleConstants.setBackground(style, Color.white);
                //___________________________________________________________________________________________________
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                String s1 = "Me: " + msg + " From " + localPort + " At time: " + sdf.format(timestamp) + "\n";
                //___________________________________________________________________________________________________
                doc.insertString(doc.getLength(), s1, style);
                msg = userName + ": " + msg;
                sendBuffer = msg.getBytes();
                sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, remot_IPAddress, remotPort);
                soketData.send(sendPacket);
            }
        } catch (UnknownHostException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | BadLocationException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SendActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void inAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inAreaFocusGained
        // TODO add your handling code here:
        if (myFrame.getText().equals("enter text here")) {
            myFrame.setText("");
            myFrame.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_inAreaFocusGained

    private void inAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inAreaFocusLost
        // TODO add your handling code here:
        if (myFrame.getText().isEmpty()) {
            myFrame.setForeground(Color.GRAY);
            myFrame.setText("enter text here");
        }
    }//GEN-LAST:event_inAreaFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (loggedIn) {
            JOptionPane.showMessageDialog(null, "You are loged out successfully");
            loggedIn = false;
            t = false;
            j = false;

            try {
                String localIp1 = Local_IP.getText();
                int localPort1 = Integer.parseInt(Local_Port.getText());
                InetAddress remot_IPAddress1 = InetAddress.getByName(localIp1);
                String msg = "logout";
                sendBuffer = msg.getBytes();
                sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, remot_IPAddress1, localPort1);
                soketData.send(sendPacket);
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            String s = "logout";
            try {
                dataToServer.writeUTF(s);

            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            dlm.clear();

            try {
                soketData.close();
                serverSocket.close();
                DataInputStream.close();
                dataFromServer.close();
                dataToServer.close();

            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "You are already loged out");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void online_userValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_online_userValueChanged
        // TODO add your handling code here:
        try {
            int x = online_user.getModel().getSize();
            if (!evt.getValueIsAdjusting() && x != 0) {
                String s = (online_user.getSelectedValue().toString());
                String[] tokens = s.split(",");
                Remot_IP.setText(tokens[1]);
                Remot_Port.setText(tokens[2]);
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_online_userValueChanged

    private void SendToAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendToAllActionPerformed
        // TODO add your handling code here:
        try {
            if (!con) {
                JOptionPane.showMessageDialog(null, "You can't send, pleace Login first");
            } else if (myFrame.getText().equals("") || myFrame.getText().equals("cpuld you enter your massage here")) {
                JOptionPane.showMessageDialog(null, "You can't send empty message");
            } else {
                int x = online_user.getModel().getSize();
                ListModel model = online_user.getModel();
                int onetime = 0;
                
                for (int i = 0; i < x; i++) {
                    String s = (model.getElementAt(i).toString());
                    String[] tokens = s.split(",");
                    remotIp = tokens[1];
                    remotPort = Integer.parseInt(tokens[2]);
                    
                    userName = username.getText();
                    remot_IPAddress = InetAddress.getByName(remotIp);
                    String msg = myFrame.getText();
                    StyledDocument doc = textPaneArea.getStyledDocument();
                    Style style = textPaneArea.addStyle("", null);
                    StyleConstants.setForeground(style, Color.RED);
                    StyleConstants.setBackground(style, Color.white);
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                    if (onetime == 0) {
                        onetime = 1;
                        String s1 = "Me: " + msg+" From " + localPort + " At time: " + sdf.format(timestamp) + "\n";
                        doc.insertString(doc.getLength(), s1, style);
                    }
                    msg = userName + ": " +msg ;
                    sendBuffer = msg.getBytes();
                    sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, remot_IPAddress, remotPort);
                    soketData.send(sendPacket);
                }
                myFrame.setText(""); 
            }
            
        } 
        catch (Exception  ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SendToAllActionPerformed
    
    void receive() {
        try {
            if (t) {
            	
                StyledDocument doc = textPaneArea.getStyledDocument();
                Style style = textPaneArea.addStyle("", null);
                soketData.receive(receivePacket);
                String msg = new String(reveiveBuffer, 0, receivePacket.getLength());
                if (msg.equals("Logout")) {
                    return;
                }
                InetAddress S_IPAddress = receivePacket.getAddress();
                StyleConstants.setForeground(style, Color.BLUE.brighter());
                StyleConstants.setBackground(style, Color.LIGHT_GRAY);
                int Sport = receivePacket.getPort();
                //___________________________________________________________________________________________________
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");                
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                String userdisp = username.getText();
                String s1 = msg + " From " + Sport + " At time: " + sdf.format(timestamp) + "\n";
                //___________________________________________________________________________________________________
                doc.insertString(doc.getLength(), s1, style);
                String s = S_IPAddress.getHostAddress();
                status.setText("Received From : "+ userdisp+"    IP= " + s + ", port: " + Sport);
            }
        } catch (IOException | BadLocationException ex) {

        }
    }

    
    boolean CheckLogin(String password, String name) throws Exception
    {
        boolean checkLogin = false;
        String YourInfo = name + " " + password;
        String fileName = "C:\\Users\\Azhar Shhadeh\\Downloads\\New folder\\New folder\\Network Part2\\Network Part2\\Code Part2\\info.txt";
        Path path = Paths.get(fileName);
        List <String> allInfo = Files.readAllLines(path, StandardCharsets.UTF_8);
        for(int i = 0; i < allInfo.size(); i++)
        {
            if(allInfo.get(i).equalsIgnoreCase(YourInfo))
            {
                checkLogin = true;
                break;
            }
        }
        return checkLogin;
    }

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new Client().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Local_IP;
    private javax.swing.JTextField Local_Port;
    private javax.swing.JTextField Remot_IP;
    private javax.swing.JTextField Remot_Port;
    private javax.swing.JButton Send;
    private javax.swing.JButton SendToAll;
    private javax.swing.JTextArea myFrame;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton login;
    private javax.swing.JList<String> online_user;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField serIp;
    private javax.swing.JTextField setPort;
    private javax.swing.JTextField status;
    private javax.swing.JTextPane textPaneArea;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;


import Model.Brand;
import Model.Phone;
import Model.Registry;
import com.sun.java.accessibility.util.AWTEventMonitor;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static sun.io.Win32ErrorMode.initialize;

/**
 *
 * @author Chamara
 */
public class Mobile extends javax.swing.JFrame {

    Registry registry;

    private String brand;
    private String Model;
    private String color;
    private int ram;
    private double camera;
    private double price;
    private int storage;
    private double screenSize;
    private boolean waterproof;

    public Mobile() {
        initComponents();
       // jPanel4.setVisible(false);
        registry = new Registry();
        initialize();
    }

    public Mobile(String brand, String Model, int ram, String color, int storage, double screenSize, boolean waterproof, double camera, double price) {
        this.brand = brand;
        this.Model = Model;
        this.ram = ram;
        this.color = color;
        this.storage = storage;
        this.screenSize = screenSize;
        this.waterproof = waterproof;
        this.camera = camera;
        this.price = price;

    }

    private Map<Brand, Phone> phones = new HashMap<>();

    public Phone getPhone(Brand brand) {
        Phone phone = null;
        try {
            phone = (Phone) phones.get(brand).clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return phone;
    }

    private void initialize() {
        Phone s = new Phone() {
        };
        s.setModel(Model);
        s.setBrand(brand);
        s.setCamera(camera);
        s.setColor(color);
        s.setStorage(storage);
        s.setRam(ram);
        s.setDisplay(screenSize);
        s.setPrice(price);
        s.setWaterproof(waterproof);

        phones.put(Brand.SAMSUNG, s);
        phones.put(Brand.APPLE, s);
        phones.put(Brand.HUAWEI, s);
    }

    @Override
    public String toString() {
        return brand
                + Model
                + ram
                + color
                + storage
                + screenSize
                + waterproof
                + camera
                + price;
    }

    
    //bill
    
    public void addTable(String Name, Double Price) {

        String Qty = JOptionPane.showInputDialog("Enter Qty");
        Double tqty = Double.valueOf(Qty);
        Double Tot_Price = Price * tqty;

        DecimalFormat df = new DecimalFormat("00.00");
        String d11 = df.format(Tot_Price);

        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();

        Vector v = new Vector();
        v.add(Name);
        v.add(Qty);
        v.add(d11);
        dt.addRow(v);

        cart_cal();
    }

    public void cart_cal() {

        int numofrow = jTable1.getRowCount();
        double total = 0;
        for (int i = 0; i < numofrow; i++) {
            double value = Double.valueOf(jTable1.getValueAt(i, 2).toString());
            total += value;

        }

        DecimalFormat df = new DecimalFormat("00.00");
        String d1 = df.format(total);
        Too.setText(d1);

    }

    public void bill_print() {

        try {
            bill.setText("                                   NeZZeX Mobile Solution \n"
            );
            bill.setText(bill.getText() + "    589/ King Road, \n");
            bill.setText(bill.getText() + "    Colombo, Srilanka, \n");
            bill.setText(bill.getText() + "    +9411 123456789, \n");
            bill.setText(bill.getText() + "--------------------------------------------\n");
            bill.setText(bill.getText() + " Iteam\tQty\tPrice\n");
            bill.setText(bill.getText() + "--------------------------------------------\n");

            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
            for (int i = 0; i < jTable1.getRowCount(); i++) {

                String name = df.getValueAt(i, 0).toString();
                String qt = df.getValueAt(i, 1).toString();
                String prc = df.getValueAt(i, 2).toString();


                bill.setText(bill.getText() + name + "\t" + qt + "\t" + prc + " \n");

            }
            bill.setText(bill.getText() + "--------------------------------------------\n");
            bill.setText(bill.getText() + "SubTotal :\t" + Too.getText() + "\n");
            bill.setText(bill.getText() + "Cash :\t" + Cash.getText() + "\n");
            bill.setText(bill.getText() + "Ballance :\t" + Bal.getText() + "\n");
            bill.setText(bill.getText() + "====================================\n");
            bill.setText(bill.getText() + "             Thanks For Your Business...!" + "\n");
            // bill.setText(bill.getText() + "---------------------------------------------n");
            bill.setText(bill.getText() + "             Software by Chamara Kasun" + "\n");

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();

            bill.setText(bill.getText() + "             " + dtf.format(now) + "\n");

            bill.print();

        } catch (PrinterException ex) {

        }

    }

    public String description;

    public String getDescription() {
        return description;
    }

    public double cost() {

        return 0;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox13 = new javax.swing.JComboBox<>();
        jComboBox14 = new javax.swing.JComboBox<>();
        jComboBox15 = new javax.swing.JComboBox<>();
        jComboBox16 = new javax.swing.JComboBox<>();
        jComboBox17 = new javax.swing.JComboBox<>();
        jComboBox18 = new javax.swing.JComboBox<>();
        jRadioButton24 = new javax.swing.JRadioButton();
        brand1 = new javax.swing.JLabel();
        model1 = new javax.swing.JLabel();
        ram1 = new javax.swing.JLabel();
        gpu1 = new javax.swing.JLabel();
        procesor1 = new javax.swing.JLabel();
        hard1 = new javax.swing.JLabel();
        screen1 = new javax.swing.JLabel();
        wifi1 = new javax.swing.JLabel();
        bluetooth1 = new javax.swing.JLabel();
        os1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        bill = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Too = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Bal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Cash = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(java.awt.Color.darkGray);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(42, 39, 41));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pexels-pixabay-270283-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 580, 420));

        jPanel2.setBackground(new java.awt.Color(42, 39, 41));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 153, 0));
        jLabel15.setText("If You want to ");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 153, 0));
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 200, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 153, 0));
        jLabel17.setText("build up Mobile on custermer requirement");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 410, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 153, 0));
        jLabel18.setText("now you can apply they want item.");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 410, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        jLabel2.setBackground(java.awt.Color.darkGray);
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Setup Laptop");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 330, 60));

        jLabel21.setBackground(new java.awt.Color(192, 27, 54));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel21.setOpaque(true);
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 100, 90));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/left_2_30px.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 30, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/closing.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, 30, 30));

        jLabel20.setBackground(new java.awt.Color(192, 27, 54));
        jLabel20.setOpaque(true);
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 790, 10));

        jPanel6.setBackground(new java.awt.Color(42, 39, 41));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 153, 0));
        jLabel31.setText("Brand");

        jRadioButton7.setBackground(new java.awt.Color(42, 39, 41));
        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setText("SAMSUNG");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton8.setBackground(new java.awt.Color(42, 39, 41));
        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setText("APPLE");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton9.setBackground(new java.awt.Color(42, 39, 41));
        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jRadioButton9.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setText("HUAWEI");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 153, 0));
        jLabel32.setText("Model");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 153, 0));
        jLabel33.setText("RAM (GB)");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 153, 0));
        jLabel34.setText("COLOR");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 153, 0));
        jLabel35.setText("CAMERA");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 153, 0));
        jLabel36.setText("STORAGE");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 153, 0));
        jLabel37.setText("Screen Size (inches)");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 153, 0));
        jLabel38.setText("WATER ROOF");

        jButton3.setBackground(java.awt.Color.darkGray);
        jButton3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Set Up");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox13.setBackground(new java.awt.Color(42, 39, 41));
        jComboBox13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jComboBox13.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please select the brand" }));
        jComboBox13.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox13ItemStateChanged(evt);
            }
        });
        jComboBox13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox13MouseClicked(evt);
            }
        });
        jComboBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox14.setBackground(new java.awt.Color(42, 39, 41));
        jComboBox14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jComboBox14.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "6", "8" }));
        jComboBox14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox14MouseClicked(evt);
            }
        });
        jComboBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox14ActionPerformed(evt);
            }
        });

        jComboBox15.setBackground(new java.awt.Color(42, 39, 41));
        jComboBox15.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jComboBox15.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blue", "White", "Ash", "Black" }));

        jComboBox16.setBackground(new java.awt.Color(42, 39, 41));
        jComboBox16.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jComboBox16.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "13" }));
        jComboBox16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox16MouseClicked(evt);
            }
        });

        jComboBox17.setBackground(new java.awt.Color(42, 39, 41));
        jComboBox17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jComboBox17.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "16", "32", "64", "128", "256" }));
        jComboBox17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox17MouseClicked(evt);
            }
        });

        jComboBox18.setBackground(new java.awt.Color(42, 39, 41));
        jComboBox18.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jComboBox18.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "5.5", "6", "6.5" }));
        jComboBox18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox18MouseClicked(evt);
            }
        });

        jRadioButton24.setBackground(new java.awt.Color(42, 39, 41));
        jRadioButton24.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jRadioButton24.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton24.setText("Yes");
        jRadioButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jRadioButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton9))
                            .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton24)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton24))
                .addGap(50, 50, 50)
                .addComponent(jButton3)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 400, 480));

        brand1.setBackground(java.awt.Color.darkGray);
        brand1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        brand1.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(brand1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 130, 24));

        model1.setBackground(java.awt.Color.darkGray);
        model1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        model1.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(model1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 180, 24));

        ram1.setBackground(java.awt.Color.darkGray);
        ram1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ram1.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(ram1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 76, 24));

        gpu1.setBackground(java.awt.Color.darkGray);
        gpu1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        gpu1.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(gpu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 76, 24));

        procesor1.setBackground(java.awt.Color.darkGray);
        procesor1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        procesor1.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(procesor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 76, 24));

        hard1.setBackground(java.awt.Color.darkGray);
        hard1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        hard1.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(hard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 91, 24));

        screen1.setBackground(java.awt.Color.darkGray);
        screen1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        screen1.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(screen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 127, 24));

        wifi1.setBackground(java.awt.Color.darkGray);
        wifi1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        wifi1.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(wifi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 210, 24));

        bluetooth1.setBackground(java.awt.Color.darkGray);
        bluetooth1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        bluetooth1.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(bluetooth1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, 160, 24));

        os1.setBackground(java.awt.Color.darkGray);
        os1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        os1.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(os1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 680, 136, 24));

        jTable1.setBackground(java.awt.Color.darkGray);
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "iteam", "Qty", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 360, 330));

        bill.setBackground(java.awt.Color.darkGray);
        bill.setColumns(20);
        bill.setForeground(new java.awt.Color(255, 255, 255));
        bill.setRows(5);
        bill.setBorder(null);
        jScrollPane2.setViewportView(bill);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 390, 360, 370));

        jPanel3.setBackground(java.awt.Color.darkGray);
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total :");

        Too.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Too.setForeground(new java.awt.Color(255, 255, 255));
        Too.setText("0");
        Too.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TooMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Balance :");

        Bal.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Bal.setForeground(new java.awt.Color(255, 0, 51));
        Bal.setText("0");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cash :");

        Cash.setBackground(java.awt.Color.darkGray);
        Cash.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Cash.setForeground(new java.awt.Color(255, 153, 0));
        Cash.setText("0");
        Cash.setBorder(null);
        Cash.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cash, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Too, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Too))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Bal))
                .addGap(140, 140, 140))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, 200, 114));

        jButton13.setBackground(new java.awt.Color(192, 27, 54));
        jButton13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("PAY");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 640, 104, 32));

        jButton14.setBackground(new java.awt.Color(42, 39, 41));
        jButton14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Print");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 680, 104, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1192, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        new Frame().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        Double tot = Double.valueOf(Too.getText());
        Double chs = Double.valueOf(Cash.getText());
        Double bal = chs - tot;

        DecimalFormat df = new DecimalFormat("00.00");
        Bal.setText(String.valueOf(df.format(bal)));

      


    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        bill_print();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void TooMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TooMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TooMouseClicked

    private void CashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_CashActionPerformed

    private void jRadioButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton22ActionPerformed
        addTable("Water Roof", 25000.00);
    }//GEN-LAST:event_jRadioButton22ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
      //  addTable(selected);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Model = jComboBox13.getSelectedItem().toString();
        ram = Integer.parseInt((String) jComboBox14.getSelectedItem()) ;
        color = jComboBox15.getSelectedItem().toString();
        camera = Double.parseDouble((String) jComboBox16.getSelectedItem()) ;
        storage = Integer.parseInt((String) jComboBox17.getSelectedItem()) ;
        screenSize = Double.parseDouble((String) jComboBox18.getSelectedItem());

        if (jRadioButton7.isSelected()) {

            Phone samsungPhone = (Phone) getPhone(Brand.SAMSUNG);
            samsungPhone.setModel(Model);
            samsungPhone.setBrand(brand);
            samsungPhone.setCamera(camera);
            samsungPhone.setColor(color);
            samsungPhone.setStorage(storage);
            samsungPhone.setRam(ram);
            samsungPhone.setDisplay(screenSize);
            samsungPhone.setPrice(price);
            samsungPhone.setWaterproof(waterproof);
            if(jRadioButton24.isSelected()){
                waterproof = true;
            }else{
                waterproof = false;
            }
            System.out.println(samsungPhone);
           

            brand1.setText(brand);
            model1.setText(Model);
            ram1.setText(ram+" GB");
            gpu1.setText(color);
            procesor1.setText(camera+" pixel");
            hard1.setText(storage+" GB");
            screen1.setText(screenSize+" inches");
            if(waterproof){
                wifi1.setText("waterproof function");
            }else{
                wifi1.setText("Without waterproof Function");
            }

        } else if (jRadioButton8.isSelected()) {

            Phone applePhone = (Phone) getPhone(Brand.APPLE);
            applePhone.setModel(Model);
            applePhone.setBrand(brand);
            applePhone.setCamera(camera);
            applePhone.setColor(color);
            applePhone.setStorage(storage);
            applePhone.setRam(ram);
            applePhone.setDisplay(screenSize);
            applePhone.setPrice(price);
            applePhone.setWaterproof(waterproof);
            if(jRadioButton24.isSelected()){
                waterproof = true;
            }else{
                waterproof = false;
            }

            brand1.setText(brand);
            model1.setText(Model);
            ram1.setText(ram+" GB");
            gpu1.setText(color);
            procesor1.setText(camera+" pixel");
            hard1.setText(storage+" GB");
            screen1.setText(screenSize+" inches");
            if(waterproof){
                wifi1.setText("waterproof function");
            }else{
                wifi1.setText("Without waterproof Function");
            }
            System.out.println(applePhone);

        } else if (jRadioButton9.isSelected()) {

            Phone huaweiPhone = (Phone) getPhone(Brand.HUAWEI);
            huaweiPhone.setModel(Model);
            huaweiPhone.setBrand(brand);
            huaweiPhone.setCamera(camera);
            huaweiPhone.setColor(color);
            huaweiPhone.setStorage(storage);
            huaweiPhone.setRam(ram);
            huaweiPhone.setDisplay(screenSize);
            huaweiPhone.setPrice(price);
            huaweiPhone.setWaterproof(waterproof);
            if(jRadioButton24.isSelected()){
                waterproof = true;
            }else{
                waterproof = false;
            }

            brand1.setText(brand);
            model1.setText(Model);
            ram1.setText(ram+" GB");
            gpu1.setText(color);
            procesor1.setText(camera+" pixel");
            hard1.setText(storage+" GB");
            screen1.setText(screenSize+" inches");
            if(waterproof){
                wifi1.setText("waterproof function");
            }else{
                wifi1.setText("Without waterproof Function");
            }
            System.out.println(huaweiPhone);

        } else {

            JOptionPane.showConfirmDialog(rootPane, "Please select the Phone brand", "Success", -1, 1);
        }

        //validation
        //        if ((jRadioButton1.isSelected() == false) && (jRadioButton2.isSelected() == false) && (jRadioButton3.isSelected() == false)) {
            //            JOptionPane.showMessageDialog(null, "Please Select Brand");
            //        }
        //
        //        if ((jRadioButton4.isSelected() == false) && (jRadioButton5.isSelected() == false)) {
            //            JOptionPane.showMessageDialog(null, "Please select Model");
            //        }
        //
        //        if ((jRadioButton7.isSelected() == false) && (jRadioButton8.isSelected() == false) && (jRadioButton9.isSelected() == false)) {
            //            JOptionPane.showMessageDialog(null, "Please Select RAM");
            //        }
        //
        //        if ((jRadioButton10.isSelected() == false) && (jRadioButton11.isSelected() == false) && (jRadioButton12.isSelected() == false)) {
            //            JOptionPane.showMessageDialog(null, "Please Select GPU");
            //        }
        //
        //        if ((jRadioButton13.isSelected() == false) && (jRadioButton14.isSelected() == false)) {
            //            JOptionPane.showMessageDialog(null, "Please select Processor");
            //        }
        //
        //        if ((jRadioButton16.isSelected() == false) && (jRadioButton17.isSelected() == false)) {
            //            JOptionPane.showMessageDialog(null, "Please select Hard Capacity");
            //        }
        //
        //        if ((jRadioButton20.isSelected() == false) && (jRadioButton21.isSelected() == false)) {
            //            JOptionPane.showMessageDialog(null, "Please select Screen Size");
            //        }
        //
        //        if ((jRadioButton22.isSelected() == false) && (jRadioButton22.isSelected() == false)) {
            //            JOptionPane.showMessageDialog(null, "Please select Wi-fi Avalability");
            //        }
        //
        //        if ((jRadioButton25.isSelected() == false) && (jRadioButton26.isSelected() == false)) {
            //            JOptionPane.showMessageDialog(null, "lease select Bluetooth Avalability");
            //        }
        //
        //        if ((jRadioButton28.isSelected() == false) && (jRadioButton29.isSelected() == false)) {
            //            JOptionPane.showMessageDialog(null, "lease select Opareting System");
            //        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed

        // brand = jRadioButton3.getText();
        brand = jRadioButton9.getText();
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Y Series", "P Series", "Nova", "GR5"}));
        addTable("HUAWEI", 50000.00);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        brand = jRadioButton8.getText();
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"iPhone 14", "iPhone 13", "iPhone 12", "iPhone 11"}));
        addTable("APPLE", 100000.00);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        brand = jRadioButton7.getText();
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Samsung Galaxy Z Flip", "Galaxy M52", "Galaxy S22 Ultra", "Galaxy A03 LTE"}));

        addTable("SAMSUNG", 75000.00);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jComboBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox14ActionPerformed
        // table.getSelectedRow(), 1
       
    }//GEN-LAST:event_jComboBox14ActionPerformed

    private void jComboBox13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox13ItemStateChanged
         
    }//GEN-LAST:event_jComboBox13ItemStateChanged

    private void jComboBox13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox13MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jComboBox13MouseClicked

    private void jComboBox14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox14MouseClicked
         addTable("RAM", 10000.00);
    }//GEN-LAST:event_jComboBox14MouseClicked

    private void jComboBox16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox16MouseClicked
        addTable("CAMERA", 5000.00);
    }//GEN-LAST:event_jComboBox16MouseClicked

    private void jComboBox17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox17MouseClicked
       addTable("Storage", 3000.00);
    }//GEN-LAST:event_jComboBox17MouseClicked

    private void jComboBox18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox18MouseClicked
       addTable("Screen", 20000.00);
    }//GEN-LAST:event_jComboBox18MouseClicked

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mobile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mobile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mobile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mobile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mobile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bal;
    private javax.swing.JTextField Cash;
    private javax.swing.JLabel Too;
    private javax.swing.JTextArea bill;
    private javax.swing.JLabel bluetooth1;
    private javax.swing.JLabel brand1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JLabel gpu1;
    private javax.swing.JLabel hard1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel model1;
    private javax.swing.JLabel os1;
    private javax.swing.JLabel procesor1;
    private javax.swing.JLabel ram1;
    private javax.swing.JLabel screen1;
    private javax.swing.JLabel wifi1;
    // End of variables declaration//GEN-END:variables
}

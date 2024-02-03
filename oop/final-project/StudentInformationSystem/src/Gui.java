
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Gui extends javax.swing.JFrame {
    
    private DatabaseHandler db;
    
    private ButtonGroup buttonGroup1;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JPanel jPanel1;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;

    public Gui(DatabaseHandler db) {
        this.db = db;
        initComponents();
    }

    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jTextField5 = new JTextField();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jComboBox1 = new JComboBox<>();
        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new Font("Sitka Text", 1, 30));
        jLabel1.setText("CCIS Student Information");

        jLabel2.setFont(new Font("Sitka Text", 0, 18));
        jLabel2.setText("Gender:");

        jLabel3.setFont(new Font("Sitka Text", 0, 18));
        jLabel3.setText("Last Name:");

        jLabel4.setFont(new Font("Sitka Text", 0, 18));
        jLabel4.setText("Age:");

        jLabel5.setFont(new Font("Sitka Text", 0, 18));
        jLabel5.setText("First Name:");

        jLabel6.setFont(new Font("Sitka Text", 0, 18));
        jLabel6.setText("Program:");

        jLabel7.setFont(new Font("Sitka Text", 0, 18));
        jLabel7.setText("Address:");

        jLabel8.setFont(new Font("Sitka Text", 0, 18));
        jLabel8.setText("Email:");

        jTextField1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        jTextField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        jTextField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        jTextField3.addActionListener((ActionEvent evt) -> {
            jTextField3ActionPerformed(evt);
        });

        jTextField4.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        jTextField4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setForeground(Color.gray);
        jTextField5.setText("(Optional)");
        jTextField5.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        jTextField5.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
            @Override
            public void focusLost(FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });
        jTextField5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new Font("Sitka Text", 0, 18));
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new Font("Sitka Text", 0, 18)); 
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new Font("Sitka Text", 0, 14)); 
        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "(Choose a Program)", "CS", "IT" }));
        jComboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {
                jComboBox1FocusGained(evt);
            }
            @Override
            public void focusLost(FocusEvent evt) {
                jComboBox1FocusLost(evt);
            }
        });
        jComboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new Font("Sitka Text", 1, 16)); 
        jButton1.setText("Clear");

        jButton2.setFont(new Font("Sitka Text", 1, 16));
        jButton2.setText("Save");

        jButton3.setFont(new Font("Sitka Text", 1, 16)); 
        jButton3.setText("Display");
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    jButton3ActionPerformed(evt);
                } catch (SQLException ex) {
                    Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField5, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jTextField4, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jTextField3, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jTextField2, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))
                            .addComponent(jComboBox1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(76, Short.MAX_VALUE))
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField2ActionPerformed(ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField3ActionPerformed(ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField4ActionPerformed(ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField5ActionPerformed(ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField5FocusGained(FocusEvent evt) {                                        
        if (jTextField5.getText().equals("(Optional)")) {
                    jTextField5.setText("");
                    jTextField5.setForeground(Color.BLACK);
                }
    }                                       

    private void jTextField5FocusLost(FocusEvent evt) {                                      
        if (jTextField5.getText().isEmpty()) {
                    jTextField5.setText("(Optional)");
                    jTextField5.setForeground(Color.GRAY);
                }
    }                                     

    private void jRadioButton1ActionPerformed(ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jRadioButton2ActionPerformed(ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jComboBox1ActionPerformed(ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jComboBox1FocusLost(FocusEvent evt) {                                     
        if (jComboBox1.getSelectedItem() == null || jComboBox1.getSelectedItem().toString().isEmpty()) {
            jComboBox1.setForeground(Color.GRAY); 
            jComboBox1.setSelectedItem("(Choose a Program)"); 
        }
    }                                    

    private void jComboBox1FocusGained(FocusEvent evt) {                                       
        if (jComboBox1.getSelectedItem().equals("(Choose a Program)")) {
            jComboBox1.setSelectedItem(null);
        }
        jComboBox1.setForeground(Color.BLACK);
    }                                      

    private void jComboBox1ItemStateChanged(ItemEvent evt) {                                            
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (jComboBox1.getSelectedItem().equals("(Choose a Program)")) {
                jComboBox1.setSelectedItem(null); // Clear the placeholder when an item is selected
                jComboBox1.setForeground(Color.BLACK);
                }
            }
    }                                           

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
        // Spawns database table window
        Table table = new Table(db);
    }
}

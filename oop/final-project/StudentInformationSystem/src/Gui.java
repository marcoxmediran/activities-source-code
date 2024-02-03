
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
    
    private ButtonGroup radioGroup;
    private JButton clearButton;
    private JButton saveButton;
    private JButton displayButton;
    private JComboBox<String> programComboBox;
    private JLabel windowLabel;
    private JLabel genderLabel;
    private JLabel lastNameLabel;
    private JLabel ageLabel;
    private JLabel firstNameLabel;
    private JLabel programLabel;
    private JLabel addressLabel;
    private JLabel emailLabel;
    private JPanel jPanel1;
    private JRadioButton maleRadio;
    private JRadioButton femaleRadio;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField ageField;
    private JTextField addressField;
    private JTextField emailField;

    public Gui(DatabaseHandler db) {
        this.db = db;
        initComponents();
    }

    private void initComponents() {

        radioGroup = new javax.swing.ButtonGroup();
        windowLabel = new JLabel();
        genderLabel = new JLabel();
        lastNameLabel = new JLabel();
        ageLabel = new JLabel();
        firstNameLabel = new JLabel();
        programLabel = new JLabel();
        addressLabel = new JLabel();
        emailLabel = new JLabel();
        firstNameField = new JTextField();
        lastNameField = new JTextField();
        ageField = new JTextField();
        addressField = new JTextField();
        emailField = new JTextField();
        maleRadio = new JRadioButton();
        femaleRadio = new JRadioButton();
        programComboBox = new JComboBox<>();
        jPanel1 = new JPanel();
        clearButton = new JButton();
        saveButton = new JButton();
        displayButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        windowLabel.setFont(new Font("Sitka Text", 1, 30));
        windowLabel.setText("CCIS Student Information");

        genderLabel.setFont(new Font("Sitka Text", 0, 18));
        genderLabel.setText("Gender:");

        lastNameLabel.setFont(new Font("Sitka Text", 0, 18));
        lastNameLabel.setText("Last Name:");

        ageLabel.setFont(new Font("Sitka Text", 0, 18));
        ageLabel.setText("Age:");

        firstNameLabel.setFont(new Font("Sitka Text", 0, 18));
        firstNameLabel.setText("First Name:");

        programLabel.setFont(new Font("Sitka Text", 0, 18));
        programLabel.setText("Program:");

        addressLabel.setFont(new Font("Sitka Text", 0, 18));
        addressLabel.setText("Address:");

        emailLabel.setFont(new Font("Sitka Text", 0, 18));
        emailLabel.setText("Email:");

        firstNameField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        
        lastNameField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        
        ageField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        
        addressField.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        emailField.setForeground(Color.gray);
        emailField.setText("(Optional)");
        emailField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        emailField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
            @Override
            public void focusLost(FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });

        radioGroup.add(maleRadio);
        maleRadio.setFont(new Font("Sitka Text", 0, 18));
        maleRadio.setText("Male");

        radioGroup.add(femaleRadio);
        femaleRadio.setFont(new Font("Sitka Text", 0, 18)); 
        femaleRadio.setText("Female");

        programComboBox.setFont(new Font("Sitka Text", 0, 14)); 
        programComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "(Choose a Program)", "Computer Science", "Information Technology" }));
        programComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        programComboBox.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {
                jComboBox1FocusGained(evt);
            }
            @Override
            public void focusLost(FocusEvent evt) {
                jComboBox1FocusLost(evt);
            }
        });

        clearButton.setFont(new Font("Sitka Text", 1, 16)); 
        clearButton.setText("Clear");
        clearButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               try {
                   clearButtonActionPerformed(evt);
               } catch (SQLException ex) {
                    Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
        });

        saveButton.setFont(new Font("Sitka Text", 1, 16));
        saveButton.setText("Save");
        saveButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent evt) {
               try {
                   saveButtonActionPerformed(evt);
               } catch (SQLException ex) {
                    Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
        });

        displayButton.setFont(new Font("Sitka Text", 1, 16)); 
        displayButton.setText("Display");
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    displayButtonActionPerformed(evt);
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
                .addComponent(clearButton, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(saveButton, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(displayButton, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayButton, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(windowLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameLabel)
                            .addComponent(lastNameLabel)
                            .addComponent(ageLabel)
                            .addComponent(addressLabel)
                            .addComponent(emailLabel)
                            .addComponent(genderLabel)
                            .addComponent(programLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailField, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(addressField, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(ageField, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(lastNameField, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(firstNameField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maleRadio)
                                .addGap(18, 18, 18)
                                .addComponent(femaleRadio))
                            .addComponent(programComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(76, Short.MAX_VALUE))
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(windowLabel)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameField, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameField, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageField, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(maleRadio)
                    .addComponent(femaleRadio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(programLabel)
                    .addComponent(programComboBox, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressField, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                                               

    private void jTextField5FocusGained(FocusEvent evt) {                                        
        if (emailField.getText().equals("(Optional)")) {
                    emailField.setText("");
                    emailField.setForeground(Color.BLACK);
                }
    }                                       

    private void jTextField5FocusLost(FocusEvent evt) {                                      
        if (emailField.getText().isEmpty()) {
                    emailField.setText("(Optional)");
                    emailField.setForeground(Color.GRAY);
                }
    }                        

    private void jComboBox1FocusLost(FocusEvent evt) {                                     
        if (programComboBox.getSelectedItem() == null || programComboBox.getSelectedItem().toString().isEmpty()) {
            programComboBox.setForeground(Color.GRAY); 
            programComboBox.setSelectedItem("(Choose a Program)"); 
        }
    }                                    

    private void jComboBox1FocusGained(FocusEvent evt) {                                       
        if (programComboBox.getSelectedItem().equals("(Choose a Program)")) {
            programComboBox.setSelectedItem(null);
        }
        programComboBox.setForeground(Color.BLACK);
    }                                      

    private void jComboBox1ItemStateChanged(ItemEvent evt) {                                            
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (programComboBox.getSelectedItem().equals("(Choose a Program)")) {
                programComboBox.setSelectedItem(null); // Clear the placeholder when an item is selected
                programComboBox.setForeground(Color.BLACK);
                }
            }
    }                                       
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
        // adds a new student to the database;
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String age = ageField.getText();
        String gender = radioGroup.getSelection() == null ? "" : (maleRadio.isSelected() ? "M" : "F");
        String program = programComboBox.getSelectedIndex() == 0 ? "" : String.valueOf(programComboBox.getSelectedItem());
        String address = addressField.getText();
        String email = emailField.getText().equals("(Optional)") ? "NULL" : emailField.getText();
        Student student = new Student(firstName, lastName, age, gender, program, address, email);
        if (student.isValid()) {
            db.addStudent(student);
            this.clearFields();
        } else {
            JOptionPane.showMessageDialog(null, "Please answer all fields", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                     
    
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
        this.clearFields();
    }

    private void displayButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
        // Spawns database table window
        Table table = new Table(db);
    }
    
    private void clearFields() {
        // clears all fields
        firstNameField.setText("");
        lastNameField.setText("");
        ageField.setText("");
        addressField.setText("");
        emailField.setText("");
        radioGroup.clearSelection();
        programComboBox.setSelectedIndex(0);
    }
}

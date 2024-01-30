import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JollyMcKing extends JFrame implements ActionListener {
    
    JPanel mainPanel;
    JPanel userPanel, passPanel;
    JPanel instructionPanel;
    JPanel checkBoxPanel1, checkBoxPanel2, checkBoxPanel3;
    JPanel radioPanel;
    JPanel billPanel;
    JPanel controlPanel;
    JTextField userField;
    JPasswordField passField;
    JButton ok;
    JCheckBox checkBox1, checkBox2, checkBox3;
    JRadioButton radio1, radio2;
    ButtonGroup radioGroup;
    JComboBox<String> comboBox;
    JButton computeButton;
    JTextField billField;
    JButton clearButton, closeButton;

    public JollyMcKing(String title) {
        // instantiate
        super(title);
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        userPanel = new JPanel();
        userPanel.setLayout(new BoxLayout(userPanel, BoxLayout.LINE_AXIS));
        passPanel = new JPanel();
        passPanel.setLayout(new BoxLayout(passPanel, BoxLayout.LINE_AXIS));
        instructionPanel = new JPanel();
        checkBoxPanel1 = new JPanel();
        checkBoxPanel2 = new JPanel();
        checkBoxPanel3 = new JPanel();
        radioPanel = new JPanel();
        billPanel = new JPanel();
        controlPanel = new JPanel();

        userField = new JTextField("", 20);
        passField = new JPasswordField(20);

        ok = new JButton("OK");

        checkBox1 = new JCheckBox("Value Meal #1: P25.00");
        checkBox2 = new JCheckBox("Value Meal #2: P30.00");
        checkBox3 = new JCheckBox("Value Meal #3: P35.00");

        String[] comboBoxItems = {"Coke", "Sprite", "Root Beer"};
        comboBox = new JComboBox<>(comboBoxItems);

        radio1 = new JRadioButton("Extra Rice");
        radio2 = new JRadioButton("No Extra Rice");
        radioGroup = new ButtonGroup();
        radioGroup.add(radio1);
        radioGroup.add(radio2);

        computeButton = new JButton("Compute");

        billField = new JTextField("0.0", 20);

        clearButton = new JButton("Clear");
        closeButton = new JButton("Close");

        // add mainPanel to Frame
        add(mainPanel);

        // add components to mainPanel
        mainPanel.add(userPanel);
        mainPanel.add(passPanel);
        mainPanel.add(instructionPanel);
        mainPanel.add(checkBoxPanel1);
        mainPanel.add(checkBoxPanel2);
        mainPanel.add(checkBoxPanel3);
        mainPanel.add(radioPanel);
        mainPanel.add(billPanel);
        mainPanel.add(controlPanel);

        // userPanel
        userPanel.add(new JLabel("Username: "));
        userPanel.add(userField);

        // passPanel
        passPanel.add(new JLabel("Password: "));
        passPanel.add(passField);
        passPanel.add(ok);

        // instructionPanel
        instructionPanel.add(new JLabel("Choose your order:"));

        // checkBoxPanel1
        checkBoxPanel1.add(checkBox1);

        // checkBoxPanel2
        checkBoxPanel2.add(checkBox2);

        // checkBoxPanel3
        checkBoxPanel3.add(checkBox3);
        checkBoxPanel3.add(comboBox);

        // radioPanel
        radioPanel.add(radio1);
        radioPanel.add(radio2);
        radioPanel.add(computeButton);

        // billPanel
        billPanel.add(new JLabel("Total Bill is: "));
        billPanel.add(billField);

        // controlPanel
        controlPanel.add(clearButton);
        controlPanel.add(closeButton);
        
        // ActionListeners
        ok.addActionListener(this);
        comboBox.addActionListener(this);
        checkBox1.addActionListener(this);
        checkBox2.addActionListener(this);
        checkBox3.addActionListener(this);
        radio1.addActionListener(this);
        radio1.addActionListener(this);
        clearButton.addActionListener(this);
        closeButton.addActionListener(this);
        computeButton.addActionListener(this);

        // startup commands
        billField.setEditable(false);
        comboBox.setEnabled(false);
        radio2.setSelected(true);
        computeButton.setEnabled(false);
        checkBox1.setEnabled(false);
        checkBox2.setEnabled(false);
        checkBox3.setEnabled(false);
        radio1.setEnabled(false);
        radio2.setEnabled(false);
        comboBox.setEnabled(false);
        comboBox.setSelectedIndex(0);

        // show panel
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);;
        setVisible(true);
    }

    public static void main(String[] args) {
        JollyMcKing gui = new JollyMcKing("Jolly McKing");
    }


    public void actionPerformed(ActionEvent e) {
        Object s = e.getSource();

        if (s == clearButton) {
            int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear?", "Clear Operation", JOptionPane.YES_NO_OPTION);
            if (choice == 1) {
                return;
            }
            userField.setText("");
            passField.setText("");
            checkBox1.setSelected(false);
            checkBox2.setSelected(false);
            checkBox3.setSelected(false);
            radio1.setEnabled(false);
            radio2.setEnabled(false);
            radio2.setSelected(true);
            computeButton.setEnabled(false);
            comboBox.setEnabled(false);
            comboBox.setSelectedIndex(0);
        } else if (s == closeButton) {
            int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to close the application?", "Close Operation", JOptionPane.YES_NO_OPTION);
            if (choice == 1) {
                return;
            }
            dispose();
        } else if (s == ok) {
            String password = "password";

            // input checks
            if (userField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please input a username", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (!String.valueOf(passField.getPassword()).equals(password)) {
                JOptionPane.showMessageDialog(null, "Invalid password", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // enable buttons
            checkBox1.setEnabled(true);
            checkBox2.setEnabled(true);
            checkBox3.setEnabled(true);
            radio1.setEnabled(true);
            radio2.setEnabled(true);
            computeButton.setEnabled(true);
        } else if (s == checkBox3) {
            comboBox.setEnabled(checkBox3.isSelected() ? true : false);
        } else if (s == computeButton) {
            Double bill = 0.0;

            // calculate
            bill += checkBox1.isSelected() ? 25.0 : 0.0;
            bill += checkBox2.isSelected() ? 30.0 : 0.0;
            bill += checkBox3.isSelected() ? 35.0 : 0.0;
            bill += radio1.isSelected() ? 25.0 : 0.0;

            // result
            billField.setText(String.valueOf(bill));
        }

    }

}

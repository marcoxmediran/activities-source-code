import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ValueMeal extends JFrame implements ActionListener {
    
    JPanel mainPanel;
    JLabel totalLabel; 
    JPanel inputPanel1, inputPanel2, inputPanel3;
    JPanel buttonPanel1, buttonPanel2, buttonPanel3;
    JPanel controlPanel;
    JTextField quantityField1, quantityField2, quantityField3;
    JTextField totalField1, totalField2, totalField3;
    JTextField amountDueField;
    JCheckBox checkBox1, checkBox2, checkBox3;
    JRadioButton radio1a, radio1b, radio2a, radio2b, radio3a, radio3b;
    ButtonGroup buttonGroup1, buttonGroup2, buttonGroup3;
    JButton clearButton, computeButton;

    public ValueMeal(String title) {
        // instantitate
        super(title);

        mainPanel = new JPanel();
        totalLabel = new JLabel("Total");
        FlowLayout flowLeft = new FlowLayout(FlowLayout.LEFT);
        inputPanel1 = new JPanel(flowLeft);
        inputPanel2 = new JPanel(flowLeft);
        inputPanel3 = new JPanel(flowLeft);
        buttonPanel1 = new JPanel(flowLeft);
        buttonPanel2 = new JPanel(flowLeft);
        buttonPanel3 = new JPanel(flowLeft);
        controlPanel = new JPanel(flowLeft);

        quantityField1 = new JTextField("", 10);
        quantityField2 = new JTextField("", 10);
        quantityField3 = new JTextField("", 10);
        totalField1 = new JTextField("0", 10);
        totalField2 = new JTextField("0", 10);
        totalField3 = new JTextField("0", 10);
        amountDueField = new JTextField("0", 10);

        checkBox1 = new JCheckBox("Value Meal 1 P30");
        checkBox2 = new JCheckBox("Value Meal 2 P40");
        checkBox3 = new JCheckBox("Value Meal 3 P50");

        radio1a = new JRadioButton("regular");
        radio1b = new JRadioButton("upsize (+10)");
        radio2a = new JRadioButton("regular");
        radio2b = new JRadioButton("upsize (+10)");
        radio3a = new JRadioButton("regular");
        radio3b = new JRadioButton("upsize (+10)");
        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        buttonGroup3 = new ButtonGroup();
        buttonGroup1.add(radio1a);
        buttonGroup1.add(radio1b);
        buttonGroup2.add(radio2a);
        buttonGroup2.add(radio2b);
        buttonGroup3.add(radio3a);
        buttonGroup3.add(radio3b);
        radio1a.setSelected(true);
        radio2a.setSelected(true);
        radio3a.setSelected(true);

        clearButton = new JButton("CLEAR");
        computeButton = new JButton("COMPUTE");

        // add component to JFrame
        add(totalLabel, BorderLayout.NORTH);
        add(mainPanel);

        // add components to mainPanel
        mainPanel.add(inputPanel1);
        mainPanel.add(buttonPanel1);
        mainPanel.add(inputPanel2);
        mainPanel.add(buttonPanel2);
        mainPanel.add(inputPanel3);
        mainPanel.add(buttonPanel3);
        mainPanel.add(controlPanel);

        // inputPanel1
        inputPanel1.add(checkBox1);
        inputPanel1.add(new JLabel("Qty"));
        inputPanel1.add(quantityField1);
        inputPanel1.add(totalField1);

        // buttonPanel1
        buttonPanel1.add(new JLabel("Drinks"));
        buttonPanel1.add(radio1a);
        buttonPanel1.add(radio1b);

        // inputPanel2
        inputPanel2.add(checkBox2);
        inputPanel2.add(new JLabel("Qty"));
        inputPanel2.add(quantityField2);
        inputPanel2.add(totalField2);

        // buttonPanel2
        buttonPanel2.add(new JLabel("Drinks"));
        buttonPanel2.add(radio2a);
        buttonPanel2.add(radio2b);

        // inputPanel3
        inputPanel3.add(checkBox3);
        inputPanel3.add(new JLabel("Qty"));
        inputPanel3.add(quantityField3);
        inputPanel3.add(totalField3);

        // buttonPanel3
        buttonPanel3.add(new JLabel("Drinks"));
        buttonPanel3.add(radio3a);
        buttonPanel3.add(radio3b);

        // computePanel
        controlPanel.add(clearButton);
        controlPanel.add(computeButton);
        controlPanel.add(new JLabel("AMOUNT DUE"));
        controlPanel.add(amountDueField);

        // set alignment
        totalLabel.setHorizontalAlignment(SwingConstants.RIGHT);

        // set Layout
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));

        // actionListeners
        clearButton.addActionListener(this);
        computeButton.addActionListener(this);
        checkBox1.addActionListener(this);
        checkBox2.addActionListener(this);
        checkBox3.addActionListener(this);
        radio1a.addActionListener(this);
        radio1b.addActionListener(this);
        radio2a.addActionListener(this);
        radio2b.addActionListener(this);
        radio3a.addActionListener(this);
        radio3b.addActionListener(this);

        // startup commands
        quantityField1.setEnabled(false);
        quantityField2.setEnabled(false);
        quantityField3.setEnabled(false);
        totalField1.setEnabled(false);
        totalField2.setEnabled(false);
        totalField3.setEnabled(false);
        amountDueField.setEnabled(false);

        // show
        pack();
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        ValueMeal vm = new ValueMeal("Value Meal");
    }

    public void actionPerformed(ActionEvent e) {
        Object s = e.getSource();

        if (s == clearButton) {
            checkBox1.setSelected(false);
            checkBox2.setSelected(false);
            checkBox3.setSelected(false);
            quantityField1.setText("");
            quantityField2.setText("");
            quantityField3.setText("");
            totalField1.setText("0");
            totalField2.setText("0");
            totalField3.setText("0");
            amountDueField.setText("0");
        } else if (s == computeButton) {
            int amountDue = 0;
            int total1 = 0, total2 = 0, total3 = 0;

            // meal1
            if (checkBox1.isSelected() && !quantityField1.getText().equals("")) {
                int quantity1 = Integer.valueOf(quantityField1.getText());
                total1 = radio1a.isSelected() ? 30 * quantity1 : 40 * quantity1;
                totalField1.setText(String.valueOf(total1));
            }
            
            // meal2
            if (checkBox2.isSelected() && !quantityField2.getText().equals("")) {
                int quantity2 = Integer.valueOf(quantityField2.getText());
                total2 = radio2a.isSelected() ? 40 * quantity2 : 50 * quantity2;
                totalField2.setText(String.valueOf(total2));
            }
            
            // meal3
            if (checkBox3.isSelected() && !quantityField3.getText().equals("")) {
                int quantity3 = Integer.valueOf(quantityField3.getText());
                total3 = radio3a.isSelected() ? 50 * quantity3 : 60 * quantity3;
                totalField3.setText(String.valueOf(total3));
            }

            amountDue += total1 + total2 + total3;
            
            // setText
            amountDueField.setText(String.valueOf(amountDue));
        } else if (s == checkBox1) {
            quantityField1.setEnabled(checkBox1.isSelected() ? true : false);
            totalField1.setText("0");
            radio1a.setSelected(true);
        } else if (s == checkBox2) {
            quantityField2.setEnabled(checkBox2.isSelected() ? true : false);
            totalField1.setText("0");
            radio2a.setSelected(true);
        } else if (s == checkBox3) {
            quantityField3.setEnabled(checkBox3.isSelected() ? true : false);
            totalField1.setText("0");
            radio3a.setSelected(true);
        }
    }
    
}

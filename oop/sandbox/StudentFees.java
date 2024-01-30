import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.*;

public class StudentFees extends JFrame implements ActionListener {

    JPanel mainPanel;
    JPanel namePanel, unitsPanel, yearPanel;
    JPanel otherFeesPanel;
    JPanel inputPanel, checkBoxPanel1, labelPanel1, checkBoxPanel2, labelPanel2;
    JPanel scholarshipLabelPanel;
    JPanel scholarshipPanel, radioPanel;
    JPanel amountPanel;
    JPanel controlPanel;
    JTextField nameField, unitsField;
    JComboBox<String> yearComboBox;
    JCheckBox labFeeCheckBox, regCardCheckBox, catalystCheckBox, studentCouncilCheckBox, studentIDCheckBox, miscCheckBox;
    JRadioButton nonRadio, fullRadio, partialRadio;
    ButtonGroup radioGroup;
    JTextField amountField;
    JButton computeButton, clearButton;
    
    public StudentFees(String title) {
        // instantiate
        super(title);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.PAGE_AXIS));
        FlowLayout flowLeft = new FlowLayout(FlowLayout.LEFT);
        namePanel = new JPanel(flowLeft);
        unitsPanel = new JPanel(flowLeft);
        yearPanel = new JPanel(flowLeft);
        otherFeesPanel = new JPanel(flowLeft);
        inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.LINE_AXIS));
        checkBoxPanel1 = new JPanel();
        checkBoxPanel1.setLayout(new BoxLayout(checkBoxPanel1, BoxLayout.PAGE_AXIS));
        labelPanel1 = new JPanel();
        labelPanel1.setLayout(new BoxLayout(labelPanel1, BoxLayout.PAGE_AXIS));
        checkBoxPanel2 = new JPanel();
        checkBoxPanel2.setLayout(new BoxLayout(checkBoxPanel2, BoxLayout.PAGE_AXIS));
        labelPanel2 = new JPanel();
        labelPanel2.setLayout(new BoxLayout(labelPanel2, BoxLayout.PAGE_AXIS));
        scholarshipLabelPanel = new JPanel(flowLeft);
        scholarshipPanel = new JPanel();
        scholarshipPanel.setLayout(new BoxLayout(scholarshipPanel, BoxLayout.LINE_AXIS));
        radioPanel = new JPanel();
        radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.PAGE_AXIS));
        amountPanel = new JPanel(flowLeft);
        controlPanel = new JPanel();

        nameField = new JTextField("", 20);
        unitsField = new JTextField("", 20);
        
        String[] years = {"1st Year", "2nd Year", "3rd Year", "4th Year", "5th Year"};
        yearComboBox = new JComboBox<>(years);
        yearComboBox.setSelectedIndex(-1);

        labFeeCheckBox = new JCheckBox("Laboratory Fee");
        regCardCheckBox = new JCheckBox("Registration Card");
        catalystCheckBox = new JCheckBox("Catalyst");
        studentCouncilCheckBox = new JCheckBox("Student Council");
        studentIDCheckBox = new JCheckBox("Student ID");
        miscCheckBox = new JCheckBox("Other Miscellaneous");

        nonRadio = new JRadioButton("Non-Scholar");
        fullRadio = new JRadioButton("Full Scholar");
        partialRadio = new JRadioButton("Partial Scholar");
        radioGroup = new ButtonGroup();
        radioGroup.add(nonRadio);
        radioGroup.add(fullRadio);
        radioGroup.add(partialRadio);

        amountField = new JTextField("", 20);

        computeButton = new JButton("COMPUTE");
        clearButton = new JButton("CLEAR");

        // add mainPanel to JFrame
        add(mainPanel);

        // add components to mainPanel
        mainPanel.add(namePanel);
        mainPanel.add(unitsPanel);
        mainPanel.add(yearPanel);
        mainPanel.add(otherFeesPanel);
        mainPanel.add(inputPanel);
        mainPanel.add(scholarshipLabelPanel);
        mainPanel.add(scholarshipPanel);
        mainPanel.add(amountPanel);
        mainPanel.add(controlPanel);

        // namePanel
        namePanel.add(new JLabel("Student Name: "));
        namePanel.add(nameField);

        //  unitsPanel
        unitsPanel.add(new JLabel("Units Enrolled: "));
        unitsPanel.add(unitsField);

        // yearPanel
        yearPanel.add(new JLabel("Year Level"));
        yearPanel.add(yearComboBox);

        // otherFeesPanel
        otherFeesPanel.add(new JLabel("Other Fees:"));

        // inputPanel
        inputPanel.add(checkBoxPanel1);
        inputPanel.add(labelPanel1);
        inputPanel.add(checkBoxPanel2);
        inputPanel.add(labelPanel2);

        // checkBoxPanel1
        checkBoxPanel1.add(labFeeCheckBox);
        checkBoxPanel1.add(regCardCheckBox);
        checkBoxPanel1.add(catalystCheckBox);

        // labelPanel1
        labelPanel1.add(new JLabel("P200"));
        labelPanel1.add(new JLabel("P50"));
        labelPanel1.add(new JLabel("P50"));

        // checkBoxPanel2
        checkBoxPanel2.add(studentCouncilCheckBox);
        checkBoxPanel2.add(studentIDCheckBox);
        checkBoxPanel2.add(miscCheckBox);

        // labelPanel2
        labelPanel2.add(new JLabel("P50"));
        labelPanel2.add(new JLabel("P50"));
        labelPanel2.add(new JLabel("P100"));

        // scholarshipLabelPanel
        scholarshipLabelPanel.add(new JLabel("Scholarship Grants: "));

        // scholarshipPanel
        scholarshipPanel.add(scholarshipLabelPanel);
        scholarshipPanel.add(radioPanel);

        // radioPanel
        radioPanel.add(nonRadio);
        radioPanel.add(fullRadio);
        radioPanel.add(partialRadio);

        // amountPanel
        amountPanel.add(new JLabel("Total Amount: "));
        amountPanel.add(amountField);

        // controlPanel
        controlPanel.add(computeButton);
        controlPanel.add(clearButton);

        // ActionListeners
        clearButton.addActionListener(this);
        computeButton.addActionListener(this);
        labFeeCheckBox.addActionListener(this);
        regCardCheckBox.addActionListener(this);
        catalystCheckBox.addActionListener(this);
        studentCouncilCheckBox.addActionListener(this);
        studentIDCheckBox.addActionListener(this);
        miscCheckBox.addActionListener(this);
        nonRadio.addActionListener(this);
        fullRadio.addActionListener(this);
        partialRadio.addActionListener(this);

        // startup commands
        nonRadio.setSelected(true);
        amountField.setEditable(false);

        // show frame
        pack();
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        StudentFees sf = new StudentFees("Student Fees");
    }

    public void actionPerformed(ActionEvent e) {
        Object s = e.getSource();

        if (s == clearButton) {
            nameField.setText("");
            unitsField.setText("");
            yearComboBox.setSelectedIndex(-1);
            nonRadio.setSelected(true);
            labFeeCheckBox.setSelected(false);
            regCardCheckBox.setSelected(false);
            catalystCheckBox.setSelected(false);
            studentCouncilCheckBox.setSelected(false);
            studentIDCheckBox.setSelected(false);
            miscCheckBox.setSelected(false);
        } else if (s == computeButton) {
            int fee = 0;
            int units = 0;

            // input checks
            String unitsInput = unitsField.getText();
            try {
                units = Integer.valueOf(unitsInput);
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(this, "Please input a positive integer for units", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int selectedYear = yearComboBox.getSelectedIndex() + 1;
            if (selectedYear < 1) {
                JOptionPane.showMessageDialog(null, "Please select a year level", "Input Erorr", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // full scholar
            if (fullRadio.isSelected()) {
                amountField.setText(String.valueOf(fee));
                return;
            }

            // units
            fee += Integer.valueOf(unitsInput) * 10;

            // other fees
            fee += labFeeCheckBox.isSelected() ? 200 : 0;
            fee += regCardCheckBox.isSelected() ? 50 : 0;
            fee += catalystCheckBox.isSelected() ? 50 : 0;
            fee += studentCouncilCheckBox.isSelected() ? 50 : 0;
            fee += studentIDCheckBox.isSelected() ? 50 : 0;
            fee += miscCheckBox.isSelected() ? 100 : 0;



            // partial scholar
            int yearLevelFee = 100 * selectedYear;
            if (partialRadio.isSelected()) {
                yearLevelFee /= 2;
            }
            fee += yearLevelFee;

            // result
            amountField.setText(String.valueOf(fee));
        }

    }

}

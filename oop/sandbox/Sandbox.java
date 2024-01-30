/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
 * Component Sandbox
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class Sandbox extends JFrame implements ActionListener, ListSelectionListener, ChangeListener {

    // components
    JPanel mainPanel;
    JLabel jLabel;
    JButton jButton;
    JCheckBox jCheckBox;
    JComboBox<String> jComboBox;
    JList<String> jList;
    JMenuBar jMenuBar;
    JMenu jMenu, jOptionMenu;
    JMenuItem jMenuItemA, jMenuItemB, jOptionDialog, jOptionInput;
    JRadioButton jRadioButton;
    JSlider jSlider;
    JTextField jTextField;
    JPasswordField jPasswordField;
    JTable jTable;
    JTextArea jTextArea;

    public Sandbox(String windowTitle) {
        // Super Idol 的笑容
        super(windowTitle); // JFrame has GridLayout by default

        // declare layouts
        FlowLayout flowLeft = new FlowLayout(FlowLayout.LEFT);
        GridLayout gridLayout = new GridLayout(5, 5, 10, 10);   // rows, cols, hgap, vgap
        BoxLayout boxHorizontal = new BoxLayout(getContentPane(), BoxLayout.LINE_AXIS);
        BoxLayout boxVertical = new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS);

        // instantiate
        mainPanel = new JPanel();   // Panel has FlowLayout by default
        jLabel = new JLabel("JLabel");
        jButton = new JButton("JButton");
        jCheckBox = new JCheckBox("JCheckBox");
        String[] items = {"Foo", "Bar", "Spam"};    // For JComboBox and JList choices
        jComboBox = new JComboBox<>(items);
        jList = new JList<>(items);
        jMenuBar = new JMenuBar();
        jMenu = new JMenu("JMenu");
        jOptionMenu = new JMenu("JOptionPane");
        jMenuItemA = new JMenuItem("New Sandbox");
        jMenuItemB = new JMenuItem("Exit Sandbox");
        jOptionDialog = new JMenuItem("showMessageDialog");
        jOptionInput = new JMenuItem("showInputDialog");
        jSlider = new JSlider(JSlider.HORIZONTAL, 0, 10, 5);
        jTextField = new JTextField("JTextField (Enter to setText())", 20);
        jPasswordField = new JPasswordField(20);
        jTable = new JTable();
        jTextArea = new JTextArea();

        // set layout
        mainPanel.setLayout(new GridLayout(0, 3, 10, 10));

        // set alignments and size
        jLabel.setHorizontalAlignment(SwingConstants.CENTER); // Align component in a FlowLayout

        // fonts
        Font jetBrainsMonoNerdFont = new Font("JetBrainsMono NF", Font.BOLD, 20);
        jLabel.setFont(jetBrainsMonoNerdFont);    // Set font for this specific JLabel only

        // jMenuBar
        jMenu.add(jMenuItemA);
        jMenu.add(jMenuItemB);
        jOptionMenu.add(jOptionDialog);
        jOptionMenu.add(jOptionInput);
        jMenuBar.add(jMenu);
        jMenuBar.add(jOptionMenu);
        jMenuBar.setBackground(Color.GRAY);
        
        // jSlider
        jSlider.setMajorTickSpacing(1);
        jSlider.setPaintLabels(true);

        // jTextArea
        jTextArea.setText("Use JButton to setText() from JTextArea");

        // tooltips
        jMenuItemA.setToolTipText("Create a new Sandbox");
        jMenuItemB.setToolTipText("Exit the sandbox");;


        // add mainPanel to JFrame
        add(jMenuBar, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
        add(jLabel, BorderLayout.SOUTH);

        // add components to JPanel
        mainPanel.add(jButton);
        mainPanel.add(jCheckBox);
        mainPanel.add(jComboBox);
        mainPanel.add(jList);
        mainPanel.add(jSlider);
        mainPanel.add(jTextField);
        mainPanel.add(jPasswordField);
        mainPanel.add(jTable);
        mainPanel.add(jTextArea);

        // listeners
        jMenuItemA.addActionListener(this);
        jMenuItemB.addActionListener(this);
        jOptionDialog.addActionListener(this);
        jOptionInput.addActionListener(this);
        jButton.addActionListener(this);
        jCheckBox.addActionListener(this);
        jComboBox.addActionListener(this);
        jList.addListSelectionListener(this);
        jSlider.addChangeListener(this);
        jTextField.addActionListener(this);
        jPasswordField.addActionListener(this);

        // show
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        Sandbox sandbox = new Sandbox("Sandbox");
    } 

    // for ActionListener
    public void actionPerformed(ActionEvent e) {
        Object s = e.getSource();

        if (s == jMenuItemA) {
            new Sandbox("New Sandbox");
        } else if (s == jMenuItemB) {
            dispose();
        } else if (s == jOptionDialog) {
            JOptionPane.showMessageDialog(null, "Caption", "Header", JOptionPane.INFORMATION_MESSAGE);
            jLabel.setText("JOptionPane.showMessageDialog()");
        } else if (s == jOptionInput) {
            jLabel.setText(JOptionPane.showInputDialog(null, "Caption", "Header", JOptionPane.QUESTION_MESSAGE));
        } else if (s == jButton) {
            jLabel.setText(jTextArea.getText());
        } else if (s == jCheckBox) {
            jLabel.setText(jCheckBox.isSelected() ? "JCheckBox: Checked" : "JCheckBox: Unchecked");
        } else if (s == jComboBox) {
            jLabel.setText(String.valueOf(jComboBox.getSelectedItem()));
        } else if (s == jTextField) {
            jLabel.setText(jTextField.getText());
        } else if (s == jPasswordField) {
            jLabel.setText(String.valueOf(jPasswordField.getPassword()));
        }
    }

    // for ListSelectionListener
    public void valueChanged(ListSelectionEvent e) {
        Object s = e.getSource();

        if (s == jList) {
            jLabel.setText(jList.getSelectedValue());
        }
    }

    // for ChangeListener
    public void stateChanged(ChangeEvent e) {
        Object s = e.getSource();

        if (s == jSlider) {
            jLabel.setText(String.valueOf(jSlider.getValue()));
        }
    }

}

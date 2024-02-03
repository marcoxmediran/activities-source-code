
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Table extends JFrame implements ActionListener {
    
    private DatabaseHandler db;
    private String[] headers = {"ID", "First Name", "Last Name", "Age", "Gender", "Address", "Program", "Email"};
    
    private JPanel mainPanel;
    private JPanel controlPanel, leftPanel, rightPanel;
    private JTable mainTable;
    private JTextField searchField;
    private JButton refreshButton, searchButton, deleteButton, truncateButton;
    
    public Table(DatabaseHandler db) throws SQLException {
        // instantiate
        super("Records");
        this.db = db;
        
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        
        controlPanel = new JPanel();
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.LINE_AXIS));
        leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        rightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        
        mainTable = new JTable(createTableModel(db.getTable(), headers));
        mainTable.setAutoCreateRowSorter(true);
        this.resizeTableColumns();
        
        deleteButton = new JButton("Delete Row");
        truncateButton = new JButton("Clear Table");
        
        searchField = new JTextField(20);
        searchButton = new JButton("Search");
        refreshButton = new JButton("Refresh");
        
        
        // add mainPanel to JFrame
        add(mainPanel);
        add(controlPanel, BorderLayout.SOUTH);
        
        // add components to mainPanel
        mainPanel.add(new JScrollPane(mainTable));
        
        // add components to controlPanel
        controlPanel.add(leftPanel);
        controlPanel.add(rightPanel);
        
        // add components to leftPanel
        leftPanel.add(deleteButton);
        leftPanel.add(truncateButton);
        
        // add components to rightPanel
        rightPanel.add(searchField);
        rightPanel.add(searchButton);
        rightPanel.add(refreshButton);
        
        // actionListener
        deleteButton.addActionListener(this);
        truncateButton.addActionListener(this);
        searchButton.addActionListener(this);
        refreshButton.addActionListener(this);

        
        // create JFrame
        pack();
        setSize(1170, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setVisible(false);
    }
    
    public DefaultTableModel createTableModel(ResultSet rs, String[] headers) throws SQLException {
        DefaultTableModel model = new DefaultTableModel(headers, 0);
        while (rs.next()) {
            String id = rs.getString("id");
            String firstName = rs.getString("firstName");
            String lastName = rs.getString("lastName");
            String age = rs.getString("age");
            String gender = rs.getString("gender");
            String permanentAddress = rs.getString("permanentAddress");
            String program = rs.getString("program");
            String emailAddress = rs.getString("emailAddress");

            // create a single array of one row's worth of data
            String[] data = { id, firstName, lastName, age, gender, permanentAddress, program, emailAddress } ;

            // and add this row of data into the table model
            model.addRow(data);
        }
        return model;
    }
    
    public void resizeTableColumns() {
        mainTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        mainTable.getColumn(headers[0]).setPreferredWidth(40);
        mainTable.getColumn(headers[1]).setPreferredWidth(150);
        mainTable.getColumn(headers[2]).setPreferredWidth(150);
        mainTable.getColumn(headers[3]).setPreferredWidth(40);
        mainTable.getColumn(headers[4]).setPreferredWidth(70);
        mainTable.getColumn(headers[5]).setPreferredWidth(300);
        mainTable.getColumn(headers[6]).setPreferredWidth(200);
        mainTable.getColumn(headers[7]).setPreferredWidth(200);
        mainTable.setDefaultEditor(Object.class, null);
    }
    
    public void refreshTable() throws SQLException {
        this.mainTable.setModel(createTableModel(db.getTable(), headers));
        this.resizeTableColumns();
    }
    
    public void filter(DefaultTableModel defaultModel, String query) {
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(defaultModel);
        mainTable.setRowSorter(rowSorter);
        rowSorter.setRowFilter(RowFilter.regexFilter(query));
    }
    
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        if (source == refreshButton) {
            try {
                this.refreshTable();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            this.mainTable.repaint();
        } else if (source == deleteButton) {
            int row = this.mainTable.getSelectedRow();
            int id = 0;
            try {
                id = Integer.valueOf((String) this.mainTable.getModel().getValueAt(row, 0));
                db.deleteStudent(id);
                this.refreshTable();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else if (source == truncateButton) {
            int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear the whole table?", "Drop Confirmation", JOptionPane.YES_NO_OPTION);
            if (choice == 0) {
                try {
                    db.truncateTable();
                    this.refreshTable();
                } catch (SQLException ex) {
                    Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if (source == searchButton) {
            String query = searchField.getText();
            try {
                this.filter(this.createTableModel(db.getTable(), headers), query);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    
    
}

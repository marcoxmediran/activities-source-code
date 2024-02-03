
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Table extends JFrame {
    
    private DatabaseHandler db;
    
    private JPanel mainPanel;
    private JTable mainTable;
    
    public Table(DatabaseHandler db) throws SQLException {
        // instantiate
        super("Records");
        this.db = db;
        
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        
        mainTable = new JTable(createTableModel(db.getTable()));
        mainTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        
        
        // add mainPanel to JFrame
        add(mainPanel);
        
        // add components to mainPanel
        mainPanel.add(new JScrollPane(mainTable));
        
        // actionListener
        
        // create JFrame
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    
    public DefaultTableModel createTableModel(ResultSet rs) throws SQLException {
        String[] headers = {"ID", "First Name", "Last Name", "Age", "Gender", "Address", "Program", "Email"};
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
}

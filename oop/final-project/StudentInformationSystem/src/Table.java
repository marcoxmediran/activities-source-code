
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
        
        String[] headers = {"ID", "First Name", "Last Name", "Age", "Gender", "Address", "Program", "Email"};
        mainTable = new JTable(createTableModel(db.getTable(), headers));
        mainTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        mainTable.getColumn(headers[0]).setPreferredWidth(40);
        mainTable.getColumn(headers[1]).setPreferredWidth(150);
        mainTable.getColumn(headers[2]).setPreferredWidth(150);
        mainTable.getColumn(headers[3]).setPreferredWidth(40);
        mainTable.getColumn(headers[4]).setPreferredWidth(70);
        mainTable.getColumn(headers[5]).setPreferredWidth(300);
        mainTable.getColumn(headers[6]).setPreferredWidth(200);
        mainTable.getColumn(headers[7]).setPreferredWidth(200);
        
        
        
        // add mainPanel to JFrame
        add(mainPanel);
        
        // add components to mainPanel
        mainPanel.add(new JScrollPane(mainTable));
        
        // actionListener
        
        // create JFrame
        pack();
        setSize(1170, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
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
}

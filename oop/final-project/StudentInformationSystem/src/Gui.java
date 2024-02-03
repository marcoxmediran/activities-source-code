
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Gui extends JFrame implements ActionListener {
    
    private DatabaseHandler db;
    
    private JPanel mainPanel;
    private JButton button;
    
    public Gui(String title, DatabaseHandler db) {
        // instantiate
        super(title);
        this.db = db;
        
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        
        button = new JButton("addStudent");
        
        // add mainPanel to JFrame
        add(mainPanel);
        
        // add components to mainPanel
        mainPanel.add(button);
        
        // actionListener
        button.addActionListener(this);
        
        // create JFrame
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        
        if (source == button) {
            try {
                db.deleteStudent(3);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    
}

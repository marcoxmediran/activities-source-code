
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GuiOld extends JFrame implements ActionListener {
    
    private DatabaseHandler db;
    
    private JPanel mainPanel;
    private JButton button;
    private JButton tableButton;
    
    public GuiOld(String title, DatabaseHandler db) {
        // instantiate
        super(title);
        this.db = db;
        
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        
        button = new JButton("addStudent");
        tableButton = new JButton("showTable");
        
        // add mainPanel to JFrame
        add(mainPanel);
        
        // add components to mainPanel
        mainPanel.add(button);
        mainPanel.add(tableButton);
        
        // actionListener
        button.addActionListener(this);
        tableButton.addActionListener(this);
        
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
                db.addStudent();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else if (source == tableButton) {
            try {
                Table table = new Table(db);
            } catch (SQLException ex) {
                Logger.getLogger(GuiOld.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}

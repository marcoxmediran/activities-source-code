import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

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
        
        button = new JButton("createTable");
        
        // add mainPanel to JFrame
        add(mainPanel);
        
        // add components to mainPanel
        mainPanel.add(button);
        
        // actionListener
        button.addActionListener(this);
        
        // create JFrame
        pack();
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        
        if (source == button) {
            try {
                db.createTable();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    
}

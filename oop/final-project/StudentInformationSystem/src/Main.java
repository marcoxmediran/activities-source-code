
import java.sql.SQLException;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;


public class Main {

    public static void main(String[] args) throws SQLException {
        // set global theme
        enableNimbusLookAndFeel();
        
        // create DatabaseHandler object and create a table if there is none
        DatabaseHandler db = new DatabaseHandler();
        db.createTable();
        
        // launch gui program
        Gui gui = new Gui("Student Information System", db);
    }
    
    public static void enableNimbusLookAndFeel() {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                UIManager.setLookAndFeel(info.getClassName());
                break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}

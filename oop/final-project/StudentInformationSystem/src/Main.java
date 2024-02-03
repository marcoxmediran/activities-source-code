
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) throws SQLException {
        DatabaseHandler db = new DatabaseHandler();
        Gui gui = new Gui("Student Information System", db);
    }
    
}

import java.sql.*;

public class DatabaseHandler {
    
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    
    public DatabaseHandler() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            statement = connection.createStatement();
        } catch (Exception exception) {
            exception.getStackTrace();
        }
    }
    
    public void createTable() throws SQLException {
        String query = "CREATE TABLE IF NOT EXISTS STUDENTS " +
                "(id INTEGER not NULL, " + 
                "firstName VARCHAR(255) not NULL, " +
                "lastName VARCHAR(255) not NULL, " +
                "gender CHAR not NULL, " +
                "permanentAddress VARCHAR(255) not NULL, " + 
                "program VARCHAR(255) not NULL, " + 
                "emailAddress VARCHAR(255), " +
                "PRIMARY KEY (id))";
        statement.execute(query);
    }
    
}

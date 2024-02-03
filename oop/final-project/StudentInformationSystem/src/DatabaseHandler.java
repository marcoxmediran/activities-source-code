import java.sql.*;

public class DatabaseHandler {
    
    private Connection connection;
    private Statement statement;
    
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
                "(id INTEGER not NULL AUTO_INCREMENT, " + 
                "firstName VARCHAR(255) not NULL, " +
                "lastName VARCHAR(255) not NULL, " +
                "gender CHAR not NULL, " +
                "permanentAddress VARCHAR(255) not NULL, " + 
                "program VARCHAR(255) not NULL, " + 
                "emailAddress VARCHAR(255), " +
                "PRIMARY KEY (id))";
        statement.execute(query);
    }
    
    public void addStudent() throws SQLException {
        String query = "INSERT INTO STUDENTS (`firstName`, `lastName`, `gender`, `permanentAddress`, `program`, `emailAddress`)";
        query += " VALUE (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        // substitute values form fields and buttons
        preparedStatement.setString(1, "Marcox");
        preparedStatement.setString(2, "Mediran");
        preparedStatement.setString(3, "M");
        preparedStatement.setString(4, "General Trias, Cavite");
        preparedStatement.setString(5, "BS in Computer Science");
        preparedStatement.setString(6, "marcox@mediran.com");
        preparedStatement.execute();
    }
    
    public void deleteStudent(int id) throws SQLException {
        String query = "DELETE FROM STUDENTS WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, String.valueOf(id));
        preparedStatement.execute();
    }
    
    public ResultSet getTable() throws SQLException {
        String query = "SELECT * FROM STUDENTS";
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet;
    }
    
}

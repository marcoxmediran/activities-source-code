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
                "age INTEGER not NULL, " + 
                "gender CHAR not NULL, " +
                "permanentAddress VARCHAR(255) not NULL, " + 
                "program VARCHAR(255) not NULL, " + 
                "emailAddress VARCHAR(255), " +
                "PRIMARY KEY (id))";
        statement.execute(query);
    }
    
    public void addStudent(Student student) throws SQLException {
        String query = "INSERT INTO STUDENTS (`firstName`, `lastName`, `age`, `gender`, `program`, `permanentAddress`, `emailAddress`) " + student.toString();
        this.statement.execute(query);
    }
    
    public void deleteStudent(int id) throws SQLException {
        String query = "DELETE FROM STUDENTS WHERE id=" + id;
        this.statement.execute(query);
    }
    
    public void truncateTable() throws SQLException {
        String query = "TRUNCATE TABLE STUDENTS";
        this.statement.execute(query);
    }
    
    public ResultSet getTable() throws SQLException {
        String query = "SELECT * FROM STUDENTS";
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet;
    }
    
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by alex on 12/11/16.
 */
public class DB_Util_4 {
    private static final String URL="jdbc:mysql://127.0.0.1:3306/DB_demo?characterEncoding=utf8&useSSL=true";
    private static final String NAME="root";
    private static final String PASSWORD="818818";
    public static void main(String args[])throws Exception{
        Statement statement;
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection(URL,NAME,PASSWORD);
        statement=connection.createStatement();

    }
}

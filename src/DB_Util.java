import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB_Util {
    private static final String URL="jdbc:mysql://127.0.0.1:3306/DB_demo?characterEncoding=utf8&useSSL=true";
    private static final String NAME="root";
    private static final String PASSWORD="818818";
    public static void main(String[] args) throws Exception {
        //1.load the driver
        Class.forName("com.mysql.jdbc.Driver");
        //2.connect the database
        Connection connection=DriverManager.getConnection(URL,NAME,PASSWORD);
        //3.operate on the database
        Statement statement=connection.createStatement();
        //deletion
        statement.execute("DELETE FROM student");
        //*/
        System.out.println("current state::");
        ResultSet resultSet=statement.executeQuery("SELECT id,sex FROM student");
        while(resultSet.next()){
            System.out.println(resultSet.getString("id")+","+resultSet.getString("sex"));
        }

        //here is the insertion
        statement.execute("INSERT into student(id,sex,address)VALUES('0000000001','male','City A') ");
        statement.execute("INSERT into student(id,sex,address)VALUES('0000000002','male','City C') ");
        statement.execute("INSERT into student(id,sex,address)VALUES('0000000003','fema','City B') ");
        System.out.println("state after insertion");
        resultSet=statement.executeQuery("SELECT id,sex FROM student");
        while(resultSet.next()){
            System.out.println(resultSet.getString("id")+","+resultSet.getString("sex"));
        }
    }
}

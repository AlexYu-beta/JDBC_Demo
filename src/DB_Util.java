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
        statement.execute("DELETE from DB_demo.student");
        statement.execute("DELETE from DB_demo.User");//
        System.out.println("current state::");
        System.out.println("table student");
        ResultSet resultSet=statement.executeQuery("SELECT id,sex FROM DB_demo.student");
        while(resultSet.next()){
            System.out.println(resultSet.getString("id")+","+resultSet.getString("sex"));
        }
        System.out.println("table user");//
        resultSet=statement.executeQuery("SELECT id,pwd,contact from DB_demo.User");//
        while(resultSet.next()){//
            System.out.println(resultSet.getString("id")+","+resultSet.getString("pwd")+","+resultSet.getString("contact"));//
        }//
        //here is the insertion
        statement.execute("INSERT into DB_demo.student(id,sex,address)VALUES('0000000001','male','City A') ");
        statement.execute("INSERT into DB_demo.student(id,sex,address)VALUES('0000000002','male','City C') ");
        statement.execute("INSERT into DB_demo.student(id,sex,address)VALUES('0000000003','male','City B') ");
        String pwd="asdfasdf";
        statement.execute("INSERT into DB_demo.User(id,pwd,name,contact)VALUES('0000000001',AES_ENCRYPT('zxcvzxcv','key_pwd'),'alex','110')");//
        statement.execute("INSERT into DB_demo.User(id,pwd,name,contact)VALUES('0000000002',AES_ENCRYPT('"+pwd+"','key_pwd'),'blex','10086')");//
        statement.execute("INSERT into DB_demo.User(id,pwd,name,contact)VALUES('0000000003',AES_ENCRYPT('qwerqwer','key_pwd'),'clex','12580')");//
        System.out.println("state after insertion");
        System.out.println("table student");
        resultSet=statement.executeQuery("SELECT id,sex FROM DB_demo.student");
        while(resultSet.next()){
            System.out.println(resultSet.getString("id")+","+resultSet.getString("sex"));
        }
        System.out.println("table user");//
        //resultSet=statement.executeQuery("SELECT id,pwd,contact from DB_demo.User");//
        resultSet=statement.executeQuery("SELECT id,AES_DECRYPT(pwd,'key_pwd'),contact from DB_demo.User");//
        while(resultSet.next()){//
            //System.out.println(resultSet.getString("id")+","+resultSet.getString("pwd")+","+resultSet.getString("contact"));//
            System.out.println(resultSet.getString("id")+","+resultSet.getString("AES_DECRYPT(pwd,'key_pwd')")+","+resultSet.getString("contact"));//
        }//
    }
}

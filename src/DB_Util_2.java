import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Created by alex on 11/26/16.
 * the DB_Util_2 is a simple utilization of HBMS database
 */
public class DB_Util_2 {
    private static final String HOST_IP="127.0.0.1";
    private static final String DB_PORT="3306";
    private static final String DB_NAME="DB_HBMS_Innovator";
    private static final String URL="jdbc:mysql://"+HOST_IP+":"+DB_PORT+"/"+DB_NAME+"?characterEncoding=utf8&useSSL=true";
    private static final String NAME="root";
    private static final String PASSWORD="818818";
    public static Statement statement;

    static void reestablishment()throws Exception{
        //deletion
        statement.execute("DELETE FROM DB_HBMS_Innovator.Appeal");
        statement.execute("DELETE FROM DB_HBMS_Innovator.CommentInfo");
        statement.execute("DELETE FROM DB_HBMS_Innovator.CreditRecord");
        statement.execute("DELETE FROM DB_HBMS_Innovator.Hotel");
        statement.execute("DELETE FROM DB_HBMS_Innovator.HotelPromotion");
        statement.execute("DELETE FROM DB_HBMS_Innovator.OrderList");
        statement.execute("DELETE FROM DB_HBMS_Innovator.RoomInfo");
        statement.execute("DELETE FROM DB_HBMS_Innovator.User");
        statement.execute("DELETE FROM DB_HBMS_Innovator.WebPromotion");
        //reset auto-increments
        statement.execute("ALTER TABLE DB_HBMS_Innovator.Appeal AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_Innovator.CommentInfo AUTO_INCREMENT = 1");
    }

    static void showAppeal() throws Exception{
        ResultSet resultSet=statement.executeQuery("SELECT * FROM DB_HBMS_Innovator.Appeal");
        while(resultSet.next()){
            System.out.print(resultSet.getString("appealID")+"::");
            System.out.print(resultSet.getString("appealTime")+"::");
            System.out.print(resultSet.getString("userID")+"::");
            System.out.print(resultSet.getString("webMarketerID")+"::");
            System.out.print(resultSet.getString("content")+"::");
            System.out.print(resultSet.getString("appealState")+"::");
            System.out.println(resultSet.getString("orderID"));
        }
    }

    static void showCommentInfo()throws Exception{
        ResultSet resultSet=statement.executeQuery("SELECT * FROM DB_HBMS_Innovator.CommentInfo");
        while(resultSet.next()){
            System.out.print(resultSet.getString("commentID")+"::");
            System.out.print(resultSet.getString("time")+"::");
            System.out.print(resultSet.getString("hotelID")+"::");
            System.out.print(resultSet.getString("score")+"::");
            System.out.print(resultSet.getString("comment")+"::");
            System.out.print(resultSet.getString("picture1")+"::");
            System.out.print(resultSet.getString("picture2")+"::");
            System.out.println(resultSet.getString("picture3"));
        }
    }

    public static void main(String args[])throws Exception{
        Date date;
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime="";
        String sentence="";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection(URL,NAME,PASSWORD);
        statement=connection.createStatement();
        ///*[Reestablishment]
        //uncomment the following code if you need to reestablish the database
        //the reestablishment code is like kind of test suite ...
        reestablishment();
        //*/
        //initialization of an appeal individually
        currentTime=format.format(new Date());
        sentence="INSERT into DB_HBMS_Innovator.Appeal(appealTime, userID, webMarketerID, content, appealState, orderID)VALUES('"
                +currentTime+"'"+",'0300000001','0100000001','I just cannot understand',0,1)";
        System.out.println("the sentence is "+sentence);
        statement.execute(sentence);
        System.out.println("testing appeal individually");
        showAppeal();
        //initialization of a commentInfo individually
        sentence="INSERT into DB_HBMS_Innovator.CommentInfo(time, hotelID, score, comment, picture1, picture2, picture3)Values('"
                +currentTime+"'"+",'0001001001',5,'nice but noise','NOPIC','NOPIC','NOPIC')";
        statement.execute(sentence);
        System.out.println("testing commentinfo individually");
        showCommentInfo();
    }
}

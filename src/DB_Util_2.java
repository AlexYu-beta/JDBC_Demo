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
        statement.execute("ALTER TABLE DB_HBMS_Innovator.CreditRecord AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_Innovator.Hotel AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_Innovator.HotelPromotion AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_Innovator.OrderList AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_Innovator.RoomInfo AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_Innovator.WebPromotion AUTO_INCREMENT = 1");
    }

    static void showAppeal() throws Exception{
        System.out.println();
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
        System.out.println();
    }

    static void showCommentInfo()throws Exception{
        System.out.println();
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
        System.out.println();
    }

    static void showCreditRecord()throws Exception{
        System.out.println();
        ResultSet resultSet=statement.executeQuery("SELECT * FROM DB_HBMS_Innovator.CreditRecord");
        while(resultSet.next()){
            System.out.print(resultSet.getString("creditRecordID")+"::");
            System.out.print(resultSet.getString("time")+"::");
            System.out.print(resultSet.getString("userID")+"::");
            System.out.print(resultSet.getString("changeType")+"::");
            System.out.print(resultSet.getString("reasonType")+"::");
            System.out.println(resultSet.getString("amount"));
        }
        System.out.println();
    }

    static void showHotel()throws Exception{
        System.out.println();
        ResultSet resultSet=statement.executeQuery("SELECT * FROM DB_HBMS_Innovator.Hotel");
        while(resultSet.next()){
            System.out.print(resultSet.getString("hotelID")+"::");
            System.out.print(resultSet.getString("name")+"::");
            System.out.print(resultSet.getString("address")+"::");
            System.out.print(resultSet.getString("region")+"::");
            System.out.print(resultSet.getString("introduction")+"::");
            System.out.print(resultSet.getString("star")+"::");
            System.out.print(resultSet.getString("environment1")+"::");
            System.out.print(resultSet.getString("environment2")+"::");
            System.out.print(resultSet.getString("environment3")+"::");
            System.out.print(resultSet.getString("facility")+"::");
            System.out.println(resultSet.getString("score"));
        }
        System.out.println();
    }

    static void showHotelPromotion() throws Exception{
        System.out.println();
        ResultSet resultSet=statement.executeQuery("SELECT * FROM DB_HBMS_Innovator.HotelPromotion");
        while(resultSet.next()){
            System.out.print(resultSet.getString("hotelPromotionID")+"::");
            System.out.print(resultSet.getString("hotelID")+"::");
            System.out.print(resultSet.getString("name")+"::");
            System.out.print(resultSet.getString("content")+"::");
            System.out.print(resultSet.getString("startDate")+"::");
            System.out.print(resultSet.getString("endDate")+"::");
            System.out.print(resultSet.getString("minRankAvailable")+"::");
            System.out.println(resultSet.getString("maxRankAvailable"));
        }
        System.out.println();
    }

    static void showOrderList() throws Exception{
        System.out.println();
        ResultSet resultSet=statement.executeQuery("SELECT * FROM DB_HBMS_Innovator.OrderList");
        while(resultSet.next()){
            System.out.print(resultSet.getString("orderID")+"::");
            System.out.print(resultSet.getString("generateTime")+"::");
            System.out.print(resultSet.getString("cancelTime")+"::");
            System.out.print(resultSet.getString("executeDDL")+"::");
            System.out.print(resultSet.getString("hotelID")+"::");
            System.out.print(resultSet.getString("orderState")+"::");
            System.out.print(resultSet.getString("checkinTime")+"::");
            System.out.print(resultSet.getString("checkoutTime")+"::");
            System.out.print(resultSet.getString("number")+"::");
            System.out.print(resultSet.getString("hasChild")+"::");
            System.out.println(resultSet.getString("price"));
        }
        System.out.println();
    }

    static void showRoomInfo() throws Exception{
        System.out.println();
        ResultSet resultSet=statement.executeQuery("SELECT * FROM DB_HBMS_Innovator.RoomInfo");
        while(resultSet.next()){
            System.out.print(resultSet.getString("roomInfoID")+"::");
            System.out.print(resultSet.getString("hotelID")+"::");
            System.out.print(resultSet.getString("roomID")+"::");
            System.out.print(resultSet.getString("roomType")+"::");
            System.out.print(resultSet.getString("roomPrice")+"::");
            System.out.print(resultSet.getString("roomState")+"::");
            System.out.print(resultSet.getString("detailedInfo1")+"::");
            System.out.println(resultSet.getString("detailedInfo2"));
        }
        System.out.println();
    }

    static void showUser()throws Exception{
        System.out.println();
        ResultSet resultSet=statement.executeQuery("SELECT * FROM DB_HBMS_Innovator.User");
        while(resultSet.next()){
            System.out.print(resultSet.getString("userID")+"::");
            System.out.print(resultSet.getString("accountName")+"::");
            System.out.print(resultSet.getString("password")+"::");
            System.out.print(resultSet.getString("name")+"::");
            System.out.print(resultSet.getString("contact")+"::");
            System.out.print(resultSet.getString("portrait")+"::");
            System.out.print(resultSet.getString("creditValue")+"::");
            System.out.print(resultSet.getString("memberType")+"::");
            System.out.print(resultSet.getString("memberInfo")+"::");
            System.out.print(resultSet.getString("rank")+"::");
            System.out.print(resultSet.getString("hotelID")+"::");
            System.out.println(resultSet.getString("workID"));
        }
        System.out.println();
    }

    static void showWebPromotion() throws Exception{
        System.out.println();
        ResultSet resultSet=statement.executeQuery("SELECT * FROM DB_HBMS_Innovator.WebPromotion");
        while(resultSet.next()){
            System.out.print(resultSet.getString("webPromotionID")+"::");
            System.out.print(resultSet.getString("webPromotionType")+"::");
            System.out.print(resultSet.getString("name")+"::");
            System.out.print(resultSet.getString("content")+"::");
            System.out.print(resultSet.getString("startDate")+"::");
            System.out.print(resultSet.getString("endDate")+"::");
            System.out.print(resultSet.getString("minRankAvailable")+"::");
            System.out.print(resultSet.getString("maxRankAvailable")+"::");
            System.out.println(resultSet.getString("regionAvailableList"));
        }
        System.out.println();
    }

    public static void main(String args[])throws Exception{
        Date date;
        SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format2=new SimpleDateFormat("yyyy-MM-dd");
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
        currentTime=format1.format(new Date());
        sentence="INSERT into DB_HBMS_Innovator.Appeal(appealTime, userID, webMarketerID, content, appealState, orderID)VALUES('"
                +currentTime+"'"+",'0300000001','0100000001','I just cannot understand',0,1)";
        statement.execute(sentence);
        System.out.println("testing appeal individually");
        showAppeal();
        //initialization of a commentInfo individually
        sentence="INSERT into DB_HBMS_Innovator.CommentInfo(time, hotelID, score, comment, picture1, picture2, picture3)Values('"
                +currentTime+"'"+",1,5,'nice but noise','NOPIC','NOPIC','NOPIC')";
        statement.execute(sentence);
        System.out.println("testing commentinfo individually");
        showCommentInfo();
        //initialization of a creditRecord individually
        sentence="INSERT into DB_HBMS_Innovator.CreditRecord(time, userID, changeType, reasonType, amount)VALUES ('"
                +currentTime+"'"+",'0300000001',0,0,648)";
        statement.execute(sentence);
        System.out.println("testing creditRecord individually");
        showCreditRecord();
        //initialization of a hotel individually
        sentence="INSERT into DB_HBMS_Innovator.Hotel(name, address, region, introduction, star, environment1, environment2, environment3, facility, score)VALUES('"
                +"motel168','department 10, South Zhongshan Rd. ','Jiangsu/Nanjing/Xinjiekou','a lovely hotel far away from peace',4,'NOPIC','NOPIC','NOPIC','basically equipped','5')";
        statement.execute(sentence);
        System.out.println("testing hotel individually");
        showHotel();
        //initialization of a hotelPromotion individually
        currentTime=format2.format(new Date());
        sentence="INSERT into DB_HBMS_Innovator.HotelPromotion(hotelID, name, content, startDate, endDate, minRankAvailable, maxRankAvailable)" +
                "VALUES('1','double 11 promotion','50% off!!!','"+currentTime+"','2017-11-10',1,100)";
        statement.execute(sentence);
        System.out.println("testing hotelPromotion individually");
        showHotelPromotion();
        //initialization of an OrderList individually
        currentTime=format1.format(new Date());
        sentence="INSERT into DB_HBMS_Innovator.OrderList(generateTime, cancelTime, executeDDL, hotelID, orderState, checkinTime, checkoutTime, number, hasChild, price)" +
                "VALUES('"+currentTime+"',NULL,'2017-1-1 18:00:00',1,0,Null,NULL,2,0,328)";
        statement.execute(sentence);
        System.out.println("testing OrderList individually");
        showOrderList();
        //initialization of a roominfo individually
        sentence="INSERT into DB_HBMS_Innovator.RoomInfo(hotelID, roomID, roomType, roomPrice, roomState, detailedInfo1, detailedInfo2)" +
                "VALUES('1','3B348','palace',648,0,NULL,NULL)";
        statement.execute(sentence);
        System.out.println("testing RoomInfo individually");
        showRoomInfo();
        //initialization of a user individually
        sentence="INSERT into DB_HBMS_Innovator.User(userID, accountName, password, name, contact, portrait, creditValue, memberType, memberInfo, rank, hotelID, workID)";
        statement.execute(sentence+"VALUES('0000000001','alex2097','123','Alex Yu','10086','NOPIC',NULL,NULL,NULL,NULL,0,'0001')");
        statement.execute(sentence+"VALUES('0100000001','alex2096','123','Alex Chen','110','NOPIC',NULL,NULL,NULL,NULL,0,'0001')");
        statement.execute(sentence+"VALUES('0200000001','alex2095','123','Alex Shi','510','NOPIC',NULL,NULL,NULL,NULL,1,'0001')");
        statement.execute(sentence+"VALUES('0300000001','alex2094','123','Alex Yu','272','NOPIC',10000,1,'1996-09-30',98,0,NULL)");
        System.out.println("testing user individually");
        showUser();
        //initialization of a web promotion individually
        currentTime=format2.format(new Date());
        sentence="INSERT into DB_HBMS_Innovator.WebPromotion(webPromotionType, name, content, startDate, endDate, minRankAvailable, maxRankAvailable, regionAvailableList)" +
                "VALUES(0,'double 11 promotion','50% off!!!','"+currentTime+"','2017-11-10',1,100,'003001002003')";
        statement.execute(sentence);
        System.out.println("testing web promotion individually");
        showWebPromotion();
    }
}

/**
 * Created by alex on 11/27/16.
 *
 * DB_Util_3 implements the initialization of the database of HBMS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.text.SimpleDateFormat;
public class DB_Util_3 {
    private static final String HOST_IP="127.0.0.1";
    private static final String DB_PORT="3306";
    private static final String DB_NAME="DB_HBMS_INNOVATOR";
    private static final String URL="jdbc:mysql://"+HOST_IP+":"+DB_PORT+"/"+DB_NAME+"?characterEncoding=utf8&useSSL=true";
    private static final String NAME="root";
    private static final String PASSWORD="818818";
    public static Statement statement;
    private static SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static SimpleDateFormat format2=new SimpleDateFormat("yyyy-MM-dd");

    static void reestablishment()throws Exception{
        //deletion
        statement.execute("DELETE FROM DB_HBMS_INNOVATOR.Appeal");
        statement.execute("DELETE FROM DB_HBMS_INNOVATOR.CommentInfo");
        statement.execute("DELETE FROM DB_HBMS_INNOVATOR.CreditRecord");
        statement.execute("DELETE FROM DB_HBMS_INNOVATOR.Hotel");
        statement.execute("DELETE FROM DB_HBMS_INNOVATOR.HotelPromotion");
        statement.execute("DELETE FROM DB_HBMS_INNOVATOR.OrderList");
        statement.execute("DELETE FROM DB_HBMS_INNOVATOR.RoomInfo");
        statement.execute("DELETE FROM DB_HBMS_INNOVATOR.User");
        statement.execute("DELETE FROM DB_HBMS_INNOVATOR.WebPromotion");
        statement.execute("DELETE FROM DB_HBMS_INNOVATOR.Region");
        //reset auto-increments
        statement.execute("ALTER TABLE DB_HBMS_INNOVATOR.Appeal AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_INNOVATOR.CommentInfo AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_INNOVATOR.CreditRecord AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_INNOVATOR.Hotel AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_INNOVATOR.HotelPromotion AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_INNOVATOR.OrderList AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_INNOVATOR.RoomInfo AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_INNOVATOR.WebPromotion AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_INNOVATOR.Region AUTO_INCREMENT = 1");
    }

    static void initRegion() throws Exception{
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('上海','上海','南京路')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('上海','上海','徐家汇')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('上海','上海','静安寺')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('上海','上海','淮海路')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('上海','上海','陆家嘴')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('上海','上海','陆家嘴')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('浙江','杭州','武林')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('浙江','杭州','湖滨')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('浙江','杭州','钱江新城')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('浙江','杭州','城西')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('江苏','苏州','观前')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('江苏','苏州','石路')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('江苏','苏州','平江新城')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('江苏','苏州','吴中')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('江苏','南京','新街口')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('江苏','南京','湖南路')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('江苏','南京','夫子庙')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('江苏','南京','中央门')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('浙江','宁波','天一')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('浙江','宁波','城隍庙')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('浙江','宁波','鼓楼步行街')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('湖北','武汉','江汉路')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('湖北','武汉','中央文化区')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('湖北','武汉','武广')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('福建','厦门','中山路')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('湖南','长沙','五一')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('湖南','长沙','溁湾镇')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('广东','广州','天河中心')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('广东','广州','上下九')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('广东','广州','北京路')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('广东','深圳','华侨城')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('广东','深圳','东门')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('广东','深圳','南山')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('广东','深圳','龙岗')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('重庆','重庆','解放碑')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.Region(province, town, regionName)" +
                "VALUES('重庆','重庆','沙坪坝')");
    }

    static void initHotel() throws Exception{

    }

    static void initAll() throws Exception{
        initRegion();
        initHotel();
    }

    public static void main(String args[]) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection(URL,NAME,PASSWORD);
        statement=connection.createStatement();
        reestablishment();
        initAll();
    }
}

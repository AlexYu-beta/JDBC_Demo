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
        String sentence="INSERT into DB_HBMS_INNOVATOR.Hotel(name, address, region, introduction, star, environment1, environment2, environment3, facility, score)";
        //
        statement.execute(sentence + "VALUES ('如家连锁酒店','13 Nanjing Rd.',1,'a very expensive hotel',3,'NOPIC','NOPIC','NOPIC','feel like living in your own home, but a little bit noisy',3)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Nanjing Rd.',1,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Nanjing Rd.',1,'a holy-expensive hotel, built in 1900',5,'NOPIC','NOPIC','NOPIC','we call it royal, what else can you imagine?',5)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','1 Yunnan Rd.',1,'a fundamentally equipped hotel, and the service is of standard',2,'NOPIC','NOPIC','NOPIC','basically equipped, standardized service provided',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',2,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',2,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',2,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',2,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('希尔顿酒店','6610 W. Nanjing Rd.',3,'a holy-expensive hotel, never try without a moderate wallet',5,'NOPIC','NOPIC','NOPIC','maybe the most fantastic furnish in Shanghai',4)");
        statement.execute(sentence + "VALUES ('汉庭连锁酒店','800 W. Nanjing Rd.',3,'a very cheap chain hotel',2,'NOPIC','NOPIC','NOPIC','best choice for tourists from nearby cities',5)");
        //allow me repeat in the next lines;
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',4,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',4,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',4,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',4,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','100 Tianyaoqiao Rd.',5,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',5,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('速８连锁酒店','123 S. Wanping Rd.',5,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',5,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('速８连锁酒店','100 Tianyaoqiao Rd.',6,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',6,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',6,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',6,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',7,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',7,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',7,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',7,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',5)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',8,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',8,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('速８连锁酒店','123 S. Wanping Rd.',8,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',8,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',9,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',9,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',9,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',9,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',10,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',10,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',10,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',10,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',5)");
        //
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','100 Tianyaoqiao Rd.',11,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',11,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('速８连锁酒店','123 S. Wanping Rd.',11,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',11,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('速８连锁酒店','100 Tianyaoqiao Rd.',12,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',5)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',12,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',12,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',12,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',13,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',13,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',13,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',5)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',13,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',14,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',14,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('速８连锁酒店','123 S. Wanping Rd.',14,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',14,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',15,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',15,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',15,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',15,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',5)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',16,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',16,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',16,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',16,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','100 Tianyaoqiao Rd.',17,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',17,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('速８连锁酒店','123 S. Wanping Rd.',17,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',17,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('速８连锁酒店','100 Tianyaoqiao Rd.',18,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',18,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',18,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',18,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',19,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',5)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',19,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',19,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',19,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',20,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',20,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('速８连锁酒店','123 S. Wanping Rd.',20,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',20,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',5)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',21,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',21,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',21,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',21,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',22,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',22,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',22,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',22,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',5)");
        //
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','100 Tianyaoqiao Rd.',23,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',23,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('速８连锁酒店','123 S. Wanping Rd.',23,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',23,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('速８连锁酒店','100 Tianyaoqiao Rd.',24,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',24,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',24,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',24,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',25,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',5)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',25,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',25,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',25,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',26,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',26,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('速８连锁酒店','123 S. Wanping Rd.',26,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',26,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',27,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',3)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',27,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',27,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',27,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',5)");
//
        statement.execute(sentence + "VALUES ('速８连锁酒店','100 Tianyaoqiao Rd.',28,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',5)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',28,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',28,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',3)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',28,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',3)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',29,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',5)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',29,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',29,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',29,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',30,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',30,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('速８连锁酒店','123 S. Wanping Rd.',30,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',30,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',31,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',31,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',31,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',5)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',31,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',32,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',5)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',32,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',32,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',32,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','100 Tianyaoqiao Rd.',33,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',3)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',33,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('速８连锁酒店','123 S. Wanping Rd.',33,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',33,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('速８连锁酒店','100 Tianyaoqiao Rd.',34,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',34,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',34,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',34,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',5)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',35,'a secret garden hidden inside of the downtown',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',35,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',35,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',35,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',3)");



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

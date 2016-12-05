/**
 * Created by alex on 11/27/16.
 *
 * DB_Util_3 implements the initialization of the database of HBMS
 */
import java.rmi.server.ExportException;
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
        statement.execute("DELETE FROM DB_HBMS_INNOVATOR.appeal");
        statement.execute("DELETE FROM DB_HBMS_INNOVATOR.commentinfo");
        statement.execute("DELETE FROM DB_HBMS_INNOVATOR.creditrecord");
        statement.execute("DELETE FROM DB_HBMS_INNOVATOR.hotel");
        statement.execute("DELETE FROM DB_HBMS_INNOVATOR.hotelpromotion");
        statement.execute("DELETE FROM DB_HBMS_INNOVATOR.orderlist");
        statement.execute("DELETE FROM DB_HBMS_INNOVATOR.roominfo");
        statement.execute("DELETE FROM DB_HBMS_INNOVATOR.user");
        statement.execute("DELETE FROM DB_HBMS_INNOVATOR.webpromotion");
        statement.execute("DELETE FROM DB_HBMS_INNOVATOR.region");
        //reset auto-increments
        statement.execute("ALTER TABLE DB_HBMS_INNOVATOR.appeal AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_INNOVATOR.commentinfo AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_INNOVATOR.creditrecord AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_INNOVATOR.hotel AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_INNOVATOR.hotelpromotion AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_INNOVATOR.orderlist AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_INNOVATOR.roominfo AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_INNOVATOR.webpromotion AUTO_INCREMENT = 1");
        statement.execute("ALTER TABLE DB_HBMS_INNOVATOR.region AUTO_INCREMENT = 1");
    }

    static void initregion() throws Exception{
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('上海','上海','南京路')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('上海','上海','徐家汇')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('上海','上海','静安寺')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('上海','上海','淮海路')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('上海','上海','陆家嘴')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('浙江','杭州','武林')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('浙江','杭州','湖滨')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('浙江','杭州','钱江新城')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('浙江','杭州','城西')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('江苏','苏州','观前')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('江苏','苏州','石路')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('江苏','苏州','平江新城')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('江苏','苏州','吴中')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('江苏','南京','新街口')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('江苏','南京','湖南路')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('江苏','南京','夫子庙')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('江苏','南京','中央门')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('浙江','宁波','天一')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('浙江','宁波','城隍庙')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('浙江','宁波','鼓楼步行街')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('湖北','武汉','江汉路')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('湖北','武汉','中央文化区')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('湖北','武汉','武广')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('福建','厦门','中山路')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('湖南','长沙','五一')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('湖南','长沙','溁湾镇')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('广东','广州','天河中心')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('广东','广州','上下九')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('广东','广州','北京路')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('广东','深圳','华侨城')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('广东','深圳','东门')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('广东','深圳','南山')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('广东','深圳','龙岗')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('重庆','重庆','解放碑')");
        statement.execute("INSERT into DB_HBMS_INNOVATOR.region(province, city, regionName)" +
                "VALUES('重庆','重庆','沙坪坝')");
    }

    static void inithotel() throws Exception{
        String sentence="INSERT into DB_HBMS_INNOVATOR.hotel(name, address, region, introduction, star, environment1, environment2, environment3, facility, score)";
        //
        statement.execute(sentence + "VALUES ('如家连锁酒店','13 Nanjing Rd.',1,'a very expensive hotel',3,'NOPIC','NOPIC','NOPIC','feel like living in your own home, but a little bit noisy',3)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Nanjing Rd.',1,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Nanjing Rd.',1,'a holy-expensive hotel, built in 1900',5,'NOPIC','NOPIC','NOPIC','we call it royal, what else can you imagine?',5)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','1 Yunnan Rd.',1,'a fundamentally equipped hotel, and the service is of standard',2,'NOPIC','NOPIC','NOPIC','basically equipped, standardized service provided',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',2,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',2,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',2,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',2,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('希尔顿酒店','6610 W. Nanjing Rd.',3,'a holy-expensive hotel, never try without a moderate wallet',5,'NOPIC','NOPIC','NOPIC','maybe the most fantastic furnish in Shanghai',4)");
        statement.execute(sentence + "VALUES ('汉庭连锁酒店','800 W. Nanjing Rd.',3,'a very cheap chain hotel',2,'NOPIC','NOPIC','NOPIC','best choice for tourists from nearby cities',5)");
        //allow me repeat in the next lines;
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',4,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',4,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',4,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',4,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','100 Tianyaoqiao Rd.',5,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',5,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('速８连锁酒店','123 S. Wanping Rd.',5,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',5,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('速８连锁酒店','100 Tianyaoqiao Rd.',6,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',6,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',6,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',6,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',7,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',7,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',7,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',7,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',5)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',8,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',8,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('速８连锁酒店','123 S. Wanping Rd.',8,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',8,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',9,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',9,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',9,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',9,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',10,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',10,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',10,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',10,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',5)");
        //
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','100 Tianyaoqiao Rd.',11,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',11,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('速８连锁酒店','123 S. Wanping Rd.',11,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',11,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('速８连锁酒店','100 Tianyaoqiao Rd.',12,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',5)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',12,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',12,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',12,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',13,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',13,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',13,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',5)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',13,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',14,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',14,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('速８连锁酒店','123 S. Wanping Rd.',14,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',14,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',15,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',15,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',15,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',15,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',5)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',16,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',16,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',16,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',16,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','100 Tianyaoqiao Rd.',17,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',17,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('速８连锁酒店','123 S. Wanping Rd.',17,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',17,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('速８连锁酒店','100 Tianyaoqiao Rd.',18,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',18,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',18,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',18,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',19,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',5)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',19,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',19,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',19,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',20,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',20,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('速８连锁酒店','123 S. Wanping Rd.',20,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',20,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',5)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',21,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',21,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',21,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',21,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',22,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',22,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',22,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',22,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',5)");
        //
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','100 Tianyaoqiao Rd.',23,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',23,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('速８连锁酒店','123 S. Wanping Rd.',23,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',23,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('速８连锁酒店','100 Tianyaoqiao Rd.',24,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',24,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',24,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',24,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',25,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',5)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',25,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',25,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',25,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',26,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',26,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('速８连锁酒店','123 S. Wanping Rd.',26,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',26,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',27,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',3)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',27,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',27,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',27,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',5)");
//
        statement.execute(sentence + "VALUES ('速８连锁酒店','100 Tianyaoqiao Rd.',28,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',5)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',28,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',28,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',3)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',28,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',3)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',29,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',5)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',29,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',29,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',29,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',30,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',30,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('速８连锁酒店','123 S. Wanping Rd.',30,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',30,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',31,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',31,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',31,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',5)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',31,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',32,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',5)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',32,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',32,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',32,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','100 Tianyaoqiao Rd.',33,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',3)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',33,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('速８连锁酒店','123 S. Wanping Rd.',33,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',33,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',4)");
        //
        statement.execute(sentence + "VALUES ('速８连锁酒店','100 Tianyaoqiao Rd.',34,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('君悦大酒店','648 Tianyaoqiao Rd.',34,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',34,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','120 Zhaojiabang Rd.',34,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',5)");
        //
        statement.execute(sentence + "VALUES ('７天连锁酒店','100 Tianyaoqiao Rd.',35,'a secret garden hidden inside of the downcity',3,'NOPIC','NOPIC','NOPIC','environment is not good',2)");
        statement.execute(sentence + "VALUES ('希尔顿酒店','648 Tianyaoqiao Rd.',35,'a holy-expensive hotel, built in 2016, symbolize the life of the rich',5,'NOPIC','NOPIC','NOPIC','everything is perfect except the traffic',4)");
        statement.execute(sentence + "VALUES ('格林豪泰连锁酒店','123 S. Wanping Rd.',35,'a very cheap chain hotel',3,'NOPIC','NOPIC','NOPIC','maybe the service here is better than other chains',4)");
        statement.execute(sentence + "VALUES ('７天连锁酒店','120 Zhaojiabang Rd.',35,'a very cheap hotel',3,'NOPIC','NOPIC','NOPIC','good enough, but a little bit noisy',3)");



    }

    static void inithotelpromotion() throws Exception{
        Date date=new Date();
        String startTime1=format2.format(date);
        String startTime2="2015-01-01";
        String startTime3="2016-11-11";
        String startTime4="2017-11-11";
        String endTime1="2017-12-31";
        String endTime2="2016-12-31";
        String endTime3="2017-11-20";
        String endTime4="2018-01-01";
        String sentence="INSERT into DB_HBMS_INNOVATOR.hotelpromotion(hotelID, name, content, startDate, endDate, minRankAvailable, maxRankAvailable) ";
        //
        statement.execute(sentence+"VALUES(1,'All-year discount','20% percent off  from this year','"+startTime1+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(1,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(1,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime2+"','"+endTime4+"',1,1)");
        //
        statement.execute(sentence+"VALUES(2,'first order','to attract more customers online, the first order would be 70% off!!!!','"+startTime2+"','"+endTime4+"',1,1)");
        statement.execute(sentence+"VALUES(2,'first order','to show gratefulness for old customers(those vip rank is more than 5), the first 3 orders will be 50% off','"+startTime4+"','"+endTime4+"',6,10)");
        //
        statement.execute(sentence+"VALUES(3,'All-year discount','20% percent off  from this year','"+startTime2+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(3,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(3,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime3+"','"+endTime2+"',1,1)");
        //
        statement.execute(sentence+"VALUES(4,'All-year discount','20% percent off  from this year','"+startTime1+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(4,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(5,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime3+"','"+endTime2+"',1,1)");
        //
        statement.execute(sentence+"VALUES(6,'All-year discount','20% percent off  from this year','"+startTime2+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(7,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(7,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime3+"','"+endTime2+"',1,1)");
        //
        statement.execute(sentence+"VALUES(9,'All-year discount','20% percent off  from this year','"+startTime1+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(9,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(10,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime3+"','"+endTime2+"',1,1)");
        //
        statement.execute(sentence+"VALUES(10,'All-year discount','20% percent off  from this year','"+startTime2+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(11,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(12,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime3+"','"+endTime2+"',1,1)");
        //
        statement.execute(sentence+"VALUES(15,'All-year discount','20% percent off  from this year','"+startTime2+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(17,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(18,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime3+"','"+endTime2+"',1,1)");
        //
        statement.execute(sentence+"VALUES(21,'All-year discount','20% percent off  from this year','"+startTime1+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(21,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(21,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime3+"','"+endTime2+"',1,1)");
        //
        statement.execute(sentence+"VALUES(22,'All-year discount','20% percent off  from this year','"+startTime1+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(23,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(23,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime3+"','"+endTime2+"',1,1)");
        //
        statement.execute(sentence+"VALUES(24,'All-year discount','20% percent off  from this year','"+startTime1+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(26,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(27,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime3+"','"+endTime2+"',1,1)");
        //
        statement.execute(sentence+"VALUES(27,'All-year discount','20% percent off  from this year','"+startTime1+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(29,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(30,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime3+"','"+endTime2+"',1,1)");
        //
        statement.execute(sentence+"VALUES(31,'All-year discount','20% percent off  from this year','"+startTime1+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(35,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(40,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime3+"','"+endTime2+"',1,1)");
        //
        statement.execute(sentence+"VALUES(41,'All-year discount','20% percent off  from this year','"+startTime1+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(41,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(43,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime3+"','"+endTime2+"',1,1)");
        //
        statement.execute(sentence+"VALUES(47,'All-year discount','20% percent off  from this year','"+startTime1+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(53,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(55,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime3+"','"+endTime2+"',1,1)");
        //
        statement.execute(sentence+"VALUES(57,'All-year discount','20% percent off  from this year','"+startTime1+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(57,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(58,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime3+"','"+endTime2+"',1,1)");
        //
        statement.execute(sentence+"VALUES(66,'All-year discount','20% percent off  from this year','"+startTime1+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(67,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(71,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime3+"','"+endTime2+"',1,1)");
        //
        statement.execute(sentence+"VALUES(73,'All-year discount','20% percent off  from this year','"+startTime1+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(89,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(89,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime3+"','"+endTime2+"',1,1)");
        //
        statement.execute(sentence+"VALUES(103,'All-year discount','20% percent off  from this year','"+startTime1+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(110,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(121,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime3+"','"+endTime2+"',1,1)");
        //
        statement.execute(sentence+"VALUES(125,'All-year discount','20% percent off  from this year','"+startTime1+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(125,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(125,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime3+"','"+endTime2+"',1,1)");
        //
        statement.execute(sentence+"VALUES(127,'All-year discount','20% percent off  from this year','"+startTime1+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(130,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(131,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime3+"','"+endTime2+"',1,1)");
        //
        statement.execute(sentence+"VALUES(131,'All-year discount','20% percent off  from this year','"+startTime1+"','"+endTime1+"',1,10)");
        statement.execute(sentence+"VALUES(138,'double 11 special promotion','to attract more customers online, all breakfasts will be free if the promotion takes effect','"+startTime4+"','"+endTime3+"',1,10)");
        statement.execute(sentence+"VALUES(138,'first order','to attract more customers online, the first order would be 80% off!!!!','"+startTime3+"','"+endTime2+"',1,1)");
    }

    static void initwebpromotion() throws Exception{
        Date date=new Date();
        String startTime1=format2.format(date);
        String startTime2="2017-12-20";
        String startTime3="2016-11-11";
        String startTime4="2017-11-11";
        String endTime1="2017-12-31";
        String endTime2="2016-12-31";
        String endTime3="2017-11-20";
        String endTime4="2018-01-01";
        String allRegion="035000001002003004005006007008009010011012013014015016017018019020021022023024025026027028029030031032033034";
        String partialRegion="010001003005007009010012014016018";
        String sentence="INSERT into DB_HBMS_INNOVATOR.webpromotion(webPromotionType, name, content, startDate, endDate, minRankAvailable, maxRankAvailable, regionAvailableList)";
        statement.execute(sentence+"VALUES(0,'double 11 promotion','a holy discount, an average of 25% off, more benefits than you can imagine!','"+startTime4+"','"+endTime3+"',1,10,'"+allRegion+"')");
        statement.execute(sentence+"VALUES(0,'christmas promotion','time for black friday, an average of 15% off','"+startTime2+"','"+endTime1+"',1,10,'"+allRegion+"')");
        statement.execute(sentence+"VALUES(0,'seashore festive','splendid ceremonies at seaside towns','"+startTime3+"','"+endTime2+"',2,10,'"+partialRegion+"')");
        statement.execute(sentence+"VALUES(1,'promotion for all newly signed-up friends','first charge, buy one get one free for all products','"+startTime1+"','"+endTime4+"',1,1,'"+allRegion+"')");
        statement.execute(sentence+"VALUES(1,'promotion for all newly signed-up friends','20% off for seashore festive','"+startTime1+"','"+endTime4+"',1,1,'"+partialRegion+"')");
    }

    static void initUser() throws Exception{
        String sentence="INSERT into DB_HBMS_INNOVATOR.user(userID, accountName, password, name, contact, portrait, creditValue, memberType, memberInfo, rank, hotelID, workID) ";
        //initiating 4 web managers
        statement.execute(sentence+"VALUES('0000000001','Alex2097','123','Alex Yu','68888888',null,0,null,null,null,null,'001')");
        statement.execute(sentence+"VALUES('0000000003','Tim1001','123','Tim He','68888881',null,0,null,null,null,null,'002')");
        statement.execute(sentence+"VALUES('0000000007','Betty11','123','Betty Liu','68882888',null,0,null,null,null,null,'003')");
        statement.execute(sentence+"VALUES('0000000010','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'014')");
        //initiating 2 web marketers
        statement.execute(sentence+"VALUES('0100000001','Luke','1234','Luke','61838488',null,0,null,null,null,null,'015')");
        statement.execute(sentence+"VALUES('0100000019','Luke1','1234','Luke Nog','68833888',null,0,null,null,null,null,'019')");
        //initiating 10 hotel staffs
        statement.execute(sentence+"VALUES('0200000011','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('0200000012','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('0200000013','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('0200001000','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('0200001001','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('0200002048','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('0200000999','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('0200000077','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('0200000016','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('0200000018','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        //initiating 15 users
        statement.execute(sentence+"VALUES('1200000011','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('2500000012','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('3300000013','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('1240001000','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('4444001001','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('2220000011','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('6600000012','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('8800000013','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('6000710600','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('2023401001','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('1234000011','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('2003040012','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('7522000013','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('6200231000','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
        statement.execute(sentence+"VALUES('9200001001','Eryuding1998','123','丁二玉','68838888',null,0,null,null,null,null,'010')");
    }

    static void initAll() throws Exception{
        initregion();
        inithotel();
        inithotelpromotion();
        initwebpromotion();
        initUser();
    }

    public static void main(String args[]) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection(URL,NAME,PASSWORD);
        statement=connection.createStatement();
        reestablishment();
        initAll();
    }
}

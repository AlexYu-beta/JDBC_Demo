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

    static void initRegion() throws Exception{
        Date date;
        String currentTime="";
        String sentence="";
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


    }

    public static void main(String args[]) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection(URL,NAME,PASSWORD);
        statement=connection.createStatement();
        initRegion();
    }
}

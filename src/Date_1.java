import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by alex on 12/10/16.
 */
public class Date_1 {
    public static void main(String args[]) throws Exception{
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-mm-dd");
        String time;
        Date date=simpleDateFormat.parse("1996-9-30");
        time=simpleDateFormat.format(date);
        System.out.println(time);
    }
}

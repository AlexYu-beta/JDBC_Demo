import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.spi.CalendarNameProvider;

/**
 * Created by alex on 12/11/16.
 */
public class Date_2 {
    public static void main(String args[]){

        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Calendar calendar=Calendar.getInstance();
        try {
            Date date1=simpleDateFormat1.parse("1996-09-30");
            Date date2=simpleDateFormat2.parse("1997-09-30 13:20:07");
            calendar.setTime(date1);
            System.out.println(calendar.get(Calendar.MONTH));
            calendar.setTime(date2);
            System.out.println(calendar.get(Calendar.MONTH));
            //System.out.println(date2);
        } catch (ParseException e) {
            System.out.println("wrong format");
        }
    }
}

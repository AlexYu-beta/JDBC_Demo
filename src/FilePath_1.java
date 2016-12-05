/**
 * Created by alex on 12/5/16.
 */
import java.io.File;
public class FilePath_1 {
    public static void main(String args[]) throws Exception{
        File directory = new File("");//参数为空
        String courseFile = directory.getCanonicalPath() ;
        System.out.println(courseFile);

    }
}

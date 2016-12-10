import java.io.File;

/**
 * Created by alex on 12/10/16.
 */
public class FilePath_3 {
    public static void main(String args[]){
        File file=new File("/home/alex/Test/subTest2/aa/bb/cc");
        file.mkdirs();
        deldir(new File("/home/alex/Test/subTest2"));
    }

   static void deldir(File file){
        if(file.exists()){
            if(file.isFile()){
                file.delete();
            }else{
                File[] files=file.listFiles();
                for(int i=0;i<files.length;i++){
                    deldir(files[i]);
                }
                file.delete();
            }
        }else{
            return;
        }
    }
}

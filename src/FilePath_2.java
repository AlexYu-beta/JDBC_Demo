import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by alex on 12/10/16.
 */
public class FilePath_2 {
    public static void main(String args[])throws Exception{
        File file=new File("/home/alex/Pictures/test.jpg");//file to be uploaded
        //rmi transmission
        //rmi transmission
        File file2=new File("/home/alex/test2.jpg");//file to be saved
        Image image = ImageIO.read(file);//the imageio converts the File it gets to Image
        int w=image.getWidth(null);
        int h=image.getHeight(null);
        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_3BYTE_BGR);
        //essential part, makes the image drawable and savable
        Graphics g = bi.getGraphics();
        try {
            g.drawImage(image, 0, 0, null);
            ImageIO.write(bi,"jpg",file2);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

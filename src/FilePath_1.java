/**
 * Created by alex on 12/5/16.
 */
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FilePath_1 {
    public static void main(String args[]) throws Exception{
        Image image = ImageIO.read(new File("/home/alex/Pictures/test.jpg"));
        int w=image.getWidth(null);
        int h=image.getHeight(null);
        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_3BYTE_BGR);
        Graphics g = bi.getGraphics();
        try {
            g.drawImage(image, 0, 0, null);

//将BufferedImage变量写入文件中。
            ImageIO.write(bi,"jpg",new File("/home/alex/test2.jpg"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //ImageIO.write((BufferedImage)image, "png", new File("/home/alex/test2.jpg"));
    }
}

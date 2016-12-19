import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by alex on 12/17/16.
 */

public class Image_1 extends Application{
    private ImageView imageView;
    public void start(Stage stage)
    {
        imageView = new ImageView();

        File testImage=new File("/home/alex/Pictures/admin.png");
        Image fxImage=null;
        try {
            fxImage = new Image(new FileInputStream(testImage));
        }catch(IOException e){
            e.printStackTrace();
        }
        imageView.setImage(fxImage);
        VBox root = new VBox();
        Scene scene = new Scene(root,300,250);
        root.getChildren().add(imageView);

        stage.setScene(scene);
        stage.show();
    }



    public static void main(String args[]){
        launch(args);
    }
}

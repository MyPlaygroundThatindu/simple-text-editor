package lk.ijse.dep11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
//        do{
//            System.out.println("App started");
//            splashScreen(primaryStage);
//            Thread.sleep(2000);
//            break;
//        }while (true);

        AnchorPane root = FXMLLoader.load(getClass().getResource("/view/TextEditor.fxml"));
        Scene mainScene = new Scene(root);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Simple Text Editor");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

//    private void splashScreen (Stage primaryStage) throws Exception{
//        AnchorPane transRoot= FXMLLoader.load(getClass().getResource("/view/SplashScreen.fxml"));
//        Scene mainScene=new Scene(transRoot);
//        primaryStage.setScene(mainScene);
//        primaryStage.setTitle("Simple Text Editor");
//        primaryStage.initStyle(StageStyle.TRANSPARENT);
//        transRoot.setBackground(Background.fill(Color.TRANSPARENT));
//        mainScene.setFill(Color.TRANSPARENT);
//        primaryStage.centerOnScreen();
//        primaryStage.show();
//    }
}

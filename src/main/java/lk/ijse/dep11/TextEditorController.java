package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class TextEditorController {
    public MenuItem btnExit;
    public AnchorPane root;

    public void btnExitOnAction(ActionEvent e) {
//        Stage primaryStage = (Stage) root.getScene().getWindow();
//        primaryStage.close();
        System.exit(0);
    }
}

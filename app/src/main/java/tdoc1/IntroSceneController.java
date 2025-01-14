package tdoc1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class IntroSceneController {

    @FXML
    private Button button;

    @FXML
    private Label heading;

    

    @FXML
    void continueButtonAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AuthScene.fxml"));
            Parent authSceneRoot = loader.load();
            Stage mainWindow = (Stage) heading.getScene().getWindow();
            AuthSceneController authSceneController = loader.getController();
            Scene authScene = new Scene(authSceneRoot);
            mainWindow.setScene(authScene);
            mainWindow.setTitle("User Panel");
            mainWindow.show();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
    

    

}

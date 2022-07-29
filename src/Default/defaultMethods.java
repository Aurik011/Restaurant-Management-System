package Default;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class defaultMethods {    
    public void showPages(String fxmlAddress,String title) throws IOException{
        
        String address= fxmlAddress;
        String titleValue= title; //specifically for title
        
        Parent root = FXMLLoader.load(getClass().getResource(address));        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle(titleValue);
        stage.setScene(scene);
        stage.show();  
    }
    public void showDialog(String msg) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}

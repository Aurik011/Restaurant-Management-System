
package project;

import Default.defaultMethods;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;



public class startPageController implements Initializable {
    
   defaultMethods df = new defaultMethods();
    
    private void handleButtonAction(ActionEvent event) {
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    

    @FXML
    private void showFoodPage(ActionEvent event) throws IOException {
        
       
       df.showPages("/FoodMenu/foodMenu.fxml","Food Page");
              
    }

    @FXML
    private void showEmployeeList(ActionEvent event) throws IOException {
        df.showPages("/employeeList/employeeList.fxml","Employee List");

    }

    @FXML
    private void showLoginPage(ActionEvent event) throws IOException {
        df.showPages("/Login/login.fxml","Login");
    }
    
      @FXML
    private void showContact(ActionEvent event) throws IOException {
        df.showPages("/contact/contact.fxml","Contacts");

    }
    @FXML
    private void showAbout(ActionEvent event) throws IOException {
        df.showPages("/about/about.fxml","About");

    }
    
}

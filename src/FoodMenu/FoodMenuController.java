
package FoodMenu;

import databaseCon.ConnectDB;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;


public class FoodMenuController implements Initializable {
    ConnectDB DBobject;
    Connection connect = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    @FXML
    private CheckBox FriedChicken;
    @FXML
    private TextField FriedChickednText;
    
    int se;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        DBobject = new ConnectDB();
    } 
    
    @FXML
    private void saveOrderOnDatabase(ActionEvent event) {
       DBobject.connect();
       
//      String sql = "SELECT * From   login where DBname=? and DBpassword = ?";
//        ps = connect.prepareStatement(sql);
//        ps.setString(1, se);
//      //  ps.setString(2, password);
//         ps.executeQuery();
//        System.out.println(se);

       
       
       
    }

    @FXML
    private void isSelect(ActionEvent event) {
       String s;
       s=FriedChickednText.getText();
       se= Integer.parseInt(s);
    }
}

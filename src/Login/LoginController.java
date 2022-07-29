
package Login;

import Default.defaultMethods;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
//import commonFunction.commonFunction;
import databaseCon.ConnectDB;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;



public class LoginController implements Initializable {

    @FXML
    private JFXTextField nameField;
    @FXML
    private JFXPasswordField passwordField;
    @FXML
    private JFXButton loginbuttonField;

    ConnectDB DBobject;
    Connection connect = null;
    String name;
    String password;
    PreparedStatement ps = null;
    ResultSet rs = null;
    defaultMethods dm;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        DBobject = new ConnectDB();
        dm = new defaultMethods();

    }

    @FXML
    private void loginAction(ActionEvent event) throws SQLException {

        name = nameField.getText();
        password = passwordField.getText();

        //connect to the database
        connect = DBobject.connect();
        System.err.println(connect);

        String sql = "SELECT * From   login where DBname=? and DBpassword = ?";
        ps = connect.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, password);
        rs = ps.executeQuery();

        String dbname = " ";
        String dbpass = " ";

        while (rs.next()) {
            dbname = rs.getString("DBname");
            dbpass = rs.getString("DBpassword");
        }

        if ((dbname.equals(name)) && (dbpass.equals(password))) {
            dm.showDialog("Successful ! Welcome to Login Panel.");
        } else {
             dm.showDialog("Failed");
        }

    }

}

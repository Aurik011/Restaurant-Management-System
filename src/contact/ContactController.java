package contact;

import about.AboutController;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class ContactController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
        Desktop d = Desktop.getDesktop();
        try {
            try {
                d.browse(new URI("https://wordpress.com/view/restaurantmanagementsystem433140294.wordpress.com"));
            } catch (IOException ex) {
                Logger.getLogger(AboutController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(AboutController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void ridirect(ActionEvent event) {
        
        
        
    }
    
}

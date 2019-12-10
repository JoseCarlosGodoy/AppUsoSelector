/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APPUsoSelector;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import selectorDesplazamiento.SelectorDeslizamiento;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class AppUsoSelectorController implements Initializable {

    @FXML
    private VBox root;
    @FXML
    private SelectorDeslizamiento Arriba;
    @FXML
    private SelectorDeslizamiento Abajo;
    @FXML
    private Label resul;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ArrayList<String> lista=new ArrayList<String>();
        for(int i=1;i<10;i++)
            lista.add(String.valueOf(i));
        
        Arriba.setItems(lista);
        Abajo.setItems(lista);
        
        Arriba.setOnAction((event) -> {
            resul.setText("Pulsado Selector Arriba");
            
        });
        
        Abajo.setOnAction((event) -> {
            resul.setText("Pulsado Selector Abajo");
        });
    }    
    
}

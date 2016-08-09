package pl.grzegorz2047.mathsolver.mainscene;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainLayoutController {

    @FXML
    private Label output;
    public MainLayoutController() {

    }


    @FXML
    public void actionPerformed(ActionEvent e) {
        Button button = (Button) e.getSource();
        output.setText("Przycisnal przycisk o nazwie " + button.getText());
    }

}

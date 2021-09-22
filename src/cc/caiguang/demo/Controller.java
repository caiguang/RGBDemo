package cc.caiguang.demo;

import com.jfoenix.controls.JFXSlider;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.fxml.FXML;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Controller {

    @FXML
    private JFXSlider red;

    @FXML
    private JFXSlider green;

    @FXML
    private JFXSlider blue;

    @FXML
    private Pane px;

    public void modifyPX() {
        int r = (int)red.getValue();
        int g = (int)green.getValue();
        int b = (int)blue.getValue();

        px.setBackground(new Background(new BackgroundFill(Color.rgb(r,g, b), null, null)));
    }

    public void init() {
        red.setValue(0);
        green.setValue(0);
        blue.setValue(0);

        red.valueProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                modifyPX();
            }
        });

        green.valueProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                modifyPX();
            }
        });

        blue.valueProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                modifyPX();
            }
        });
    }

}

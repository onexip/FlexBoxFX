package com.onexip.flexboxfx.test;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Test2Controller implements Initializable
{
    public Button item4;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        if (item4 != null)
        {
            item4.setVisible(true);
        }

    }
}

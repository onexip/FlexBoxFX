package com.onexip.flexboxfx.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by TB on 11.10.16.
 */
public class TestItemsOrder extends Application
{
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = null;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TestItemsOrder.fxml"));
        root = loader.load();
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}

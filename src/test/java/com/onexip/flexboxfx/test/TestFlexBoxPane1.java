package com.onexip.flexboxfx.test;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

/**
 * Created by TB on 12.10.16.
 */
public class TestFlexBoxPane1 extends ApplicationTest
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        /*
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TestFlexBoxPane.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
        */
    }

    @Test
    public void should_drag_file_into_trashcan()
    {
        // given:
        // FlexBox flexBoxPane = this.lookup("#flexBoxPane").query();
        //System.out.println("flexBoxPane = " + flexBoxPane);

        //FxAssert.verifyThat(flexBoxPane, flexBoxPane.getWidth()>100);

        //BoundsQuery bounds = bounds("#flexBoxPane");
        //System.out.println("bounds = " + bounds);
    }
}

package com.onexip.flexboxfx.test;

import javafx.geometry.Orientation;
import javafx.scene.layout.StackPane;

/**
 * Created by TB on 17.10.16.
 */
public class HorizontalStackPane extends StackPane
{
    @Override
    public Orientation getContentBias()
    {
        return Orientation.HORIZONTAL;
    }
}

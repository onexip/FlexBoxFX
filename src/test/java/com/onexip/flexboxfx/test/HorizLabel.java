package com.onexip.flexboxfx.test;

import javafx.geometry.Orientation;
import javafx.scene.control.Label;

/**
 * Created by TB on 17.10.16.
 */
public class HorizLabel extends Label
{
    @Override
    public Orientation getContentBias()
    {
        return Orientation.VERTICAL;
    }
}

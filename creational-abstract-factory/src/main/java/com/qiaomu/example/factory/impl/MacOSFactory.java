package com.qiaomu.example.factory.impl;

import com.qiaomu.example.button.Button;
import com.qiaomu.example.button.impl.MacOSButton;
import com.qiaomu.example.checkbox.Checkbox;
import com.qiaomu.example.checkbox.impl.MacOSCheckbox;
import com.qiaomu.example.factory.GUIFactory;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
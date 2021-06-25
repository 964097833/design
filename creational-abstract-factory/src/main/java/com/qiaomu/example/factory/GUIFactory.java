package com.qiaomu.example.factory;

import com.qiaomu.example.button.Button;
import com.qiaomu.example.checkbox.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
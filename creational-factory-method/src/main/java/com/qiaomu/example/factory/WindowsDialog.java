package com.qiaomu.example.factory;

import com.qiaomu.example.button.Button;
import com.qiaomu.example.button.impl.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
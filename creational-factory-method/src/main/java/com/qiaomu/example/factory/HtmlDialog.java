package com.qiaomu.example.factory;

import com.qiaomu.example.button.Button;
import com.qiaomu.example.button.impl.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}

package com.qiaomu.example;

import com.qiaomu.example.app.Application;
import com.qiaomu.example.config.AppConfig;

/**
 * TODO
 *
 * @author yuqiaodi
 * @date 2021/6/25 10:34
 */
public class Demo {

    public static void main(String[] args) {
        Application application = AppConfig.configureApplication();
        application.paint();
    }

}

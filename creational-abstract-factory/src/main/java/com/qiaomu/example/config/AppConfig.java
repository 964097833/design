package com.qiaomu.example.config;

import com.qiaomu.example.app.Application;
import com.qiaomu.example.factory.GUIFactory;
import com.qiaomu.example.factory.impl.MacOSFactory;
import com.qiaomu.example.factory.impl.WindowsFactory;

/**
 * TODO
 *
 * @author yuqiaodi
 * @date 2021/6/25 10:33
 */
public class AppConfig {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    public static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

}

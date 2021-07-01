package com.qiaomu.example;

import com.qiaomu.example.app.Application;
import com.qiaomu.example.factory.GUIFactory;
import com.qiaomu.example.factory.impl.MacOSFactory;
import com.qiaomu.example.factory.impl.WindowsFactory;

/**
 * TODO
 *
 * @author yuqiaodi
 * @date 2021/6/25 10:34
 */
public class Demo {

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
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

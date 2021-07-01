package com.qiaomu.example;

import com.qiaomu.example.device.Device;
import com.qiaomu.example.device.Radio;
import com.qiaomu.example.device.Tv;
import com.qiaomu.example.remote.AdvancedRemote;
import com.qiaomu.example.remote.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
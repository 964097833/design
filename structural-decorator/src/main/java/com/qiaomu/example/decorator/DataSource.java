package com.qiaomu.example.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}
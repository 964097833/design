package com.qiaomu.example.builder;

import com.qiaomu.example.car.CarType;
import com.qiaomu.example.component.GPSNavigator;
import com.qiaomu.example.component.Transmission;
import com.qiaomu.example.component.TripComputer;
import com.qiaomu.example.component.Engine;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
package com.jon.pattern.head.observer;

import com.jon.pattern.head.observer.learn.CurrentConditionsDisplay;
import com.jon.pattern.head.observer.learn.WeatherData;

/**
 * 自定义Observer模式
 */
public class ObserverTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
//        ForeCastDisplay foreCastDisplay = new ForeCastDisplay(weatherData);
//        StaticsDisplay staticsDisplay = new StaticsDisplay(weatherData);

        weatherData.setMeasureMents(80, 65, 30.4f);
        weatherData.setMeasureMents(82, 70, 29.2f);
        weatherData.setMeasureMents(78, 90, 29.2f);
    }
}

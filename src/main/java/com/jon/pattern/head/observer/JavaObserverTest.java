package com.jon.pattern.head.observer;

import com.jon.pattern.head.observer.java.CurrentConditionsDisplay;
import com.jon.pattern.head.observer.java.WeatherData;

/**
 * 使用java库定义的observer模式
 * https://blog.csdn.net/sinat_34093604/article/details/53081130
 *
 */
public class JavaObserverTest {
    public static void main(String[] args) {
        WeatherData  weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasureMents(80, 65, 30.4f);
        weatherData.setMeasureMents(82, 70, 29.2f);
        weatherData.setMeasureMents(78, 90, 29.2f);    }
}

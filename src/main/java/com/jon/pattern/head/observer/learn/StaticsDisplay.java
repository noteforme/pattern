package com.jon.pattern.head.observer.learn;

public class StaticsDisplay implements  Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;


    public StaticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current conditions:" + temperature+
                " the observer pattern "+ "F degrees and" + humidity + "% humidity");
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();

    }
}

package org.example.homework_nr_3_1;

import org.example.homework_nr_3.TemperatureConverter;

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(3);
        TempConverter converter = new TempConverter(3,15);
        System.out.println(circle.calculateAria());
        System.out.println(converter.toCelsius());
        System.out.println(converter.toFahrenheit());
    }
}

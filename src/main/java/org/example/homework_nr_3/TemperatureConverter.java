package org.example.homework_nr_3;

public class TemperatureConverter {
    public void toCelsius(double C) {
        System.out.println(C+" in celsius is "+ (C-32)*5/9);
    }
    public void toFahrenheit(double F) {
        System.out.println(F+" in fahrenheit is "+ ((F*9/5)+32));
    }
    public static void main(String[] args) {
        double Celsius=3;
        double Fahrenheit=15;
        TemperatureConverter converter = new TemperatureConverter();
        converter.toFahrenheit(Celsius);
        converter.toCelsius(Fahrenheit);
    }
}

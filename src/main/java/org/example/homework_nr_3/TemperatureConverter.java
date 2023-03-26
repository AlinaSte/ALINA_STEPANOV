package org.example.homework_nr_3;

public class TemperatureConverter {
    public void toCelsius(double C) {
        C=(C-32)*5/9;
        System.out.println("15F is celsius "+C);
    }
    public void toFahrenheit(double F) {
        F=(F*9/5)+32;
        System.out.println("3C is fahrenheit "+F);
    }
    public static void main(String[] args) {
        double Celsius=3;
        double Fahrenheit=15;
        TemperatureConverter converter = new TemperatureConverter();
        converter.toFahrenheit(Celsius);
        converter.toCelsius(Fahrenheit);
    }
}

package org.example.homework_nr_3;

public class TemperatureConverter {
    public void toCelsius(double C) {
        System.out.print(C+"F");
        C=(C-32)*5/9;
        System.out.println(" in celsius is "+C);
    }
    public void toFahrenheit(double F) {
        System.out.print(F+"C");
        F=(F*9/5)+32;
        System.out.println(" in fahrenheit is "+F);
    }
    public static void main(String[] args) {
        double Celsius=3;
        double Fahrenheit=15;
        TemperatureConverter converter = new TemperatureConverter();
        converter.toFahrenheit(Celsius);
        converter.toCelsius(Fahrenheit);
    }
}

package org.example.homework_nr_3_1;

public class TempConverter {

    double C;
    double F;

    public TempConverter(double c, double f) {
        C = c;
        F = f;
    }

    public double toCelsius() {
        return ((C-32)*5/9);
    }
    public double toFahrenheit() {
        return((F*9/5)+32);
    }
}

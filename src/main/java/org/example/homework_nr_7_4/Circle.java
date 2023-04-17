package org.example.homework_nr_7_4;

public class Circle extends TwoDimensional {
    Integer r;
    static Double Pi= 3.1415;
    public Circle(Integer r) {
        this.r = r;
    }
    @Override
    public double Area() {
        double S = Pi*this.r*this.r;
        return S;
    }
}

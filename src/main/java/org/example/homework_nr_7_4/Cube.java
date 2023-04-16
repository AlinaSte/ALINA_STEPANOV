package org.example.homework_nr_7_4;

public class Cube extends ThreeDimensional {

    Integer a;
    public Cube(Integer a) {
        this.a = a;
    }
    @Override
    public double Area() {
        double S=a*a;
        return S;
    }
    @Override
    public double Volume() {
        double V=a*a*a;
        return V;
    }
}

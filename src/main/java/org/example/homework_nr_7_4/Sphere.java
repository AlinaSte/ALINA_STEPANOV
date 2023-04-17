package org.example.homework_nr_7_4;

public class Sphere extends ThreeDimensional {
    Integer r;
    static Double Pi= 3.1415;
    public Sphere (Integer r) {
        this.r = r;
    }
    @Override
    public double Area() {
        double S= Pi*r*r;
    return S;
    }
    @Override
    public double Volume() {
        double V=4/3*r*r*r;
        return V;
    }
}

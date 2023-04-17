package org.example.homework_nr_7_4;

public class Square extends TwoDimensional {
    Integer a;
    public Square(Integer a){
        this.a=a;
    }
    @Override
    public double Area() {
        int S = a*a;
        return S;
    }
}

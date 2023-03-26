package org.example.homework_nr_3;

public class Circle
{
    public void calculateAria(double r) {
        double Aria=3.14*r*r;
        System.out.println(Aria);
    }
    public static void main(String[] args) {
        double radius=3;
        Circle circle = new Circle();
        circle.calculateAria(radius);
    }
}

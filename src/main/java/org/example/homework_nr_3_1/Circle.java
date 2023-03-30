package org.example.homework_nr_3_1;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateAria() {
        return(3.14 * radius * radius);
    }
}
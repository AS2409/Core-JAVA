package com.example.geometry;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        this.radius = radius;
        return radius * Math.PI * radius;
    }

    public double getCircumference() {
        this.radius = radius;
        return 2 * Math.PI * radius;
    }

    public double getVolume() {
        return 4 * Math.PI * radius * radius;
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * radius;
    }
}

package com.example.geometry;

public class Rectangle {
    private int length;
    private int width;
    private int height;

    public Rectangle(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return length * width;
    }

    public int getVolume() {
        return length * width * height;
    }
}

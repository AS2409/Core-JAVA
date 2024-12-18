package com.example.utils;

import java.util.*;

import com.example.geometry.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hwllo");
        while (true) {
            System.out.println("Enter Shape: ");
            String shape = sc.next();
            System.out.println(shape);
            if (shape.equalsIgnoreCase("circle")) {
                System.out.print("Radius: ");
                int radius = sc.nextInt();
                Circle c1 = new Circle(radius);
                System.out.println(c1.getArea());
                System.out.println(c1.getCircumference());
                System.out.println(c1.getSurfaceArea());
                System.out.println(c1.getVolume());
            } else if (shape.equalsIgnoreCase("rectangle")) {
                System.out.print("Legth: ");
                int length = sc.nextInt();
                System.out.print("Width: ");
                int width = sc.nextInt();
                
                int height = sc.nextInt();
                Rectangle r1 = new Rectangle(length, width, height);
                System.out.println("Area: "+ r1.getArea());
                System.out.println("Volume: " + r1.getVolume());
            }

        }
    }
}
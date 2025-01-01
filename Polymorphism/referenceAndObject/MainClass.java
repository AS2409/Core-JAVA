package Polymorphism.referenceAndObject;

import java.io.FileWriter;
import java.io.IOException;

public class MainClass {
    public static void main(String[] args) {
        // Car car = new Car();
        // Vehicle vehicle = new Vehicle();
        // Vehicle cCar = new Car(); // Whether Car is referencing to Vehicle?.. Yes it
        // is because Car is a child of
        // Vehicle ultimately -> car vehicle hai?.. hn hai

        // Car c1 = (Car) new Vehicle(); // kya vehicle car hai?.. Nhi Vehicle plane bhe
        // ho skata h
        // Vehicle bailgadi bhe ho skta h isliye isme
        // typecasting necessary h pr yeh tarika galat hai

        // Vehicle veh = new Car(); // Proper way of downcasting.
        // Car c = (Car) veh;
        // c.start();

        // castTest(car);/

        try (FileWriter file = new FileWriter("MyNewFile.txt")) { // try with resource
            // FileWriter file = new FileWriter("MyNewFile.txt") // Creates a file named as
            // MyNewFile.txt
            file.write("***************");
            file.flush();
            System.out.println("Task done");
        } catch (IOException exp) {
            System.out.println("Exception ---------------");
        }

    }

    public static void castTest(Vehicle vec) {
        vec.name();
        Car c = (Car) vec;
        c.start();

    }

}

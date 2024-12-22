package Polymorphism.exampleOnOverriding;

public class Car extends Vehicle {
    @Override
    void start() {
        super.start();
        System.out.println("Hello currently you are in car's start method");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();

    }
}

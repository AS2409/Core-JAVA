package abstraction;

import abstraction.learnInterface.Transport;

//On using abstract keyword we cannot instantiate the object of the class. We can only inherit the class.
public abstract class Vehicle implements Transport { // Abstract Class--------------------
    int noOfTyres;

    // public Vehicle() {

    // }

    public Vehicle(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public Vehicle(String name, int id, String model) {

    }

    // We don't define the body of the abstract method. defining the body is the
    // responsibility of the child.
    public abstract void makeSound(); // Abstract method------------------

}

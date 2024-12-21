package abstraction;

public class Car extends Vehicle { // Extended the Vehicle
    /*
     * If there is no default constructor( constructor with no parameters ) in the
     * super class then child class has to create a constructor to initialize the
     * super class
     */
    Car() {
        super(5);
    }

    // Implementation of the abstract method of the Vechile class.
    @Override // annotation
    public void makeSound() {
        // TODO Auto-generated method stub
        System.out.println("Bhmmmmmmmm.......");
    }

    // child class has to implement all the methods of the parent class (abstract
    // class and interface).
    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("Unimplemented method 'start'");
    }

}

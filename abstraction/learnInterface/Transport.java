package abstraction.learnInterface;

// * In class we used to inherit the parent properties by 'extend' keyword in child class but to inherit interface we use 'implements'

// * Multiple classes can't be inhereted but multiple interface implementation is allowed

public interface Transport { // to define interface we write interface keyword in place of class.

    void start(); // All the instances in the interface are bydefault public and abstract so we
                  // don't need to write public abstract.

    default void test() { // interfaces can have default methods with implementation (definetation)

    }

    static void check() { // interfaces can have static methods with implementation(definitation)

    }
}

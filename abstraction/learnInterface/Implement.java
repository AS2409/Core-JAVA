package abstraction.learnInterface;

public class Implement implements Transport, Pet { // Multiple interface implementation.
    @Override
    public void start() {
        // TODO Auto-generated method stub

    }

    @Override
    public void bark() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bark'");
    }

    @Override
    public boolean wild() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wild'");
    }

}

package designProblems.shapeProblem;

public class Square extends Shape {
    double dimensions;

    Square(double dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        return dimensions * dimensions;
    }

}

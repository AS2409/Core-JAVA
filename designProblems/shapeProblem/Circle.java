package designProblems.shapeProblem;

public class Circle extends Shape {
    double radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub

        return Math.PI * radius * radius;
    }

}

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double circumference() {
        return Math.PI * 2 * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

}

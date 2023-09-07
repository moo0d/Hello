package week3_1.Task3and4;

public class Circle extends Shape {

    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "radius " + radius;
    }
}

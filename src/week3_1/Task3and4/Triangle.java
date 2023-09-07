package week3_1.Task3and4;

public class Triangle extends Shape {

    private double base, height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return "base " + base + " height " + height;
    }
}

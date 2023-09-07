package week3_1.Task3and4;

public class Rectangle extends Shape {

    private double height, width;
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return "height " + height + " width " + width;
    }
}

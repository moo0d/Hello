package week3_1.Task3and4;

public class ShapeCalculator {


    public static boolean shapeCompatibility(Shape one, Shape two) {
        if (one instanceof Circle && two instanceof Circle) {
            return true;
        }
        else if (one instanceof Rectangle && two instanceof Rectangle){
            return true;
        }
        else if (one instanceof Triangle && two instanceof Triangle){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Circle circle1 = new Circle(6);
        Circle circle2 = new Circle(7);
        Rectangle rectangle1 = new Rectangle(5.0, 10.0);
        Rectangle rectangle2 = new Rectangle(5.0, 10.0);
        Triangle triangle1 = new Triangle(5.0, 10.0);
        Triangle triangle2 = new Triangle(5.0, 10.0);

        System.out.println(shapeCompatibility(triangle2, triangle1));
        System.out.println(shapeCompatibility(circle1, triangle1));


        System.out.println("Shape Calculator");

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Triangle(3.0, 8.0);

        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.getClass().getSimpleName() + " with " + shape.toString() + ": " + shape.calculateArea());
        }

    }
}

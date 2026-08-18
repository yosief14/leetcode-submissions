// Interface used by all Concrete Objects
interface Shape {
    double area();
    void describe();
}
// Concrete Object
class Circle implements Shape {

    public Circle(double radius) {
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void describe() {
        // TODO: Print "Circle with area: " followed by area() formatted to 2 decimal places
        // Hint: Use System.out.printf("Circle with area: %.2f%n", area())
    }
}

class Rectangle implements Shape {
    // TODO: Add private fields for width and height (double)

    public Rectangle(double width, double height) {
        // TODO: Store width and height
    }

    @Override
    public double area() {
        // TODO: Return width * height
        return 0;
    }

    @Override
    public void describe() {
        // TODO: Print "Rectangle with area: " followed by area() formatted to 2 decimal places
    }
}

class Triangle implements Shape {
    // TODO: Add private fields for base and height (double)

    public Triangle(double base, double height) {
        // TODO: Store base and height
    }

    @Override
    public double area() {
        // TODO: Return 0.5 * base * height
        return 0;
    }

    @Override
    public void describe() {
        // TODO: Print "Triangle with area: " followed by area() formatted to 2 decimal places
    }
}
//Creator - declares factory method that returns object declared as abstract
abstract class ShapeCreator {
    // Factory method - subclasses decide which Shape to create
    public abstract Shape createShape();

    public void describe() {
        // TODO: Call createShape() to get a Shape instance
        // TODO: Call describe() on the shape
    }
}

// Concrete Creator
class CircleCreator extends ShapeCreator {
    @Override
    public Shape createShape() {
        // TODO: Return a new Circle with radius 5
        return null;
    }
}

// Concrete Creator
class RectangleCreator extends ShapeCreator {
    @Override
    public Shape createShape() {
        // TODO: Return a new Rectangle with width 4 and height 6
        return null;
    }
}

// Concrete Creator
class TriangleCreator extends ShapeCreator {
    @Override
    public Shape createShape() {
        // TODO: Return a new Triangle with base 3 and height 8
        return null;
    }
}

public class ShapeFactoryDemo {
    public static void main(String[] args) {
        // ShapeCreator creator;
        //
        // creator = new CircleCreator();
        // creator.describe();
        //
        // creator = new RectangleCreator();
        // creator.describe();
        //
        // creator = new TriangleCreator();
        // creator.describe();
    }
}
package Figures;

public class Main {

    public static void main(String[] args) throws NumberFormatException{

        Rectangle rectangle = new Rectangle(0.12234,0.4534);
        Rectangle square = new Square(10);
        Trapezoid trapezoid = new Trapezoid(123,5,0);
        Circle circle = new Circle(1);
        Triangle triangle = new Triangle(12, 4.2);

        System.out.println("Area of rectangle is: " + rectangle.calculateArea());
        System.out.println("Area of square is: " + square.calculateArea());
        System.out.println("Area of trapezoid is: " + trapezoid.calculateArea());
        System.out.println("Area of triangle is: " + triangle.calculateArea());
        System.out.println("Area of circle is: " + circle.calculateArea());
    }
}

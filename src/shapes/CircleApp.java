package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input in = new Input();

        System.out.println("Enter the radius of your circle:");
        double radius = in.getDouble();

        Circle circle = new Circle(radius);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        System.out.printf("The area of your circle is %.2f\n The circumference is %.2f%n", area, circumference);

    }
}

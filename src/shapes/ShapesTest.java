package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        //Since this is being called as a new Rectangle, it is choosing the original methods inside
        //of the Rectangle class to use rather than the square (overridden) version

        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("The perimeter of box 1 is : " + box1.getPerimeter());
        System.out.println("The area of box 1 is : " + box1.getArea());


        //Since this is being called as a new Square, it is choosing the overridden methods inside
        //of the Square class to use rather than the rectangle (original) version

        Rectangle box2 = new Square(5);
        System.out.println("The perimeter of box 2 is : " + box2.getPerimeter());
        System.out.println("The area of box 2 is : " + box2.getArea());


    }

}

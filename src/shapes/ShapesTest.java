package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        //Since this is being called as a new Rectangle, it is choosing the original methods inside
        //of the Rectangle class to use rather than the square (overridden) version

//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("The perimeter of box 1 is : " + box1.getPerimeter());
//        System.out.println("The area of box 1 is : " + box1.getArea());


        //Since this is being called as a new Square, it is choosing the overridden methods inside
        //of the Square class to use rather than the rectangle (original) version

//        Rectangle box2 = new Square(5);
//        System.out.println("The perimeter of box 2 is : " + box2.getPerimeter());
//        System.out.println("The area of box 2 is : " + box2.getArea());



        //NEW SHAPES TESTS

        Measurable myShape; //declare a variable of the type Measurable named myShape

        myShape = new Rectangle(5, 4);
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());
//        System.out.println("myShape.getPerimeter() = " + myShape.getLength());

        myShape = new Square(5);
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());


//Q: Why does the code fail to compile if you leave off the getPerimeter
// method in Rectangle?

//A: My understanding is that when you just call myShape, it doesn't know
//which myShape to call to. Just because you define it as a rectangle or square,
//it doesn't know where to pull from. When you add the .getPerimeter() or
// .getArea(), it goes into the class it needs, take and execute those methods, and
//give us the proper answer. myShape doesn't determine anything.



//Q: What happens if you try to call the getLength or getWidth methods of the
// myShape variable? Why?

//A: getLength and getWidth are NOT defined in the measurable class. The getPerimeter
//and getArea are being called/used from the measurable class, thus they work. If
//we want getPerimeter and getAra to work, we need to define them in the measurable.



//NOTE FOR ME:

//Measurable is like a checklist; it has sections for what to do in the
// morning, afternoon and night, but the lines are blank. Filling in the
//information for what EXACTLY you need to do is when the Square/Rectangle classes
//come into play. The Measurable executes the specific tasks based on what section it's in.

//...This probably a bad metaphor but it's the only way I can understand it at this
//point.



    }

}

package shapes;

public class Rectangle {

    public double length; //public length
    public double width; // public width

    public Rectangle(double recLength, double recWidth) { //Defining width and length for rectangles to be defined
        this.length = recLength;
        this.width = recWidth;
    }


    //Do NOT pass anything through parameters. I tried, it didn't work. Since you are just
    //getting something using public, pre-existing doubles (l and w respectively), it doesn't
    //need to be passed. Java knows what it is already. Goes for both getArea() and getPerimeter().

    public double getPerimeter() {

        return (2 * this.length) + (2 * this.width);

    }

    public double getArea() {

        return this.length * this.width;

    }

//    public Rectangle(){}; not necessary

}

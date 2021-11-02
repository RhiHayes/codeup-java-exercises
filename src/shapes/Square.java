package shapes;

public class Square extends Rectangle {

    public double side;

    public Square(double side) {

        super(side, side);

        //tried putting recWidth and recLength in here, it didn't work. Had to call the public
        //length/width referenced in the Rectangle class then define as sides.

        this.length = side;
        this.width = side;

    }


//    Q: How can you determine which getArea and getPerimeter methods are being called on each object?

//    For me, I was able to call the overwritten method by switching out this.side to this.length/width.


    public double getPerimeter() {
        return this.length * 4; //Overriding method
    }

    public double getArea() {
        return this.length * this.width; //Overriding method
    }


}

package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public double length; //public length
    public double width; // public width

    public Rectangle(double reclength, double recwidth) {
        super(reclength, recwidth);
        //Defining width and length for rectangles to be defined


     //I tried commenting these out because they weren't useful, but it was a naming
     //error

        this.length = reclength;
        this.width = recwidth;
    }


    public void setLength(double reclength) { //From Measurable Interface
        this.length = reclength; //Just returns length
    }


    public void setWidth(double recwidth) { //From Measurable Interface
        this.width = recwidth; //Just returns width
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

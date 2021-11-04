package shapes;

abstract class Quadrilateral extends Shape implements Measurable {

    protected double length; //protected properties for length and width.
    protected double width;

    public Quadrilateral(double length, double width) { //Defining Quadrilateral
        this.length = length;
        this.width = width;
    }

    public double getLength() { //Get Length
        return length;
    }
    public double getWidth() { //Get Width
        return width;
    }

    public abstract void setLength(double quadWidth); //Sets Width

    public abstract void setWidth(double quadLength); //Sets Length



}

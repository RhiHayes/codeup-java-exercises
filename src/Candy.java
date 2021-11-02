import java.util.Arrays;

public class Candy {

    public String candyName;
    public String candySize;
    public String[] candyDescriptors;


    public Candy (String name) {

        this.candyName = name;
        this.candySize = "idk";

    }

    public Candy (String name, String size) {

        this.candyName = name;
        this.candySize = size;

    }

    public Candy (String name, String size, String[] descriptors) {

        this.candyName = name;
        this.candySize = size;
        this.candyDescriptors = descriptors;

    }


    public static void main(String[] args) {

//        Java WarmUp
//        Write a public class named ‘Candy’ - this class should have two public fields,
//        both taking in a string literal as a value.
//        The first would be ‘name’ and the second will be ‘size’.
//        The class will also need two constructors - the first for if we know the name,
//        but not the size. Your first constructor should set some kind of string literal for the
//        size.
//        The second would be for if we know both the name and the size. This second constructor
//        will pass through those arguments into the Candy object being instantiated.

//        BONUS:
//        Write a method for your Candy class - this method should print out a message saying:
//“Ahhh, a [name]! I see that you got the [size] of it. Sounds good! :)”

        Candy reeses = new Candy("Reeses");
        Candy hershey = new Candy("Hershey's", "Big Bar");
        Candy mnm = new Candy("M&M's", "Fun sized", new String[] {"candy coated", "chocolate"});

        System.out.println(reeses.candyName + " " + reeses.candySize);
        System.out.println(hershey.candyName + " " + hershey.candySize);
        System.out.println(mnm.candyName + " " + mnm.candySize + " " + Arrays.toString(mnm.candyDescriptors));
        //forgot the Arrays.toString initially, but got everything else right.


    }






}

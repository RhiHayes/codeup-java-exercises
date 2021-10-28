import util.Input;

public class InputTest {

    public static void main(String[] args) {

        //FROM UTILS - EXERCISE 2


        //getString()

        Input in = new Input();
        System.out.println("Give me a string!");
        String storedString = in.getString();

        System.out.println(storedString);


        // yesNo()

        System.out.println("yes or no? (y/n)");
        Boolean myChoice = in.yesNo();

        System.out.println(myChoice);


        // getInt(int min, int max)

        int myNum = in.getInt(1, 20);
        System.out.println(myNum);


        //getInt()

        System.out.println("Give me an int");

        int numInt = in.getInt();
        System.out.println(numInt);


        // getDouble(double min, double max)

        double myNums = in.getDouble(2.25, 55.75);
        System.out.println(myNums);


        //getDouble()

        System.out.println("Give me a double");

        double doubleNum = in.getDouble();
        System.out.println(doubleNum);


    }

}

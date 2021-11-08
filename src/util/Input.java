package util;
import java.util.Objects;
import java.util.Scanner;

public class Input {

private Scanner scanner = new Scanner(System.in);

public String getString() {
    return scanner.nextLine();
}


    public boolean yesNo() {

        if (Objects.equals(scanner.nextLine(), "y")) {
        return true;
        } else {
        return false;
        }


    }
//NEW GETINT();


    public int getInt(int min, int max) {

        System.out.println("Enter an integer between " + min + " and " + max);

         int userNumber;

        userNumber = this.scanner.nextInt();

        try {
            return Integer.parseInt((getString()));
        } catch (NumberFormatException e){
            System.err.println("ERROR: Not a valid input, try again.");
        }

        if(userNumber <= max && userNumber >= min){
            System.out.println("Thank you for the valid number!");
            return userNumber;
        } else {
            System.out.println("You didn't give me a # between the inputs!");
            return getInt(min, max);
        }


    }




    public int getInt(){
        return scanner.nextInt();
    }




//NEW GETDOUBLE();


    public double getDouble(double min, double max) {
        System.out.println("Enter an integer between " + min + " and " + max);

        double userInput = this.scanner.nextDouble();

        try {
            return Double.parseDouble(getString());
        }
        catch (NumberFormatException e){
            System.err.println("ERROR: Not a valid input, try again.");
        }

        while (userInput <= min || userInput >= max) {
            System.out.println("Enter an integer between " + min + " and " + max);
            userInput = this.scanner.nextDouble();
        }

        System.out.println("Thank you for the valid number!");
        return userInput;
    }




    public double getDouble(){
        return scanner.nextDouble();
    } //Hadn't programmed this in; this is what I needed for my circle app.



}

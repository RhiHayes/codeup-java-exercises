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
//OLD GETINT();


//    public int getInt(int min, int max) {
//
//        System.out.println("Enter an integer between " + min + " and " + max);
//
//         int userNumber;
//
//        userNumber = this.scanner.nextInt();
//
//        if(userNumber <= max && userNumber >= min){
//            return userNumber;
//        } else {
//            System.out.println("Wrong, try again!");
//            return getInt(min, max);
//        }
//
//
//    }


//OLD GETINT();


//    public int getInt(){
//        return scanner.nextInt();
//    }


//NEW GETINT();
    public int getInt(){

        System.out.print("Enter an integer: ");

        try {
            return Integer.parseInt((getString()));
        } catch (NumberFormatException e){
            System.out.println("Not a valid input, try again.");
        }
        return getInt();
    }


//OLD GETDOUBLE();


//    public double getDouble(double min, double max) {
//        System.out.println("Enter an integer between " + min + " and " + max);
//
//        double userInput = this.scanner.nextDouble();
//
//        while (userInput <= min || userInput >= max) {
//            System.out.println("Enter an integer between " + min + " and " + max);
//            userInput = this.scanner.nextDouble();
//        }
//        return userInput;
//    }


//OLD GETDOUBLE();


//    public double getDouble(){
//        return scanner.nextDouble();
//    } //Hadn't programmed this in; this is what I needed for my circle app.

    public double getDouble(){

        System.out.println("Enter a double");

        try{
            return Double.parseDouble(getString());
        }catch (NumberFormatException e){
            System.out.println("Not a valid input, try again.");
        }return getDouble();
    }


}

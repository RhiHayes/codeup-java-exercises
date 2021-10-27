import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

        int number = (int)(1 + Math.random() * 100);

        System.out.println("I'm thinking of a whole number between 1 and 100.");

        Scanner scanner = new Scanner(System.in);

        boolean done = false;
        while(!done){

            int guess = scanner.nextInt();


            if (number < guess){
                System.out.println("The number I'm thinking of is lower than " + guess + ".");
                System.out.println("Guess again!");
            }
            else if (number > guess){
                System.out.println("The number I'm thinking of is greater than " + guess + ".");
                System.out.println("Guess again!");
            }
            else {
                System.out.println("That's correct! I was thinking of " + number + ".");
                done = true;
            }
        }


    }

}

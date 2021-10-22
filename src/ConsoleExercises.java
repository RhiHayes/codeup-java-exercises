import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String args[]) {

        double pi = 3.14159;

        System.out.printf("The value of pi is approximately: ");
          System.out.format("%.2f%n", pi);

          //---------

        //Prompt 1

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        String userInput = scanner.nextLine();

        System.out.printf("You entered %s \n", userInput);


        //Prompt 2

        scanner.nextLine();

        System.out.print("Enter three words: ");

        String firstWord = scanner.next();

        String secondWord = scanner.next();

        String thirdWord = scanner.next();

        System.out.printf("You entered %s %s %s \n", firstWord, secondWord, thirdWord);


        //Prompt 3

        scanner.nextLine();

        System.out.print("Enter a sentence: ");

        String fullSentence = scanner.nextLine();

        System.out.printf("You entered: %s \n", fullSentence);


        //Calculate perimeter

        scanner.nextLine();

        System.out.print("Enter a width and length: ");

        String width = scanner.nextLine();

        int number1 = Integer.parseInt(width);

        String height = scanner.nextLine();

        int number2 = Integer.parseInt(height);

        int total = number1 * number2;

        System.out.printf("The perimeter: %s \n", total);

    }

}

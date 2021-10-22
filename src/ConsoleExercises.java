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

        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Enter three words: ");

        String firstWord = scanner2.next();

        String secondWord = scanner2.next();

        String thirdWord = scanner2.next();

        System.out.printf("You entered %s %s %s \n", firstWord, secondWord, thirdWord);


        //Prompt 3

        Scanner scanner3 = new Scanner(System.in);

        System.out.print("Enter a sentence: ");

        String fullSentence = scanner3.nextLine();

        System.out.printf("You entered: %s \n", fullSentence);


        //Calculate perimeter

        Scanner scanner4 = new Scanner(System.in);

        System.out.print("Enter a width and length: ");

        String width = scanner4.nextLine();

        int number1 = Integer.parseInt(width);

        String height = scanner4.nextLine();

        int number2 = Integer.parseInt(height);

        int total = number1 * number2;

        System.out.printf("The perimeter: %s \n", total);

    }

}

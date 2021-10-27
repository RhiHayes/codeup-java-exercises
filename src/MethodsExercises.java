import java.util.Scanner;

public class MethodsExercises {

    //Math Methods
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int remainder(int num1, int num2) {
        return num1 % num2;
    }

    //Taking the defined methods and executing them with parameters
    public static void main(String[] args) {
        System.out.println("add: " + add(10, 2)); //Math
        System.out.println("subtract: " + subtract(9, 4)); //Math
        System.out.println("divide: " + divide(9, 3)); //Math
        System.out.println("multiply: " + multiply(11, 5)); //Math
        System.out.println("remainder: " + remainder(15, 3)); //Math

//        getInteger(1, 10); //Integer

        getFactorial(getInteger(1, 10)); //Factorial

        diceRoll(); //Void since nothing is being passed in. Dice Roll.
    }

//Min-Max Range

    public static int getInteger(int min, int max) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        int userNumber = scanner.nextInt();
        if (userNumber <= max && userNumber >= min) {
            System.out.println("Thank you!");
        }
        else {
            userNumber = getInteger(min, max);
        }

        return userNumber;
    }

    //Factorial

    public static long getFactorial(int myNewNum) {

        int myNum = myNewNum;
        long fact = 1;
        for(int i = 1; i <= myNum; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + myNum + " is: " + fact);

        return fact;
    }


    //Dice Roll

    public static void diceRoll() {

        String choice = "r"; // Determines dice roll
        String choice2 = "y"; //Determines choice to roll
        while (choice2.equals("y")) {

        Scanner diceScanner = new Scanner(System.in);

        System.out.println("Let's roll a dice! How many sides do you want?");
        int diceSides = diceScanner.nextInt();

        System.out.println("Let's roll the dice! (type in r for roll)");
        choice = diceScanner.next();

        if(choice.equals("r")) {
            int dice = (int)(Math.random()*diceSides+1);
            int dice2 = (int)(Math.random()*diceSides+1);
            System.out.println("Your first dice roll is: " + dice);
            System.out.println("Your second dice roll is: " + dice2);
        }

            System.out.print("\nWant to roll again? (y/n):\t\t");
            choice2 = diceScanner.next();
            System.out.println();

        }

    }

}

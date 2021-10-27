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

        getInteger(1, 10); //Integer
    }

//Min-Max Range

    public static int getInteger(int min, int max) {
        int userNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        userNumber = scanner.nextInt();
        if (userNumber <= max && userNumber >= min) {
            System.out.println("Thank you!");
        } else {
            userNumber = getInteger(min, max);
        }
        return userNumber;
    }

}

import java.util.Scanner;


public class ConsoleIO {

    public static void main(String args[]) {
        String name = "Quasar";

        System.out.printf("Hello there %s. Nice to meet you. \n", name); // \n is a new line break

        String greeting = "Howdy";
        String myName = "Rhiannon";

        System.out.printf("%s, %s!", greeting, myName);



//        System.out.print("Enter something: ");
//
        Scanner scanner = new Scanner(System.in);
//
//        String userInput = scanner.next();
//
//        System.out.println("You entered: ---> \"" + userInput + "\" <--");



            System.out.print("Enter something: ");

            String userInput = scanner.nextLine();

            System.out.printf("You entered %s", userInput);


    }


}

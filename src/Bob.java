import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hey, I'm Bob...ask me whatever, I guess.\n");


            String userInput = scanner.nextLine();

            if (userInput.endsWith("?")) {
                System.out.printf("Sure.");
            }
            else if (userInput.endsWith("!")) {
                System.out.printf("Woah, chill out!");
            }
            else if (userInput.isEmpty()) {
                System.out.printf("Fine, be that way!");
            } else {
                System.out.printf("Whatever.");
            }

    }

}

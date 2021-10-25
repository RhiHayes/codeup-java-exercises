import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String args[]) {

        //Loop Basics

        int i = 5;

        while (i <= 15) {
            System.out.println(i);
            i++;
        }


        //Do While

        //First Do-While Loop - Even Counter Up

        int j = 0;

        do {
            System.out.println(j);
            j += 2;
        } while (j <= 100);

        //Second Do-While Loop - Even Counter Down

        do {
            System.out.println(j);
            j -= 2;
        } while (j >= -10);


        //Third Do-While Loop - Up to 65536

        long k = 2; //int doesn't work here because int stores smaller numbers

        do {
            System.out.println(k);
            k *= k;
        } while (k < 1000000);


        //For Loop Refactors - Exercise 1 and 2


        //Exercise 1

        //Having to make new ints for this because it's already defined

        for (int x = 0; x <= 100; x += 2) {
            System.out.println(x);
        }


        //Exercise 2

        for (int x = 0; x >= -10; x -= 2) {
            System.out.println(x);
        }


//Fizzbuzz

        for (int x = 0; x <= 100; x++) {

            System.out.println(x);

            if (x % 3 == 0) {
                if (x % 5 == 0) {
                    System.out.println("fizzbuzz");
                } else {
                    System.out.println("fizz");
                }
            } else if (x % 5 == 0) {
                System.out.println("buzz");
            }


        }

//Display a table of powers




    }
}

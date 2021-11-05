package grocery;

import util.Input;

import java.util.*;

public class GroceryListApplication {

    // 1. Create an input that asks if the user want to use the app (do while?
    //maybe an if statement? I'm not sure how to do it the if way effectively)
    // ---DONE WITH 1

    //2. If they pick yes, they will be prompted if they would like to enter a
    // new item. If the users picks yes, they should be given the following three
    // prompts:
    //
    //Given an ordered list of grocery categories to choose from, select the category.
    //Enter the name of the item.
    //Enter how many of the item.

    //What do I do here? Do I need to create grocery items like we do for students?
    //Or do I not need to do that? Will do more research.





    public static void main(String[] args) {

        Input input = new Input();


        //App Dialogue

        System.out.println("Welcome to The Grocery Application!\n");

        boolean confirmed = true; //declares boolean confirm
        do {

        System.out.println("Would you like to use the application? [Y/N]\n");
        String userStartsApp = input.getString(); //User's choice


        //If user wants to run app, do this
        if (userStartsApp.equalsIgnoreCase("y")) {

            System.out.println("Would you like to add an item? [Y/N]\n");
            String userWantsItem = input.getString(); //User's item


            //If user wants an item, do this. Nested if statement.
            if (userWantsItem.equalsIgnoreCase("y")) {
                System.out.println("You chose to have an item!\n");
//                System.out.println(categories);
            }









            // Decides if user wants to continue or not
                input.getString();
                System.out.print("Do you want to continue? [Y/N] ");
                String userConfirm = input.getString();
                confirmed = userConfirm.equalsIgnoreCase("y"); //confirm = y

            }

        } while (confirmed); //Do everything inside of the do loop, while confirm





    }


}

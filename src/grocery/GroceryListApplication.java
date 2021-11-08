package grocery;

import util.Input;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GroceryListApplication {

    // Adds an item and quantity to list
    public static void addToList(HashMap<String, Integer> category, String item, int quantity){
        category.put(item, quantity);
    }

    // Prompts the user for an item and quantity, keeps if statement clean

                                    //Hashmap        //Category Number      //Category Name   //User input
    public static void addUserGrocery(HashMap<String, Integer> Category, String categoryName, Input input){
        System.out.printf("%nAdd an item to %s%n", categoryName);
        System.out.print("Enter item name: ");
        String userItem = input.getString(); //User item input
        System.out.printf("Add a quantity of %s: ", userItem);
        int userQuantity = input.getInt(); //User item number input
        addToList(Category, userItem, userQuantity); //Adds all to list, also calls addToList()
        System.out.printf("%nYour %s list:%n", categoryName);
        sortItems(Category); //sorts everything
        System.out.println();
    }

    // Gets all items in a category and displays "items x quantity" alphabetically
    public static void sortItems(HashMap<String, Integer> Category) {

        //Treemaps automatically sort items for you with its methods, how useful!
        TreeMap<String, Integer> sorted = new TreeMap<>(Category);

        //For loop to go through and sort/print every item
        for (Map.Entry<String, Integer> entry : sorted.entrySet())
            System.out.println(entry.getKey() + " x " + entry.getValue());
    }


    public static void GroceryListApp(){ //Activates Grocery List App

        Input input = new Input();

        HashMap<String, Integer> Fruits = new HashMap<>();
        HashMap<String, Integer> Vegetables = new HashMap<>();
        HashMap<String, Integer> Frozen = new HashMap<>();
        HashMap<String, Integer> Snacks = new HashMap<>();
        HashMap<String, Integer> Other = new HashMap<>();



        //App Dialogue

        System.out.println("Welcome to The Grocery Application!\n");

        boolean confirmed = true; //declares boolean confirm
        do {

        System.out.println("Would you like to use the application? [Y/N]\n");
        String userStartsApp = input.getString(); //User's choice


        //If user wants to run app, do this
        if (userStartsApp.equalsIgnoreCase("y")) {

            System.out.println("Would you like to add an item? [Y/N]\n");
            String userWantsItem = input.getString(); //User's wants an item, so execute program

            boolean addMore; //declare inside here; declaring it outside messes up code

        do {
            //If user wants an item, do this. Nested if statement.
            if (userWantsItem.equalsIgnoreCase("y")) {
                System.out.println("Choose a category: |1: Fruits| |2: Vegetables| |3: Frozen| |4: Snacks| |5: Other|\n");;
                System.out.print("ENTER a category #: ");
                int usersCategory = input.getInt();

                // Clearing scanner, or else only number of items will be picked up
                input.getString();

                if (usersCategory == 1){
                    addUserGrocery(Fruits, "Fruits", input);
                }
                else if (usersCategory == 2){
                    addUserGrocery(Vegetables, "Vegetables", input);
                }
                else if (usersCategory == 3){
                    addUserGrocery(Frozen, "Frozen", input);
                }
                else if (usersCategory == 4){
                    addUserGrocery(Snacks, "Snacks", input);
                }
                else if (usersCategory == 5){
                    addUserGrocery(Other, "Other", input);
                }
                else {
                    GroceryListApp();
                }

                // Clearing scanner so user can choose whether to add another item or finalize
                input.getString();

            } System.out.println("Would you like to:\n1. Add another item to your list \n2. Finalize your grocery list\nEnter [ 1 ] or [ 2 ]");
            String userWantsMoreItems = input.getString();
            addMore = userWantsMoreItems.equals("1");
        } while (addMore);

            System.out.println("\nYour final grocery list is: ");
            sortItems(Fruits);
            sortItems(Vegetables);
            sortItems(Frozen);
            sortItems(Snacks);
            sortItems(Other);



            // Decides if user wants to continue or not
                input.getString();
                System.out.print("Do you want to make another list? [Y/N] ");
                String userConfirm = input.getString();
                confirmed = userConfirm.equalsIgnoreCase("y"); //confirm = y

            }

        } while (confirmed); //Do everything inside of the do loop, while confirm


    }

    public static void main(String[] args) {
        GroceryListApp();
    }

}

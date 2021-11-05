package grades;

import util.Input;

import java.util.*; //Adds all util classes

public class GradesApplication {

    public static void main(String[] args) {

        //Changing <String, String> to <String, Student>
        //allows Students to be passed as variables in the map

        HashMap<String, Student> students = new HashMap<>();

        //Initializing Students

        Student rhi = new Student ("Rhiannon");
        Student deku = new Student ("Izuku");
        Student allmight = new Student ("Allmight");
        Student aizawa = new Student ("Shouta");


        //Rhi Grades

        rhi.addGrade(89);
        rhi.addGrade(99);
        rhi.addGrade(93);

        //Deku Grades

        deku.addGrade(79);
        deku.addGrade(71);
        deku.addGrade(82);

        //Allmight Grades

        allmight.addGrade(55);
        allmight.addGrade(42);
        allmight.addGrade(65);

        //Aizawa Grades

        aizawa.addGrade(28);
        aizawa.addGrade(34);
        aizawa.addGrade(29);


        //Initializing GitHub Names

        students.put("RhiHayes", rhi);
        students.put("AllmightMini", deku);
        students.put("DefinitelyNotAllmight", allmight);
        students.put("ShoutaAizawa31", aizawa);


       //App Dialogue

        System.out.println("Here are the GitHub usernames of our students:\n");
        System.out.println("|RhiHayes| |MiniMight| |DefinitelyNotAllmight| |ShoutaAizawa31|\n");


        boolean confirmed; //declares boolean confirm
        do {
            Input input = new Input(); //Allows user input to be picked up
            System.out.println("Who's info would you like to see?\n");;


            String userChoice = input.getString(); //User's choice

            if (Objects.equals(userChoice, "RhiHayes")) {
                System.out.println("You chose RhiHayes .\n");
            }

            else if (Objects.equals(userChoice, "MiniMight")) {
                System.out.println("You chose MiniMight.\n");
            }

            else if (Objects.equals(userChoice, "DefinitelyNotAllmight")) {
                System.out.println("You chose DefinitelyNotAllmight.\n");
            }

            else if (Objects.equals(userChoice, "ShoutaAizawa31")) {
                System.out.println("You chose ShoutaAizawa31.\n");
            }

            else {
                System.out.println("Sorry, that name isn't in our database. Try again.\n");
            }

            input.getString(); //decides if user wants to continue or not
            System.out.print("Do you want to continue? [Y/N] ");
            String userConfirm = input.getString();
            confirmed = userConfirm.equalsIgnoreCase("y"); //confirm = y
        }

        while(confirmed); //Do everything inside of the do loop, while confirm


    }

}

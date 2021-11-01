import util.Person;

import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] array, Person singlePer){

        //This method allows you to take in the array (Person [] array), and the new person
        // (person /singlePer). This method makes a copy of the array, adds one, then moves it
        // back to insert the singlePer, which can then be edited.

        Person[] personPlusOne = Arrays.copyOf(array, array.length + 1);
        personPlusOne[personPlusOne.length -1] = singlePer;
        return personPlusOne;
    }

    public static void main(String[] args) {

        //        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//
//        This code print any of the numbers.

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

//        This code prints out the entire array.


  // * --------------- PEOPLE CODE ------------- *


        Person[] people = new Person[3]; //Creates 3 base people

        people[0] = new Person("Rhiannon");
        people[1] = new Person("Allmight");
        people[2] = new Person("Deku");

        System.out.println(Arrays.toString(people)); //Prints out 3 base people

        for(int i = 0; i < people.length; i++){
            System.out.println("for loop " + people[i].getName());
        } //The for loop prints out each individual name

        Person myPerson = new Person("Bakugo");

        Person[] anotherArray = ArraysExercises.addPerson(people, myPerson); //is calling the
        //add person method outside of ArraysExercises, look up for details


        for(Person addedPerson : anotherArray){ //is adding new person to array in for loop
            System.out.println(addedPerson.getName());
        }


    }

}

import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//
//        This code print any of the numbers.

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

//        This code prints out the entire array.


        String[] people = new String[3];

        people[0] = new String("Rhiannon");
        people[1] = new String("Allmight");
        people[2] = new String("Deku");
        System.out.println(Arrays.toString(people));


        for (int i = 0; i < people.length; i++){
            System.out.println(people[i]);
        }


//        public static newPerson(people[], new String(name)){
//
//            for (int i = 0; i < people.length; i++){
//                System.out.println(people[i]);
//            }
//            System.out.println(new String(name));
//
//
//
//        }




    }

}

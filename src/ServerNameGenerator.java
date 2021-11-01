public class ServerNameGenerator {

    static String[] myAdjectives = {"adorable", "beautiful", "bored", "foolish", "sarcastic",
            "silly", "gentle", "lucky", "dangerous", "nervous"}; //my adjectives

    static String[] myNouns = {"bear", "duck", "bunny", "lion", "frog",
            "bee", "panda", "unicorn", "cat", "sheep"}; //my nouns


    public static String getRandom(String[] array) { //will allow BOTH arrays to use this method

        int random = (int)(Math.random() * array.length);
        //NOT including the * array.length will not allow the code to give you random picks EACH time.
        //It will only do it once otherwise. Also, you need to define it as an int or the random won't
        //work.

        return array[random]; //returns the array with the random int.
    }


    public static void main(String[] args) {

        String adjective = getRandom(myAdjectives); //calls getRandom method and passes in myAdjectives
        // array. It is then stored in a string.

//        System.out.println(adjective);

        String noun = getRandom(myNouns); //calls getRandom method and passes in myNouns
        // array. It is then stored in a string.

//        System.out.println(noun);

        System.out.println("Here is your server name:");
        System.out.printf("%s-%s\n", adjective, noun); //pass in variables with stored info
        System.out.println("Run the code again to get a new combination!");

    }


}

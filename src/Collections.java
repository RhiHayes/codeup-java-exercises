import java.util.ArrayList;
import java.util.HashMap;

public class Collections {

    public static void main(String[] args) {

//Old way: Array initializer; not as easy to work with :\

//        String[] nameOfVar = {"thing1", "thing2", "thing3"};
//
//        System.out.println(nameOfVar[3]);


        ArrayList<String> students = new ArrayList<>();

        students.add("Rhiannon");
        students.add("Mary");
        students.remove("Mary");

        System.out.println(students.size());
        System.out.println(students);


        ArrayList<Integer> myFavoriteNums = new ArrayList<>();
        myFavoriteNums.add(11);
        myFavoriteNums.add(23);
        myFavoriteNums.add(0, 7);
        myFavoriteNums.add(3, 9);
        myFavoriteNums.add(myFavoriteNums.size(), 15);



        System.out.println("My Nums: " + myFavoriteNums);
        System.out.println("My Nums Size: " + myFavoriteNums.size());

        System.out.println("My Nums (23 Index): " + myFavoriteNums.indexOf(23));
        System.out.println("My Nums (Get Num at 2 Index): " + myFavoriteNums.get(2));

        System.out.println("My Nums (has 15?): " + myFavoriteNums.contains(15));
        System.out.println("My Nums (has 76?): " + myFavoriteNums.contains(76));

        myFavoriteNums.remove( (Integer) 11);
        System.out.println("My Nums (Removing 11): " + myFavoriteNums);


        // --------- HASH MAPS STARTS BELOW HERE ---------

        HashMap<String, String> usernames = new HashMap<>();

        usernames.put("Rhi", "KawaiiRhiRhi");
        usernames.put("Deku", "AllMightFan556");
        usernames.put("Aizawa", "SleepyKittyCat");

        System.out.println("Aizawa's username : " + usernames.get("Aizawa"));

        // Oops; We looked for "Bobby" as a key...no results found :( we end up
        //with a return of NULL
        System.out.println(usernames.get("Bobby"));

        //Providing default might be better:

        System.out.println(usernames.getOrDefault("Bobby", "UserNotFound"));

        //.contains with our above experimentation

        System.out.println(usernames.containsKey("Bobby"));
        System.out.println(usernames.containsKey("Deku"));

        System.out.println(usernames.containsValue("AllMightFan556"));
        System.out.println(usernames.containsValue("CuteGirl34"));

        System.out.println(usernames);

        usernames.putIfAbsent("Deku", "IzukuMidoriya");
        usernames.putIfAbsent("Bobby", "BobbyJoe");
        System.out.println(usernames);

        usernames.remove("Deku");
        System.out.println(usernames);

        usernames.replace("Rhi", "CoolRhiRhi");
        System.out.println(usernames);

        usernames.clear();
        System.out.println(usernames);

        System.out.println("Is usernames empty? " + usernames.isEmpty());

    }


}
